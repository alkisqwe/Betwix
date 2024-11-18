package com.example.betwix;
import android.app.*;
import android.widget.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.view.View.*;
import java.net.*;
import java.io.*;
import org.json.*;
import android.util.*;
import android.graphics.*;
import android.widget.AdapterView.*;
import java.util.*;
import android.view.inputmethod.*;
import android.content.res.*;
import android.text.*;
import android.graphics.drawable.*;

public class search extends Activity
{
	public ImageView homeimage;
	public ImageView searchimage;
	public ImageView moreimage;
	public Spinner spin;
	public Spinner spin2;
	public Dialog genres;
	public EditText searchedittext;
	public GridLayout searchgrid;
	public String applyablegenres = "";
	public ScrollView searchscrol;
	public boolean searched = false;
	public int page = 1;
	public LinearLayout edittextcontainer;
	public LinearLayout filterbuttoncontainer;
	ProgressDialog pd;
	public ArrayList<AsyncTask> down;
	public LinearLayout homer;
	public LinearLayout searcher;
	public LinearLayout morer;
	public Button searcherbutton;
	public LinearLayout transone;
	public LinearLayout transfive;
	public LinearLayout transsix;
	public LinearLayout transseven;
	public TextView transfourteen;
	public TextView transfifteen;
	public TextView transsixteen;
	public LinearLayout background;
	public hsv scroller;
	public LinearLayout scrool;
	public TextView menutitle;
	public TextView menudate;
	public TextView menudescription;
	public LinearLayout searchfirst;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
		edittextcontainer = (LinearLayout)findViewById(R.id.edittextcontainer);
		filterbuttoncontainer = (LinearLayout)findViewById(R.id.filterbuttoncontainer);
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
			scrool = (LinearLayout)findViewById(R.id.scrool);
			background = (LinearLayout)findViewById(R.id.background);
			scroller = (hsv)findViewById(R.id.scroller);
			menutitle = (TextView)findViewById(R.id.menutitle);
			menudate = (TextView)findViewById(R.id.menudate);
			menudescription = (TextView)findViewById(R.id.menudescription);
			transone = (LinearLayout)findViewById(R.id.transone);
			transfive = (LinearLayout)findViewById(R.id.homer);
			transsix = (LinearLayout)findViewById(R.id.searcher);
			transseven = (LinearLayout)findViewById(R.id.morer);
			transfourteen = (TextView)findViewById(R.id.transfourteen);
			transfifteen = (TextView)findViewById(R.id.transfifteen);
			transsixteen = (TextView)findViewById(R.id.transsixteen);
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			homeimage.setAlpha(80);
			searchimage.setAlpha(80);
			moreimage.setAlpha(80);
			scroller.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener()
				{
					@Override
					public void onScrollChanged()
					{
						float maxScrollX = scroller.getChildAt(0).getMeasuredWidth()-scroller.getMeasuredWidth(); 
						if (scroller.getScrollX() == maxScrollX) 
						{
							if(searched)
							{
								String spinvalue = spin.getSelectedItem().toString();
								if(spinvalue.equals("MOVIES"))
								{
									String spin2value = spin2.getSelectedItem().toString();
									if(spin2value.equals("BY TEXT"))
									{
										String edittextvalue = searchedittext.getText().toString();
										if(edittextvalue.equals(""))
										{

										}
										else
										{
											page += 1;
											pd.show();
											new json().execute("https://api.themoviedb.org/3/search/movie?query="+edittextvalue+"&include_adult=false&language=el-GRpage="+String.valueOf(page));
										}
									}
									else if(spin2value.equals("BY GENRES"))
									{
										if(applyablegenres.equals(""))
										{

										}
										else
										{
											page += 1;
											pd.show();
											new json().execute("https://api.themoviedb.org/3/discover/movie?with_genres="+applyablegenres+"&language=el-GR&page="+String.valueOf(page));
										}
									}
								}
								else if(spinvalue.equals("SIRIES"))
								{
									String spin2value = spin2.getSelectedItem().toString();
									if(spin2value.equals("BY TEXT"))
									{
										String edittextvalue = searchedittext.getText().toString();
										if(edittextvalue.equals(""))
										{

										}
										else
										{
											page += 1;
											pd.show();
											new json2().execute("https://api.themoviedb.org/3/search/tv?query="+edittextvalue+"&include_adult=false&language=el-GR&page="+String.valueOf(page));
										}
									}
									else if(spin2value.equals("BY GENRES"))
									{
										if(applyablegenres.equals(""))
										{

										}
										else
										{
											page += 1;
											pd.show();
											new json2().execute("https://api.themoviedb.org/3/discover/tv?with_genres="+applyablegenres+"&language=el-GR&page="+String.valueOf(page));
										}
									}
								}
								else if(spinvalue.equals("ACTORS"))
								{
									String edittextvalue = searchedittext.getText().toString();
									if(edittextvalue.equals(""))
									{

									}
									else
									{
										page += 1;
										pd.show();
										new json3().execute("https://api.themoviedb.org/3/search/person?query="+edittextvalue+"&language=el-GR&page="+String.valueOf(page));
									}
								}
							}
						}
					}
				});
			transone.setOnFocusChangeListener(new OnFocusChangeListener()
				{
					@Override
					public void onFocusChange(View p1,boolean p2)
					{
						if(transone == null || transfive == null || transsix == null || transseven == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transfive == null || transsix == null || transseven == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transfive == null || transsix == null || transseven == null || homeimage == null || searchimage == null || moreimage == null)
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
						if(transone == null || transfive == null || transsix == null || transseven == null || homeimage == null || searchimage == null || moreimage == null)
						{

						}
						else
						{
							navbuttons(p2);
						}
					}
				});
			background.setOnFocusChangeListener(new OnFocusChangeListener()
			{
				@Override
				public void onFocusChange(View p1,boolean p2)
				{
					if(p2)
					{
						if(searchfirst == null)
						{
						
						}
						else
						{
							searchfirst.requestFocus();
						}
					}
				}
			});
			if(transfourteen == null || transfifteen == null || transsixteen == null)
			{

			}
			else
			{
				transfourteen.setVisibility(View.GONE);
				transfifteen.setVisibility(View.GONE);
				transsixteen.setVisibility(View.GONE);
			}
		}
		else
		{
			homeimage.setImageResource(R.drawable.home);
			searchimage.setImageResource(R.drawable.search);
			moreimage.setImageResource(R.drawable.more);
			searchgrid = (GridLayout)findViewById(R.id.searchgrid);
			searchgrid.setColumnCount(3);
			searchgrid.setRowCount(3);
			searchscrol = (ScrollView)findViewById(R.id.searchscrol);
			searchscrol.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener()
				{
					@Override
					public void onScrollChanged()
					{
						if (isAtBottom(searchscrol))
						{
							if(searched)
							{
								String spinvalue = spin.getSelectedItem().toString();
								if(spinvalue.equals("MOVIES"))
								{
									String spin2value = spin2.getSelectedItem().toString();
									if(spin2value.equals("BY TEXT"))
									{
										String edittextvalue = searchedittext.getText().toString();
										if(edittextvalue.equals(""))
										{

										}
										else
										{
											page += 1;
											pd.show();
											new json().execute("https://api.themoviedb.org/3/search/movie?query="+edittextvalue+"&include_adult=false&language=el-GR&page="+String.valueOf(page));
										}
									}
									else if(spin2value.equals("BY GENRES"))
									{
										if(applyablegenres.equals(""))
										{

										}
										else
										{
											page += 1;
											pd.show();
											new json().execute("https://api.themoviedb.org/3/discover/movie?with_genres="+applyablegenres+"&language=el-GR&page="+String.valueOf(page));
										}
									}
								}
								else if(spinvalue.equals("SIRIES"))
								{
									String spin2value = spin2.getSelectedItem().toString();
									if(spin2value.equals("BY TEXT"))
									{
										String edittextvalue = searchedittext.getText().toString();
										if(edittextvalue.equals(""))
										{

										}
										else
										{
											page += 1;
											pd.show();
											new json2().execute("https://api.themoviedb.org/3/search/tv?query="+edittextvalue+"&include_adult=false&language=el-GR&page="+String.valueOf(page));
										}
									}
									else if(spin2value.equals("BY GENRES"))
									{
										if(applyablegenres.equals(""))
										{

										}
										else
										{
											page += 1;
											pd.show();
											new json2().execute("https://api.themoviedb.org/3/discover/tv?with_genres="+applyablegenres+"&language=el-GR&page="+String.valueOf(page));
										}
									}
								}
								else if(spinvalue.equals("ACTORS"))
								{
									String edittextvalue = searchedittext.getText().toString();
									if(edittextvalue.equals(""))
									{

									}
									else
									{
										page += 1;
										pd.show();
										new json3().execute("https://api.themoviedb.org/3/search/person?query="+edittextvalue+"&language=el-GR&page="+String.valueOf(page));
									}
								}
							}
						}
					}
				});
		}
		searchedittext = (EditText)findViewById(R.id.searchedittext);
		searchedittext.requestFocus();
		searchedittext.setOnKeyListener(new OnKeyListener()
		{
				@Override
				public boolean onKey(View v, int keyCode, KeyEvent event)
				{
					if (event.getAction() == KeyEvent.ACTION_DOWN)
					{
						switch (keyCode)
						{
							case KeyEvent.KEYCODE_DPAD_DOWN:
								searcherbutton.requestFocus();
								return true;
							case KeyEvent.KEYCODE_DPAD_UP:
								spin.requestFocus();
								return true;
							case KeyEvent.KEYCODE_DPAD_LEFT:
								homer.requestFocus();
								return true;
							default:
								break;
						}
					}
					return false;
				}
		});
		homer = (LinearLayout)findViewById(R.id.homer);
		searcher = (LinearLayout)findViewById(R.id.searcher);
		morer = (LinearLayout)findViewById(R.id.morer);
		searcherbutton = (Button)findViewById(R.id.searcherbutton);
		spin = (Spinner)findViewById(R.id.spin);
		String[] items = new String[]{"MOVIES", "SIRIES", "ACTORS"};
		ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
		spin.setAdapter(adapter);
		spin.setOnItemSelectedListener(new OnItemSelectedListener()
			{
				@Override
				public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
				{
					if(position == 0)
					{
						genres = new Dialog(search.this);
						genres.getWindow().setBackgroundDrawableResource(R.drawable.dialo);
						genres.setContentView(R.layout.genresmovies);
						final CheckBox one = genres.findViewById(R.id.one);
						final CheckBox two = genres.findViewById(R.id.two);
						final CheckBox three = genres.findViewById(R.id.three);
						final CheckBox four = genres.findViewById(R.id.four);
						final CheckBox five = genres.findViewById(R.id.five);
						final CheckBox six = genres.findViewById(R.id.six);
						final CheckBox seven = genres.findViewById(R.id.seven);
						final CheckBox eight = genres.findViewById(R.id.eight);
						final CheckBox nine = genres.findViewById(R.id.nine);
						final CheckBox ten = genres.findViewById(R.id.ten);
						final CheckBox eleven = genres.findViewById(R.id.eleven);
						final CheckBox twelve = genres.findViewById(R.id.twelve);
						final CheckBox threeteen = genres.findViewById(R.id.threeteen);
						final CheckBox fourteen = genres.findViewById(R.id.fourteen);
						final CheckBox fifteen = genres.findViewById(R.id.fifteen);
						final CheckBox sixteen = genres.findViewById(R.id.sixteen);
						final CheckBox seventeen = genres.findViewById(R.id.seventeen);
						final CheckBox eighteen = genres.findViewById(R.id.eighteen);
						final CheckBox nineteen = genres.findViewById(R.id.nineteen);
						final Button clearbutton = genres.findViewById(R.id.clearbutton);
						clearbutton.setOnClickListener(new OnClickListener()
							{
								public void onClick(View view)
								{
									applyablegenres = "";
									genres.dismiss();
								}
							});
						final Button cancelbutton = genres.findViewById(R.id.cancelbutton);
						cancelbutton.setOnClickListener(new OnClickListener()
						{
							public void onClick(View view)
							{
								genres.dismiss();
							}
						});
						final Button genresapply = genres.findViewById(R.id.genresapply);
						genresapply.setOnClickListener(new OnClickListener()
							{
								public void onClick(View view)
								{
									applyablegenres = "";
									StringBuilder genresid = new StringBuilder();
									if(one.isChecked())
									{
										genresid.append("28,");
									}
									if(two.isChecked())
									{
										genresid.append("12,");
									}
									if(three.isChecked())
									{
										genresid.append("16,");
									}
									if(four.isChecked())
									{
										genresid.append("35,");
									}
									if(five.isChecked())
									{
										genresid.append("80,");
									}
									if(six.isChecked())
									{
										genresid.append("99,");
									}
									if(seven.isChecked())
									{
										genresid.append("18,");
									}
									if(eight.isChecked())
									{
										genresid.append("10751,");
									}
									if(nine.isChecked())
									{
										genresid.append("14,");
									}
									if(ten.isChecked())
									{
										genresid.append("36,");
									}
									if(eleven.isChecked())
									{
										genresid.append("27,");
									}
									if(twelve.isChecked())
									{
										genresid.append("10402,");
									}
									if(threeteen.isChecked())
									{
										genresid.append("9648,");
									}
									if(fourteen.isChecked())
									{
										genresid.append("10749,");
									}
									if(fifteen.isChecked())
									{
										genresid.append("878,");
									}
									if(sixteen.isChecked())
									{
										genresid.append("10770,");
									}
									if(seventeen.isChecked())
									{
										genresid.append("53,");
									}
									if(eighteen.isChecked())
									{
										genresid.append("10752,");
									}
									if(nineteen.isChecked())
									{
										genresid.append("37,");
									}
									String genresidfin = genresid.toString();
									if(genresidfin.length() > 0)
									{
										String genresidfjnn = genresidfin.substring(0,genresidfin.length()-1);
										applyablegenres = genresidfjnn;
									}
									else
									{
										applyablegenres = "";
									}
									genres.dismiss();
								}
							});
						spin2.setVisibility(View.VISIBLE);
					}
					else if(position == 1)
					{
						genres = new Dialog(search.this);
						genres.getWindow().setBackgroundDrawableResource(R.drawable.dialo);
						genres.setContentView(R.layout.genrestv);
						final CheckBox twenty = genres.findViewById(R.id.twenty);
						final CheckBox twentyone = genres.findViewById(R.id.twentyone);
						final CheckBox twentywo = genres.findViewById(R.id.twentytwo);
						final CheckBox twentythree = genres.findViewById(R.id.twentythree);
						final CheckBox twentyfour = genres.findViewById(R.id.twentyfour);
						final CheckBox twentyfive = genres.findViewById(R.id.twentyfive);
						final CheckBox twentysix = genres.findViewById(R.id.twentysix);
						final CheckBox twentyseven = genres.findViewById(R.id.twentyseven);
						final CheckBox twentyeight = genres.findViewById(R.id.twentyeight);
						final CheckBox twentynine = genres.findViewById(R.id.twentynine);
						final CheckBox thirty = genres.findViewById(R.id.thirty);
						final CheckBox thirtyone = genres.findViewById(R.id.thirtyone);
						final CheckBox thirtytwo = genres.findViewById(R.id.thirtytwo);
						final CheckBox thirtythree = genres.findViewById(R.id.thirtythree);
						final CheckBox thirtyfour = genres.findViewById(R.id.thirtyfour);
						final CheckBox thirtyfive = genres.findViewById(R.id.thirtyfive);
						final Button clearbutton2 = genres.findViewById(R.id.clearbutton2);
						clearbutton2.setOnClickListener(new OnClickListener()
							{
								public void onClick(View view)
								{
									applyablegenres = "";
									genres.dismiss();
								}
							});
						final Button cancelbutton2 = genres.findViewById(R.id.cancelbutton2);
						cancelbutton2.setOnClickListener(new OnClickListener()
							{
								public void onClick(View view)
								{
									genres.dismiss();
								}
							});
						final Button genresapply2 = genres.findViewById(R.id.genresapply2);
						genresapply2.setOnClickListener(new OnClickListener()
							{
								public void onClick(View view)
								{
									applyablegenres = "";
									StringBuilder genresid = new StringBuilder();
									if(twenty.isChecked())
									{
										genresid.append("10759,");
									}
									if(twentyone.isChecked())
									{
										genresid.append("16,");
									}
									if(twentywo.isChecked())
									{
										genresid.append("35,");
									}
									if(twentythree.isChecked())
									{
										genresid.append("80,");
									}
									if(twentyfour.isChecked())
									{
										genresid.append("99,");
									}
									if(twentyfive.isChecked())
									{
										genresid.append("18,");
									}
									if(twentysix.isChecked())
									{
										genresid.append("10751,");
									}
									if(twentyseven.isChecked())
									{
										genresid.append("10762,");
									}
									if(twentyeight.isChecked())
									{
										genresid.append("9648,");
									}
									if(twentynine.isChecked())
									{
										genresid.append("10763,");
									}
									if(thirty.isChecked())
									{
										genresid.append("10764,");
									}
									if(thirtyone.isChecked())
									{
										genresid.append("10765,");
									}
									if(thirtytwo.isChecked())
									{
										genresid.append("10766,");
									}
									if(thirtythree.isChecked())
									{
										genresid.append("10767,");
									}
									if(thirtyfour.isChecked())
									{
										genresid.append("10768,");
									}
									if(thirtyfive.isChecked())
									{
										genresid.append("37,");
									}
									String genresidfin = genresid.toString();
									if(genresidfin.length() > 0)
									{
										String genresidfjnn = genresidfin.substring(0,genresidfin.length()-1);
										applyablegenres = genresidfjnn;
									}
									else
									{
										applyablegenres = "";
									}
									genres.dismiss();
								}
							});
						spin2.setVisibility(View.VISIBLE);
					}
					else if(position == 2)
					{
						spin2.setVisibility(View.GONE);
						filterbuttoncontainer.setVisibility(View.GONE);
						edittextcontainer.setVisibility(View.VISIBLE);
						try
						{
							homer.setNextFocusRightId(R.id.searchedittext);
							searcher.setNextFocusRightId(R.id.searchedittext);
							morer.setNextFocusRightId(R.id.searchedittext);
							spin.setNextFocusDownId(R.id.searchedittext);
							searcherbutton.setNextFocusUpId(R.id.searchedittext);
							spin2.setNextFocusDownId(R.id.searchedittext);
						}
						catch(Exception e){}
					}
				}

				@Override
				public void onNothingSelected(AdapterView<?> parentView) {
					// your code here
				}

			});
		spin2 = (Spinner)findViewById(R.id.spin2);
		String[] items2 = new String[]{"BY TEXT", "BY GENRES"};
		ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
		spin2.setAdapter(adapter2);
		spin2.setOnItemSelectedListener(new OnItemSelectedListener()
		{
				@Override
				public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
					if(position == 0)
					{
						filterbuttoncontainer.setVisibility(View.GONE);
						edittextcontainer.setVisibility(View.VISIBLE);
						try
						{
							homer.setNextFocusRightId(R.id.searchedittext);
							searcher.setNextFocusRightId(R.id.searchedittext);
							morer.setNextFocusRightId(R.id.searchedittext);
							spin.setNextFocusDownId(R.id.searchedittext);
							searcherbutton.setNextFocusUpId(R.id.searchedittext);
							spin2.setNextFocusDownId(R.id.searchedittext);
						}
						catch(Exception e){}
					}
					else if(position == 1)
					{
						filterbuttoncontainer.setVisibility(View.VISIBLE);
						edittextcontainer.setVisibility(View.GONE);
						try
						{
							homer.setNextFocusRightId(R.id.filterbuttoncontainerer);
							searcher.setNextFocusRightId(R.id.filterbuttoncontainerer);
							morer.setNextFocusRightId(R.id.filterbuttoncontainerer);
							spin.setNextFocusDownId(R.id.filterbuttoncontainerer);
							searcherbutton.setNextFocusUpId(R.id.filterbuttoncontainerer);
							spin2.setNextFocusDownId(R.id.filterbuttoncontainerer);
						}
						catch(Exception e){}
					}
				}

				@Override
				public void onNothingSelected(AdapterView<?> parentView) {
					// your code here
				}

		});
		pd = new ProgressDialog(search.this);
		pd.setMessage("Please wait");
		pd.setCancelable(false);
		down = new ArrayList<>();
	}
	
	public void navbuttons(boolean p2)
	{
		if(p2)
		{
			transone.setBackgroundColor(Color.parseColor("#000000"));
			transfive.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transsix.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			transseven.setBackgroundDrawable(getDrawable(R.drawable.generalselector));
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			homeimage.setAlpha(255);
			searchimage.setAlpha(255);
			moreimage.setAlpha(255);
			transone.setLayoutParams(new LinearLayout.LayoutParams(400,LinearLayout.LayoutParams.MATCH_PARENT));
			transfourteen.setVisibility(View.VISIBLE);
			transfifteen.setVisibility(View.VISIBLE);
			transsixteen.setVisibility(View.VISIBLE);
		}
		else
		{
			Resources r = getResources();
			float widthr = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, r.getDisplayMetrics());
			transone.setLayoutParams(new LinearLayout.LayoutParams(Math.round(widthr),LinearLayout.LayoutParams.MATCH_PARENT));
			transfourteen.setVisibility(View.GONE);
			transfifteen.setVisibility(View.GONE);
			transsixteen.setVisibility(View.GONE);
			transone.setBackgroundResource(0);
			transfive.setBackgroundResource(0);
			transsix.setBackgroundResource(0);
			transseven.setBackgroundResource(0);
			homeimage.setImageResource(R.drawable.homewhite);
			searchimage.setImageResource(R.drawable.searchwhite);
			moreimage.setImageResource(R.drawable.morewhite);
			homeimage.setAlpha(80);
			searchimage.setAlpha(80);
			moreimage.setAlpha(80);
		}
	}
	
	private boolean isAtBottom(ScrollView scrollView)
	{
		View child = scrollView.getChildAt(0);
		if (child != null)
		{
			int diff = (child.getBottom() - (scrollView.getHeight() + scrollView.getScrollY()));
			return diff <= 10;
		}
		return false;
	}
	
	public void searchbutton(View view)
	{
		
	}
	
	public void more(View view)
	{
		
	}
	
	public void empty(View view)
	{
		
	}
	
	public void home(View view)
	{
		for(int i = 0;i< down.size();i++)
		{
			down.get(i).cancel(true);
		}
		Intent intent = new Intent(search.this, MainActivity.class);
		startActivity(intent);
	}
	
	public void filters(View view)
	{
		genres.setTitle("filters");
		genres.show();
	}
	
	public void search(View view)
	{
		if(getResources().getBoolean(R.bool.is_landscape))
		{
			scrool.removeAllViews();
			background.requestFocus();
		}
		else
		{
			searchgrid.removeAllViews();
		}
		String spinvalue = spin.getSelectedItem().toString();
		if(spinvalue.equals("MOVIES"))
		{
			String spin2value = spin2.getSelectedItem().toString();
			if(spin2value.equals("BY TEXT"))
			{
				String edittextvalue = searchedittext.getText().toString();
				if(edittextvalue.equals(""))
				{
					
				}
				else
				{
					searched = true;
					page = 1;
					for(int i = 0;i< down.size();i++)
					{
						down.get(i).cancel(true);
					}
					pd.show();
					new json().execute("https://api.themoviedb.org/3/search/movie?query="+edittextvalue+"&include_adult=false&language=el-GR&page="+String.valueOf(page));
				}
			}
			else if(spin2value.equals("BY GENRES"))
			{
				if(applyablegenres.equals(""))
				{
					
				}
				else
				{
					searched = true;
					page = 1;
					for(int i = 0;i< down.size();i++)
					{
						down.get(i).cancel(true);
					}
					pd.show();
					new json().execute("https://api.themoviedb.org/3/discover/movie?with_genres="+applyablegenres+"&language=el-GR&page="+String.valueOf(page));
				}
			}
		}
		else if(spinvalue.equals("SIRIES"))
		{
			String spin2value = spin2.getSelectedItem().toString();
			if(spin2value.equals("BY TEXT"))
			{
				String edittextvalue = searchedittext.getText().toString();
				if(edittextvalue.equals(""))
				{

				}
				else
				{
					searched = true;
					page = 1;
					for(int i = 0;i< down.size();i++)
					{
						down.get(i).cancel(true);
					}
					pd.show();
					new json2().execute("https://api.themoviedb.org/3/search/tv?query="+edittextvalue+"&include_adult=false&language=el-GR&page="+String.valueOf(page));
				}
			}
			else if(spin2value.equals("BY GENRES"))
			{
				if(applyablegenres.equals(""))
				{

				}
				else
				{
					searched = true;
					page = 1;
					for(int i = 0;i< down.size();i++)
					{
						down.get(i).cancel(true);
					}
					pd.show();
					new json2().execute("https://api.themoviedb.org/3/discover/tv?with_genres="+applyablegenres+"&language=el-GR&page="+String.valueOf(page));
				}
			}
		}
		else if(spinvalue.equals("ACTORS"))
		{
			String edittextvalue = searchedittext.getText().toString();
			if(edittextvalue.equals(""))
			{

			}
			else
			{
				searched = true;
				page = 1;
				for(int i = 0;i< down.size();i++)
				{
					down.get(i).cancel(true);
				}
				pd.show();
				new json3().execute("https://api.themoviedb.org/3/search/person?query="+edittextvalue+"&language=el-GR&page="+String.valueOf(page));
			}
		}
		InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
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
			if (pd.isShowing())
			{
				pd.dismiss();
        	}
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
								butt(obj.getString("title"),obj.getString("backdrop_path"),obj.getString("release_date"),obj.getString("id"),obj.getString("backdrop_path"),1,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butt(obj.getString("original_title"),obj.getString("poster_path"),obj.getString("release_date"),obj.getString("id"),obj.getString("poster_path"),1,obj.getString("overview"),"");
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
								butt(obj.getString("title"),obj.getString("backdrop_path"),obj.getString("release_date"),obj.getString("id"),obj.getString("backdrop_path"),0,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butt(obj.getString("original_title"),obj.getString("poster_path"),obj.getString("release_date"),obj.getString("id"),obj.getString("poster_path"),0,obj.getString("overview"),"");
							}
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

		public void butt(final String te,final String image,final String release,final String idd,final String backdrop,final int first,final String description,final String genres)
		{
			final LinearLayout one = new LinearLayout(search.this);
			final LinearLayout textslay = new LinearLayout(search.this);
			final ImageView two = new ImageView(search.this);
			Space spacer = new Space(search.this);
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				textslay.setOrientation(LinearLayout.VERTICAL);
				textslay.setBackgroundColor(Color.parseColor("#414141"));
				TextView three = new TextView(search.this);
				TextView four = new TextView(search.this);
				spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
				Space spacertwo = new Space(search.this);
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
				TextView three = new TextView(search.this);
				TextView four = new TextView(search.this);
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
						Intent intent = new Intent(search.this, second.class);
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
							AsyncTask dow = new DownloadBackgroundTask(background).execute("https://image.tmdb.org/t/p/w780"+backdrop);
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
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								try
								{
									searchedittext.requestFocus();
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
					searchfirst = one;
					try
					{
						scroller.setCenter(one);
					}
					catch(Exception e){}
				}
			}
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				scrool.addView(one);
				scrool.addView(spacer);
			}
			else
			{
				searchgrid.addView(one);
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
			String[] one = sorter(result);
			sorter2(one);
			if (pd.isShowing())
			{
				pd.dismiss();
        	}
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
								butt(obj.getString("name"),obj.getString("backdrop_path"),obj.getString("first_air_date"),obj.getString("id"),obj.getString("backdrop_path"),1,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butt(obj.getString("original_name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),obj.getString("poster_path"),1,obj.getString("overview"),"");
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
								butt(obj.getString("name"),obj.getString("backdrop_path"),obj.getString("first_air_date"),obj.getString("id"),obj.getString("backdrop_path"),0,obj.getString("overview"),resultStringfin);
							}
							else
							{
								butt(obj.getString("original_name"),obj.getString("poster_path"),obj.getString("first_air_date"),obj.getString("id"),obj.getString("poster_path"),0,obj.getString("overview"),"");
							}
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

		public void butt(final String te,final String image,final String release,final String idd,final String backdrop,final int first,final String description,final String genres)
		{
			final LinearLayout one = new LinearLayout(search.this);
			final LinearLayout textslay = new LinearLayout(search.this);
			final Space spacer = new Space(search.this);
			final ImageView two = new ImageView(search.this);
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				textslay.setOrientation(LinearLayout.VERTICAL);
				textslay.setBackgroundColor(Color.parseColor("#414141"));
				TextView three = new TextView(search.this);
				TextView four = new TextView(search.this);
				spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
				Space spacertwo = new Space(search.this);
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
				TextView three = new TextView(search.this);
				TextView four = new TextView(search.this);
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
					Intent intent = new Intent(search.this, third.class);
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
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								AsyncTask dow = new DownloadBackgroundTask(background).execute("https://image.tmdb.org/t/p/w780"+backdrop);
								down.add(dow);
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
						if(p3.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP && p3.getAction() == KeyEvent.ACTION_DOWN)
						{
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								try
								{
									searchedittext.requestFocus();
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
					searchfirst = one;
					try
					{
						scroller.setCenter(one);
					}
					catch(Exception e){}
				}
			}
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				scrool.addView(one);
				scrool.addView(spacer);
			}
			else
			{
				searchgrid.addView(one);
			}
		}
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
			String[] one = sorter(result);
			sorter2(one);
			if (pd.isShowing())
			{
				pd.dismiss();
        	}
    	}

		public void sorter2(String[] jso)
		{
			try
			{
				for(int i = 0;i < jso.length;i++)
				{
					final JSONObject obj = new JSONObject(jso[i]);
					if(obj.getString("known_for_department").equals("Acting"))
					{
						try
						{
							if(i == 0)
							{
								butto(obj.getString("profile_path"),obj.getString("name"),obj.getString("id"),1);
							}
							else
							{
								butto(obj.getString("profile_path"),obj.getString("name"),obj.getString("id"),0);
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

		public void butto(final String image,final String name,final String idd,final int first)
		{
			final LinearLayout one = new LinearLayout(search.this);
			final LinearLayout textslay = new LinearLayout(search.this);
			final ImageView two = new ImageView(search.this);
			final Space spacer = new Space(search.this);
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				spacer.setLayoutParams(new LinearLayout.LayoutParams(50,LinearLayout.LayoutParams.WRAP_CONTENT));
				textslay.setOrientation(LinearLayout.VERTICAL);
				textslay.setBackgroundColor(Color.parseColor("#414141"));
				TextView three = new TextView(search.this);
				Space spacertwo = new Space(search.this);
				spacertwo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,20));
				one.setOrientation(LinearLayout.VERTICAL);
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
				one.addView(spacertwo);
				one.addView(textslay);
				two.setAlpha(150);
				textslay.getBackground().setAlpha(150);
			}
			else
			{
				TextView three = new TextView(search.this);
				one.setOrientation(LinearLayout.VERTICAL);
				three.setText(name);
				three.setTextColor(Color.parseColor("#000000"));
				AsyncTask dow = new DownloadImageTask(two).execute("https://image.tmdb.org/t/p/w185"+image);
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
			}
			one.setOnClickListener(new OnClickListener()
				{
					public void onClick(View view)
					{
						for(int i = 0;i< down.size();i++)
						{
							down.get(i).cancel(true);
						}
						Intent intent = new Intent(search.this, actorsmovies.class);
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
							
							if(getResources().getBoolean(R.bool.is_landscape))
							{
								background.setBackgroundColor(Color.parseColor("#000000"));
								scroller.setCenter(one);
								textslay.setBackgroundColor(Color.parseColor("#0078FF"));
								two.setBackgroundDrawable(getDrawable(R.drawable.simplecircle));
								two.setAlpha(255);
								textslay.getBackground().setAlpha(255);
								menutitle.setText("");
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
							searchedittext.requestFocus();
							return true;
						}
						return false;
					}
				});
			if(first == 1)
			{
				if(getResources().getBoolean(R.bool.is_landscape))
				{
					searchfirst = one;
					try
					{
						scroller.setCenter(one);
					}
					catch(Exception e){}
				}
			}
			if(getResources().getBoolean(R.bool.is_landscape))
			{
				scrool.addView(one);
				scrool.addView(spacer);
			}
			else
			{
				searchgrid.addView(one);
			}
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
