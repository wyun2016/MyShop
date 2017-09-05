package com.wu.myshop.community.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.wu.myshop.base.BaseFragment;

/**
 * Created by wuyun on 2017/9/5.
 * 作用：发现
 */

public class CommunityFragment extends BaseFragment{

    private static final String TAG = CommunityFragment.class.getSimpleName();
    private TextView textView;

    /**
     * 绑定视图
     * @return
     */
    @Override
    protected View initView() {
        Log.e(TAG," 主页视图被初始化了");
        textView = new TextView(mContext);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        textView.setTextColor(Color.RED);
        return textView;
    }

    /**
     * 初始化数据
     */
    @Override
    public void initData() {
        super.initData();
        Log.e(TAG," 发现数据被初始化了");
        textView.setText(" 发现");
    }
}
