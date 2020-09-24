package com.example.anthony_paulfontana_ceng319lab1_ex1.dummy;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anthony_paulfontana_ceng319lab1_ex1.R;

public class AI_Activity extends AppCompatActivity {
    String tag = "Lifecycle";

    public  AI_Activity(){

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        AIActivityCycle(getString(R.string.onCreateCycle));
    }

    public void AIActivityCycle(String message){



        if(message.equalsIgnoreCase(getString(R.string.onPauseCycle)) || message.equalsIgnoreCase(getString(R.string.onRestartCycle))){
            ((TextView)findViewById(R.id.aiTextView)).setText("AI Activity");
        }
        ((TextView)findViewById(R.id.aiTextView)).append("\n " + message);

    }



    public void onStart()
    {
        super.onStart();
        AIActivityCycle(getString(R.string.onStartCycle));

        Log.d(tag, "In the onStart() event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
        AIActivityCycle(getString(R.string.onResumeCycle));
    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
        AIActivityCycle(getString(R.string.onRestartCycle));
    }

    public void onPause()
    {
        super.onPause();
        AIActivityCycle(getString(R.string.onPauseCycle));
        Log.d(tag, "In the onPause() event");
    }
    //
    public void onStop()
    {
        super.onStop();
        AIActivityCycle(getString(R.string.onStopCycle));
        Log.d(tag, "In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        AIActivityCycle(getString(R.string.onDestroyCycle));
        Log.d(tag, "In the onDestroy() event");
    }



}