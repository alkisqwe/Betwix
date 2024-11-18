package com.example.betwix;
import android.app.*;
import android.os.*;
import android.content.*;

public class shortcuts extends Activity
{
	@Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		shortcut();
	}

	public void shortcut()
	{
		Intent intent = new Intent(shortcuts.this, MainActivity.class);
		Intent result = new Intent();
		result.putExtra(Intent.EXTRA_SHORTCUT_INTENT, intent);
		result.putExtra(Intent.EXTRA_SHORTCUT_NAME, "TAINIES");
		Parcelable iconResource = Intent.ShortcutIconResource.fromContext(this,  R.mipmap.ic_launcher);
		result.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, iconResource);
		setResult(RESULT_OK, result);
		finish();
	}
}
