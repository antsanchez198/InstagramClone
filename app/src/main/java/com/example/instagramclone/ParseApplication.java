package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TfRTglLsokGeOZNw3YLT3W3ZY6h00SNXiCEIY2B7")
                .clientKey("kZECk61U0GJMfsbnzCS8yRsNR175fBRMDxnYEqqV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
