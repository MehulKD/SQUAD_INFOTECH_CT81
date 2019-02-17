package com.squad.android.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.squad.android.MainActivity;
import com.squad.android.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MarketingFragment1 extends Fragment implements View.OnClickListener
{
    Button skipButton;
    
    
    public MarketingFragment1()
    {
        // Required empty public constructor
    }
    
    
    @Override public View onCreateView(LayoutInflater inflater,
                                       ViewGroup container,
                                       Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_marketing_fragment1, container, false);
    
        skipButton=view.findViewById(R.id.skipButton);
        skipButton.setOnClickListener(this);
        
        return view;
    }
    
    
    @Override public void onClick(View view)
    {
        int id=view.getId();
        
        switch(id)
        {
            case R.id.skipButton:
                startActivity(new Intent(getActivity(), MainActivity.class));
                break;
                
        }
    }
}
