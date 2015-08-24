package com.harry;

import android.app.IntentService;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static TextView text;
    MyBR myBR = new MyBR();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
//        MyIntentService myIntentService  = new MyIntentService();
//        myIntentService.abc();
        this.registerReceiver(myBR, new IntentFilter("com.finished"));
    }

    public void start(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }


}
