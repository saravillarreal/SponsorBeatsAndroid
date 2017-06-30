package com.sponsorbeats.android;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import app.sponsorbeats.com.sponsorbeats.Animation;
import app.sponsorbeats.com.sponsorbeats.R;
import app.sponsorbeats.com.sponsorbeats.databinding.LoginActivityBinding;


/**
 * Created by Sara Villarreal on 6/30/2017.
 */

public class LoginActivity extends BaseActivity {
    public final static String TAG = "LoginActivity";

    private LoginActivityBinding loginActivityBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginActivityBinding = DataBindingUtil.setContentView(this, R.layout.login_activity);
        loginActivityBinding.facebookIcon.setOnClickListener(new LoginFacebookOnClickListener());
        loginActivityBinding.twitterIcon.setOnClickListener(new LoginTwitterOnClickListener());
        loginActivityBinding.instagramIcon.setOnClickListener(new LoginInstagramOnClickListener());
    }


    private class LoginFacebookOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Animation.pulseAnimation(loginActivityBinding.facebookIcon);

        }
    }

    private class LoginTwitterOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Animation.pulseAnimation(loginActivityBinding.twitterIcon);
        }
    }

    private class LoginInstagramOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Animation.pulseAnimation(loginActivityBinding.instagramIcon);
        }
    }






}
