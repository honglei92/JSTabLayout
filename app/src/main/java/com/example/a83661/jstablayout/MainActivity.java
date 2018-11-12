package com.example.a83661.jstablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.honglei.jstablayout.JSTabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> titles = new ArrayList<>();
    TabLayout tb1;
    JSTabLayout tb2;
    ViewPager vp1, vp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titles.add("折叠自行车把手");
        titles.add("鼠标垫");
        titles.add("伞");
        titles.add("手机");
        titles.add("电视盒子");
        titles.add("书籍");
        titles.add("子弹头");
        tb1 = findViewById(R.id.tb1);
        tb2 = findViewById(R.id.tb2);
        vp1 = findViewById(R.id.vp1);
        vp2 = findViewById(R.id.vp2);
        inittb1();
        inittb2();

    }

    private void inittb2() {
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return MyFragment.newInstance(position);
            }

            @Override
            public int getCount() {
                return titles.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return titles.get(position);
            }
        };
        vp2.setAdapter(fragmentPagerAdapter);
        tb2.setupWithViewPager(vp2);
    }

    private void inittb1() {
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return MyFragment.newInstance(position);
            }

            @Override
            public int getCount() {
                return titles.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return titles.get(position);
            }
        };
        vp1.setAdapter(fragmentPagerAdapter);
        tb1.setupWithViewPager(vp1);

    }
}
