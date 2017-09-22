package com.andryyu.eventdeliver;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by WH1705002 on 2017/9/22.
 */

public class MyButton extends android.support.v7.widget.AppCompatButton  {

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("zyf", "dispatchTouchEvent====" + event.getAction() + "====MyButton");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("zyf", "onTouchEvent====" + event.getAction() + "====MyButton");
        return super.onTouchEvent(event);
    }
}
