package com.example.betwix;
import android.app.*;
import android.os.*;
import java.net.*;
import java.io.*;
import org.json.*;
import android.graphics.*;
import android.widget.*;
import android.util.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.net.*;
import java.util.*;
import android.content.res.*;
import android.text.*;
import android.graphics.drawable.*;

public class third extends Activity
{
	public String id;
	public ImageView background;
	public ImageView youtubebutton;
	public Button youtubebuttonrot;
	public TextView title;
	public TextView type;
	public TextView yearandstars;
	public TextView description;
	public Button watchnow;
	public RelativeLayout youtubeb;
	public String youtubelink = "";
	public LinearLayout castlayout;
	public LinearLayout seasonslayout;
	public LinearLayout recomendedlayout;
	public String genres4;
	public ImageView homeimage;
	public ImageView searchimage;
	public ImageView moreimage;
	public ImageView bookmark;
	public ImageView backimage;
	public LinearLayout bookmarking;
	public String sharedname;
	public String sharedrelease;
	public String sharedphoto;
	public String sharedbackdrop;
	public String shareddescription;
	public String sharedgenres;
	ProgressDialog pd;
	public int syncer = 0;
	public ArrayList<AsyncTask> down;
	public String imdbid = "";
	public LinearLayout movieinfo;
	public LinearLayout actorsinfo;
	public int english = 0;
	public TextView tagline;
	public LinearLayout protinomena;
	public LinearLayout transone;
	public LinearLayout transtwo;
	public LinearLayout transthree;
	public LinearLayout transfive;
	public LinearLayout transsix;
	public LinearLayout transseven;
	public ImageView transeight;
	public ImageView transnine;
	public TextView transeleven;
	public TextView transtwelve;
	public TextView transfourteen;
	public TextView transfifteen;
	public TextView transsixteen;
	public hsv scroller;
	public hsv scroller2;
	public TextView menutitle;
	public TextView menudate;
	public TextView menudescription;
	public LinearLayout moviefirst;
	public LinearLayout actorsfirst;
	public ImageView actorsimageview;
	public Button informatiobutton;
	public Button actorsinfobutton;
	public Button protinomenabutton;
	public LinearLayout seasonsinfo;
	public ImageView seasonsimageview;
	public hsv scroller3;
	public LinearLayout seasonfirst;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
		Bundle bundle = getIntent().getExtras();
		id = bundle.getString("id");
		background = (ImageView)findViewById(R.id.background);
		title = (TextView)findViewById(R.id.title);
		type = (TextView)findViewById(R.id.type);
		yearandstars = (TextView)findViewById(R.id.yearandstars);
		description = (TextView)findViewById(R.id.description);
		watchnow = (Button)findViewById(R.id.watchnow);
		watchnow.requestFocus();
		youtubeb = (RelativeLayout)findViewById(R.id.youtubeb);
		castlayout = (LinearLayout)findViewById(R.id.castlayout);
		seasonslayout = (LinearLayout)findViewById(R.id.seasonsl);
		recomendedlayout = (LinearLayout)findViewById(R.id.recomendedlayout);
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
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			seasonsinfo = (LinearLayout)findViewById(R.id.seasonsinfo);
			seasonsimageview = (ImageView)findViewById(R.id.seasonsimageview);
			scroller3 = (hsv)findViewById(R.id.scroller3);
			actorsimageview = (ImageView)findViewById(R.id.actorsimageview);
			youtubebuttonrot = (Button)findViewById(R.id.youtubebutton);
			movieinfo = (LinearLayout)findViewById(R.id.movieinfo);
			actorsinfo = (LinearLayout)findViewById(R.id.actorsinfo);
			tagline = (TextView)findViewById(R.id.tagline);
			protinomena = (LinearLayout)findViewById(R.id.protinomenaid);
			transone = (LinearLayout)findViewById(R.id.transone);
			transtwo = (LinearLayout)findViewById(R.id.transtwo);
			transthree = (LinearLayout)findViewById(R.id.bookmarking);
			transfive = (LinearLayout)findViewById(R.id.transfive);
			transsix = (LinearLayout)findViewById(R.id.transsix);
			transseven = (LinearLayout)findViewById(R.id.transseven);
			transeight = (ImageView)findViewById(R.id.backimage);
			transnine = (ImageView)findViewById(R.id.bookmark);
			transeleven = (TextView)findViewById(R.id.transeleven);
			transtwelve = (TextView)findViewById(R.id.transtwelve);
			transfourteen = (TextView)findViewById(R.id.transfourteen);
			transfifteen = (TextView)findViewById(R.id.transfifteen);
			transsixteen = (TextView)findViewById(R.id.transsixteen);
			transeight.setImageResource(R.drawable.backwhite);
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			transnine.setImageResource(R.drawable.bookmarkwhite);
			transeight.setAlpha(80);
			transnine.setAlpha(80);
			homeimage.setAlpha(80);
			searchimage.setAlpha(80);
			moreimage.setAlpha(80);
			scroller = (hsv)findViewById(R.id.scroller);
			scroller2 = (hsv)findViewById(R.id.scroller2);
			menutitle = (TextView)findViewById(R.id.menutitle);
			menudate = (TextView)findViewById(R.id.menudate);
			menudescription = (TextView)findViewById(R.id.menudescription);
			informatiobutton = (Button)findViewById(R.id.informationbutton);
			actorsinfobutton = (Button)findViewById(R.id.actorsinfobutton);
			protinomenabutton = (Button)findViewById(R.id.protinomenabutton);
			watchnow.setOnKeyListener(new OnKeyListener()
				{
					@Override
					public boolean onKey(View p1,int p2,KeyEvent p3)
					{
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							return true;
						}
						return false;
					}
				});
			youtubebuttonrot.setOnKeyListener(new OnKeyListener()
				{
					@Override
					public boolean onKey(View p1,int p2,KeyEvent p3)
					{
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							return true;
						}
						return false;
					}
				});
			informatiobutton.setOnKeyListener(new OnKeyListener()
				{
					@Override
					public boolean onKey(View p1,int p2,KeyEvent p3)
					{
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							return true;
						}
						return false;
					}
				});
			actorsinfobutton.setOnKeyListener(new OnKeyListener()
				{
					@Override
					public boolean onKey(View p1,int p2,KeyEvent p3)
					{
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							return true;
						}
						return false;
					}
				});
			protinomenabutton.setOnKeyListener(new OnKeyListener()
				{
					@Override
					public boolean onKey(View p1,int p2,KeyEvent p3)
					{
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							return true;
						}
						return false;
					}
				});
			movieinfo.setOnKeyListener(new OnKeyListener()
				{
					@Override
					public boolean onKey(View p1,int p2,KeyEvent p3)
					{
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							return true;
						}
						else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							watchnow.requestFocus();
							return false;
						}
						return false;
					}
				});
			seasonsinfo.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(p2)
						{
							seasonfirst.requestFocus();
						}
					}
				});
			actorsinfo.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(p2)
						{
							actorsfirst.requestFocus();
						}
					}
				});
			protinomena.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(p2)
						{
							moviefirst.requestFocus();
						}
					}
				});
			transone.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transtwo == null || transthree == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			transthree.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transtwo == null || transthree == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			if(transeleven == null || transtwelve == null || transfourteen == null || transfifteen == null || transsixteen == null)
			{

			}
			else
			{
				transeleven.setVisibility(View.GONE);
				transtwelve.setVisibility(View.GONE);
				transfourteen.setVisibility(View.GONE);
				transfifteen.setVisibility(View.GONE);
				transsixteen.setVisibility(View.GONE);
			}
		}
		else
		{
			LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(50, 50);
			bookmark = (ImageView)findViewById(R.id.bookmark);
			bookmark.setLayoutParams(layoutParams2);
			bookmark.setAdjustViewBounds(true);
			bookmarking = (LinearLayout)findViewById(R.id.bookmarking);
			youtubebutton = (ImageView)findViewById(R.id.youtubebutton);
			backimage = (ImageView)findViewById(R.id.backimage);
			backimage.setImageResource(R.drawable.back);
			homeimage.setImageResource(R.drawable.home);
			searchimage.setImageResource(R.drawable.search);
			moreimage.setImageResource(R.drawable.more);
			bookmark.setImageResource(R.drawable.bookmark);
		}
		pd = new ProgressDialog(third.this);
		pd.setMessage("Please wait");
		pd.setCancelable(false);
		pd.show();
		down = new ArrayList<>();
		new json().execute("https://api.themoviedb.org/3/tv/"+id+"?language=el-GR");
		new json3().execute("https://api.themoviedb.org/3/tv/"+id+"/credits?language=el-GR");
		new json5().execute("https://api.themoviedb.org/3/tv/"+id+"/external_ids?language=el-GR");
	}
	
	public void navbuttons(boolean p2)
	{
		if(p2)
		{
			transone.setBackgroundColor(Color.parseColor("#000000"));
			transtwo.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transthree.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transfive.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transsix.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transseven.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transeight.setImageResource(R.drawable.backwhite);
			transnine.setImageResource(R.drawable.bookmarkwhite);
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			transeight.setAlpha(255);
			transnine.setAlpha(255);
			homeimage.setAlpha(255);
			searchimage.setAlpha(255);
			moreimage.setAlpha(255);
			transone.setLayoutParams(new LinearLayout.LayoutParams(400,LinearLayout.LayoutParams.MATCH_PARENT));
			transeleven.setVisibility(View.VISIBLE);
			transtwelve.setVisibility(View.VISIBLE);
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
			transtwelve.setVisibility(View.GONE);
			transfourteen.setVisibility(View.GONE);
			transfifteen.setVisibility(View.GONE);
			transsixteen.setVisibility(View.GONE);
			transone.setBackgroundResource(0);
			transtwo.setBackgroundResource(0);
			transthree.setBackgroundResource(0);
			transfive.setBackgroundResource(0);
			transsix.setBackgroundResource(0);
			transseven.setBackgroundResource(0);
			transeight.setImageResource(R.drawable.backwhite);
			transnine.setImageResource(R.drawable.bookmarkwhite);
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			transeight.setAlpha(80);
			transnine.setAlpha(80);
			homeimage.setAlpha(80);
			searchimage.setAlpha(80);
			moreimage.setAlpha(80);
			if(transone.isFocused() || transtwo.isFocused() || transthree.isFocused() || transfive.isFocused() || transsix.isFocused() || transseven.isFocused())
			{

			}
			else
			{
				watchnow.requestFocus();
			}
		}
	}
	
	public void actorsbutton(View view)
	{
		actorsinfo.requestFocus();
	}

	public void more(View vew)
	{

	}

	public void empty(View view)
	{

	}

	public void information(View view)
	{
		movieinfo.requestFocus();
	}

	public void protinomena(View view)
	{
		protinomena.requestFocus();
	}
	
	public void bookmark(View view)
	{
		SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
		SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_APPEND);
		int a = 0;
		try
		{
			a = sh.getInt("number",0);
		}
		catch(Exception e){}
		int tempi = 0;
		int iser = 0;
		for(int i = 0; i < a;i++)
		{
			if(id.equals(sh.getString("id"+String.valueOf(i),"")))
			{
				tempi = i;
				iser = 1;
			}
		}
		if(iser == 1)
		{
			SharedPreferences.Editor myEdit = sharedPreferences.edit();
			myEdit.remove("id"+String.valueOf(tempi));
			myEdit.remove("type"+String.valueOf(tempi));
			myEdit.remove("image"+String.valueOf(tempi));
			myEdit.remove("backdrop"+String.valueOf(tempi));
			myEdit.remove("release"+String.valueOf(tempi));
			myEdit.remove("name"+String.valueOf(tempi));
			myEdit.remove("description"+String.valueOf(tempi));
			myEdit.remove("genres"+String.valueOf(tempi));
			myEdit.commit();
			Toast.makeText(third.this,"Removed From Favorites",Toast.LENGTH_SHORT).show();
		}
		else
		{
			SharedPreferences.Editor myEdit = sharedPreferences.edit();
			myEdit.putInt("number", a+1);
			myEdit.putString("id"+String.valueOf(a), id);
			myEdit.putString("type"+String.valueOf(a), "tv");
			myEdit.putString("image"+String.valueOf(a), sharedphoto);
			myEdit.putString("backdrop"+String.valueOf(a),sharedbackdrop);
			myEdit.putString("release"+String.valueOf(a), sharedrelease);
			myEdit.putString("name"+String.valueOf(a), sharedname);
			myEdit.putString("description"+String.valueOf(a), shareddescription);
			myEdit.putString("genres"+String.valueOf(a),sharedgenres);
			myEdit.commit();
			Toast.makeText(third.this,"Added To Favorites",Toast.LENGTH_SHORT).show();
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
		Intent intent = new Intent(third.this, search.class);
		startActivity(intent);
	}

	public void home(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(third.this, MainActivity.class);
		startActivity(intent);
	}
	
	public void watch(View view)
	{
		seasonsinfo.requestFocus();
	}
	
	public void watchenglish(View view)
	{
		seasonsinfo.requestFocus();
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
			sorter2(result);
			if(syncer == 4)
			{
				if(pd.isShowing())
				{
					pd.dismiss();
				}
			}
			else
			{
				syncer += 1;
				if(syncer == 5)
				{
					if(pd.isShowing())
					{
						pd.dismiss();
					}
				}
			}
    	}

		public void sorter2(String jso)
		{
			try
			{
				JSONObject obj = new JSONObject(jso);
				sharedbackdrop = obj.getString("backdrop_path");
				sharedphoto = obj.getString("poster_path");
				AsyncTask dow = new DownloadImageTask(background).execute("https://image.tmdb.org/t/p/w780"+obj.getString("backdrop_path"));
				down.add(dow);
				sharedname = obj.getString("original_name");
				title.setText(obj.getString("original_name"));
				JSONArray g = obj.getJSONArray("genres");
				String[] fin = new String[g.length()];
				for(int i = 0;i < g.length();i++)
				{
					fin[i] = g.get(i).toString();
				}
				StringBuilder stringBuilder = new StringBuilder();
				StringBuilder genresid = new StringBuilder();
				for(int i = 0;i < fin.length;i++)
				{
					JSONObject obj2 = new JSONObject(fin[i]);
					stringBuilder.append(obj2.getString("name")+",");
					genresid.append(obj2.getString("id")+",");
				}
				String genresidfin = genresid.toString();
				String genresidfjnn = genresidfin.substring(0,genresidfin.length()-1);
				genres4 = genresidfjnn;
				new json4().execute("https://api.themoviedb.org/3/discover/tv?with_genres="+genresidfjnn+"&language=el-GR");
				String resultString = stringBuilder.toString();
				type.setText(resultString.substring(0,resultString.length()-1));
				sharedgenres = resultString.substring(0,resultString.length()-1);
				sharedrelease = obj.getString("first_air_date");
				yearandstars.setText(obj.getString("first_air_date")+"   ★"+obj.getString("vote_average").substring(0,3)+"   "+obj.getString("episode_run_time")+"mins   total episodes:"+obj.getString("number_of_episodes"));
				description.setText(obj.getString("overview"));
				shareddescription = obj.getString("overview");
				JSONArray gg = obj.getJSONArray("seasons");
				String[] fil = new String[gg.length()];
				for(int i = 0;i < gg.length();i++)
				{
					fil[i] = gg.get(i).toString();
				}
				int total = 0;
				for(int i = 0;i < fil.length;i++)
				{
					total += 1;
				}
				int counter = 0;
				int seasoner = 1;
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(350);
					spacer(110);
				}
				for(int i = 0;i < fil.length;i++)
				{
					JSONObject fil2 = new JSONObject(fil[i]);
					if(fil2.getString("season_number").startsWith("0"))
					{
						
					}
					else
					{
						if(counter==0)
						{
							butt(fil2.getString("name"),fil2.getString("poster_path"),fil2.getString("air_date"),fil2.getString("id"),fil2.getString("episode_count"),seasoner,1);
						}
						else if(counter == total-1)
						{
							butt(fil2.getString("name"),fil2.getString("poster_path"),fil2.getString("air_date"),fil2.getString("id"),fil2.getString("episode_count"),seasoner,2);
						}
						else
						{
							butt(fil2.getString("name"),fil2.getString("poster_path"),fil2.getString("air_date"),fil2.getString("id"),fil2.getString("episode_count"),seasoner,0);
						}
						counter += 1;
						seasoner += 1;
					}
				}
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(425);
				}
				new json2().execute("https://api.themoviedb.org/3/tv/"+id+"/videos?language=el-GR");

			}
			catch (Exception e){}
		}
		
		public void spacer(int size)
		{
			Space spacer = new Space(third.this);
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
			spacer.setLayoutParams(layoutParams);
			seasonslayout.addView(spacer);
		}

		public void butt(final String te,final String image,final String release,final String idd,final String episodes,final int seasonum,final int first)
		{
			final LinearLayout one = new LinearLayout(third.this);
			final LinearLayout textslay = new LinearLayout(third.this);
			final ImageView two = new ImageView(third.this);
			final Space spacer = new Space(third.this);
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
				textslay.setOrientation(LinearLayout.VERTICAL);
				textslay.setBackgroundColor(Color.parseColor("#414141"));
				TextView three = new TextView(third.this);
				TextView four = new TextView(third.this);
				Space spacertwo = new Space(third.this);
				spacertwo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,20));
				one.setOrientation(LinearLayout.VERTICAL);
				four.setText(release);
				three.setText(te);
				three.setTextColor(Color.parseColor("#000000"));
				AsyncTask dow = new DownloadImageTask(two).execute("https://image.tmdb.org/t/p/w185"+image);
				down.add(dow);
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(450, 450);
				two.setLayoutParams(layoutParams);
				two.setAdjustViewBounds(true);
				one.setBackground(getResources().getDrawable(R.drawable.one));
				three.setLayoutParams(new LinearLayout.LayoutParams(450, 50));
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
				TextView three = new TextView(third.this);
				TextView five = new TextView(third.this);
				TextView four = new TextView(third.this);
				one.setOrientation(LinearLayout.VERTICAL);
				four.setText(release);
				three.setText(te);
				three.setTextColor(Color.parseColor("#000000"));
				five.setTextColor(Color.parseColor("#000000"));
				five.setText(episodes+" ep");
				AsyncTask dow = new DownloadImageTask(two).execute("https://image.tmdb.org/t/p/w92"+image);
				down.add(dow);
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(250, 250);
				two.setLayoutParams(layoutParams);
				two.setAdjustViewBounds(true);
				one.setBackground(getResources().getDrawable(R.drawable.button));
				one.addView(two);
				one.addView(three);
				one.addView(five);
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
					Intent intent = new Intent(third.this, episodes.class);
					intent.putExtra("id",id);
					intent.putExtra("seassonum",seasonum);
					startActivity(intent);
		 		}
		 	});
			one.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(p2)
						{
							AsyncTask dow = new DownloadImageTask(seasonsimageview).execute("https://image.tmdb.org/t/p/w185"+image);
							down.add(dow);
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								scroller3.setCenter(one);
								textslay.setBackgroundColor(Color.parseColor("#0078FF"));
								two.setBackgroundColor(Color.parseColor("#FFFFFF"));
								two.setPadding(50,5,50,5);
								two.setAlpha(255);
								textslay.getBackground().setAlpha(255);
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
			one.setOnKeyListener(new OnKeyListener()
				{
					@Override
					public boolean onKey(View p1, int p2, KeyEvent p3)
					{
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							watchnow.requestFocus();
							return true;
						}
						if(first == 2)
						{	
							if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								return true;
							}
						}
						return false;
					}
				});
			if(first == 1)
			{
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					seasonfirst = one;
					try
					{
						scroller3.setCenter(one);
					}
					catch(Exception e){}
				}
			}
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				seasonslayout.addView(one);
				seasonslayout.addView(spacer);
			}
			else
			{
				one.setNextFocusUpId(R.id.watchnow);
				seasonslayout.addView(one);
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
			String[] one = sorter(result);
			int chemer = sorter2(one);
			if(chemer == 1)
			{
				if(syncer == 4)
				{
					if(pd.isShowing())
					{
						pd.dismiss();
					}
				}
				else
				{
					syncer += 1;
					if(syncer == 5)
					{
						if(pd.isShowing())
						{
							pd.dismiss();
						}
					}
				}
			}
    	}

		public int sorter2(String[] jso)
		{
			try
			{
				for(int i = 0;i < jso.length;i++)
				{
					final JSONObject obj = new JSONObject(jso[i]);
					if(obj.getString("official").equals("true") && obj.getString("type").equals("Trailer") && obj.getString("site").startsWith("YouTube"))
					{
						if(getResources().getBoolean(R.bool.is_landscape))
						{
							if(english == 0)
							{
								youtubebuttonrot.setText("Ελληνικό Trailer");
							}
							else
							{
								youtubebuttonrot.setText("Αγγλικό Trailer");
							}
						}
						else
						{
							youtubebutton.setImageResource(R.drawable.youtubeselector);
						}
						youtubelink = "https://www.youtube.com/watch?v="+obj.getString("key");
						return 1;
					}
					else if(obj.getString("type").equals("Trailer") && obj.getString("site").startsWith("YouTube"))
					{
						if(getResources().getBoolean(R.bool.is_landscape))
						{
							if(english == 0)
							{
								youtubebuttonrot.setText("Ελληνικό Trailer");
							}
							else
							{
								youtubebuttonrot.setText("Αγγλικό Trailer");
							}
						}
						else
						{
							youtubebutton.setImageResource(R.drawable.youtubeselector);
						}
						youtubelink = "https://www.youtube.com/watch?v="+obj.getString("key");
						return 1;
					}
				}
				if(english == 0)
				{
					english = 1;
					new json2().execute("https://api.themoviedb.org/3/tv/"+id+"/videos?language=en-US");
					return 0;
				}
			}
			catch (Exception e){}
			return 1;
		}

		public String[] sorter(String jso)
		{
			try
			{
				JSONObject obj = new JSONObject(jso);
				JSONArray objarr = obj.getJSONArray("results");
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
	}

	public void youtubel(View view)
	{
		try
		{
			Intent webIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(youtubelink));
			third.this.startActivity(webIntent);
		}
		catch(Exception e){}
	}

	private class json3 extends AsyncTask<String, String, String>
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
			if(syncer == 4)
			{
				if(pd.isShowing())
				{
					pd.dismiss();
				}
			}
			else
			{
				syncer += 1;
				if(syncer == 5)
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
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(350);
					spacer(110);
				}
				int total = 0;
				for(int i = 0;i < jso.length;i++)
				{
					final JSONObject obj = new JSONObject(jso[i]);
					try
					{
						if(obj.getString("known_for_department").equals("Acting"))
						{
							total += 1;
						}
					}
					catch(Exception e){}
				}
				int counter = 0;
				for(int i = 0;i < jso.length;i++)
				{
					final JSONObject obj = new JSONObject(jso[i]);
					try
					{
						if(obj.getString("known_for_department").equals("Acting"))
						{
							if(counter == 0)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									butto(obj.getString("profile_path"),obj.getString("name"),obj.getString("character"),obj.getString("id"),1);
								}
								else
								{
									butto(obj.getString("profile_path"),obj.getString("name"),obj.getString("character"),obj.getString("id"),1);
								}
							}
							else if(counter == total -1)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									butto(obj.getString("profile_path"),obj.getString("name"),obj.getString("character"),obj.getString("id"),2);
								}
								else
								{
									butto(obj.getString("profile_path"),obj.getString("name"),obj.getString("character"),obj.getString("id"),2);
								}
							}
							else
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									butto(obj.getString("profile_path"),obj.getString("name"),obj.getString("character"),obj.getString("id"),0);
								}
								else
								{
									butto(obj.getString("profile_path"),obj.getString("name"),obj.getString("character"),obj.getString("id"),0);
								}
							}
							counter += 1;
						}
					}
					catch(Exception e){}
				}
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(425);
				}
			}
			catch (Exception e){}
		}

		public String[] sorter(String jso)
		{
			try
			{
				JSONObject obj = new JSONObject(jso);
				JSONArray objarr = obj.getJSONArray("cast");
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
		
		public void spacer(int size)
		{
			Space spacer = new Space(third.this);
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
			spacer.setLayoutParams(layoutParams);
			castlayout.addView(spacer);
		}

		public void butto(final String image,final String name,final String actingname,final String idd,final int first)
		{
			final LinearLayout one = new LinearLayout(third.this);
			final LinearLayout textslay = new LinearLayout(third.this);
			final ImageView two = new ImageView(third.this);
			final Space spacer = new Space(third.this);
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
				textslay.setOrientation(LinearLayout.VERTICAL);
				textslay.setBackgroundColor(Color.parseColor("#414141"));
				TextView three = new TextView(third.this);
				TextView four = new TextView(third.this);
				Space spacertwo = new Space(third.this);
				spacertwo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,20));
				one.setOrientation(LinearLayout.VERTICAL);
				four.setText("("+actingname+")");
				three.setText(name);
				three.setTextColor(Color.parseColor("#000000"));
				AsyncTask dow = new DownloadcircleTask(two).execute("https://image.tmdb.org/t/p/w185"+image);
				down.add(dow);
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(450, 450);
				two.setLayoutParams(layoutParams);
				two.setAdjustViewBounds(true);
				one.setBackground(getResources().getDrawable(R.drawable.one));
				three.setLayoutParams(new LinearLayout.LayoutParams(450, 50));
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
				TextView three = new TextView(third.this);
				TextView four = new TextView(third.this);
				one.setOrientation(LinearLayout.VERTICAL);
				four.setText("("+actingname+")");
				three.setText(name);
				three.setTextColor(Color.parseColor("#000000"));
				AsyncTask dow = new DownloadImageTask(two).execute("https://image.tmdb.org/t/p/w185"+image);
				down.add(dow);
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(250, 250);
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
						Intent intent = new Intent(third.this, actorsmovies.class);
						intent.putExtra("id",idd);
						startActivity(intent);
					}
				});
			one.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(p2)
						{
							AsyncTask dow = new DownloadImageTask(actorsimageview).execute("https://image.tmdb.org/t/p/w185"+image);
							down.add(dow);
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								scroller2.setCenter(one);
								textslay.setBackgroundColor(Color.parseColor("#0078FF"));
								two.setBackgroundDrawable(getDrawable(R.drawable.simplecircle));
								two.setAlpha(255);
								textslay.getBackground().setAlpha(255);
							}
						}
						else
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								textslay.setBackgroundColor(Color.parseColor("#414141"));
								two.setBackgroundResource(0);
								two.setAlpha(150);
								textslay.getBackground().setAlpha(150);
							}
						}
					}
				});
			one.setOnKeyListener(new OnKeyListener()
				{
					@Override
					public boolean onKey(View p1, int p2, KeyEvent p3)
					{
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							watchnow.requestFocus();
							return true;
						}
						if(first == 2)
						{	
							if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								return true;
							}
						}
						return false;
					}
				});
			if(first == 1)
			{
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					actorsfirst = one;
					try
					{
						scroller2.setCenter(one);
					}
					catch(Exception e){}
				}
			}
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				castlayout.addView(one);
				castlayout.addView(spacer);
			}
			else
			{
				castlayout.addView(one);
			}
		}
	}
	
	private class json4 extends AsyncTask<String, String, String>
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
			if(syncer == 4)
			{
				if(pd.isShowing())
				{
					pd.dismiss();
				}
			}
			else
			{
				syncer += 1;
				if(syncer == 5)
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
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(350);
					spacer(35);
				}
				int total = 0;
				int counter = 0;
				for(int i = 0;i < jso.length;i++)
				{
					final JSONObject obj = new JSONObject(jso[i]);
					try
					{
						total += 1;
					}
					catch(Exception e){}
				}
				for(int i = 0;i < jso.length;i++)
				{
					final JSONObject obj = new JSONObject(jso[i]);
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
								butto(obj.getString("backdrop_path"),obj.getString("name"),obj.getString("first_air_date"),obj.getString("id"),"",false,obj.getString("backdrop_path"),1,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butto(obj.getString("poster_path"),obj.getString("original_name"),obj.getString("first_air_date"),obj.getString("id"),"",false,obj.getString("poster_path"),1,obj.getString("overview"),"");
							}
						}
						else if(counter == total)
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
								butto(obj.getString("backdrop_path"),obj.getString("name"),obj.getString("first_air_date"),obj.getString("id"),"",false,obj.getString("backdrop_path"),2,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butto(obj.getString("poster_path"),obj.getString("original_name"),obj.getString("first_air_date"),obj.getString("id"),"",false,obj.getString("poster_path"),2,obj.getString("overview"),"");
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
								butto(obj.getString("backdrop_path"),obj.getString("name"),obj.getString("first_air_date"),obj.getString("id"),"",false,obj.getString("backdrop_path"),0,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butto(obj.getString("poster_path"),obj.getString("original_name"),obj.getString("first_air_date"),obj.getString("id"),"",false,obj.getString("poster_path"),0,obj.getString("overview"),"");
							}
						}
						counter += 1;
					}
					catch(Exception e){}
				}
				butto("","","","",genres4,true,"",0,"","");
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(350);
				}
			}
			catch (Exception e){}
		}

		public String[] sorter(String jso)
		{
			try
			{
				JSONObject obj = new JSONObject(jso);
				JSONArray objarr = obj.getJSONArray("results");
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
		
		public void spacer(int size)
		{
			Space spacer = new Space(third.this);
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
			spacer.setLayoutParams(layoutParams);
			recomendedlayout.addView(spacer);
		}

		public void butto(final String image,final String te,final String release,final String idd,final String genres,final boolean ok,final String backdrop,final int first,final String description,final String final_genres)
		{
			if(ok)
			{
				final LinearLayout one = new LinearLayout(third.this);
				final LinearLayout textslay = new LinearLayout(third.this);
				final ImageView two = new ImageView(third.this);
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					textslay.setOrientation(LinearLayout.VERTICAL);
					textslay.setBackgroundColor(Color.parseColor("#414141"));
					TextView three = new TextView(third.this);
					TextView four = new TextView(third.this);
					Space spacertwo = new Space(third.this);
					spacertwo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,20));
					one.setOrientation(LinearLayout.VERTICAL);
					four.setText("");
					three.setText("Show all");
					three.setTextColor(Color.parseColor("#000000"));
					two.setImageResource(R.drawable.more);
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
					TextView three = new TextView(third.this);
					TextView four = new TextView(third.this);
					one.setOrientation(LinearLayout.VERTICAL);
					three.setText("Show all");
					four.setText("");
					three.setTextColor(Color.parseColor("#000000"));
					two.setImageResource(R.drawable.more);
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(250, 250);
					two.setLayoutParams(layoutParams);
					two.setAdjustViewBounds(true);
					one.setBackground(getResources().getDrawable(R.drawable.button));
					three.setLayoutParams(new LinearLayout.LayoutParams(250, 100));
					one.addView(two);
					one.addView(four);
					one.addView(three);
				}
				one.setOnClickListener(new OnClickListener()
					{
						public void onClick(View view)
						{
							for(int i = 0;i< down.size();i++)
							{
								down.get(i).cancel(true);
							}
							Intent intent = new Intent(third.this, all.class);
							intent.putExtra("type","genres-tv");
							intent.putExtra("genres",genres);
							startActivity(intent);
						}
					});
				one.setOnFocusChangeListener(new OnFocusChangeListener()
					{
						@Override
						public void onFocusChange(View p1, boolean p2)
						{
							if(p2)
							{
								findViewById(R.id.protinomenaid).setBackgroundColor(Color.parseColor("#000000"));
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									scroller.setCenter(one);
									textslay.setBackgroundColor(Color.parseColor("#0078FF"));
									two.setBackgroundColor(Color.parseColor("#FFFFFF"));
									two.setPadding(5,5,5,5);
									two.setAlpha(255);
									textslay.getBackground().setAlpha(255);
									menutitle.setText("Show all");
									menutitle.setTextSize(50);
									menudate.setText("");
									menudescription.setText("");
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
				one.setOnKeyListener(new OnKeyListener()
					{
						@Override
						public boolean onKey(View p1, int p2, KeyEvent p3)
						{
							if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								watchnow.requestFocus();
								return true;
							}
							if(first == 2)
							{	
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									return true;
								}
							}
							return false;
						}
					});
				if(first == 1)
				{
					if(getResources().getBoolean(R.bool.is_landscape))
					{
						moviefirst = one;
						try
						{
							scroller.setCenter(one);
						}
						catch(Exception e){}
					}
				}
				recomendedlayout.addView(one);
			}
			else
			{
				final LinearLayout one = new LinearLayout(third.this);
				final LinearLayout textslay = new LinearLayout(third.this);
				final ImageView two = new ImageView(third.this);
				Space spacer = new Space(third.this);
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					textslay.setOrientation(LinearLayout.VERTICAL);
					textslay.setBackgroundColor(Color.parseColor("#414141"));
					TextView three = new TextView(third.this);
					TextView four = new TextView(third.this);
					spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
					Space spacertwo = new Space(third.this);
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
					TextView three = new TextView(third.this);
					TextView four = new TextView(third.this);
					one.setOrientation(LinearLayout.VERTICAL);
					four.setText(release);
					three.setText(te);
					three.setTextColor(Color.parseColor("#000000"));
					AsyncTask dow = new DownloadImageTask(two).execute("https://image.tmdb.org/t/p/w92"+image);
					down.add(dow);
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(250, 250);
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
							Intent intent = new Intent(third.this, third.class);
							intent.putExtra("id",idd);
							startActivity(intent);
						}
					});
				one.setOnFocusChangeListener(new OnFocusChangeListener()
					{
						@Override
						public void onFocusChange(View p1,boolean p2)
						{
							if(p2)
							{
								AsyncTask dow = new DownloadBackgroundTask((LinearLayout)findViewById(R.id.protinomenaid)).execute("https://image.tmdb.org/t/p/w780"+backdrop);
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
				one.setOnKeyListener(new OnKeyListener()
					{
						@Override
						public boolean onKey(View p1, int p2, KeyEvent p3)
						{
							if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								watchnow.requestFocus();
								return true;
							}
							if(first == 2)
							{	
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									return true;
								}
							}
							return false;
						}
					});
				if(first == 1)
				{
					if(getResources().getBoolean(R.bool.is_landscape))
					{
						moviefirst = one;
						try
						{
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
					recomendedlayout.addView(one);
				}
			}
		}
	}
	
	private class json5 extends AsyncTask<String, String, String>
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
			if(syncer == 4)
			{
				if(pd.isShowing())
				{
					pd.dismiss();
				}
			}
			else
			{
				syncer += 1;
				if(syncer == 5)
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
				JSONObject obj = new JSONObject(jso);
				imdbid = obj.getString("imdb_id");

			}
			catch (Exception e){}
		}
	}
	
	private class DownloadcircleTask extends AsyncTask<String, Void, Bitmap>
	{
		ImageView bmImage;

		public DownloadcircleTask(ImageView bmImage)
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
			try
			{
				Bitmap imageBitmap=getCircledBitmap(result);
				bmImage.setImageBitmap(imageBitmap);
			}
			catch(Exception e){}
		}

		public Bitmap getCircledBitmap(Bitmap bitmap)
		{
			Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
			Canvas canvas = new Canvas(output);
			final Paint paint = new Paint();
			final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());

			paint.setAntiAlias(true);
			canvas.drawARGB(0, 0, 0, 0);
			canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
			paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
			canvas.drawBitmap(bitmap, rect, rect, paint);

			return output;
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
}
