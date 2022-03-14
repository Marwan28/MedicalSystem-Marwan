package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AttendanceSecondSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_second_splash);
    }

    public void finishRegister(View view) {
        Intent intent = new Intent(AttendanceSecondSplashActivity.this, AttendanceLeavingActivity.class);
        startActivity(intent);
    }
}