package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReceptionistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptionist);
    }

    public void calls(View view) {
        Intent intent = new Intent(ReceptionistActivity.this, CallsActivity.class);
        startActivity(intent);
    }
}