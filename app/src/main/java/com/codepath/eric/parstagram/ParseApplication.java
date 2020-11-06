package com.codepath.eric.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WdaFPLaf6DUVhJTlL4CLJcYJIpEezra45QEAjjs4")
                .clientKey("Kbya0Bd52ZFvQrQj5HUEO09NKm2vbAQImXIU3tNe")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
