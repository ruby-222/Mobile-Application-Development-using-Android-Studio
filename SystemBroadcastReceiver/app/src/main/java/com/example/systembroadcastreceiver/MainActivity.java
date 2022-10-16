package com.example.systembroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter=new IntentFilter("android.intent.action.BATTERY_LOW");
        MyReceiver myReceiver=new MyReceiver();
        registerReceiver(myReceiver,intentFilter);
    }
}