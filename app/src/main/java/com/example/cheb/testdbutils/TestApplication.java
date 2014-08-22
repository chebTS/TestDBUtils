package com.example.cheb.testdbutils;

import android.app.Application;

/**
 * Created by cheb on 22.08.2014.
 */
public class TestApplication extends Application {
    public static DBUtils dbUtils;

    @Override
    public void onCreate() {
        super.onCreate();
        dbUtils = DBUtils.newInstance(this, "test.sqlite", 1);
    }
}