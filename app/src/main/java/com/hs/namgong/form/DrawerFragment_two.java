package com.hs.namgong.form;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DrawerFragment_two extends Fragment implements TabLayout.OnTabSelectedListener {
    private Context mContext;
    private TabLayout mTabLayout;
    private ViewPager mPager;
    private TabLayoutAdapter mAdapter;
    private Fragment[] tabItem = {new TabFragment_one(), new TabFragment_two(), new TabFragment_three(), new TabFragment_four(), new TabFragment_five(), new TabFragment_six()};
    private String[] tabTitle = {"기관장", "OA시스템", "파티션", "교육용", "공공","사무용"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drawer_two, container, false);
        mContext = getActivity();
        mAdapter = new TabLayoutAdapter(getChildFragmentManager(), tabItem, tabTitle);
        mPager = (ViewPager) view.findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
        mTabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mPager);
        mTabLayout.setOnTabSelectedListener(this);
        return view;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        mPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        mPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        mPager.setCurrentItem(tab.getPosition());
    }
}
