package com.android.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class HelloAndroidList extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        String dir = getIntent().getStringExtra(HelloAndroid.direction);
//        setContentView(R.layout.list);
        TextView tv = new TextView(this);
        tv.setText(dir);
        setContentView(tv);
    }
}
