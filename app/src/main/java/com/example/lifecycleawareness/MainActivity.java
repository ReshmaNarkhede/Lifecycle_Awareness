package com.example.lifecycleawareness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLifecycle().addObserver(new MyActivityObserver());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Owner OnResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Owner onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Owner onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Owner onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Owner onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Owner onRestart");
    }
}
