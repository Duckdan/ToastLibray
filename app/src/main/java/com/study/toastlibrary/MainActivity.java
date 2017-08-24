package com.study.toastlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.study.toastutils.LibrayActivity;
import com.study.toastutils.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        ToastUtils.showToast(this, "我是库工程中的工具类");
        Intent intent = new Intent(this, LibrayActivity.class);
        startActivity(intent);
    }
}
