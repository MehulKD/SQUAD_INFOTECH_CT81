package com.squad.android;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squad.android.adapter.MarketingPageAdapter;

public class MarkettingActivity extends AppCompatActivity
{
    ViewPager viewPager;
    
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketting);
    
        viewPager=findViewById(R.id.viewPager);
    
        MarketingPageAdapter marketingPageAdapter=new MarketingPageAdapter(getSupportFragmentManager());
        
        viewPager.setAdapter(marketingPageAdapter);
        
    }
}
