package com.android.helloandroid;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import android.widget.SimpleAdapter;
import android.widget.ArrayAdapter;


public class HelloAndroidList extends ListActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        String dir = getIntent().getStringExtra(HelloAndroid.direction);
        if (dir.equals("North")) {
            HashMap north = new HashMap();
            north.put("RCENN", "Central Station");
            String[] names = new String[] { "Central Station" };
            setListAdapter(new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, names));
        }
    }
}
