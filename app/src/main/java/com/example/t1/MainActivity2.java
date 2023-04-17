package com.example.t1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e("MainActivityJava", "onCreate");
        Button button = findViewById(R.id.btn_press_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();

        Log.e("MainActivityJava", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("MainActivityJava", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("MainActivityJava", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("MainActivityJava", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("MainActivityJava", "onDestroy");
    }
}