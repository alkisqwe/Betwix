package com.example.betwix;
import android.app.*;
import android.os.*;
import java.net.*;
import java.io.*;
import org.json.*;
import android.widget.*;
import android.graphics.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.util.*;
import android.net.*;
import java.util.*;
import android.content.res.*;
import android.text.*;
import android.graphics.drawable.*;

public class actorsmovies extends Activity
{
	public String id;
	public GridLayout actorm;
	public int page = 1;
	public ImageView facebook;
	public ImageView instagram;
	public ImageView tiktok;
	public ImageView homeimage;
	public ImageView searchimage;
	public ImageView moreimage;
	public ImageView backimage;
	ProgressDialog pd;
	public int syncer = 0;
	public ArrayList<AsyncTask> down;
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
	public LinearLayout recomendedlayout;
	public hsv scroller;
	public TextView menutitle;
	public TextView menudate;
	public TextView menudescription;
	public LinearLayout moviefirst;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actorsmovies);
		Bundle bundle = getIntent().getExtras();
		id = bundle.getString("id");
		facebook = (ImageView)findViewById(R.id.facebook);
		instagram = (ImageView)findViewById(R.id.instagram);
		tiktok = (ImageView)findViewById(R.id.tiktok);
		homeimage = (ImageView)findViewById(R.id.homeimage);
		searchimage = (ImageView)findViewById(R.id.searchimage);
		moreimage = (ImageView)findViewById(R.id.moreimage);
		backimage = (ImageView)findViewById(R.id.backimage);
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(50, 50);
		homeimage.setLayoutParams(layoutParams);
		homeimage.setAdjustViewBounds(true);
		searchimage.setLayoutParams(layoutParams);
		searchimage.setAdjustViewBounds(true);
		moreimage.setLayoutParams(layoutParams);
		moreimage.setAdjustViewBounds(true);
		//actorscrol = (ScrollView)findViewById(R.id.actorsscroll);
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			recomendedlayout = (LinearLayout)findViewById(R.id.recomendedlayout);
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
			scroller = (hsv)findViewById(R.id.scroller);
			menutitle = (TextView)findViewById(R.id.menutitle);
			menudate = (TextView)findViewById(R.id.menudate);
			menudescription = (TextView)findViewById(R.id.menudescription);
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
			actorm = (GridLayout)findViewById(R.id.actorm);
			actorm.setColumnCount(3);
			actorm.setRowCount(3);
		}
		pd = new ProgressDialog(actorsmovies.this);
		pd.setMessage("Please wait");
		pd.setCancelable(false);
		pd.show();
		down = new ArrayList<>();
		new json2().execute("https://api.themoviedb.org/3/person/"+id+"/external_ids?language=el-GR");
		new json().execute("https://api.themoviedb.org/3/person/"+id+"?language=el-GR&append_to_response=combined_credits");
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
	
	public void more(View view)
	{
		
	}
	
	public void search(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(actorsmovies.this, search.class);
		startActivity(intent);
	}

	public void home(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(actorsmovies.this, MainActivity.class);
		startActivity(intent);
	}
	
	public void back(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		finish();
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
        	//if (pd.isShowing())
			//{
			//pd.dismiss();
        	//}
			String[] one = sorter(result);
			sorter2(one);
			if(syncer == 1)
			{
				if(pd.isShowing())
				{
					pd.dismiss();
				}
			}
			else
			{
				syncer += 1;
				if(syncer == 2)
				{
					if(pd.isShowing())
					{
						pd.dismiss();
					}
				}
			}
    	}

		public void sorter2(String[] jso)
		{
			try
			{
				for(int i = 0;i < jso.length;i++)
				{
					JSONObject obj = new JSONObject(jso[i]);
					if(obj.getString("media_type").equals("movie"))
					{
						try
						{
							if(i == 0)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									JSONArray g = obj.getJSONArray("genre_ids");
									String[] fin = new String[g.length()];
									for(int j = 0;j < g.length();j++)
									{
										fin[j] = g.get(j).toString();
									}
									StringBuilder stringBuilder = new StringBuilder();
									for(int j = 0;j < fin.length;j++)
									{
										int idobj = Integer.valueOf(fin[j]);
										stringBuilder.append(translateidmovies(idobj)+",");
									}
									String resultString = stringBuilder.toString();
									String resultStringfin = resultString.substring(0,resultString.length()-1);
									butt(obj.getString("title"),obj.getString("backdrop_path"),obj.getString("release_date"),obj.getString("id"),obj.getString("media_type"),obj.getString("backdrop_path"),1,obj.getString("overview"),resultStringfin);
								}
								else
								{
									butt(obj.getString("original_title"),obj.getString("poster_path"),obj.getString("release_date"),obj.getString("id"),obj.getString("media_type"),obj.getString("poster_path"),1,obj.getString("overview"),"");
								}
							}
							else
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									JSONArray g = obj.getJSONArray("genre_ids");
									String[] fin = new String[g.length()];
									for(int j = 0;j < g.length();j++)
									{
										fin[j] = g.get(j).toString();
									}
									StringBuilder stringBuilder = new StringBuilder();
									for(int j = 0;j < fin.length;j++)
									{
										int idobj = Integer.valueOf(fin[j]);
										stringBuilder.append(translateidmovies(idobj)+",");
									}
									String resultString = stringBuilder.toString();
									String resultStringfin = resultString.substring(0,resultString.length()-1);
									butt(obj.getString("title"),obj.getString("backdrop_path"),obj.getString("release_date"),obj.getString("id"),obj.getString("media_type"),obj.getString("backdrop_path"),0,obj.getString("overview"),resultStringfin);
								}
								else
								{
									butt(obj.getString("original_title"),obj.getString("poster_path"),obj.getString("release_date"),obj.getString("id"),obj.getString("media_type"),obj.getString("poster_path"),0,obj.getString("overview"),"");
								}
							}
						}
						catch(Exception e){}
					}
					else if(obj.getString("media_type").equals("tv"))
					{
						try
						{
							if(i == 0)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									JSONArray g = obj.getJSONArray("genre_ids");
									String[] fin = new String[g.length()];
									for(int j = 0;j < g.length();j++)
									{
										fin[j] = g.get(j).toString();
									}
									StringBuilder stringBuilder = new StringBuilder();
									for(int j = 0;j < fin.length;j++)
									{
										int idobj = Integer.valueOf(fin[j]);
										stringBuilder.append(translateidshows(idobj)+",");
									}
									String resultString = stringBuilder.toString();
									String resultStringfin = resultString.substring(0,resultString.length()-1);
									butt(obj.getString("name"),obj.getString("backdrop_path"),obj.getString("first_air_date"),obj.getString("id"),obj.getString("media_type"),obj.getString("backdrop_path"),1,obj.getString("overview"),resultStringfin);
								}
								else
								{
									butt(obj.getString("original_name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),obj.getString("media_type"),obj.getString("poster_path"),1,obj.getString("overview"),"");
								}
							}
							else
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									JSONArray g = obj.getJSONArray("genre_ids");
									String[] fin = new String[g.length()];
									for(int j = 0;j < g.length();j++)
									{
										fin[j] = g.get(j).toString();
									}
									StringBuilder stringBuilder = new StringBuilder();
									for(int j = 0;j < fin.length;j++)
									{
										int idobj = Integer.valueOf(fin[j]);
										stringBuilder.append(translateidshows(idobj)+",");
									}
									String resultString = stringBuilder.toString();
									String resultStringfin = resultString.substring(0,resultString.length()-1);
									butt(obj.getString("name"),obj.getString("backdrop_path"),obj.getString("first_air_date"),obj.getString("id"),obj.getString("media_type"),obj.getString("backdrop_path"),0,obj.getString("overview"),resultStringfin);
								}
								else
								{
									butt(obj.getString("original_name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),obj.getString("media_type"),obj.getString("poster_path"),0,obj.getString("overview"),"");
								}
							}
						}
						catch(Exception e){}
					}
				}
			}
			catch (Exception e){}
		}

		public String[] sorter(String jso)
		{
			try
			{
				JSONObject obj = new JSONObject(jso);
				JSONObject objj = new JSONObject(obj.getString("combined_credits"));
				JSONArray objarr = objj.getJSONArray("cast");
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

		public void butt(final String te,final String image,final String release,final String id,final String type,final String backdrop,final int first,final String description,final String final_genres)
		{
			final LinearLayout one = new LinearLayout(actorsmovies.this);
			final LinearLayout textslay = new LinearLayout(actorsmovies.this);
			final ImageView two = new ImageView(actorsmovies.this);
			Space spacer = new Space(actorsmovies.this);
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				textslay.setOrientation(LinearLayout.VERTICAL);
				textslay.setBackgroundColor(Color.parseColor("#414141"));
				TextView three = new TextView(actorsmovies.this);
				TextView four = new TextView(actorsmovies.this);
				spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
				Space spacertwo = new Space(actorsmovies.this);
				spacertwo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,20));
				one.setOrientation(LinearLayout.VERTICAL);
				four.setText(release);
				String tem = te;
				if(te.length() > 27)
				{
					tem = te.substring(0,27)+"...";
				}
				three.setText(tem);
				three.setTextColor(Color.parseColor("#000000"));
				AsyncTask dow = new DownloadImageTask(two).execute("https://image.tmdb.org/t/p/w154"+backdrop);
				down.add(dow);
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(600, 340);
				two.setLayoutParams(layoutParams);
				two.setAdjustViewBounds(true);
				one.setBackground(getResources().getDrawable(R.drawable.one));
				three.setLayoutParams(new LinearLayout.LayoutParams(600, 50));
				one.addView(two);
				textslay.addView(three);
				textslay.addView(four);
				one.addView(spacertwo);
				one.addView(textslay);
				two.setAlpha(150);
				textslay.getBackground().setAlpha(150);
			}
			else
			{
				TextView three = new TextView(actorsmovies.this);
				TextView four = new TextView(actorsmovies.this);
				one.setOrientation(LinearLayout.VERTICAL);
				four.setText(release);
				String tem = te;
				if(te.length() > 16)
				{
					tem = te.substring(0,16)+"...";
				}
				three.setText(tem);
				three.setTextColor(Color.parseColor("#000000"));
				AsyncTask dow = new DownloadImageTask(two).execute("https://image.tmdb.org/t/p/w92"+image);
				down.add(dow);
				DisplayMetrics displayMetrics = new DisplayMetrics();
				getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
				int width = displayMetrics.widthPixels;
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width/3, width/3);
				two.setLayoutParams(layoutParams);
				two.setAdjustViewBounds(true);
				one.setBackground(getResources().getDrawable(R.drawable.button));
				three.setLayoutParams(new LinearLayout.LayoutParams(250, 100));
				one.addView(two);
				one.addView(three);
				one.addView(four);
			}
			one.setOnClickListener(new OnClickListener()
				{
					public void onClick(View view)
					{
						for(int i = 0;i< down.size();i++)
						{
							down.get(i).cancel(true);
						}
						if(type.equals("movie"))
						{
							Intent intent = new Intent(actorsmovies.this, second.class);
							intent.putExtra("id",id);
							startActivity(intent);
						}
						else if(type.equals("tv"))
						{
							Intent intent = new Intent(actorsmovies.this, third.class);
							intent.putExtra("id",id);
							startActivity(intent);
						}
					}
				});
			one.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(p2)
						{
							AsyncTask dow = new DownloadBackgroundTask((LinearLayout)findViewById(R.id.backdrop)).execute("https://image.tmdb.org/t/p/w780"+backdrop);
							down.add(dow);
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								scroller.setCenter(one);
								textslay.setBackgroundColor(Color.parseColor("#0078FF"));
								two.setBackgroundColor(Color.parseColor("#FFFFFF"));
								two.setPadding(5,5,5,5);
								two.setAlpha(255);
								textslay.getBackground().setAlpha(255);
								String titleshort = te;
								if(te.length() > 30)
								{
									titleshort = te.substring(0,30)+"...";
								}
								String desshort = description;
								if(description.length() > 800)
								{
									desshort = "<font color='#FF0000'>"+description.substring(0,800)+"</font>"+"<font color='#008000'>"+"...Πατήστε OK για περισσότερα..."+"</font>";
								}
								else
								{
									desshort = "<font color='#FF0000'>"+description+"</font>";
								}
								menutitle.setText(titleshort);
								menutitle.setTextSize(50);
								menudate.setText(Html.fromHtml("<font color='#008000'>"+release+"</font>"+"/"+"<font color='#FF0000'>"+final_genres+"</font>"));
								menudescription.setText(Html.fromHtml(desshort));
							}
						}
						else
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								textslay.setBackgroundColor(Color.parseColor("#414141"));
								two.setBackgroundResource(0);
								two.setPadding(0,0,0,0);
								two.setAlpha(150);
								textslay.getBackground().setAlpha(150);
							}
						}
					}
				});
			if(first == 1)
			{
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					moviefirst = one;
					try
					{
						one.requestFocus();
						scroller.setCenter(one);
					}
					catch(Exception e){}
				}
			}
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				recomendedlayout.addView(one);
				recomendedlayout.addView(spacer);
			}
			else
			{
				actorm.addView(one);
			}
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
	
	private class DownloadBackgroundTask extends AsyncTask<String, Void, Bitmap>
	{
		LinearLayout bmImage;

		public DownloadBackgroundTask(LinearLayout bmImage)
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
			bmImage.setBackgroundDrawable(new BitmapDrawable(getResources(),result));
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
        	//if (pd.isShowing())
			//{
			//pd.dismiss();
        	//}
			sorter(result);
			if(syncer == 1)
			{
				if(pd.isShowing())
				{
					pd.dismiss();
				}
			}
			else
			{
				syncer += 1;
				if(syncer == 2)
				{
					if(pd.isShowing())
					{
						pd.dismiss();
					}
				}
			}
    	}

		public void sorter(String jso)
		{
			try
			{
				final JSONObject obj = new JSONObject(jso);
				if(!(obj.getString("facebook_id").equals("null")))
				{
					facebook.setImageResource(R.drawable.facebookselector);
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(150, 150);
					facebook.setLayoutParams(layoutParams);
					facebook.setAdjustViewBounds(true);
					facebook.setOnClickListener(new OnClickListener()
					{
						public void onClick(View view)
						{
							try
							{
								Intent webIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"+obj.getString("facebook_id")));
								actorsmovies.this.startActivity(webIntent);
							}
							catch(Exception e){}
						}
					});
				}
				if(!(obj.getString("instagram_id").equals("null")))
				{
					instagram.setImageResource(R.drawable.instagramselector);
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(150, 150);
					instagram.setLayoutParams(layoutParams);
					instagram.setAdjustViewBounds(true);
					instagram.setOnClickListener(new OnClickListener()
						{
							public void onClick(View view)
							{
								try
								{
									Intent webIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/"+obj.getString("instagram_id")));
									actorsmovies.this.startActivity(webIntent);
								}
								catch(Exception e){}
							}
						});
				}
				if(!(obj.getString("tiktok_id").equals("null")))
				{
					tiktok.setImageResource(R.drawable.tiktokselector);
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(150, 150);
					tiktok.setLayoutParams(layoutParams);
					tiktok.setAdjustViewBounds(true);
					tiktok.setOnClickListener(new OnClickListener()
						{
							public void onClick(View view)
							{
								try
								{
									Intent webIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.tiktok.com/"+obj.getString("tiktok_id")));
									actorsmovies.this.startActivity(webIntent);
								}
								catch(Exception e){}
							}
						});
				}
			}
			catch (Exception e){}
		}
	}
	
	public String translateidshows(int genres_id)
	{
		if(genres_id == 10759)
		{
			return "Περιπέτεια Δράσης(Act+Adv)";
		}
		else if(genres_id == 16)
		{
			return "Κινουμένων Σχεδίων(Animation)";
		}
		else if(genres_id == 35)
		{
			return "Κωμωδία(Comedy)";
		}
		else if(genres_id == 80)
		{
			return "Έγκλημα(Crime)";
		}
		else if(genres_id == 99)
		{
			return "Ντοκυμαντέρ(Documentary)";
		}
		else if(genres_id == 18)
		{
			return "Δράμα(Drama)";
		}
		else if(genres_id == 10751)
		{
			return "Οικογενειακών(Family)";
		}
		else if(genres_id == 10762)
		{
			return "Παιδικά(Kids)";
		}
		else if(genres_id == 9648)
		{
			return "Μυστηρίου(Mystery)";
		}
		else if(genres_id == 10763)
		{
			return "Ειδήσεις(News)";
		}
		else if(genres_id == 10764)
		{
			return "Πραγματικότητα(Reality)";
		}
		else if(genres_id == 10765)
		{
			return "Επιστημονικής Φαντασίας(Sci-Fi&amp;Fantasy)";
		}
		else if(genres_id == 10766)
		{
			return "Σαπουνόπερες(Soap)";
		}
		else if(genres_id == 10767)
		{
			return "Ομιλία(Talk)";
		}
		else if(genres_id == 10768)
		{
			return "Πόλεμος &amp; Πολιτική(War &amp; Politics)";
		}
		else if(genres_id == 37)
		{
			return "Δυτικός(Western)";
		}
		else
		{
			return "";
		}
	}

	public String translateidmovies(int genres_id)
	{
		if(genres_id == 28)
		{
			return "Δράση(Action)";
		}
		else if(genres_id == 12)
		{
			return "Περιπέτεια(Adventure)";
		}
		else if(genres_id == 16)
		{
			return "Κινουμένων Σχεδίων(Animation)";
		}
		else if(genres_id == 35)
		{
			return "Κωμωδία(Comedy)";
		}
		else if(genres_id == 80)
		{
			return "Έγκλημα(Crime)";
		}
		else if(genres_id == 99)
		{
			return "Ντοκυμαντέρ(Documentary)";
		}
		else if(genres_id == 18)
		{
			return "Δράμα(Drama)";
		}
		else if(genres_id == 10751)
		{
			return "Οικογενειακών(Family)";
		}
		else if(genres_id == 14)
		{
			return "Φαντασία(Fantasy)";
		}
		else if(genres_id == 36)
		{
			return "Ιστορία(History)";
		}
		else if(genres_id == 27)
		{
			return "Φρίκη(Horror)";
		}
		else if(genres_id == 10402)
		{
			return "Μουσική(Music)";
		}
		else if(genres_id == 9648)
		{
			return "Μυστηρίου(Mystery)";
		}
		else if(genres_id == 10749)
		{
			return "Ρομάντζο(Romance)";
		}
		else if(genres_id == 878)
		{
			return "Επιστημονική Φαντασία(Science Fiction)";
		}
		else if(genres_id == 10770)
		{
			return "Τηλεοπτική Ταινία(Tv-Movie)";
		}
		else if(genres_id == 53)
		{
			return "Φίλμ Αγωνίας(Thriller)";
		}
		else if(genres_id == 10752)
		{
			return "Πολεμικές(War)";
		}
		else if(genres_id == 37)
		{
			return "Δυτικές(Western)";
		}
		else
		{
			return "";
		}
	}
}
