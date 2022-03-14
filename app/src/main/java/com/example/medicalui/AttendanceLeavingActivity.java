package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AttendanceLeavingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_leaving);
    }

    public void notification(View view) {
        Intent intent = new Intent(AttendanceLeavingActivity.this, NotificationActivity.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(AttendanceLeavingActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void attendance(View view) {
        Intent intent = new Intent(AttendanceLeavingActivity.this, AttendanceFirstSplashActivity.class);
        startActivity(intent);
    }

    public void leaving(View view) {
        Intent intent = new Intent(AttendanceLeavingActivity.this, AttendanceFirstSplashActivity.class);
        startActivity(intent);
    }
}