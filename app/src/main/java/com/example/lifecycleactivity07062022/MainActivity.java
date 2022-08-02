package com.example.lifecycleactivity07062022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","MainActivity: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","MainActivity: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","MainActivity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","MainActivity: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","MainActivity: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","MainActivity: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","MainActivity: onRestart");
    }
}
