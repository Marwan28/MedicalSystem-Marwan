package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
    }

    public void profile(View view) {
        Intent intent = new Intent(DoctorActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void notification(View view) {
        Intent intent = new Intent(DoctorActivity.this, NotificationActivity.class);
        startActivity(intent);
    }

    public void doctorCalls(View view) {
        Intent intent = new Intent(DoctorActivity.this, DoctorCallsActivity.class);
        startActivity(intent);
    }

    public void reports(View view) {
        Intent intent = new Intent(DoctorActivity.this, ReportsActivity.class);
        startActivity(intent);
    }

    public void tasks(View view) {
        Intent intent = new Intent(DoctorActivity.this, TasksActivity.class);
        startActivity(intent);
    }

    public void attendanceLeaving(View view) {
        Intent intent = new Intent(DoctorActivity.this, AttendanceLeavingActivity.class);
        startActivity(intent);
    }

    public void cases(View view) {
    }
}