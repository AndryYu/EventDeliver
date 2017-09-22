package com.andryyu.eventdeliver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener {

    private MyRelativeLayout myLayout;
    private MyButton myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (MyButton) findViewById(R.id.btn_event);
        myLayout = (MyRelativeLayout) findViewById(R.id.rl_event);

        myButton.setOnClickListener(this);
        myLayout.setOnClickListener(this);
        myButton.setOnTouchListener(this);
        myLayout.setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("zyf", "onClickListener====" + v.getId());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.i("zyf", "onTouchListener====" + event.getAction() + "====" + v.getId());
        return false;
    }
}
