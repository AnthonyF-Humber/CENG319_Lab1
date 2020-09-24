package com.example.anthony_paulfontana_ceng319lab1_ex1.dummy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;

import com.example.anthony_paulfontana_ceng319lab1_ex1.R;


public class firstFragment extends Fragment {

    public  firstFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);

        return v;



    }
}
