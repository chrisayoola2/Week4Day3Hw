package com.example.week4day3hw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;

public class TestBroadcastReceivers extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        if (action.equals(Intent.ACTION_POWER_DISCONNECTED)){
        Toast.makeText(context, "No Connection", Toast.LENGTH_LONG).show();
    }else if(action.equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context, "Power has been Connected", Toast.LENGTH_LONG).show();
        }

        //Declare and register our receiver




    }
}
