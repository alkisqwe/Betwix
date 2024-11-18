package com.example.betwix;

import android.app.Activity;
import android.os.Bundle;
import java.net.*;
import android.os.*;
import java.io.*;
import android.util.*;
import org.json.*;
import android.widget.*;
import android.graphics.*;
import android.view.*;
import android.view.View.*;
import android.content.*;
import android.widget.GridLayout.*;
import android.text.*;
import android.app.*;
import java.util.*;
import org.apache.http.impl.execchain.*;
import android.graphics.drawable.*;
import android.widget.NumberPicker.*;
import android.content.res.*;

public class MainActivity extends Activity
{
	public LinearLayout scrool;
	public LinearLayout scrool2;
	public LinearLayout scrool3;
	public ImageView homeimage;
	public ImageView searchimage;
	public ImageView moreimage;
	ProgressDialog pd;
	public int syncer = 0;
	public ArrayList<AsyncTask> down;
	public LinearLayout moviefirst;
	public LinearLayout tvfirst;
	public LinearLayout favfirst;
	public TextView famousmoviestext;
	public TextView famoustvtext;
	public TextView favtext;
	public LinearLayout transone;
	public LinearLayout transtwo;
	public LinearLayout transthree;
	public LinearLayout transfour;
	public LinearLayout transfive;
	public LinearLayout transsix;
	public LinearLayout transseven;
	public Button transeight;
	public Button transnine;
	public Button transten;
	public TextView transeleven;
	public TextView transtwelve;
	public TextView transthirdteen;
	public TextView transfourteen;
	public TextView transfifteen;
	public TextView transsixteen;
	public ImageView movieup;
	public ImageView tvup;
	public ImageView favup;
	public Space tvupspace;
	public Space favupspace;
	public hsv scroller;
	public hsv scroller2;
	public hsv scroller3;
	public TextView menutitle;
	public TextView menudate;
	public TextView menudescription;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		famousmoviestext = (TextView)findViewById(R.id.famousmoviestext);
		famoustvtext = (TextView)findViewById(R.id.famoustvtext);
		favtext = (TextView)findViewById(R.id.favtext);
		scrool = (LinearLayout)findViewById(R.id.scrolview);
		scrool2 = (LinearLayout)findViewById(R.id.scrolviewsiries);
		scrool3 = (LinearLayout)findViewById(R.id.scrolviewmylist);
		homeimage = (ImageView)findViewById(R.id.homeimage);
		searchimage = (ImageView)findViewById(R.id.searchimage);
		moreimage = (ImageView)findViewById(R.id.moreimage);
		homeimage.setImageResource(R.drawable.home);
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(50, 50);
		homeimage.setLayoutParams(layoutParams);
		homeimage.setAdjustViewBounds(true);
		searchimage.setImageResource(R.drawable.search);
		searchimage.setLayoutParams(layoutParams);
		searchimage.setAdjustViewBounds(true);
		moreimage.setImageResource(R.drawable.more);
		moreimage.setLayoutParams(layoutParams);
		moreimage.setAdjustViewBounds(true);
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			movieup = (ImageView)findViewById(R.id.movieup);
			tvup = (ImageView)findViewById(R.id.tvup);
			favup = (ImageView)findViewById(R.id.favup);
			tvupspace = (Space)findViewById(R.id.tvupspace);
			favupspace = (Space)findViewById(R.id.favupspace);
			transone = (LinearLayout)findViewById(R.id.transone);
			transtwo = (LinearLayout)findViewById(R.id.transtwo);
			transthree = (LinearLayout)findViewById(R.id.transthree);
			transfour = (LinearLayout)findViewById(R.id.transfour);
			transfive = (LinearLayout)findViewById(R.id.transfive);
			transsix = (LinearLayout)findViewById(R.id.transsix);
			transseven = (LinearLayout)findViewById(R.id.transseven);
			transeight = (Button)findViewById(R.id.transeight);
			transnine = (Button)findViewById(R.id.transnine);
			transten = (Button)findViewById(R.id.transten);
			transeleven = (TextView)findViewById(R.id.transeleven);
			transtwelve = (TextView)findViewById(R.id.transtwelve);
			transthirdteen = (TextView)findViewById(R.id.transthirdteen);
			transfourteen = (TextView)findViewById(R.id.transfourteen);
			transfifteen = (TextView)findViewById(R.id.transfifteen);
			transsixteen = (TextView)findViewById(R.id.transsixteen);
			scroller = (hsv)findViewById(R.id.scroller);
			scroller2 = (hsv)findViewById(R.id.scroller2);
			scroller3 = (hsv)findViewById(R.id.scroller3);
			menutitle = (TextView)findViewById(R.id.menutitle);
			menudate = (TextView)findViewById(R.id.menudate);
			menudescription = (TextView)findViewById(R.id.menudescription);
			transone.setOnFocusChangeListener(new OnFocusChangeListener()
			{
				@Override
				public void onFocusChange(View p1,boolean p2)
				{
					if(transone == null || transtwo == null || transthree == null || transfour == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || transten == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfour == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || transten == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfour == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || transten == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			transfour.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transtwo == null || transthree == null || transfour == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || transten == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfour == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || transten == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfour == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || transten == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transtwo == null || transthree == null || transfour == null || transfive == null || transsix == null || transseven == null || transeight == null || transnine == null || transten == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			if(scrool2 == null || scrool3 == null || famoustvtext == null || favtext == null || movieup == null || favup == null)
			{
				
			}
			else
			{
				scrool2.setVisibility(View.GONE);
				scrool3.setVisibility(View.GONE);
				famoustvtext.setVisibility(View.GONE);
				favtext.setVisibility(View.GONE);
				movieup.setVisibility(View.GONE);
				tvup.setVisibility(View.VISIBLE);
				tvup.setBackgroundDrawable(getDrawable(R.drawable.down));
				favup.setVisibility(View.GONE);
				tvupspace.setVisibility(View.VISIBLE);
				favupspace.setVisibility(View.GONE);
			}
			if(transeleven == null || transtwelve == null || transthirdteen == null || transfourteen == null || transfifteen == null || transsixteen == null)
			{
				
			}
			else
			{
				transeleven.setVisibility(View.GONE);
				transtwelve.setVisibility(View.GONE);
				transthirdteen.setVisibility(View.GONE);
				transfourteen.setVisibility(View.GONE);
				transfifteen.setVisibility(View.GONE);
				transsixteen.setVisibility(View.GONE);
			}
		}
		pd = new ProgressDialog(MainActivity.this);
		pd.setMessage("Please wait");
		pd.setCancelable(false);
		pd.show();
		down = new ArrayList<>();
		mylist();
		new json().execute("https://api.themoviedb.org/3/movie/popular?language=el-GR&page=1");
		new json2().execute("https://api.themoviedb.org/3/tv/popular?language=el-GR&page=1");
    }
	
	public void favorites(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(MainActivity.this, favorites.class);
		startActivity(intent);
	}
	
	public void navbuttons(boolean p2)
	{
		if(p2)
		{
			transone.setBackgroundColor(Color.parseColor("#000000"));
			transtwo.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transthree.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transfour.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transfive.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transsix.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transseven.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transeight.setBackgroundDrawable(getDrawable(R.drawable.moviewhite));
			transnine.setBackgroundDrawable(getDrawable(R.drawable.tvwhite));
			transten.setBackgroundDrawable(getDrawable(R.drawable.bookmarkwhite));
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			transeight.getBackground().setAlpha(255);
			transnine.getBackground().setAlpha(255);
			transten.getBackground().setAlpha(255);
			homeimage.setAlpha(255);
			searchimage.setAlpha(255);
			moreimage.setAlpha(255);
			transone.setLayoutParams(new LinearLayout.LayoutParams(400,LinearLayout.LayoutParams.MATCH_PARENT));
			transeleven.setVisibility(View.VISIBLE);
			transtwelve.setVisibility(View.VISIBLE);
			transthirdteen.setVisibility(View.VISIBLE);
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
			transthirdteen.setVisibility(View.GONE);
			transfourteen.setVisibility(View.GONE);
			transfifteen.setVisibility(View.GONE);
			transsixteen.setVisibility(View.GONE);
			transone.setBackgroundResource(0);
			transtwo.setBackgroundResource(0);
			transthree.setBackgroundResource(0);
			transfour.setBackgroundResource(0);
			transfive.setBackgroundResource(0);
			transsix.setBackgroundResource(0);
			transseven.setBackgroundResource(0);
			transeight.setBackgroundDrawable(getDrawable(R.drawable.moviewhite));
			transnine.setBackgroundDrawable(getDrawable(R.drawable.tvwhite));
			transten.setBackgroundDrawable(getDrawable(R.drawable.bookmarkwhite));
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			transeight.getBackground().setAlpha(80);
			transnine.getBackground().setAlpha(80);
			transten.getBackground().setAlpha(80);
			homeimage.setAlpha(80);
			searchimage.setAlpha(80);
			moreimage.setAlpha(80);
			if(transone.isFocused() || transtwo.isFocused() || transthree.isFocused() || transfour.isFocused() || transfive.isFocused() || transsix.isFocused() || transseven.isFocused())
			{
				
			}
			else
			{
				if(scrool.getVisibility() == View.VISIBLE)
				{
					if(moviefirst == null)
					{

					}
					else
					{
						moviefirst.requestFocus();
					}
				}
				else if(scrool2.getVisibility() == View.VISIBLE)
				{
					if(tvfirst == null)
					{

					}
					else
					{
						tvfirst.requestFocus();
					}
				}
				else if(scrool3.getVisibility() == View.VISIBLE)
				{
					if(favfirst == null)
					{

					}
					else
					{
						favfirst.requestFocus();
					}
				}
			}
		}
	}
	
	public void mylist()
	{
		try
		{
			SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_APPEND);
			int a = sh.getInt("number",0);
			int frs = 1;
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				createspacer(350);
				createspacer(350);
				createspacer(35);
			}
			for(int i = 0; i < a; i++)
			{
				frs= 0;
				try
				{
					if(i == 0)
					{
						if(sh.getString("type"+String.valueOf(i),"").equals("movie"))
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								moviebutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),sh.getString("backdrop"+String.valueOf(i),""),1,sh.getString("description"+String.valueOf(i),""),sh.getString("genres"+String.valueOf(i),""));
							}
							else
							{
								moviebutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),1,"","");
							}
						}
						else if(sh.getString("type"+String.valueOf(i),"").equals("tv"))
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								tvbutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),sh.getString("backdrop"+String.valueOf(i),""),1,sh.getString("description"+String.valueOf(i),""),sh.getString("genres"+String.valueOf(i),""));
							}
							else
							{
								tvbutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),1,"","");
							}
						}
					}
					else
					{
						if(sh.getString("type"+String.valueOf(i),"").equals("movie"))
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								moviebutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),sh.getString("backdrop"+String.valueOf(i),""),0,sh.getString("description"+String.valueOf(i),""),sh.getString("genres"+String.valueOf(i),""));
							}
							else
							{
								moviebutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),0,"","");
							}
						}
						else if(sh.getString("type"+String.valueOf(i),"").equals("tv"))
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								tvbutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),sh.getString("backdrop"+String.valueOf(i),""),0,sh.getString("description"+String.valueOf(i),""),sh.getString("genres"+String.valueOf(i),""));
							}
							else
							{
								tvbutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),0,"","");
							}
						}
					}
				}
				catch(Exception e){}
			}
			createempty(frs);
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				createspacer(350);
				createspacer(350);
			}
		}
		catch(Exception e){}
	}
	
	public void createspacer(int size)
	{
		Space spacer = new Space(MainActivity.this);
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
		spacer.setLayoutParams(layoutParams);
		scrool3.addView(spacer);
	}
	
	public void createempty(final int first)
	{
		final LinearLayout one = new LinearLayout(MainActivity.this);
		final LinearLayout textslay = new LinearLayout(MainActivity.this);
		final ImageView two = new ImageView(MainActivity.this);
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			textslay.setOrientation(LinearLayout.VERTICAL);
			textslay.setBackgroundColor(Color.parseColor("#414141"));
			TextView three = new TextView(MainActivity.this);
			TextView four = new TextView(MainActivity.this);
			Space spacertwo = new Space(MainActivity.this);
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
			TextView three = new TextView(MainActivity.this);
			TextView four = new TextView(MainActivity.this);
			Space spacer = new Space(MainActivity.this);
			spacer.setLayoutParams(new LinearLayout.LayoutParams(5,LinearLayout.LayoutParams.WRAP_CONTENT));
			one.setOrientation(LinearLayout.VERTICAL);
			String tem = "SHOW ALL";
			three.setText(tem);
			three.setTextColor(Color.parseColor("#000000"));
			two.setBackgroundDrawable(getDrawable(R.drawable.more));
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(350, 350);
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
					Intent intent = new Intent(MainActivity.this, favorites.class);
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
						findViewById(R.id.backdrop).setBackgroundColor(Color.parseColor("#000000"));
						if(getResources().getBoolean(R.bool.is_landscape))
						{
							scroller3.setCenter(one);
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
				public boolean onKey(View p1,int p2,KeyEvent p3)
				{
					if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
					{
						if(getResources().getBoolean(R.bool.is_landscape))
						{
							movieup.setVisibility(View.GONE);
							tvup.setVisibility(View.VISIBLE);
							tvup.setBackgroundDrawable(getDrawable(R.drawable.up));
							favup.setVisibility(View.VISIBLE);
							favup.setBackgroundDrawable(getDrawable(R.drawable.down));
							tvupspace.setVisibility(View.GONE);
							favupspace.setVisibility(View.VISIBLE);
							scrool.setVisibility(View.GONE);
							scrool2.setVisibility(View.VISIBLE);
							scrool3.setVisibility(View.GONE);
							famousmoviestext.setVisibility(View.GONE);
							famoustvtext.setVisibility(View.VISIBLE);
							favtext.setVisibility(View.GONE);
							try
							{
								tvfirst.requestFocus();
							}
							catch(Exception e){}
						}
						return true;
					}
					return false;
				}
			});
		if(first == 1)
		{
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				favfirst = one;
				try
				{
					scroller3.setCenter(one);
				}
				catch(Exception e){}
			}
		}
		scrool3.addView(one);
	}
	
	public void moviebutton(final String te,final String image,final String release,final String idd,final String backdrop,final int first,final String description,final String genres)
	{
		final LinearLayout one = new LinearLayout(MainActivity.this);
		final LinearLayout textslay = new LinearLayout(MainActivity.this);
		final ImageView two = new ImageView(MainActivity.this);
		final Space spacer = new Space(MainActivity.this);
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			textslay.setOrientation(LinearLayout.VERTICAL);
			textslay.setBackgroundColor(Color.parseColor("#414141"));
			TextView three = new TextView(MainActivity.this);
			TextView four = new TextView(MainActivity.this);
			spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
			Space spacertwo = new Space(MainActivity.this);
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
			TextView three = new TextView(MainActivity.this);
			TextView four = new TextView(MainActivity.this);
			spacer.setLayoutParams(new LinearLayout.LayoutParams(5,LinearLayout.LayoutParams.WRAP_CONTENT));
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
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(350, 350);
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
				Intent intent = new Intent(MainActivity.this, second.class);
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
						AsyncTask dow = new DownloadBackgroundTask((LinearLayout)findViewById(R.id.backdrop)).execute("https://image.tmdb.org/t/p/w780"+backdrop);
						down.add(dow);
						if(getResources().getBoolean(R.bool.is_landscape))
						{
							scroller3.setCenter(one);
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
							menudate.setText(Html.fromHtml("<font color='#008000'>"+release+"</font>"+"/"+"<font color='#FF0000'>"+genres+"</font>"));
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
				public boolean onKey(View p1,int p2,KeyEvent p3)
				{
					if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
					{
						if(getResources().getBoolean(R.bool.is_landscape))
						{
							movieup.setVisibility(View.GONE);
							tvup.setVisibility(View.VISIBLE);
							tvup.setBackgroundDrawable(getDrawable(R.drawable.up));
							favup.setVisibility(View.VISIBLE);
							favup.setBackgroundDrawable(getDrawable(R.drawable.down));
							tvupspace.setVisibility(View.GONE);
							favupspace.setVisibility(View.VISIBLE);
							scrool.setVisibility(View.GONE);
							scrool2.setVisibility(View.VISIBLE);
							scrool3.setVisibility(View.GONE);
							famousmoviestext.setVisibility(View.GONE);
							famoustvtext.setVisibility(View.VISIBLE);
							favtext.setVisibility(View.GONE);
							try
							{
								tvfirst.requestFocus();
							}
							catch(Exception e){}
						}
						return true;
					}
					return false;
				}
			});
		if(first == 1)
		{
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				favfirst = one;
				try
				{
					scroller3.setCenter(one);
				}
				catch(Exception e){}
			}
		}
		scrool3.addView(one);
		scrool3.addView(spacer);
	}
	
	public void tvbutton(final String te,final String image,final String release,final String idd,final String backdrop,final int first,final String description,final String genres)
	{
		final LinearLayout one = new LinearLayout(MainActivity.this);
		final LinearLayout textslay = new LinearLayout(MainActivity.this);
		final ImageView two = new ImageView(MainActivity.this);
		final Space spacer = new Space(MainActivity.this);
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			textslay.setOrientation(LinearLayout.VERTICAL);
			textslay.setBackgroundColor(Color.parseColor("#414141"));
			TextView three = new TextView(MainActivity.this);
			TextView four = new TextView(MainActivity.this);
			spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
			Space spacertwo = new Space(MainActivity.this);
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
			TextView three = new TextView(MainActivity.this);
			TextView four = new TextView(MainActivity.this);
			spacer.setLayoutParams(new LinearLayout.LayoutParams(5,LinearLayout.LayoutParams.WRAP_CONTENT));
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
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(350, 350);
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
				Intent intent = new Intent(MainActivity.this, third.class);
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
						AsyncTask dow = new DownloadBackgroundTask((LinearLayout)findViewById(R.id.backdrop)).execute("https://image.tmdb.org/t/p/w780"+backdrop);
						down.add(dow);
						if(getResources().getBoolean(R.bool.is_landscape))
						{
							scroller3.setCenter(one);
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
							menudate.setText(Html.fromHtml("<font color='#008000'>"+release+"</font>"+"/"+"<font color='#FF0000'>"+genres+"</font>"));
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
				public boolean onKey(View p1,int p2,KeyEvent p3)
				{
					if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
					{
						if(getResources().getBoolean(R.bool.is_landscape))
						{
							movieup.setVisibility(View.GONE);
							tvup.setVisibility(View.VISIBLE);
							tvup.setBackgroundDrawable(getDrawable(R.drawable.up));
							favup.setVisibility(View.VISIBLE);
							favup.setBackgroundDrawable(getDrawable(R.drawable.down));
							tvupspace.setVisibility(View.GONE);
							favupspace.setVisibility(View.VISIBLE);
							scrool.setVisibility(View.GONE);
							scrool2.setVisibility(View.VISIBLE);
							scrool3.setVisibility(View.GONE);
							famousmoviestext.setVisibility(View.GONE);
							famoustvtext.setVisibility(View.VISIBLE);
							favtext.setVisibility(View.GONE);
							try
							{
								tvfirst.requestFocus();
							}
							catch(Exception e){}
						}
						return true;
					}
					return false;
				}
			});
		if(first == 1)
		{
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				favfirst = one;
				try
				{
					scroller3.setCenter(one);
				}
				catch(Exception e){}
			}
		}
		scrool3.addView(one);
		scrool3.addView(spacer);
	}
	
	public void tvsectionn(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(MainActivity.this, tvsection.class);
		startActivity(intent);
	}
	
	public void home(View view)
	{
		
	}
	
	public void more(View view)
	{
		
	}
	
	public void moviessectionn(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(MainActivity.this, moviessection.class);
		startActivity(intent);
	}
	
	public void search(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(MainActivity.this, search.class);
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
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(350);
				}
				for(int i = 0;i < jso.length;i++)
				{
					JSONObject obj = new JSONObject(jso[i]);
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
								butt(obj.getString("title"),obj.getString("poster_path"),obj.getString("release_date"),obj.getString("id"),false,obj.getString("backdrop_path"),1,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butt(obj.getString("original_title"),obj.getString("poster_path"),obj.getString("release_date"),obj.getString("id"),false,obj.getString("poster_path"),1,obj.getString("overview"),"");
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
								butt(obj.getString("title"),obj.getString("poster_path"),obj.getString("release_date"),obj.getString("id"),false,obj.getString("backdrop_path"),0,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butt(obj.getString("original_title"),obj.getString("poster_path"),obj.getString("release_date"),obj.getString("id"),false,obj.getString("poster_path"),0,obj.getString("overview"),"");
							}
						}
					}
					catch(Exception e){}
				}
				butt("","","","",true,"",0,"","");
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(320);
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
			Space spacer = new Space(MainActivity.this);
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
			spacer.setLayoutParams(layoutParams);
			scrool.addView(spacer);
		}
		
		public void butt(final String te,final String image,final String release,final String id,final boolean ok,final String backdrop,final int first,final String description,final String genres)
		{
			if(ok)
			{
				final LinearLayout one = new LinearLayout(MainActivity.this);
				final LinearLayout textslay = new LinearLayout(MainActivity.this);
				final ImageView two = new ImageView(MainActivity.this);
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					textslay.setOrientation(LinearLayout.VERTICAL);
					textslay.setBackgroundColor(Color.parseColor("#414141"));
					TextView three = new TextView(MainActivity.this);
					TextView four = new TextView(MainActivity.this);
					Space spacertwo = new Space(MainActivity.this);
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
					TextView three = new TextView(MainActivity.this);
					TextView four = new TextView(MainActivity.this);
					one.setOrientation(LinearLayout.VERTICAL);
					three.setText("Show all");
					four.setText("");
					three.setTextColor(Color.parseColor("#000000"));
					two.setImageResource(R.drawable.more);
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(350, 350);
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
							Intent intent = new Intent(MainActivity.this, all.class);
							intent.putExtra("type","popular-movies");
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
								findViewById(R.id.backdrop).setBackgroundColor(Color.parseColor("#000000"));
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
						public boolean onKey(View p1,int p2,KeyEvent p3)
						{
							if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									movieup.setVisibility(View.GONE);
									tvup.setVisibility(View.VISIBLE);
									tvup.setBackgroundDrawable(getDrawable(R.drawable.up));
									favup.setVisibility(View.VISIBLE);
									favup.setBackgroundDrawable(getDrawable(R.drawable.down));
									tvupspace.setVisibility(View.GONE);
									favupspace.setVisibility(View.VISIBLE);
									scrool.setVisibility(View.GONE);
									scrool2.setVisibility(View.VISIBLE);
									scrool3.setVisibility(View.GONE);
									famousmoviestext.setVisibility(View.GONE);
									famoustvtext.setVisibility(View.VISIBLE);
									favtext.setVisibility(View.GONE);
									try
									{
										tvfirst.requestFocus();
									}
									catch(Exception e){}
								}
								return true;
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
							one.requestFocus();
							scroller.setCenter(one);
						}
						catch(Exception e){}
					}
				}
				scrool.addView(one);
			}
			else
			{
				final LinearLayout one = new LinearLayout(MainActivity.this);
				final LinearLayout textslay = new LinearLayout(MainActivity.this);
				final ImageView two = new ImageView(MainActivity.this);
				Space spacer = new Space(MainActivity.this);
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					textslay.setOrientation(LinearLayout.VERTICAL);
					textslay.setBackgroundColor(Color.parseColor("#414141"));
					TextView three = new TextView(MainActivity.this);
					TextView four = new TextView(MainActivity.this);
					spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
					Space spacertwo = new Space(MainActivity.this);
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
					TextView three = new TextView(MainActivity.this);
					TextView four = new TextView(MainActivity.this);
					spacer.setLayoutParams(new LinearLayout.LayoutParams(5,LinearLayout.LayoutParams.WRAP_CONTENT));
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
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(350, 350);
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
							Intent intent = new Intent(MainActivity.this, second.class);
							intent.putExtra("id",id);
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
									menudate.setText(Html.fromHtml("<font color='#008000'>"+release+"</font>"+"/"+"<font color='#FF0000'>"+genres+"</font>"));
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
						public boolean onKey(View p1,int p2,KeyEvent p3)
						{
							if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									movieup.setVisibility(View.GONE);
									tvup.setVisibility(View.VISIBLE);
									tvup.setBackgroundDrawable(getDrawable(R.drawable.up));
									favup.setVisibility(View.VISIBLE);
									favup.setBackgroundDrawable(getDrawable(R.drawable.down));
									tvupspace.setVisibility(View.GONE);
									favupspace.setVisibility(View.VISIBLE);
									scrool.setVisibility(View.GONE);
									scrool2.setVisibility(View.VISIBLE);
									scrool3.setVisibility(View.GONE);
									famousmoviestext.setVisibility(View.GONE);
									famoustvtext.setVisibility(View.VISIBLE);
									favtext.setVisibility(View.GONE);
									try
									{
										tvfirst.requestFocus();
									}
									catch(Exception e){}
								}
								return true;
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
							one.requestFocus();
							scroller.setCenter(one);
						}
						catch(Exception e){}
					}
				}
				scrool.addView(one);
				scrool.addView(spacer);
			}
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
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					spacer(350);
					spacer(350);
					spacer(35);
				}
				for(int i = 0;i < jso.length;i++)
				{
					JSONObject obj = new JSONObject(jso[i]);
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
								butt(obj.getString("name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),false,obj.getString("backdrop_path"),1,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butt(obj.getString("original_name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),false,obj.getString("poster_path"),1,obj.getString("overview"),"");
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
								butt(obj.getString("name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),false,obj.getString("backdrop_path"),0,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butt(obj.getString("original_name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),false,obj.getString("poster_path"),0,obj.getString("overview"),"");
							}
						}
					}
					catch(Exception e){}
				}
				butt("","","","",true,"",0,"","");
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
			Space spacer = new Space(MainActivity.this);
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
			spacer.setLayoutParams(layoutParams);
			scrool2.addView(spacer);
		}

		public void butt(final String te,final String image,final String release,final String id,final boolean ok,final String backdrop,final int first,final String description,final String genres)
		{
			if(ok)
			{
				final LinearLayout one = new LinearLayout(MainActivity.this);
				final LinearLayout textslay = new LinearLayout(MainActivity.this);
				final ImageView two = new ImageView(MainActivity.this);
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					textslay.setOrientation(LinearLayout.VERTICAL);
					textslay.setBackgroundColor(Color.parseColor("#414141"));
					TextView three = new TextView(MainActivity.this);
					TextView four = new TextView(MainActivity.this);
					Space spacertwo = new Space(MainActivity.this);
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
					TextView three = new TextView(MainActivity.this);
					TextView four = new TextView(MainActivity.this);
					one.setOrientation(LinearLayout.VERTICAL);
					three.setText("Show all");
					four.setText("");
					three.setTextColor(Color.parseColor("#000000"));
					two.setImageResource(R.drawable.more);
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(350, 350);
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
							Intent intent = new Intent(MainActivity.this, all.class);
							intent.putExtra("type","popular-tv");
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
								findViewById(R.id.backdrop).setBackgroundColor(Color.parseColor("#000000"));
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									scroller2.setCenter(one);
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
						public boolean onKey(View p1,int p2,KeyEvent p3)
						{
							if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									movieup.setVisibility(View.GONE);
									tvup.setVisibility(View.VISIBLE);
									tvup.setBackgroundDrawable(getDrawable(R.drawable.down));
									favup.setVisibility(View.GONE);
									tvupspace.setVisibility(View.VISIBLE);
									favupspace.setVisibility(View.GONE);
									scrool.setVisibility(View.VISIBLE);
									scrool2.setVisibility(View.GONE);
									scrool3.setVisibility(View.GONE);
									famousmoviestext.setVisibility(View.VISIBLE);
									famoustvtext.setVisibility(View.GONE);
									favtext.setVisibility(View.GONE);
									try
									{
										moviefirst.requestFocus();
									}
									catch(Exception e){}
								}
								return true;
							}
							else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									movieup.setVisibility(View.GONE);
									tvup.setVisibility(View.GONE);
									favup.setVisibility(View.VISIBLE);
									favup.setBackgroundDrawable(getDrawable(R.drawable.up));
									tvupspace.setVisibility(View.GONE);
									favupspace.setVisibility(View.GONE);
									scrool.setVisibility(View.GONE);
									scrool2.setVisibility(View.GONE);
									scrool3.setVisibility(View.VISIBLE);
									famousmoviestext.setVisibility(View.GONE);
									famoustvtext.setVisibility(View.GONE);
									favtext.setVisibility(View.VISIBLE);
									try
									{
										favfirst.requestFocus();
									}
									catch(Exception e){}
								}
								return true;
							}
							return false;
						}
					});
				if(first == 1)
				{
					if(getResources().getBoolean(R.bool.is_landscape))
					{
						tvfirst = one;
						try
						{
							scroller2.setCenter(one);
						}
						catch(Exception e){}
					}
				}
				scrool2.addView(one);
			}
			else
			{
				final LinearLayout one = new LinearLayout(MainActivity.this);
				final LinearLayout textslay = new LinearLayout(MainActivity.this);
				final Space spacer = new Space(MainActivity.this);
				final ImageView two = new ImageView(MainActivity.this);
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					textslay.setOrientation(LinearLayout.VERTICAL);
					textslay.setBackgroundColor(Color.parseColor("#414141"));
					TextView three = new TextView(MainActivity.this);
					TextView four = new TextView(MainActivity.this);
					spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
					Space spacertwo = new Space(MainActivity.this);
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
					TextView three = new TextView(MainActivity.this);
					TextView four = new TextView(MainActivity.this);
					spacer.setLayoutParams(new LinearLayout.LayoutParams(5,LinearLayout.LayoutParams.WRAP_CONTENT));
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
					LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(350, 350);
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
						Intent intent = new Intent(MainActivity.this, third.class);
						intent.putExtra("id",id);
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
								AsyncTask dow = new DownloadBackgroundTask((LinearLayout)findViewById(R.id.backdrop)).execute("https://image.tmdb.org/t/p/w780"+backdrop);
								down.add(dow);
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									scroller2.setCenter(one);
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
									menudate.setText(Html.fromHtml("<font color='#008000'>"+release+"</font>"+"/"+"<font color='#FF0000'>"+genres+"</font>"));
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
						public boolean onKey(View p1,int p2,KeyEvent p3)
						{
							if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									movieup.setVisibility(View.GONE);
									tvup.setVisibility(View.VISIBLE);
									tvup.setBackgroundDrawable(getDrawable(R.drawable.down));
									favup.setVisibility(View.GONE);
									tvupspace.setVisibility(View.VISIBLE);
									favupspace.setVisibility(View.GONE);
									scrool.setVisibility(View.VISIBLE);
									scrool2.setVisibility(View.GONE);
									scrool3.setVisibility(View.GONE);
									famousmoviestext.setVisibility(View.VISIBLE);
									famoustvtext.setVisibility(View.GONE);
									favtext.setVisibility(View.GONE);
									try
									{
										moviefirst.requestFocus();
									}
									catch(Exception e){}
								}
								return true;
							}
							else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
							{
								if(getResources().getBoolean(R.bool.is_landscape))
								{
									movieup.setVisibility(View.GONE);
									tvup.setVisibility(View.GONE);
									favup.setVisibility(View.VISIBLE);
									favup.setBackgroundDrawable(getDrawable(R.drawable.up));
									tvupspace.setVisibility(View.GONE);
									favupspace.setVisibility(View.GONE);
									scrool.setVisibility(View.GONE);
									scrool2.setVisibility(View.GONE);
									scrool3.setVisibility(View.VISIBLE);
									famousmoviestext.setVisibility(View.GONE);
									famoustvtext.setVisibility(View.GONE);
									favtext.setVisibility(View.VISIBLE);
									try
									{
										favfirst.requestFocus();
									}
									catch(Exception e){}
								}
								return true;
							}
							return false;
						}
					});
				if(first == 1)
				{
					if(getResources().getBoolean(R.bool.is_landscape))
					{
						tvfirst = one;
						try
						{
							scroller2.setCenter(one);
						}
						catch(Exception e){}
					}
				}
				scrool2.addView(one);
				scrool2.addView(spacer);
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
