package com.example.mayra.multiapps;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class MyIntentService extends IntentService {

    private static final String TAG = "Mayra";

    public MyIntentService(){
        super("IntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent){
        Log.i(TAG, "Service Started");
    }
}
