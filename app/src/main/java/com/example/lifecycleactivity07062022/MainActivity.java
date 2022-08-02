package com.example.lifecycleactivity07062022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNavigateMain2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNavigateMain2 = findViewById(R.id.button_navigate_main2);

        btnNavigateMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
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
