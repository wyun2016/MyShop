package com.wu.myshop.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.WindowManager;

import com.wu.myshop.MainActivity;
import com.wu.myshop.R;

/**
 * <pre>
 *     author : wyun
 *     e-mail : 372856941@qq.com
 *     time  : 2017-11-26
 *     desc  : 启动页面
 *     version: 1.0
 * </pre>
 */


public class LauncherActivity extends Activity {

    private static final String TAG = LauncherActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        //去掉信息栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // 模拟启动，
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startMainActivity();
            }
        }, 2000);
    }

    /**
     * 启动主页面
     */
    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
