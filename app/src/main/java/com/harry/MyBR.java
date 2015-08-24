package com.harry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Harry on 8/22/15.
 */
public class MyBR extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("test", "my receiver");
        String string = intent.getStringExtra("string");
        MainActivity.text.setText(string);
    }
}
