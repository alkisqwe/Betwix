package com.example.betwix;
import android.app.*;
import android.os.*;
import android.widget.*;
import java.net.*;
import java.io.*;
import org.json.*;
import android.graphics.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import java.util.*;
import android.util.*;
import android.content.res.*;

public class episodes extends Activity
{
	public LinearLayout episodeslayout;
	public String id;
	public int seassonum;
	public ImageView homeimage;
	public ImageView searchimage;
	public ImageView moreimage;
	public ImageView backimage;
	ProgressDialog pd;
	public ArrayList<AsyncTask> down;
	public String imdbid = "";
	public LinearLayout transone;
	public LinearLayout transtwo;
	public LinearLayout transfive;
	public LinearLayout transsix;
	public LinearLayout transseven;
	public ImageView transeight;
	public TextView transeleven;
	public TextView transfourteen;
	public TextView transfifteen;
	public TextView transsixteen;
	public LinearLayout moviefirst;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episodes);
		Bundle bundle = getIntent().getExtras();
		id = bundle.getString("id");
		seassonum = bundle.getInt("seassonum");
		homeimage = (ImageView)findViewById(R.id.homeimage);
		searchimage = (ImageView)findViewById(R.id.searchimage);
		moreimage = (ImageView)findViewById(R.id.moreimage);
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(50, 50);
		homeimage.setLayoutParams(layoutParams);
		homeimage.setAdjustViewBounds(true);
		searchimage.setLayoutParams(layoutParams);
		searchimage.setAdjustViewBounds(true);
		moreimage.setLayoutParams(layoutParams);
		moreimage.setAdjustViewBounds(true);
		backimage = (ImageView)findViewById(R.id.backimage);
		episodeslayout = (LinearLayout)findViewById(R.id.episodesl);
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			transone = (LinearLayout)findViewById(R.id.transone);
			transtwo = (LinearLayout)findViewById(R.id.transtwo);
			transfive = (LinearLayout)findViewById(R.id.transfive);
			transsix = (LinearLayout)findViewById(R.id.transsix);
			transseven = (LinearLayout)findViewById(R.id.transseven);
			transeight = (ImageView)findViewById(R.id.backimage);
			transeleven = (TextView)findViewById(R.id.transeleven);
			transfourteen = (TextView)findViewById(R.id.transfourteen);
			transfifteen = (TextView)findViewById(R.id.transfifteen);
			transsixteen = (TextView)findViewById(R.id.transsixteen);
			transeight.setImageResource(R.drawable.backwhite);
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			transeight.setAlpha(80);
			homeimage.setAlpha(80);
			searchimage.setAlpha(80);
			moreimage.setAlpha(80);
			transone.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transtwo == null || transfive == null || transsix == null || transseven == null || transeight == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			transtwo.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transtwo == null || transfive == null || transsix == null || transseven == null || transeight == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			transfive.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transtwo == null || transfive == null || transsix == null || transseven == null || transeight == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			transsix.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transtwo == null || transfive == null || transsix == null || transseven == null || transeight == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			transseven.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transtwo == null || transfive == null || transsix == null || transseven == null || transeight == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			if(transeleven == null || transfourteen == null || transfifteen == null || transsixteen == null)
			{

			}
			else
			{
				transeleven.setVisibility(View.GONE);
				transfourteen.setVisibility(View.GONE);
				transfifteen.setVisibility(View.GONE);
				transsixteen.setVisibility(View.GONE);
			}
		}
		else
		{
			homeimage.setImageResource(R.drawable.home);
			searchimage.setImageResource(R.drawable.search);
			backimage.setImageResource(R.drawable.back);
			moreimage.setImageResource(R.drawable.more);
		}
		pd = new ProgressDialog(episodes.this);
		pd.setMessage("Please wait");
		pd.setCancelable(false);
		pd.show();
		down = new ArrayList<>();
		new json().execute("https://api.themoviedb.org/3/tv/"+id+"/season/"+String.valueOf(seassonum)+"?language=el-GR");
	}
	
	public void navbuttons(boolean p2)
	{
		if(p2)
		{
			transone.setBackgroundColor(Color.parseColor("#000000"));
			transtwo.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transfive.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transsix.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transseven.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transeight.setImageResource(R.drawable.backwhite);
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			transeight.setAlpha(255);
			homeimage.setAlpha(255);
			searchimage.setAlpha(255);
			moreimage.setAlpha(255);
			transone.setLayoutParams(new LinearLayout.LayoutParams(400,LinearLayout.LayoutParams.MATCH_PARENT));
			transeleven.setVisibility(View.VISIBLE);
			transfourteen.setVisibility(View.VISIBLE);
			transfifteen.setVisibility(View.VISIBLE);
			transsixteen.setVisibility(View.VISIBLE);
		}
		else
		{
			Resources r = getResources();
			float widthr = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, r.getDisplayMetrics());
			transone.setLayoutParams(new LinearLayout.LayoutParams(Math.round(widthr),LinearLayout.LayoutParams.MATCH_PARENT));
			transeleven.setVisibility(View.GONE);
			transfourteen.setVisibility(View.GONE);
			transfifteen.setVisibility(View.GONE);
			transsixteen.setVisibility(View.GONE);
			transone.setBackgroundResource(0);
			transtwo.setBackgroundResource(0);
			transfive.setBackgroundResource(0);
			transsix.setBackgroundResource(0);
			transseven.setBackgroundResource(0);
			transeight.setImageResource(R.drawable.backwhite);
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			transeight.setAlpha(80);
			homeimage.setAlpha(80);
			searchimage.setAlpha(80);
			moreimage.setAlpha(80);
			if(transone.isFocused() || transtwo.isFocused() || transfive.isFocused() || transsix.isFocused() || transseven.isFocused())
			{

			}
			else
			{
				if(moviefirst == null)
				{

				}
				else
				{
					moviefirst.requestFocus();
				}
			}
		}
	}
	
	public void back(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		finish();
	}
	
	public void search(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(episodes.this, search.class);
		startActivity(intent);
	}
	
	public void more(View view)
	{
		
	}

	public void home(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(episodes.this, MainActivity.class);
		startActivity(intent);
	}
	
	private class json extends AsyncTask<String, String, String>
	{
    	protected void onPreExecute()
		{
        	super.onPreExecute();
        	//pd = new ProgressDialog(MainActivity.this);
        	//pd.setMessage("Please wait");
        	//pd.setCancelable(false);
        	//pd.show();
    	}

    	protected String doInBackground(String... params)
		{
			HttpURLConnection connection = null;
        	BufferedReader reader = null;

        	try
			{
            	URL url = new URL(params[0]);
            	connection = (HttpURLConnection) url.openConnection();
				connection.setRequestProperty("Authorization", getString(R.string.auth));
				connection.setRequestProperty("accept", "application/json");
            	connection.connect();
            	InputStream stream = connection.getInputStream();
				reader = new BufferedReader(new InputStreamReader(stream));
				StringBuffer buffer = new StringBuffer();
            	String line = "";
            	while ((line = reader.readLine()) != null)
				{
                	buffer.append(line+"\n");
            	}
				return buffer.toString();
			}
			catch (MalformedURLException e){}
			catch (IOException e){}
			finally
			{
            	if (connection != null)
				{
                	connection.disconnect();
            	}
            	try
				{
                	if (reader != null)
					{
                    	reader.close();
                	}
            	}
				catch (IOException e){}
        	}
        	return null;
    	}

    	@Override
    	protected void onPostExecute(String result)
		{
        	super.onPostExecute(result);
			String[] one = sorter(result);
			sorter2(one);
			new json2().execute("https://api.themoviedb.org/3/tv/"+id+"/external_ids?language=el-GR");
    	}

		public void sorter2(String[] jso)
		{
			try
			{
				for(int i = 0;i < jso.length;i++)
				{
					JSONObject obj = new JSONObject(jso[i]);
					try
					{
						if(i == 0)
						{
							butt(obj.getString("name"),obj.getString("still_path"),obj.getString("air_date"),obj.getString("overview"),obj.getString("episode_number"),1);
						}
						else
						{
							butt(obj.getString("name"),obj.getString("still_path"),obj.getString("air_date"),obj.getString("overview"),obj.getString("episode_number"),0);
						}
					}
					catch(Exception e){}
				}
			}
			catch (Exception e){}
		}

		public String[] sorter(String jso)
		{
			try
			{
				JSONObject obj = new JSONObject(jso);
				JSONArray objarr = obj.getJSONArray("episodes");
				String[] fin = new String[objarr.length()];
				for(int i = 0;i < objarr.length();i++)
				{
					fin[i] = objarr.get(i).toString();
				}
				return fin;

			}
			catch (Exception e){}
			String[] finn = new String[1];
			finn[0] = jso;
			return finn;
		}

		public void butt(final String te,final String image,final String release,final String description,final String episodenum,final int first)
		{
			LinearLayout onee = new LinearLayout(episodes.this);
			LinearLayout one = new LinearLayout(episodes.this);
			LinearLayout tm = new LinearLayout(episodes.this);
			ImageView two = new ImageView(episodes.this);
			TextView three = new TextView(episodes.this);
			TextView four = new TextView(episodes.this);
			TextView des = new TextView(episodes.this);
			one.setOrientation(LinearLayout.HORIZONTAL);
			onee.setOrientation(LinearLayout.VERTICAL);
			tm.setOrientation(LinearLayout.VERTICAL);
			des.setText(description);
			four.setText(release);
			three.setText(episodenum+". "+te);
			three.setTextColor(Color.parseColor("#000000"));
			AsyncTask dow = new DownloadImageTask(two).execute("https://image.tmdb.org/t/p/w185"+image);
			down.add(dow);
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(250, 250);
			two.setLayoutParams(layoutParams);
			two.setAdjustViewBounds(true);
			onee.setBackground(getResources().getDrawable(R.drawable.button));
			three.setLayoutParams(new LinearLayout.LayoutParams(250, 100));
			one.addView(two);
			tm.addView(three);
			tm.addView(four);
			one.addView(tm);
			onee.addView(one);
			onee.addView(des);
			onee.setOnClickListener(new OnClickListener()
				{
					public void onClick(View view)
					{
						for(int i = 0;i< down.size();i++)
						{
							down.get(i).cancel(true);
						}
						Intent intent = new Intent(episodes.this, watcher.class);
						intent.putExtra("type","tv");
						intent.putExtra("id",imdbid);
						intent.putExtra("season",String.valueOf(seassonum));
						intent.putExtra("episode",episodenum);
						startActivity(intent);
					}
				});
			if(first == 1)
			{
				moviefirst = onee;
				try
				{
					onee.requestFocus();
				}
				catch(Exception e){}
			}
			episodeslayout.addView(onee);
		}
	}
	
	private class DownloadImageTask extends AsyncTask<String, Void, Bitmap>
	{
		ImageView bmImage;

		public DownloadImageTask(ImageView bmImage)
		{
			this.bmImage = bmImage;
		}

		protected Bitmap doInBackground(String... urls)
		{
			String urldisplay = urls[0];
			Bitmap mIcon11 = null;
			try
			{
				InputStream in = new java.net.URL(urldisplay).openStream();
				mIcon11 = BitmapFactory.decodeStream(in);
			}
			catch (Exception e){}
			return mIcon11;
		}

		protected void onPostExecute(Bitmap result)
		{
			bmImage.setImageBitmap(result);
		}
	}
	
	private class json2 extends AsyncTask<String, String, String>
	{
    	protected void onPreExecute()
		{
        	super.onPreExecute();
        	//pd = new ProgressDialog(MainActivity.this);
        	//pd.setMessage("Please wait");
        	//pd.setCancelable(false);
        	//pd.show();
    	}

    	protected String doInBackground(String... params)
		{
			HttpURLConnection connection = null;
        	BufferedReader reader = null;

        	try
			{
            	URL url = new URL(params[0]);
            	connection = (HttpURLConnection) url.openConnection();
				connection.setRequestProperty("Authorization", getString(R.string.auth));
				connection.setRequestProperty("accept", "application/json");
            	connection.connect();
            	InputStream stream = connection.getInputStream();
				reader = new BufferedReader(new InputStreamReader(stream));
				StringBuffer buffer = new StringBuffer();
            	String line = "";
            	while ((line = reader.readLine()) != null)
				{
                	buffer.append(line+"\n");
            	}
				return buffer.toString();
			}
			catch (MalformedURLException e){}
			catch (IOException e){}
			finally
			{
            	if (connection != null)
				{
                	connection.disconnect();
            	}
            	try
				{
                	if (reader != null)
					{
                    	reader.close();
                	}
            	}
				catch (IOException e){}
        	}
        	return null;
    	}

    	@Override
    	protected void onPostExecute(String result)
		{
        	super.onPostExecute(result);
			sorter(result);
			if (pd.isShowing())
			{
				pd.dismiss();
        	}
    	}

		public void sorter(String jso)
		{
			try
			{
				JSONObject obj = new JSONObject(jso);
				imdbid = obj.getString("imdb_id");

			}
			catch (Exception e){}
		}
	}
}
		
