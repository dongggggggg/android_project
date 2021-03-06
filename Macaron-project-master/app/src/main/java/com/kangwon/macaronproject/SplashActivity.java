package com.kangwon.macaronproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.kangwon.macaronproject.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceStare) {
    super.onCreate(savedInstanceStare);
    setContentView(R.layout.splash_layout);

    Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
        }
    },2000);
}
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
