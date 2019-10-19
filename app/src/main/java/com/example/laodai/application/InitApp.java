package com.example.laodai.application;

import android.app.Application;

public class InitApp extends Application {
    public static final String TAG = "InitApp";
    public static InitApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static InitApp getInstance() {
        return instance;
    }

}
