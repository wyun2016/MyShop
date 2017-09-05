package com.wu.myshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import com.zhy.autolayout.config.AutoLayoutConifg;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 启动页
 */
public class WelcomeActivity extends Activity {

    @BindView(R.id.image_welcome)
    ImageView imageWelcome;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);// 隐藏标题头
        AutoLayoutConifg.getInstance().useDeviceSize().init(this);//初始化屏幕信息，得到屏幕宽高和设计宽高
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        // 设置动画
        final AlphaAnimation animation = new AlphaAnimation(0.1f, 1f);
        animation.setDuration(2000);
        imageWelcome.setAnimation(animation);

        // 两秒钟进入主页面
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // 执行在主线程; 启动主页面
                startMainActivity();
            }
        }, 2000);
    }

    private void startMainActivity() {
        startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        // 关闭当前页面
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // 点击快速进入主页面
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            startMainActivity();
            Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 移除消息
        handler.removeCallbacksAndMessages(null);
    }
}
