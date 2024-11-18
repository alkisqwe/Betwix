package com.example.betwix;
import android.app.*;
import android.os.*;
import android.content.*;
import android.view.*;
import android.content.pm.*;

public class first extends Activity
{
	@Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        Intent intent = new Intent(first.this, MainActivity.class);
		      startActivity(intent);
	}
}
