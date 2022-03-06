package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateCallActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_call);
        textView = findViewById(R.id.select_doctor);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateCallActivity.this, SelectDoctorActivity.class);
                startActivity(intent);
            }
        });
    }

    public void sendCall(View view) {
        Intent intent = new Intent(CreateCallActivity.this, SendedCallSplashActivity.class);
        startActivity(intent);
    }
}