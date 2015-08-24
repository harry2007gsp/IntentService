package com.harry;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Harry on 8/22/15.
 */
public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("my intent service");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("test", "on Handle Intent");
        Intent intent1 = new Intent();
        intent1.putExtra("string", "hello text");
        intent1.setAction("com.finished");
        sendBroadcast(intent1);
//        MainActivity.text.setText("hello");
//        Toast.makeText(this,"onhandleintent",Toast.LENGTH_SHORT).show();
    }
    public void abc() {
        Log.d("test", "abcd");
    }

}
