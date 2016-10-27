package com.hs.namgong.form;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class TabLayoutAdapter extends android.support.v4.app.FragmentPagerAdapter {
    private Fragment[] mTabItem;
    private String[] mTabTitle;

    public TabLayoutAdapter(FragmentManager fm, Fragment[] tabItem, String[] tabTitle) {
        super(fm);
        mTabItem = tabItem;
        mTabTitle = tabTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return mTabItem[position];
    }

    @Override
    public int getCount() {
        return mTabItem.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitle[position];
    }
}
