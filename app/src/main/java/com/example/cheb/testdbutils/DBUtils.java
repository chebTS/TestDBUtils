package com.example.cheb.testdbutils;

import android.content.Context;

import com.rightutils.rightutils.db.RightDBUtils;

/**
 * Created by cheb on 22.08.2014.
 */
public class DBUtils extends RightDBUtils {
    public static DBUtils newInstance(Context context, String name, int version) {
        DBUtils dbUtils = new DBUtils();
        dbUtils.setDBContext(context, name, version);
        return dbUtils;
    }
}