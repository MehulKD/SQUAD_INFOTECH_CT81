package com.squad.android.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squad.android.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MarketingFragment2 extends Fragment
{
    TextView sampleTextView;
    
    public MarketingFragment2()
    {
        // Required empty public constructor
    }
    
    
    @Override public View onCreateView(LayoutInflater inflater,
                                       ViewGroup container,
                                       Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_marketing_fragment2, container, false);
    
        sampleTextView=view.findViewById(R.id.sampleTextView);
    
        sampleTextView.setText("Welcome to page 2");
    
        return view;
    }
    
}
