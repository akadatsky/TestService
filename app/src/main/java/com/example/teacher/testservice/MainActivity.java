package com.example.teacher.testservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.concurrent.TimeUnit;


public class MainActivity extends ActionBarActivity {

    private static int count = 0;

    private Object o1 = new Object();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Info info = Info.getInstance();

        info.setEmail("asdfasd");
        info.setName("asdfasasdfasdd");
        info.setSecondName("asdasdfafasd");

        App app = (App) getApplicationContext();
        app.setName("test");

        Intent intent = new Intent(this, MyService.class);
        intent.putExtra("asdf","asdf");
        startService(intent);
    }

}
