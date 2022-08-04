package com.example.lifecycleactivity07062022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btnNavigateScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnNavigateScreen3 = findViewById(R.id.button_navigate_main3);
        btnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        Log.d("BBB","MainActivity2: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","MainActivity2: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","MainActivity2: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","MainActivity2: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","MainActivity2: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","MainActivity2: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","MainActivity2: onRestart");
    }
}
