package com.sponsorbeats.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import app.sponsorbeats.com.sponsorbeats.BaseActivity;
import app.sponsorbeats.com.sponsorbeats.R;

/**
 * Created by Sara Villarreal on 6/30/2017.
 */

public class SplashActivity extends BaseActivity {

    public final static String TAG = "SplashActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        showDelay(true);
    }



    private void showDelay(boolean goHome) {
        int secondsDelayed = 3;

        if (goHome){
            new Handler().postDelayed(new Runnable() {
                public void run() {

                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));


                    finish();

                }
            }, secondsDelayed * 1000);
        }
        else {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();

                }
            }, secondsDelayed * 1000);
        }
    }
}
