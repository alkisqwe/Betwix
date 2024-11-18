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
import android.content.res.*;
import android.graphics.drawable.*;

public class tvsection extends Activity
{
	public LinearLayout scrool;
	public LinearLayout scrool2;
	public LinearLayout scrool3;
	public LinearLayout scrool4;
	public LinearLayout scrool5;
	public LinearLayout scrool6;
	public LinearLayout scrool7;
	public LinearLayout scrool8;
	public LinearLayout scrool9;
	public LinearLayout scrool10;
	public LinearLayout scrool11;
	public LinearLayout scrool12;
	public LinearLayout scrool13;
	public LinearLayout scrool14;
	public LinearLayout scrool15;
	public LinearLayout scrool16;
	public ImageView homeimage;
	public ImageView searchimage;
	public ImageView moreimage;
	ProgressDialog pd;
	public int syncer = 0;
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
	public ImageView movieup;
	public ImageView tvup;
	public ImageView favup;
	public ImageView qup;
	public ImageView wup;
	public ImageView eup;
	public ImageView rup;
	public ImageView tup;
	public ImageView yup;
	public ImageView uup;
	public ImageView iup;
	public ImageView oup;
	public ImageView pup;
	public ImageView aup;
	public ImageView sup;
	public ImageView dup;
	public Space tvupspace;
	public Space favupspace;
	public Space qupspace;
	public Space wupspace;
	public Space eupspace;
	public Space rupspace;
	public Space tupspace;
	public Space yupspace;
	public Space uupspace;
	public Space iupspace;
	public Space oupspace;
	public Space pupspace;
	public Space aupspace;
	public Space supspace;
	public Space dupspace;
	public hsv scroller;
	public hsv scroller2;
	public hsv scroller3;
	public hsv scroller4;
	public hsv scroller5;
	public hsv scroller6;
	public hsv scroller7;
	public hsv scroller8;
	public hsv scroller9;
	public hsv scroller10;
	public hsv scroller11;
	public hsv scroller12;
	public hsv scroller13;
	public hsv scroller14;
	public hsv scroller15;
	public hsv scroller16;
	public TextView menutitle;
	public TextView menudate;
	public TextView menudescription;
	public LinearLayout moviefirst;
	public LinearLayout tvfirst;
	public LinearLayout favfirst;
	public LinearLayout qfirst;
	public LinearLayout wfirst;
	public LinearLayout efirst;
	public LinearLayout rfirst;
	public LinearLayout tfirst;
	public LinearLayout yfirst;
	public LinearLayout ufirst;
	public LinearLayout ifirst;
	public LinearLayout ofirst;
	public LinearLayout pfirst;
	public LinearLayout afirst;
	public LinearLayout sfirst;
	public LinearLayout dfirst;
	public TextView famousmoviestext;
	public TextView famoustvtext;
	public TextView favtext;
	public TextView qtext;
	public TextView wtext;
	public TextView etext;
	public TextView rtext;
	public TextView ttext;
	public TextView ytext;
	public TextView utext;
	public TextView itext;
	public TextView otext;
	public TextView ptext;
	public TextView atext;
	public TextView stext;
	public TextView dtext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tvsection);
		scrool = (LinearLayout)findViewById(R.id.scroltwenty);
		scrool2 = (LinearLayout)findViewById(R.id.scroltwentyone);
		scrool3 = (LinearLayout)findViewById(R.id.scroltwentytwo);
		scrool4 = (LinearLayout)findViewById(R.id.scroltwentythree);
		scrool5 = (LinearLayout)findViewById(R.id.scroltwentyfour);
		scrool6 = (LinearLayout)findViewById(R.id.scroltwentyfive);
		scrool7 = (LinearLayout)findViewById(R.id.scroltwentysix);
		scrool8 = (LinearLayout)findViewById(R.id.scroltwentyseven);
		scrool9 = (LinearLayout)findViewById(R.id.scroltwentyeight);
		scrool10 = (LinearLayout)findViewById(R.id.scroltwentynine);
		scrool11 = (LinearLayout)findViewById(R.id.scrolthirty);
		scrool12 = (LinearLayout)findViewById(R.id.scrolthirtyone);
		scrool13 = (LinearLayout)findViewById(R.id.scrolthirtytwo);
		scrool14 = (LinearLayout)findViewById(R.id.scrolthirtythree);
		scrool15 = (LinearLayout)findViewById(R.id.scrolthirtyfour);
		scrool16 = (LinearLayout)findViewById(R.id.scrolthirtyfive);
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
			famousmoviestext = (TextView)findViewById(R.id.famousmoviestext);
			famoustvtext = (TextView)findViewById(R.id.famoustvtext);
			favtext = (TextView)findViewById(R.id.favtext);
			qtext = (TextView)findViewById(R.id.qtext);
			wtext = (TextView)findViewById(R.id.wtext);
			etext = (TextView)findViewById(R.id.etext);
			rtext = (TextView)findViewById(R.id.rtext);
			ttext = (TextView)findViewById(R.id.ttext);
			ytext = (TextView)findViewById(R.id.ytext);
			utext = (TextView)findViewById(R.id.utext);
			itext = (TextView)findViewById(R.id.itext);
			otext = (TextView)findViewById(R.id.otext);
			ptext = (TextView)findViewById(R.id.ptext);
			atext = (TextView)findViewById(R.id.atext);
			stext = (TextView)findViewById(R.id.stext);
			dtext = (TextView)findViewById(R.id.dtext);
			movieup = (ImageView)findViewById(R.id.movieup);
			tvup = (ImageView)findViewById(R.id.tvup);
			favup = (ImageView)findViewById(R.id.favup);
			qup = (ImageView)findViewById(R.id.qup);
			wup = (ImageView)findViewById(R.id.wup);
			eup = (ImageView)findViewById(R.id.eup);
			rup = (ImageView)findViewById(R.id.rup);
			tup = (ImageView)findViewById(R.id.tup);
			yup = (ImageView)findViewById(R.id.yup);
			uup = (ImageView)findViewById(R.id.uup);
			iup = (ImageView)findViewById(R.id.iup);
			oup = (ImageView)findViewById(R.id.oup);
			pup = (ImageView)findViewById(R.id.pup);
			aup = (ImageView)findViewById(R.id.aup);
			sup = (ImageView)findViewById(R.id.sup);
			dup = (ImageView)findViewById(R.id.dup);
			tvupspace = (Space)findViewById(R.id.tvupspace);
			favupspace = (Space)findViewById(R.id.favupspace);
			qupspace = (Space)findViewById(R.id.qupspace);
			wupspace = (Space)findViewById(R.id.wupspace);
			eupspace = (Space)findViewById(R.id.eupspace);
			rupspace = (Space)findViewById(R.id.rupspace);
			tupspace = (Space)findViewById(R.id.tupspace);
			yupspace = (Space)findViewById(R.id.yupspace);
			uupspace = (Space)findViewById(R.id.uupspace);
			iupspace = (Space)findViewById(R.id.iupspace);
			oupspace = (Space)findViewById(R.id.oupspace);
			pupspace = (Space)findViewById(R.id.pupspace);
			aupspace = (Space)findViewById(R.id.aupspace);
			supspace = (Space)findViewById(R.id.supspace);
			dupspace = (Space)findViewById(R.id.dupspace);
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
			scroller4 = (hsv)findViewById(R.id.scroller4);
			scroller5 = (hsv)findViewById(R.id.scroller5);
			scroller6 = (hsv)findViewById(R.id.scroller6);
			scroller7 = (hsv)findViewById(R.id.scroller7);
			scroller8 = (hsv)findViewById(R.id.scroller8);
			scroller9 = (hsv)findViewById(R.id.scroller9);
			scroller10 = (hsv)findViewById(R.id.scroller10);
			scroller11 = (hsv)findViewById(R.id.scroller11);
			scroller12 = (hsv)findViewById(R.id.scroller12);
			scroller13 = (hsv)findViewById(R.id.scroller13);
			scroller14 = (hsv)findViewById(R.id.scroller14);
			scroller15 = (hsv)findViewById(R.id.scroller15);
			scroller16 = (hsv)findViewById(R.id.scroller16);
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
			if(scrool2 == null || scrool3 == null || scrool4 == null || scrool5 == null || scrool6 == null || scrool == null || scrool7 == null || scrool8 == null || scrool9 == null || scrool10 == null || scrool11 == null || scrool12 == null || scrool13 == null || scrool14 == null || scrool15 == null || scrool16 == null || famoustvtext == null || favtext == null || qtext == null || wtext == null || etext == null || rtext == null || ttext == null || ytext == null || utext == null || itext == null || otext == null || ptext == null || atext == null || stext == null || dtext == null || movieup == null || favup == null || qup == null || wup == null || eup == null || rup == null || tup == null || yup == null || uup == null || iup == null || oup == null || pup == null || aup == null || sup == null || dup == null || tvupspace == null || favupspace == null || qupspace == null || wupspace == null || eupspace == null || rupspace == null || tupspace == null || yupspace == null || uupspace == null || iupspace == null || oupspace == null || pupspace == null || aupspace == null || supspace == null || dupspace == null)
			{

			}
			else
			{
				scrool2.setVisibility(View.GONE);
				scrool3.setVisibility(View.GONE);
				scrool4.setVisibility(View.GONE);
				scrool5.setVisibility(View.GONE);
				scrool6.setVisibility(View.GONE);
				scrool7.setVisibility(View.GONE);
				scrool8.setVisibility(View.GONE);
				scrool9.setVisibility(View.GONE);
				scrool10.setVisibility(View.GONE);
				scrool11.setVisibility(View.GONE);
				scrool12.setVisibility(View.GONE);
				scrool13.setVisibility(View.GONE);
				scrool14.setVisibility(View.GONE);
				scrool15.setVisibility(View.GONE);
				scrool16.setVisibility(View.GONE);
				famoustvtext.setVisibility(View.GONE);
				favtext.setVisibility(View.GONE);
				qtext.setVisibility(View.GONE);
				wtext.setVisibility(View.GONE);
				etext.setVisibility(View.GONE);
				rtext.setVisibility(View.GONE);
				ttext.setVisibility(View.GONE);
				ytext.setVisibility(View.GONE);
				utext.setVisibility(View.GONE);
				itext.setVisibility(View.GONE);
				otext.setVisibility(View.GONE);
				ptext.setVisibility(View.GONE);
				atext.setVisibility(View.GONE);
				stext.setVisibility(View.GONE);
				dtext.setVisibility(View.GONE);
				movieup.setVisibility(View.GONE);
				tvup.setVisibility(View.VISIBLE);
				tvup.setBackgroundDrawable(getDrawable(R.drawable.down));
				favup.setVisibility(View.GONE);
				qup.setVisibility(View.GONE);
				wup.setVisibility(View.GONE);
				eup.setVisibility(View.GONE);
				rup.setVisibility(View.GONE);
				tup.setVisibility(View.GONE);
				yup.setVisibility(View.GONE);
				uup.setVisibility(View.GONE);
				iup.setVisibility(View.GONE);
				oup.setVisibility(View.GONE);
				pup.setVisibility(View.GONE);
				aup.setVisibility(View.GONE);
				sup.setVisibility(View.GONE);
				dup.setVisibility(View.GONE);
				tvupspace.setVisibility(View.VISIBLE);
				favupspace.setVisibility(View.GONE);
				qupspace.setVisibility(View.GONE);
				wupspace.setVisibility(View.GONE);
				eupspace.setVisibility(View.GONE);
				rupspace.setVisibility(View.GONE);
				tupspace.setVisibility(View.GONE);
				yupspace.setVisibility(View.GONE);
				uupspace.setVisibility(View.GONE);
				iupspace.setVisibility(View.GONE);
				oupspace.setVisibility(View.GONE);
				pupspace.setVisibility(View.GONE);
				aupspace.setVisibility(View.GONE);
				supspace.setVisibility(View.GONE);
				dupspace.setVisibility(View.GONE);
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
		pd = new ProgressDialog(tvsection.this);
		pd.setMessage("Please wait");
		pd.setCancelable(false);
		pd.show();
		down = new ArrayList<>();
		MyTaskParams params = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10759&language=el-GR&page=1",scrool,"10759",scroller,0);
		new json().execute(params);
		MyTaskParams params2 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=16&language=el-GR&page=1",scrool2,"16",scroller2,1);
		new json().execute(params2);
		MyTaskParams params3 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=35&language=el-GR&page=1",scrool3,"35",scroller3,2);
		new json().execute(params3);
		MyTaskParams params4 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=80&language=el-GR&page=1",scrool4,"80",scroller4,3);
		new json().execute(params4);
		MyTaskParams params5 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=99&language=en-GR&page=1",scrool5,"99",scroller5,4);
		new json().execute(params5);
		MyTaskParams params6 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=18&language=el-GR&page=1",scrool6,"18",scroller6,5);
		new json().execute(params6);
		MyTaskParams params7 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10751&language=el-GR&page=1",scrool7,"10751",scroller7,6);
		new json().execute(params7);
		MyTaskParams params8 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10762&language=el-GR&page=1",scrool8,"10762",scroller8,7);
		new json().execute(params8);
		MyTaskParams params9 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=9648&language=el-GR&page=1",scrool9,"9648",scroller9,8);
		new json().execute(params9);
		MyTaskParams params10 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10763&language=el-GR&page=1",scrool10,"10763",scroller10,9);
		new json().execute(params10);
		MyTaskParams params11 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10764&language=el-GR&page=1",scrool11,"10764",scroller11,10);
		new json().execute(params11);
		MyTaskParams params12 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10765&language=el-GR&page=1",scrool12,"10765",scroller12,11);
		new json().execute(params12);
		MyTaskParams params13 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10766&language=el-GR&page=1",scrool13,"10766",scroller13,12);
		new json().execute(params13);
		MyTaskParams params14 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10767&language=el-GR&page=1",scrool14,"10767",scroller14,13);
		new json().execute(params14);
		MyTaskParams params15 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=10768&language=el-GR&page=1",scrool15,"10768",scroller15,14);
		new json().execute(params15);
		MyTaskParams params16 = new MyTaskParams("https://api.themoviedb.org/3/discover/tv?with_genres=37&language=el-GR&page=1",scrool16,"37",scroller16,15);
		new json().execute(params16);
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
				else if(scrool4.getVisibility() == View.VISIBLE)
				{
					if(qfirst == null)
					{

					}
					else
					{
						qfirst.requestFocus();
					}
				}
				else if(scrool5.getVisibility() == View.VISIBLE)
				{
					if(wfirst == null)
					{

					}
					else
					{
						wfirst.requestFocus();
					}
				}
				else if(scrool6.getVisibility() == View.VISIBLE)
				{
					if(efirst == null)
					{

					}
					else
					{
						efirst.requestFocus();
					}
				}
				else if(scrool7.getVisibility() == View.VISIBLE)
				{
					if(rfirst == null)
					{

					}
					else
					{
						rfirst.requestFocus();
					}
				}
				else if(scrool8.getVisibility() == View.VISIBLE)
				{
					if(tfirst == null)
					{

					}
					else
					{
						tfirst.requestFocus();
					}
				}
				else if(scrool9.getVisibility() == View.VISIBLE)
				{
					if(yfirst == null)
					{

					}
					else
					{
						yfirst.requestFocus();
					}
				}
				else if(scrool10.getVisibility() == View.VISIBLE)
				{
					if(ufirst == null)
					{

					}
					else
					{
						ufirst.requestFocus();
					}
				}
				else if(scrool11.getVisibility() == View.VISIBLE)
				{
					if(ifirst == null)
					{

					}
					else
					{
						ifirst.requestFocus();
					}
				}
				else if(scrool12.getVisibility() == View.VISIBLE)
				{
					if(ofirst == null)
					{

					}
					else
					{
						ofirst.requestFocus();
					}
				}
				else if(scrool13.getVisibility() == View.VISIBLE)
				{
					if(pfirst == null)
					{

					}
					else
					{
						pfirst.requestFocus();
					}
				}
				else if(scrool14.getVisibility() == View.VISIBLE)
				{
					if(afirst == null)
					{

					}
					else
					{
						afirst.requestFocus();
					}
				}
				else if(scrool15.getVisibility() == View.VISIBLE)
				{
					if(sfirst == null)
					{

					}
					else
					{
						sfirst.requestFocus();
					}
				}
				else if(scrool16.getVisibility() == View.VISIBLE)
				{
					if(dfirst == null)
					{

					}
					else
					{
						dfirst.requestFocus();
					}
				}
			}
		}
	}
	
	public void favorites(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(tvsection.this, favorites.class);
		startActivity(intent);
	}
	
	public void tvref(View view)
	{
		
	}
	
	public void more(View view)
	{
		
	}
	
	public void moviesref(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(tvsection.this, moviessection.class);
		startActivity(intent);
	}

	public void search(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(tvsection.this, search.class);
		startActivity(intent);
	}
	
	public void home(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(tvsection.this, MainActivity.class);
		startActivity(intent);
	}

	private static class MyTaskParams
	{
		int foooooo;
		hsv foooo;
		String fooo;
		LinearLayout foo;
		String fo;

		MyTaskParams(String fooo, LinearLayout foo,String fo,hsv foooo,int foooooo)
		{
			this.foooooo = foooooo;
			this.foooo = foooo;
			this.fooo = fooo;
			this.foo = foo;
			this.fo = fo;
		}
	}

	private class json extends AsyncTask<MyTaskParams, String, String>
	{
		private LinearLayout hi;
		private String hii;
		private String hiii;
		private hsv hiiii;
		private int hiiiiii;

    	protected void onPreExecute()
		{
        	super.onPreExecute();
        	//pd = new ProgressDialog(MainActivity.this);
        	//pd.setMessage("Please wait");
        	//pd.setCancelable(false);
        	//pd.show();
    	}

    	protected String doInBackground(MyTaskParams... params)
		{
			HttpURLConnection connection = null;
        	BufferedReader reader = null;
			this.hi = params[0].foo;
			this.hii = params[0].fooo;
			this.hiii = params[0].fo;
			this.hiiii = params[0].foooo;
			this.hiiiiii = params[0].foooooo;
        	try
			{
            	URL url = new URL(this.hii);
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
			if(syncer == 15)
			{
				if(pd.isShowing())
				{
					pd.dismiss();
				}
			}
			else
			{
				syncer += 1;
				if(syncer == 16)
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
				int fir = 1;
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
								butt(obj.getString("name"),obj.getString("backdrop_path"),obj.getString("first_air_date"),obj.getString("id"),false,this.hiii,this.hi,this.hiiii,1,obj.getString("overview"),resultStringfin,obj.getString("backdrop_path"),this.hiiiiii);
								fir = 0;
							}
							else
							{
								hsv hsvv = new hsv(tvsection.this);
								butt(obj.getString("original_name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),false,this.hiii,this.hi,hsvv,1,obj.getString("overview"),"",obj.getString("backdrop_path"),this.hiiiiii);
								fir = 0;
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
								butt(obj.getString("name"),obj.getString("backdrop_path"),obj.getString("first_air_date"),obj.getString("id"),false,this.hiii,this.hi,this.hiiii,0,obj.getString("overview"),resultStringfin,obj.getString("backdrop_path"),this.hiiiiii);
								fir = 0;
							}
							else
							{
								hsv hsvv = new hsv(tvsection.this);
								butt(obj.getString("original_name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),false,this.hiii,this.hi,hsvv,0,obj.getString("overview"),"",obj.getString("backdrop_path"),this.hiiiiii);
								fir = 0;
							}
						}
					}
					catch(Exception e){}
				}
				hsv hsvv = new hsv(tvsection.this);
				butt("","","","",true,this.hiii,this.hi,hsvv,fir,"","","",this.hiiiiii);
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
			Space spacer = new Space(tvsection.this);
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
			spacer.setLayoutParams(layoutParams);
			this.hi.addView(spacer);
		}

		public void butt(final String te,final String image,final String release,final String id,final boolean ok,final String gens,final LinearLayout lay,final hsv scrollersel,final int first,final String description, final String genres,final String backdrop,final int direction)
		{
			if(ok)
			{
				final LinearLayout one = new LinearLayout(tvsection.this);
				final LinearLayout textslay = new LinearLayout(tvsection.this);
				final ImageView two = new ImageView(tvsection.this);
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					textslay.setOrientation(LinearLayout.VERTICAL);
					textslay.setBackgroundColor(Color.parseColor("#414141"));
					TextView three = new TextView(tvsection.this);
					TextView four = new TextView(tvsection.this);
					Space spacertwo = new Space(tvsection.this);
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
					TextView three = new TextView(tvsection.this);
					TextView four = new TextView(tvsection.this);
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
							Intent intent = new Intent(tvsection.this, all.class);
							intent.putExtra("type","genres-tv");
							intent.putExtra("genres",gens);
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
									scrollersel.setCenter(one);
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
							if(direction == 0)
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
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.VISIBLE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.VISIBLE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.VISIBLE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
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
							else if(direction == 1)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.VISIBLE);
										favup.setBackgroundDrawable(getDrawable(R.drawable.up));
										qup.setVisibility(View.VISIBLE);
										qup.setBackgroundDrawable(getDrawable(R.drawable.down));
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.VISIBLE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.VISIBLE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.VISIBLE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											favfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.VISIBLE);
										tvup.setBackgroundDrawable(getDrawable(R.drawable.down));
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.VISIBLE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.VISIBLE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.VISIBLE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											moviefirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 2)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.VISIBLE);
										qup.setBackgroundDrawable(getDrawable(R.drawable.up));
										wup.setVisibility(View.VISIBLE);
										wup.setBackgroundDrawable(getDrawable(R.drawable.down));
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.VISIBLE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.VISIBLE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.VISIBLE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											qfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.VISIBLE);
										tvup.setBackgroundDrawable(getDrawable(R.drawable.up));
										favup.setVisibility(View.VISIBLE);
										favup.setBackgroundDrawable(getDrawable(R.drawable.down));
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.VISIBLE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.VISIBLE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.VISIBLE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
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
							else if(direction == 3)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.VISIBLE);
										wup.setBackgroundDrawable(getDrawable(R.drawable.up));
										eup.setVisibility(View.VISIBLE);
										eup.setBackgroundDrawable(getDrawable(R.drawable.down));
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.VISIBLE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.VISIBLE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.VISIBLE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											wfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.VISIBLE);
										favup.setBackgroundDrawable(getDrawable(R.drawable.up));
										qup.setVisibility(View.VISIBLE);
										qup.setBackgroundDrawable(getDrawable(R.drawable.down));
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.VISIBLE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.VISIBLE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.VISIBLE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
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
							else if(direction == 4)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.VISIBLE);
										eup.setBackgroundDrawable(getDrawable(R.drawable.up));
										rup.setVisibility(View.VISIBLE);
										rup.setBackgroundDrawable(getDrawable(R.drawable.down));
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.VISIBLE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.VISIBLE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.VISIBLE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											efirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.VISIBLE);
										qup.setBackgroundDrawable(getDrawable(R.drawable.up));
										wup.setVisibility(View.VISIBLE);
										wup.setBackgroundDrawable(getDrawable(R.drawable.down));
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.VISIBLE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.VISIBLE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.VISIBLE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											qfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 5)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.VISIBLE);
										rup.setBackgroundDrawable(getDrawable(R.drawable.up));
										tup.setVisibility(View.VISIBLE);
										tup.setBackgroundDrawable(getDrawable(R.drawable.down));
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.VISIBLE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.VISIBLE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.VISIBLE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											rfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.VISIBLE);
										wup.setBackgroundDrawable(getDrawable(R.drawable.up));
										eup.setVisibility(View.VISIBLE);
										eup.setBackgroundDrawable(getDrawable(R.drawable.down));
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.VISIBLE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.VISIBLE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.VISIBLE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											wfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 6)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.VISIBLE);
										tup.setBackgroundDrawable(getDrawable(R.drawable.up));
										yup.setVisibility(View.VISIBLE);
										yup.setBackgroundDrawable(getDrawable(R.drawable.down));
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.VISIBLE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.VISIBLE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.VISIBLE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											tfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.VISIBLE);
										eup.setBackgroundDrawable(getDrawable(R.drawable.up));
										rup.setVisibility(View.VISIBLE);
										rup.setBackgroundDrawable(getDrawable(R.drawable.down));
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.VISIBLE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.VISIBLE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.VISIBLE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											efirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 7)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.VISIBLE);
										yup.setBackgroundDrawable(getDrawable(R.drawable.up));
										uup.setVisibility(View.VISIBLE);
										uup.setBackgroundDrawable(getDrawable(R.drawable.down));
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.VISIBLE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.VISIBLE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.VISIBLE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											yfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.VISIBLE);
										rup.setBackgroundDrawable(getDrawable(R.drawable.up));
										tup.setVisibility(View.VISIBLE);
										tup.setBackgroundDrawable(getDrawable(R.drawable.down));
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.VISIBLE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.VISIBLE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.VISIBLE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											rfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 8)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.VISIBLE);
										uup.setBackgroundDrawable(getDrawable(R.drawable.up));
										iup.setVisibility(View.VISIBLE);
										iup.setBackgroundDrawable(getDrawable(R.drawable.down));
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.VISIBLE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.VISIBLE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.VISIBLE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ufirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.VISIBLE);
										tup.setBackgroundDrawable(getDrawable(R.drawable.up));
										yup.setVisibility(View.VISIBLE);
										yup.setBackgroundDrawable(getDrawable(R.drawable.down));
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.VISIBLE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.VISIBLE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.VISIBLE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											tfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 9)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.VISIBLE);
										iup.setBackgroundDrawable(getDrawable(R.drawable.up));
										oup.setVisibility(View.VISIBLE);
										oup.setBackgroundDrawable(getDrawable(R.drawable.down));
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.VISIBLE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.VISIBLE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.VISIBLE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ifirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.VISIBLE);
										yup.setBackgroundDrawable(getDrawable(R.drawable.up));
										uup.setVisibility(View.VISIBLE);
										uup.setBackgroundDrawable(getDrawable(R.drawable.down));
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.VISIBLE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.VISIBLE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.VISIBLE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											yfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 10)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.VISIBLE);
										oup.setBackgroundDrawable(getDrawable(R.drawable.up));
										pup.setVisibility(View.VISIBLE);
										pup.setBackgroundDrawable(getDrawable(R.drawable.down));
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.VISIBLE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.VISIBLE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.VISIBLE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ofirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.VISIBLE);
										uup.setBackgroundDrawable(getDrawable(R.drawable.up));
										iup.setVisibility(View.VISIBLE);
										iup.setBackgroundDrawable(getDrawable(R.drawable.down));
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.VISIBLE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.VISIBLE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.VISIBLE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ufirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 11)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.VISIBLE);
										pup.setBackgroundDrawable(getDrawable(R.drawable.up));
										aup.setVisibility(View.VISIBLE);
										aup.setBackgroundDrawable(getDrawable(R.drawable.down));
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.VISIBLE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.VISIBLE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.VISIBLE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											pfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.VISIBLE);
										iup.setBackgroundDrawable(getDrawable(R.drawable.up));
										oup.setVisibility(View.VISIBLE);
										oup.setBackgroundDrawable(getDrawable(R.drawable.down));
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.VISIBLE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.VISIBLE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.VISIBLE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ifirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 12)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.VISIBLE);
										aup.setBackgroundDrawable(getDrawable(R.drawable.up));
										sup.setVisibility(View.VISIBLE);
										sup.setBackgroundDrawable(getDrawable(R.drawable.down));
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.VISIBLE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.VISIBLE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.VISIBLE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											afirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.VISIBLE);
										oup.setBackgroundDrawable(getDrawable(R.drawable.up));
										pup.setVisibility(View.VISIBLE);
										pup.setBackgroundDrawable(getDrawable(R.drawable.down));
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.VISIBLE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.VISIBLE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.VISIBLE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ofirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 13)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.VISIBLE);
										sup.setBackgroundDrawable(getDrawable(R.drawable.up));
										dup.setVisibility(View.VISIBLE);
										dup.setBackgroundDrawable(getDrawable(R.drawable.down));
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.VISIBLE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.VISIBLE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.VISIBLE);
										dtext.setVisibility(View.GONE);
										try
										{
											sfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.VISIBLE);
										pup.setBackgroundDrawable(getDrawable(R.drawable.up));
										aup.setVisibility(View.VISIBLE);
										aup.setBackgroundDrawable(getDrawable(R.drawable.down));
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.VISIBLE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.VISIBLE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.VISIBLE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											pfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 14)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.VISIBLE);
										dup.setBackgroundDrawable(getDrawable(R.drawable.up));
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.VISIBLE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.VISIBLE);
										try
										{
											dfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.VISIBLE);
										aup.setBackgroundDrawable(getDrawable(R.drawable.up));
										sup.setVisibility(View.VISIBLE);
										sup.setBackgroundDrawable(getDrawable(R.drawable.down));
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.VISIBLE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.VISIBLE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.VISIBLE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											afirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 15)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.VISIBLE);
										sup.setBackgroundDrawable(getDrawable(R.drawable.up));
										dup.setVisibility(View.VISIBLE);
										dup.setBackgroundDrawable(getDrawable(R.drawable.down));
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.VISIBLE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.VISIBLE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.VISIBLE);
										dtext.setVisibility(View.GONE);
										try
										{
											sfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							return false;
						}
					});
				if(first == 1)
				{
					if(getResources().getBoolean(R.bool.is_landscape))
					{
						if(direction == 0)
						{
							moviefirst = one;
						}
						else if(direction == 1)
						{
							tvfirst = one;
						}
						else if(direction == 2)
						{
							favfirst = one;
						}
						else if(direction == 3)
						{
							qfirst = one;
						}
						else if(direction == 4)
						{
							wfirst = one;
						}
						else if(direction == 5)
						{
							efirst = one;
						}
						else if(direction == 6)
						{
							rfirst = one;
						}
						else if(direction == 7)
						{
							tfirst = one;
						}
						else if(direction == 8)
						{
							yfirst = one;
						}
						else if(direction == 9)
						{
							ufirst = one;
						}
						else if(direction == 10)
						{
							ifirst = one;
						}
						else if(direction == 11)
						{
							ofirst = one;
						}
						else if(direction == 12)
						{
							pfirst = one;
						}
						else if(direction == 13)
						{
							afirst = one;
						}
						else if(direction == 14)
						{
							sfirst = one;
						}
						else if(direction == 15)
						{
							dfirst = one;
						}
						try
						{
							if(direction == 0)
							{
								one.requestFocus();
							}
							scrollersel.setCenter(one);
						}
						catch(Exception e){}
					}
				}
				lay.addView(one);
			}
			else
			{
				final LinearLayout one = new LinearLayout(tvsection.this);
				final LinearLayout textslay = new LinearLayout(tvsection.this);
				final ImageView two = new ImageView(tvsection.this);
				final Space spacer = new Space(tvsection.this);
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					textslay.setOrientation(LinearLayout.VERTICAL);
					textslay.setBackgroundColor(Color.parseColor("#414141"));
					TextView three = new TextView(tvsection.this);
					TextView four = new TextView(tvsection.this);
					spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
					Space spacertwo = new Space(tvsection.this);
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
					TextView three = new TextView(tvsection.this);
					TextView four = new TextView(tvsection.this);
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
							Intent intent = new Intent(tvsection.this, third.class);
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
									scrollersel.setCenter(one);
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
							if(direction == 0)
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
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.VISIBLE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.VISIBLE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.VISIBLE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
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
							else if(direction == 1)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.VISIBLE);
										favup.setBackgroundDrawable(getDrawable(R.drawable.up));
										qup.setVisibility(View.VISIBLE);
										qup.setBackgroundDrawable(getDrawable(R.drawable.down));
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.VISIBLE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.VISIBLE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.VISIBLE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											favfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.VISIBLE);
										tvup.setBackgroundDrawable(getDrawable(R.drawable.down));
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.VISIBLE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.VISIBLE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.VISIBLE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											moviefirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 2)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.VISIBLE);
										qup.setBackgroundDrawable(getDrawable(R.drawable.up));
										wup.setVisibility(View.VISIBLE);
										wup.setBackgroundDrawable(getDrawable(R.drawable.down));
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.VISIBLE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.VISIBLE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.VISIBLE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											qfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.VISIBLE);
										tvup.setBackgroundDrawable(getDrawable(R.drawable.up));
										favup.setVisibility(View.VISIBLE);
										favup.setBackgroundDrawable(getDrawable(R.drawable.down));
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.VISIBLE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.VISIBLE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.VISIBLE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
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
							else if(direction == 3)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.VISIBLE);
										wup.setBackgroundDrawable(getDrawable(R.drawable.up));
										eup.setVisibility(View.VISIBLE);
										eup.setBackgroundDrawable(getDrawable(R.drawable.down));
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.VISIBLE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.VISIBLE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.VISIBLE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											wfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.VISIBLE);
										favup.setBackgroundDrawable(getDrawable(R.drawable.up));
										qup.setVisibility(View.VISIBLE);
										qup.setBackgroundDrawable(getDrawable(R.drawable.down));
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.VISIBLE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.VISIBLE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.VISIBLE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
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
							else if(direction == 4)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.VISIBLE);
										eup.setBackgroundDrawable(getDrawable(R.drawable.up));
										rup.setVisibility(View.VISIBLE);
										rup.setBackgroundDrawable(getDrawable(R.drawable.down));
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.VISIBLE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.VISIBLE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.VISIBLE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											efirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.VISIBLE);
										qup.setBackgroundDrawable(getDrawable(R.drawable.up));
										wup.setVisibility(View.VISIBLE);
										wup.setBackgroundDrawable(getDrawable(R.drawable.down));
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.VISIBLE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.VISIBLE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.VISIBLE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											qfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 5)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.VISIBLE);
										rup.setBackgroundDrawable(getDrawable(R.drawable.up));
										tup.setVisibility(View.VISIBLE);
										tup.setBackgroundDrawable(getDrawable(R.drawable.down));
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.VISIBLE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.VISIBLE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.VISIBLE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											rfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.VISIBLE);
										wup.setBackgroundDrawable(getDrawable(R.drawable.up));
										eup.setVisibility(View.VISIBLE);
										eup.setBackgroundDrawable(getDrawable(R.drawable.down));
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.VISIBLE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.VISIBLE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.VISIBLE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											wfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 6)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.VISIBLE);
										tup.setBackgroundDrawable(getDrawable(R.drawable.up));
										yup.setVisibility(View.VISIBLE);
										yup.setBackgroundDrawable(getDrawable(R.drawable.down));
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.VISIBLE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.VISIBLE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.VISIBLE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											tfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.VISIBLE);
										eup.setBackgroundDrawable(getDrawable(R.drawable.up));
										rup.setVisibility(View.VISIBLE);
										rup.setBackgroundDrawable(getDrawable(R.drawable.down));
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.VISIBLE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.VISIBLE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.VISIBLE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											efirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 7)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.VISIBLE);
										yup.setBackgroundDrawable(getDrawable(R.drawable.up));
										uup.setVisibility(View.VISIBLE);
										uup.setBackgroundDrawable(getDrawable(R.drawable.down));
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.VISIBLE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.VISIBLE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.VISIBLE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											yfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.VISIBLE);
										rup.setBackgroundDrawable(getDrawable(R.drawable.up));
										tup.setVisibility(View.VISIBLE);
										tup.setBackgroundDrawable(getDrawable(R.drawable.down));
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.VISIBLE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.VISIBLE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.VISIBLE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											rfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 8)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.VISIBLE);
										uup.setBackgroundDrawable(getDrawable(R.drawable.up));
										iup.setVisibility(View.VISIBLE);
										iup.setBackgroundDrawable(getDrawable(R.drawable.down));
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.VISIBLE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.VISIBLE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.VISIBLE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ufirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.VISIBLE);
										tup.setBackgroundDrawable(getDrawable(R.drawable.up));
										yup.setVisibility(View.VISIBLE);
										yup.setBackgroundDrawable(getDrawable(R.drawable.down));
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.VISIBLE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.VISIBLE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.VISIBLE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											tfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 9)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.VISIBLE);
										iup.setBackgroundDrawable(getDrawable(R.drawable.up));
										oup.setVisibility(View.VISIBLE);
										oup.setBackgroundDrawable(getDrawable(R.drawable.down));
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.VISIBLE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.VISIBLE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.VISIBLE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ifirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.VISIBLE);
										yup.setBackgroundDrawable(getDrawable(R.drawable.up));
										uup.setVisibility(View.VISIBLE);
										uup.setBackgroundDrawable(getDrawable(R.drawable.down));
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.VISIBLE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.VISIBLE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.VISIBLE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											yfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 10)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.VISIBLE);
										oup.setBackgroundDrawable(getDrawable(R.drawable.up));
										pup.setVisibility(View.VISIBLE);
										pup.setBackgroundDrawable(getDrawable(R.drawable.down));
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.VISIBLE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.VISIBLE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.VISIBLE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ofirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.VISIBLE);
										uup.setBackgroundDrawable(getDrawable(R.drawable.up));
										iup.setVisibility(View.VISIBLE);
										iup.setBackgroundDrawable(getDrawable(R.drawable.down));
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.VISIBLE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.VISIBLE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.VISIBLE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ufirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 11)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.VISIBLE);
										pup.setBackgroundDrawable(getDrawable(R.drawable.up));
										aup.setVisibility(View.VISIBLE);
										aup.setBackgroundDrawable(getDrawable(R.drawable.down));
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.VISIBLE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.VISIBLE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.VISIBLE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											pfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.VISIBLE);
										iup.setBackgroundDrawable(getDrawable(R.drawable.up));
										oup.setVisibility(View.VISIBLE);
										oup.setBackgroundDrawable(getDrawable(R.drawable.down));
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.VISIBLE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.VISIBLE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.VISIBLE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ifirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 12)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.VISIBLE);
										aup.setBackgroundDrawable(getDrawable(R.drawable.up));
										sup.setVisibility(View.VISIBLE);
										sup.setBackgroundDrawable(getDrawable(R.drawable.down));
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.VISIBLE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.VISIBLE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.VISIBLE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											afirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.VISIBLE);
										oup.setBackgroundDrawable(getDrawable(R.drawable.up));
										pup.setVisibility(View.VISIBLE);
										pup.setBackgroundDrawable(getDrawable(R.drawable.down));
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.VISIBLE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.VISIBLE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.VISIBLE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											ofirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 13)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.VISIBLE);
										sup.setBackgroundDrawable(getDrawable(R.drawable.up));
										dup.setVisibility(View.VISIBLE);
										dup.setBackgroundDrawable(getDrawable(R.drawable.down));
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.VISIBLE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.VISIBLE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.VISIBLE);
										dtext.setVisibility(View.GONE);
										try
										{
											sfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.VISIBLE);
										pup.setBackgroundDrawable(getDrawable(R.drawable.up));
										aup.setVisibility(View.VISIBLE);
										aup.setBackgroundDrawable(getDrawable(R.drawable.down));
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.VISIBLE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.VISIBLE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.VISIBLE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											pfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 14)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.GONE);
										dup.setVisibility(View.VISIBLE);
										dup.setBackgroundDrawable(getDrawable(R.drawable.up));
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.VISIBLE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.VISIBLE);
										try
										{
											dfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								else if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.VISIBLE);
										aup.setBackgroundDrawable(getDrawable(R.drawable.up));
										sup.setVisibility(View.VISIBLE);
										sup.setBackgroundDrawable(getDrawable(R.drawable.down));
										dup.setVisibility(View.GONE);
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.VISIBLE);
										dupspace.setVisibility(View.GONE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.VISIBLE);
										scrool15.setVisibility(View.GONE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.VISIBLE);
										stext.setVisibility(View.GONE);
										dtext.setVisibility(View.GONE);
										try
										{
											afirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							else if(direction == 15)
							{
								if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
								{
									if(getResources().getBoolean(R.bool.is_landscape))
									{
										movieup.setVisibility(View.GONE);
										tvup.setVisibility(View.GONE);
										favup.setVisibility(View.GONE);
										qup.setVisibility(View.GONE);
										wup.setVisibility(View.GONE);
										eup.setVisibility(View.GONE);
										rup.setVisibility(View.GONE);
										tup.setVisibility(View.GONE);
										yup.setVisibility(View.GONE);
										uup.setVisibility(View.GONE);
										iup.setVisibility(View.GONE);
										oup.setVisibility(View.GONE);
										pup.setVisibility(View.GONE);
										aup.setVisibility(View.GONE);
										sup.setVisibility(View.VISIBLE);
										sup.setBackgroundDrawable(getDrawable(R.drawable.up));
										dup.setVisibility(View.VISIBLE);
										dup.setBackgroundDrawable(getDrawable(R.drawable.down));
										tvupspace.setVisibility(View.GONE);
										favupspace.setVisibility(View.GONE);
										qupspace.setVisibility(View.GONE);
										wupspace.setVisibility(View.GONE);
										eupspace.setVisibility(View.GONE);
										rupspace.setVisibility(View.GONE);
										tupspace.setVisibility(View.GONE);
										yupspace.setVisibility(View.GONE);
										uupspace.setVisibility(View.GONE);
										iupspace.setVisibility(View.GONE);
										oupspace.setVisibility(View.GONE);
										pupspace.setVisibility(View.GONE);
										aupspace.setVisibility(View.GONE);
										supspace.setVisibility(View.GONE);
										dupspace.setVisibility(View.VISIBLE);
										scrool.setVisibility(View.GONE);
										scrool2.setVisibility(View.GONE);
										scrool3.setVisibility(View.GONE);
										scrool4.setVisibility(View.GONE);
										scrool5.setVisibility(View.GONE);
										scrool6.setVisibility(View.GONE);
										scrool7.setVisibility(View.GONE);
										scrool8.setVisibility(View.GONE);
										scrool9.setVisibility(View.GONE);
										scrool10.setVisibility(View.GONE);
										scrool11.setVisibility(View.GONE);
										scrool12.setVisibility(View.GONE);
										scrool13.setVisibility(View.GONE);
										scrool14.setVisibility(View.GONE);
										scrool15.setVisibility(View.VISIBLE);
										scrool16.setVisibility(View.GONE);
										famousmoviestext.setVisibility(View.GONE);
										famoustvtext.setVisibility(View.GONE);
										favtext.setVisibility(View.GONE);
										qtext.setVisibility(View.GONE);
										wtext.setVisibility(View.GONE);
										etext.setVisibility(View.GONE);
										rtext.setVisibility(View.GONE);
										ttext.setVisibility(View.GONE);
										ytext.setVisibility(View.GONE);
										utext.setVisibility(View.GONE);
										itext.setVisibility(View.GONE);
										otext.setVisibility(View.GONE);
										ptext.setVisibility(View.GONE);
										atext.setVisibility(View.GONE);
										stext.setVisibility(View.VISIBLE);
										dtext.setVisibility(View.GONE);
										try
										{
											sfirst.requestFocus();
										}
										catch(Exception e){}
									}
									return true;
								}
								return false;
							}
							return false;
						}
					});
				if(first == 1)
				{
					if(getResources().getBoolean(R.bool.is_landscape))
					{
						if(direction == 0)
						{
							moviefirst = one;
						}
						else if(direction == 1)
						{
							tvfirst = one;
						}
						else if(direction == 2)
						{
							favfirst = one;
						}
						else if(direction == 3)
						{
							qfirst = one;
						}
						else if(direction == 4)
						{
							wfirst = one;
						}
						else if(direction == 5)
						{
							efirst = one;
						}
						else if(direction == 6)
						{
							rfirst = one;
						}
						else if(direction == 7)
						{
							tfirst = one;
						}
						else if(direction == 8)
						{
							yfirst = one;
						}
						else if(direction == 9)
						{
							ufirst = one;
						}
						else if(direction == 10)
						{
							ifirst = one;
						}
						else if(direction == 11)
						{
							ofirst = one;
						}
						else if(direction == 12)
						{
							pfirst = one;
						}
						else if(direction == 13)
						{
							afirst = one;
						}
						else if(direction == 14)
						{
							sfirst = one;
						}
						else if(direction == 15)
						{
							dfirst = one;
						}
						try
						{
							if(direction == 0)
							{
								one.requestFocus();
							}
							scrollersel.setCenter(one);
						}
						catch(Exception e){}
					}
				}
				lay.addView(one);
				lay.addView(spacer);
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
}
