package com.jfdimarzio.activity101;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;


public class MainActivity extends Activity {

    String tag = "Livscyklus af en Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Jeg er i onCreate() event");
    }

    //Activity onStart()
    public void onStart(){
        super.onStart();
        Log.d(tag, "Jeg er i onStart() event");
    }

    //Activty onRestart()
    public void onRestart(){
        super.onRestart();
        Log.d(tag, "Jeg er i onRestart() event");
    }

    //Activity onResume()
    public void onResume(){
        super.onResume();
        Log.d(tag, "Jeg er i onResume() event");
    }

    //Activity onPause()
    public void onPause(){
        super.onPause();
        Log.d(tag, "Jeg er i onPause() event");
    }

    //Activity onStop()
    public void onStop(){
        super.onStop();
        Log.d(tag, "Jeg er i onStop() event");
    }

    //Activity onDestroy()
    public void onDestroy(){
        super.onDestroy();
        Log.d(tag, "Jeg er i onDestroy() event");
    }
}


