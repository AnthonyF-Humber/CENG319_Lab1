package com.example.anthony_paulfontana_ceng319lab1_ex1.dummy;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anthony_paulfontana_ceng319lab1_ex1.R;

public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle";
    ListView listView;
    private secondFragment fragment;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String createMsg = getString(R.string.onCreateCycle);

        fragment = (secondFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentBottom);
        fragment.displayLifeCycle(createMsg);


        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.activity));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selected_item = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this,selected_item,Toast.LENGTH_SHORT).show();
               // if (i == 0){
                 //   Intent intent = new Intent(view.getContext(), AI_Activity.class);
                   // startActivity(intent);

               // }
            }
        });

        //fragment = (secondFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentBottom);

        listView.setAdapter(mAdapter);
        Log.d(tag, "In the onCreate() event");



    }


    public void onStart()
    {
        super.onStart();
        Toast.makeText(MainActivity.this,"Im in onStart()",Toast.LENGTH_SHORT).show();
       fragment.displayLifeCycle(getString(R.string.onStartCycle));
        Log.d(tag, "In the onStart() event");
    }
       public void onResume()
        {
           super.onResume();
            fragment.displayLifeCycle(getString(R.string.onResumeCycle));
            Log.d(tag, "In the onResume() event");
        }

    public void onRestart()
    {
        super.onRestart();
        fragment.displayLifeCycle(getString(R.string.onRestartCycle));
        Log.d(tag, "In the onRestart() event");
    }

    public void onPause()
    {
        super.onPause();
        fragment.displayLifeCycle(getString(R.string.onPauseCycle));
        Log.d(tag, "In the onPause() event");
    }
    //
    public void onStop()
    {
        super.onStop();
        fragment.displayLifeCycle(getString(R.string.onStopCycle));
        Log.d(tag, "In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        fragment.displayLifeCycle(getString(R.string.onDestroyCycle));
        Log.d(tag, "In the onDestroy() event");
    }

}