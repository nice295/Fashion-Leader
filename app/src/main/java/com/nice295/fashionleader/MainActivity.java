package com.nice295.fashionleader;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    ViewPager upPager;
    ViewPager downPager;
    UpPagerAdapter mUpPagerAdapter;
    UpPagerAdapter mDownPagerAdapter;

    Integer url[] = {R.drawable.up1, R.drawable.up2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        upPager = (ViewPager) findViewById(R.id.upPager);
        mUpPagerAdapter = new UpPagerAdapter(this, url);
        upPager.setAdapter(mUpPagerAdapter);

        downPager = (ViewPager) findViewById(R.id.downPager);
        mDownPagerAdapter = new UpPagerAdapter(this, url);
        downPager.setAdapter(mDownPagerAdapter);
    }

}
