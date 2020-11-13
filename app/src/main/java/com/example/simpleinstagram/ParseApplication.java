package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ku0jpKjMjKL8hnBe57uJ3fFSxC8jIwncXJNk0esX")
                .clientKey("EANUSmBEy4yZWxyTXk7cjufSO4VkITT43arV7tkY")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
