package com.squad.android.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.squad.android.ui.fragment.MarketingFragment1;
import com.squad.android.ui.fragment.MarketingFragment2;
import com.squad.android.ui.fragment.MarketingFragment3;

public class MarketingPageAdapter extends FragmentPagerAdapter
{
    public MarketingPageAdapter(FragmentManager fm)
    {
        super(fm);
    }
    
    @Override public Fragment getItem(int i)
    {
        switch(i)
        {
            case 0:
                return new MarketingFragment1();
            case 1:
                return new MarketingFragment2();
            case 2:
                return new MarketingFragment3();
                default:
                    return null;
        }
    }
    
    @Override public int getCount()
    {
        return 3;
    }
}
