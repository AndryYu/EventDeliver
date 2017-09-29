package com.andryyu.eventdeliver.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.andryyu.eventdeliver.R;

import java.util.ArrayList;
import java.util.List;

public class Test2Activity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        lv = (ListView)findViewById(R.id.lv_test2);
        List datas= new ArrayList<String>();
        for (int i = 0; i < 30; i++) {
            datas.add("item"+i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datas);
        lv.setAdapter(adapter);
    }


}
