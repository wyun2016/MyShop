package com.wu.myshop.user.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.wu.myshop.base.BaseFragment;

/**
 * Created by wuyun on 2017/9/5.
 * 作用：XXX
 */

public class UserFragment extends BaseFragment{
    private static final String TAG = UserFragment.class.getSimpleName();
    private TextView textView;

    @Override
    protected View initView() {
        textView = new TextView(mContext);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e(TAG," 主页数据被初始化了");
        textView.setText(" 主页");
    }
}
