package com.andryyu.eventdeliver.test2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by yufei on 2017/9/28.
 */

public class MyScrollView extends ScrollView {

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        //不要拦截
        requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(ev);
    }
}
