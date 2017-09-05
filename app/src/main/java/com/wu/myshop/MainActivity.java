package com.wu.myshop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wu.myshop.base.BaseFragment;
import com.wu.myshop.community.fragment.CommunityFragment;
import com.wu.myshop.home.fragment.HomeFragment;
import com.wu.myshop.shoppingcart.fragment.ShoppingCartFragment;
import com.wu.myshop.type.fragment.TypeFragment;
import com.wu.myshop.user.fragment.UserFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

    @BindView(R.id.flayout_container)
    FrameLayout flayoutContainer;
    @BindView(R.id.rb_home)
    RadioButton rbHome;
    @BindView(R.id.rb_type)
    RadioButton rbType;
    @BindView(R.id.rb_community)
    RadioButton rbCommunity;
    @BindView(R.id.rb_cart)
    RadioButton rbCart;
    @BindView(R.id.rb_user)
    RadioButton rbUser;
    @BindView(R.id.group_bottom_main)
    RadioGroup groupBottomMain;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;

    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // 默认选中主页面
        groupBottomMain.check(R.id.rb_home);
        // 初始化各个 fragment
        initFragment();
    }

    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new TypeFragment());
        fragments.add(new CommunityFragment());
        fragments.add(new ShoppingCartFragment());
        fragments.add(new UserFragment());
    // 设置默认的 Fragemnt
        //defaultFragment(getFragment(position));
    }
    private void defaultFragment(BaseFragment fragment) {
        //tempFragemnt = fragment;
    //1. 得到 FragmentManger
        FragmentManager fm = getSupportFragmentManager();
    //2. 开启事务
        FragmentTransaction ta = fm.beginTransaction();
    //3. 添加
        //ta.add(R.id.frameLayout,tempFragemnt);
    //4. 提交
        ta.commit();
    }
}
