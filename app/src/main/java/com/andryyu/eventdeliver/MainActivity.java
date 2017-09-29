package com.andryyu.eventdeliver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.andryyu.eventdeliver.test1.MyButton;
import com.andryyu.eventdeliver.test1.MyRelativeLayout;
import com.andryyu.eventdeliver.test1.Test1Activity;
import com.andryyu.eventdeliver.test2.Test2Activity;
import com.andryyu.eventdeliver.test3.Test3Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTest1;
    private Button btnTest2;
    private Button btnTest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTest1 = (Button) findViewById(R.id.btn_test1);
        btnTest2 = (Button) findViewById(R.id.btn_test2);
        btnTest3 = (Button) findViewById(R.id.btn_test3);

        btnTest1.setOnClickListener(this);
        btnTest2.setOnClickListener(this);
        btnTest3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test1:
                startActivity(new Intent(MainActivity.this, Test1Activity.class));
                break;
            case R.id.btn_test2:
                startActivity(new Intent(MainActivity.this, Test2Activity.class));
                break;
            case R.id.btn_test3:
                startActivity(new Intent(MainActivity.this, Test3Activity.class));
                break;
        }
    }
}
