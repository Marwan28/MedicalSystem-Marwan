package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void firstSplashScreen(){
        Intent intent = new Intent(MainActivity.this, FirstSplashActivity.class);
        startActivity(intent);
    }

    public void doctor(View view) {

    }

    public void receptionist(View view) {
        firstSplashScreen();
    }

    public void nurse(View view) {
        firstSplashScreen();
    }

    public void analysisEmployee(View view) {
        firstSplashScreen();
    }

    public void manager(View view) {
        firstSplashScreen();
    }

    public void hr(View view) {
        firstSplashScreen();
    }
}