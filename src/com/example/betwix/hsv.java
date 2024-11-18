package com.example.betwix;
import android.widget.*;
import android.content.*;
import android.view.*;
import android.util.*;
import android.graphics.*;
import android.app.*;

public class hsv extends HorizontalScrollView
{
	Context context;
	//int prevIndex = 0;
	
	public hsv(Context context,AttributeSet attr)
	{
		super(context,attr);
		this.context = context;
		this.setSmoothScrollingEnabled(true);
	}
	
	public hsv(Context context)
	{
		super(context);
		this.context = context;
		this.setSmoothScrollingEnabled(true);
	}
	
	public void setCenter(View view) {

		//ViewGroup parent = (ViewGroup) getChildAt(0);

		//View view = parent.getChildAt(index);

		int screenWidth = ((Activity) context).getWindowManager()
			.getDefaultDisplay().getWidth();
		int scrollX = (view.getLeft() - (screenWidth / 2))
			+ (view.getWidth() / 2) + 50;
		this.smoothScrollTo(scrollX, 0);
		//prevIndex = index;
	}
}
