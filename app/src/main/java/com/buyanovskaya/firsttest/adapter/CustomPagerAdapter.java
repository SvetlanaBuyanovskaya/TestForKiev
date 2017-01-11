package com.buyanovskaya.firsttest.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.buyanovskaya.firsttest.fragments.FirstFragment;
import com.buyanovskaya.firsttest.fragments.SecondFragment;


public class CustomPagerAdapter extends FragmentPagerAdapter {
    protected Context mContext;
    int pageNumb = 2;
    public CustomPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FirstFragment.newInstance(position);
            case 1:
                return SecondFragment.newInstance(position);
            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return pageNumb;
    }
}

