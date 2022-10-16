package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void start(View v){
        //Intent i = new Intent(this,MyService.class);
        //startService(i);
        mp=MediaPlayer.create(this,R.raw.song);
        mp.start();
    }
    public void stop(View v){
       // Intent i = new Intent(this,MyService.class);
       // stopService(i);
        mp.stop();
    }
}