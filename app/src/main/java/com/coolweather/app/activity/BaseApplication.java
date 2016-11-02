package com.coolweather.app.activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by Blank on 2016/9/25.
 */
public class BaseApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
