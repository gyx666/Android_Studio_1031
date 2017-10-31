package com.bwie.android_studio_1031;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button denglu, zhuce;
    private EditText phone;
    private EditText pwd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {

        phone = (EditText) findViewById(R.id.phone);
        pwd = (EditText) findViewById(R.id.pwd);
        denglu = (Button) findViewById(R.id.denglu);
        denglu.setOnClickListener(this);
        zhuce = (Button) findViewById(R.id.zhuce);
        zhuce.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.denglu:
                Intent intent=new Intent();

                break;
            case R.id.zhuce:
                break;
        }
    }
}
