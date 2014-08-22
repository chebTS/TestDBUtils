package com.example.cheb.testdbutils;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.rightutils.rightutils.collections.RightList;

import java.util.List;

import static com.example.cheb.testdbutils.TestApplication.*;


public class MyActivity extends Activity {
    private static final String TAG = MyActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        User user = new User(123, "Cheb","Cherkassy");
        dbUtils.add(user);
        //...
        List<User> users =  dbUtils.getAll(User.class);
        Log.i(TAG, users.toString());
    }
}
