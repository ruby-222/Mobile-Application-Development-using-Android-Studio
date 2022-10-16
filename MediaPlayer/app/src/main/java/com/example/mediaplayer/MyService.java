package com.example.mediaplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }
    MediaPlayer mp;
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }
    @Override
    public void onStart(Intent i,int startId){
        mp=MediaPlayer.create(this,R.raw.song);
        mp.start();
        super.onStart(i,startId);
    }
    @Override
    public void onDestroy(){
        mp.stop();
    }

}