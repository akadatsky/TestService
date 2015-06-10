package com.example.teacher.testservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {




    @Override
    public void onCreate() {
        super.onCreate();

        Info info = Info.getInstance();

        Log.i("MyTag", info.getEmail());
        Log.i("MyTag", info.getName());


        App app = (App) getApplicationContext();
        Log.i("MyTag", app.getName());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        Intent brIntent = new Intent();
        brIntent.setAction("com.example.DownloadProgress");
        brIntent.putExtra("progress", 90);
        sendBroadcast(brIntent);

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
