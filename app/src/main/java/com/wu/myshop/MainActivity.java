package com.wu.myshop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * <pre>
 *     author : wyun
 *     e-mail : 372856941@qq.com
 *     time  : 2017-11-26
 *     desc  : 主页面
 *     version: 1.0
 * </pre>
 */


public class MainActivity extends AppCompatActivity{

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
