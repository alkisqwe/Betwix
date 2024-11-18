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
import java.util.*;
import android.content.res.*;
import android.graphics.drawable.*;

public class favorites extends Activity
{
	public GridLayout favoritegrid;
	public LinearLayout favoritelay;
	public ImageView homeimage;
	public ImageView searchimage;
	public ImageView moreimage;
	public ArrayList<AsyncTask> down;
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
	public LinearLayout favfirst;
	public hsv scroller;
	public TextView menutitle;
	public TextView menudate;
	public TextView menudescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites);
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
			favoritelay = (LinearLayout)findViewById(R.id.favoritesgrid);
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
		else
		{
			favoritegrid = (GridLayout)findViewById(R.id.favoritesgrid);
			favoritegrid.setColumnCount(3);
			favoritegrid.setRowCount(3);
		}
		down = new ArrayList<>();
		mylist();
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
				if(favoritelay.getVisibility() == View.VISIBLE)
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
	
	public void moviessectionbutton(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(favorites.this, moviessection.class);
		startActivity(intent);
	}

	public void tvref(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(favorites.this, tvsection.class);
		startActivity(intent);
	}

	public void search(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(favorites.this, search.class);
		startActivity(intent);
	}

	public void home(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(favorites.this, MainActivity.class);
		startActivity(intent);
	}
	
	public void fav(View view)
	{
		
	}
	
	public void more(View view)
	{
		
	}
	
	public void mylist()
	{
		try
		{
			SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_APPEND);
			int a = sh.getInt("number",0);
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				createspacer(350);
				createspacer(350);
				createspacer(35);
			}
			for(int i = 0; i < a; i++)
			{
				try
				{
					if(i == 0)
					{
						if(sh.getString("type"+String.valueOf(i),"").equals("movie"))
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								moviebutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),1,sh.getString("backdrop"+String.valueOf(i),""),sh.getString("description"+String.valueOf(i),""),sh.getString("genres"+String.valueOf(i),""));
							}
							else
							{
								moviebutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),1,sh.getString("image"+String.valueOf(i),""),"","");
							}
						}
						else if(sh.getString("type"+String.valueOf(i),"").equals("tv"))
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								tvbutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),1,sh.getString("backdrop"+String.valueOf(i),""),sh.getString("description"+String.valueOf(i),""),sh.getString("genres"+String.valueOf(i),""));
							}
							else
							{
								tvbutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),1,sh.getString("image"+String.valueOf(i),""),"","");
							}
						}
					}
					else
					{
						if(sh.getString("type"+String.valueOf(i),"").equals("movie"))
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								moviebutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),0,sh.getString("backdrop"+String.valueOf(i),""),sh.getString("description"+String.valueOf(i),""),sh.getString("genres"+String.valueOf(i),""));
							}
							else
							{
								moviebutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),0,sh.getString("image"+String.valueOf(i),""),"","");
							}
						}
						else if(sh.getString("type"+String.valueOf(i),"").equals("tv"))
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								tvbutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),0,sh.getString("backdrop"+String.valueOf(i),""),sh.getString("description"+String.valueOf(i),""),sh.getString("genres"+String.valueOf(i),""));
							}
							else
							{
								tvbutton(sh.getString("name"+String.valueOf(i),""),sh.getString("image"+String.valueOf(i),""),sh.getString("release"+String.valueOf(i),""),sh.getString("id"+String.valueOf(i),""),0,sh.getString("image"+String.valueOf(i),""),"","");
							}
						}
					}
				}
				catch(Exception e){}
			}
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
		Space spacer = new Space(favorites.this);
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
		spacer.setLayoutParams(layoutParams);
		favoritelay.addView(spacer);
	}

	public void moviebutton(final String te,final String image,final String release,final String idd,final int first,final String backdrop,final String description,final String genres)
	{
		final LinearLayout one = new LinearLayout(favorites.this);
		final LinearLayout textslay = new LinearLayout(favorites.this);
		final ImageView two = new ImageView(favorites.this);
		final Space spacer = new Space(favorites.this);
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			textslay.setOrientation(LinearLayout.VERTICAL);
			textslay.setBackgroundColor(Color.parseColor("#414141"));
			TextView three = new TextView(favorites.this);
			TextView four = new TextView(favorites.this);
			spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
			Space spacertwo = new Space(favorites.this);
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
			TextView three = new TextView(favorites.this);
			TextView four = new TextView(favorites.this);
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
					Intent intent = new Intent(favorites.this, second.class);
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
		if(first == 1)
		{
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				favfirst = one;
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
			favoritelay.addView(one);
			favoritelay.addView(spacer);
		}
		else
		{
			favoritegrid.addView(one);
		}
	}

	public void tvbutton(final String te,final String image,final String release,final String idd,final int first,final String backdrop,final String description,final String genres)
	{
		final LinearLayout one = new LinearLayout(favorites.this);
		final LinearLayout textslay = new LinearLayout(favorites.this);
		final ImageView two = new ImageView(favorites.this);
		final Space spacer = new Space(favorites.this);
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			textslay.setOrientation(LinearLayout.VERTICAL);
			textslay.setBackgroundColor(Color.parseColor("#414141"));
			TextView three = new TextView(favorites.this);
			TextView four = new TextView(favorites.this);
			spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
			Space spacertwo = new Space(favorites.this);
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
			TextView three = new TextView(favorites.this);
			TextView four = new TextView(favorites.this);
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
					Intent intent = new Intent(favorites.this, third.class);
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
		if(first == 1)
		{
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				favfirst = one;
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
			favoritelay.addView(one);
			favoritelay.addView(spacer);
		}
		else
		{
			favoritegrid.addView(one);
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
}
