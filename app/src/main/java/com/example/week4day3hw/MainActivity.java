 package com.example.week4day3hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/*
Homework WeekFour Day Three


Coding
1. Create an application to use 5 systems broadcasts
2. Create a foreground service with notification. Clicking on the notification will stop the foreground music.
3. Create an IntentService to create a list of random objects (The objects should have atleast 4 fields including an image). Populate the recyclerView in the same activity which starts the intent service. Pass the data using a broadcast receiver.
4. Use the AlarmManager to send a notification after 5 secs on clicking each list item. The notification should have the object that was clicked on


*/



 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BroadcastReceiver br = new TestBroadcastReceivers();

        //Intent filter to indicate which intents we are interested in
        IntentFilter filter = new IntentFilter();

        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        getApplicationContext().registerReceiver(br,filter);
    }



}
