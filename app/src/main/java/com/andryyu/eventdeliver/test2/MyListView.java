package com.andryyu.eventdeliver.test2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by yufei on 2017/9/28.
 */

public class MyListView extends ListView {

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //int size = MeasureSpec.getSize(heightMeasureSpec);
        //int mode = MeasureSpec.getMode(heightMeasureSpec);
        //>>右移运算符
        int expandedHeight  = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2, MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
