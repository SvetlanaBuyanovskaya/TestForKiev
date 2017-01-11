package com.buyanovskaya.firsttest.activity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.buyanovskaya.firsttest.R;

public class MainActivity extends FragmentActivity implements View.OnClickListener {


    String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    private int page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
        ImageView imPoster1 = (ImageView) findViewById(R.id.im_poster1);
        ImageView stick=(ImageView)findViewById(R.id.stick);
        ImageView light=(ImageView)findViewById(R.id.light);
        ImageView imPoster2 = (ImageView) findViewById(R.id.im_poster2);
        ObjectAnimator animation = ObjectAnimator.ofFloat(stick, "rotationY", 0.0f, 360f);
        animation.setDuration(2400);
        animation.setRepeatCount(ObjectAnimator.INFINITE);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.scale);
        animation.start();
light.startAnimation(anim);
        imPoster1.setOnClickListener(this);
        imPoster2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, TwoActivity.class);
        Bundle bundle=new Bundle();
        switch (v.getId()){
            case R.id.im_poster1:
                bundle.putInt("image2", R.drawable.ic_tmp_poster1);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.im_poster2:
                bundle.putInt("image1",R.drawable.ic_tmp_poster2);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
        }

    }
}