package com.example.anthony_paulfontana_ceng319lab1_ex1.dummy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.anthony_paulfontana_ceng319lab1_ex1.R;


public class secondFragment extends Fragment {

    String tag = "lifecycle";

    public  secondFragment(){

    }


    public static secondFragment newInstance(String param1, String param2) {
        secondFragment fragment = new secondFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void displayLifeCycle(String message){
        //String actMain = getString(R.string.actMain);
        TextView cycleText = (TextView)getActivity().findViewById(R.id.cycleText);

        if(message.equalsIgnoreCase(getString(R.string.onPauseCycle)) || message.equalsIgnoreCase(getString(R.string.onRestartCycle))){
            cycleText.setText("");
            cycleText.setText("Main Activity");
        }
        cycleText.append("\n" + message);

    }


}