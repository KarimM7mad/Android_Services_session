package com.cse437.lab4_karimm7mad;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.media.MediaPlayer;



public class MyService extends Service{

    public MediaPlayer mpAudio;
    @Override
    public void onCreate() {
        super.onCreate();
        mpAudio = MediaPlayer.create(this,R.raw.song);
        mpAudio.setLooping(true);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mpAudio.stop();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mpAudio.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
