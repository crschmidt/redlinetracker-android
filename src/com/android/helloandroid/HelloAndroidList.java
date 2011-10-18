package com.android.helloandroid;

import android.widget.ListView;
import android.widget.Toast;
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
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        // Get the item that was clicked
        Object o = this.getListAdapter().getItem(position);
        String keyword = o.toString();
        Toast.makeText(this, "You selected: " + keyword, Toast.LENGTH_SHORT)
                .show();

    }
}
