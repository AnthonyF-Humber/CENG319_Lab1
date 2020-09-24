package com.example.anthony_paulfontana_ceng319lab1_ex1.dummy;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

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
    }

    public void AIActivityCycle(String message){


        ((TextView)findViewById(R.id.aiTextView)).setText("\n " + message);


        if(message.equalsIgnoreCase(getString(R.string.onPauseCycle)) || message.equalsIgnoreCase(getString(R.string.onRestartCycle))){
            ((TextView)findViewById(R.id.aiTextView)).setText("");
            ((TextView)findViewById(R.id.aiTextView)).setText("AI Activity");
        }
        ((TextView)findViewById(R.id.aiTextView)).setText("\n " + message);

    }



    public void onStart()
    {
        super.onStart();
        Toast.makeText(AI_Activity.this,"Im in onStart()",Toast.LENGTH_SHORT).show();
        AIActivityCycle(getString(R.string.onStartCycle));

        Log.d(tag, "In the onStart() event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }

    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }
    //
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }



}