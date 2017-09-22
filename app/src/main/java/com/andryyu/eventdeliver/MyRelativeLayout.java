package com.andryyu.eventdeliver;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by WH1705002 on 2017/9/22.
 */

public class MyRelativeLayout extends RelativeLayout {


    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("zyf", "dispatchTouchEvent====" + ev.getAction() + "====MyRelativeLayout");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("zyf", "onInterceptTouchEvent====" + ev.getAction() + "====MyRelativeLayout");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("zyf", "onTouchEvent====" + event.getAction() + "====MyRelativeLayout");
        return super.onTouchEvent(event);
    }
}
