package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SendedCallSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sended_call_splash);
    }

    public void backToHome(View view) {
        Intent intent = new Intent(SendedCallSplashActivity.this, ReceptionistActivity.class);
        startActivity(intent);
    }
}