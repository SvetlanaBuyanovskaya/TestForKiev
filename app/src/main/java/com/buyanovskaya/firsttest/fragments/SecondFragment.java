package com.buyanovskaya.firsttest.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.buyanovskaya.firsttest.R;


public class SecondFragment extends Fragment {

    public static SecondFragment newInstance(int page) {
        SecondFragment pageFragment = new SecondFragment();
        return pageFragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        ImageView im_view2 = (ImageView) view.findViewById(R.id.im_view2);
        im_view2.setImageResource(R.drawable.ic_tmp_poster2);
        return view;
    }

}
