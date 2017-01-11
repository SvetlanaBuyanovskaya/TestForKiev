package com.buyanovskaya.firsttest.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.buyanovskaya.firsttest.R;
import com.buyanovskaya.firsttest.adapter.CustomPagerAdapter;


public class TwoActivity extends FragmentActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        CustomPagerAdapter mCustomPagerAdapter = new CustomPagerAdapter(getSupportFragmentManager(), this);
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(mCustomPagerAdapter);
        Bundle bundle = this.getIntent().getExtras();
        int pic = bundle.getInt("image1");
        viewPager.setCurrentItem(pic);
    }
}





