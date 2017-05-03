package com.example.wenlongzhao.myprojectv10.mainActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

/**
 * Created by Useradmin on 2017/4/5.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 4;
    private DiscoveryFragment myFragment1 = null;
    private NotificationFragment myFragment2 = null;
    private PersonalFragment myFragment3 = null;
    private SettingFragment myFragment4 = null;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        myFragment1 = new DiscoveryFragment();
        myFragment2 = new NotificationFragment();
        myFragment3 = new PersonalFragment();
        myFragment4 = new SettingFragment();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case MainContentActivity.PAGE_ONE:
                fragment = myFragment1;
                break;
            case MainContentActivity.PAGE_TWO:
                fragment = myFragment2;
                break;
            case MainContentActivity.PAGE_THREE:
                fragment = myFragment3;
                break;
            case MainContentActivity.PAGE_FOUR:
                fragment = myFragment4;
                break;
        }
        return fragment;
    }


}

