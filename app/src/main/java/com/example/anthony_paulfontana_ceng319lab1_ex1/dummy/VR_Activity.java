package com.example.anthony_paulfontana_ceng319lab1_ex1.dummy;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anthony_paulfontana_ceng319lab1_ex1.R;

public class VR_Activity extends AppCompatActivity {


    String tag = "Lifecycle";
    
    public VR_Activity(){
        
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);
        VRActivityCycle(getString(R.string.onCreateCycle));
    }

    public void VRActivityCycle(String message){



        if(message.equalsIgnoreCase(getString(R.string.onPauseCycle)) || message.equalsIgnoreCase(getString(R.string.onRestartCycle))){
            ((TextView)findViewById(R.id.vrTextView)).setText("VR Activity");
        }
        ((TextView)findViewById(R.id.vrTextView)).append("\n " + message);

    }
    

    public void onStart()
    {
        super.onStart();
        VRActivityCycle(getString(R.string.onStartCycle));
        Log.d(tag, "In the onStart() event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
        VRActivityCycle(getString(R.string.onResumeCycle));
    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
        VRActivityCycle(getString(R.string.onRestartCycle));
    }

    public void onPause()
    {
        super.onPause();
        VRActivityCycle(getString(R.string.onPauseCycle));
        Log.d(tag, "In the onPause() event");
    }

    public void onStop()
    {
        super.onStop();
        VRActivityCycle(getString(R.string.onStopCycle));
        Log.d(tag, "In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        VRActivityCycle(getString(R.string.onDestroyCycle));
        Log.d(tag, "In the onDestroy() event");
    }



}