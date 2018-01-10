package com.example.nttr.exitmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //タブレイアウト
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//        tabLayout.addTab(tabLayout.newTab().setText("タブ1"));
//        tabLayout.addTab(tabLayout.newTab().setText("タブ2"));
//        tabLayout.addTab(tabLayout.newTab().setText("タブ3"));
//
//        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
//        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
//
//        tabLayout.setupWithViewPager(viewPager);
//
    }

//    private class ViewPagerAdapter extends FragmentPagerAdapter {
//        public ViewPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            Fragment fragment = null;
//
//            switch (position) {
//                case 0:
//                    fragment = new FirstFragment();
//                    break;
//                case 1:
//                    fragment = new SecondFragment();
//                    break;
//                case 2:
//                    fragment = new ThirdFragment();
//                    break;
//                default:
//                    break;
//            }
//            return fragment;
//        }
//
//        @Override
//        public int getCount() {
//            return 3;
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return "タブ"+ (position+1);
//        }

}
