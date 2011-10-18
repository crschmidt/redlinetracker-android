package com.android.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class HelloAndroid extends Activity
{
    /** Called when the activity is first created. */
    public Activity activity;
    static final String direction = "DIRECTION";
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        activity = this;
        setContentView(R.layout.main);
        Button northButton = (Button)this.findViewById(R.id.north);
        northButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, HelloAndroidList.class);
                intent.putExtra(direction, "North");
                startActivity(intent);
            }
          });
        Button southButton = (Button)this.findViewById(R.id.south);
        southButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, HelloAndroidList.class);
                intent.putExtra(direction, "South");
                startActivity(intent);
            }
          });
    }
}
