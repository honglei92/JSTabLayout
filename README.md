# JSTabLayout
仿照简书tablayout做得效果

使用方式

1.layout.xml
```
 <com.example.a83661.jstablayout.JSTabLayout
        android:id="@+id/tb2"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        app:tabBackground="@null"
        app:tabIndicatorColor="#E58D7F"
        app:tabIndicatorHeight="26dp"
        app:tabModeJS="scrollable"
        app:tabSelectedTextColor="#ffffff"
        app:tabTextAppearance="@style/TabLayoutTextStyle"
        app:tabTextColor="#333333" />

    <android.support.v4.view.ViewPager
        android:id="@+id/vp2"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />
```
2.acitivity
```
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
    ```
    其余的参考我的工程文件，需要的自取。
    
    ![Image text](https://github.com/honglei92/JSTabLayout/blob/master/screenshoot/JSTabLayout.gif?raw=true)
    
    ![Image text](https://github.com/honglei92/JSTabLayout/blob/master/screenshoot/jianshu.gif?raw=true)
