package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class SelectDoctorActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<DoctorModel> doctors = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_doctor);
        recyclerView = findViewById(R.id.rv_doctors);
        prepareData();
        DoctorAdapter doctorAdapter = new DoctorAdapter(doctors);
        recyclerView.setAdapter(doctorAdapter);

    }
    private void prepareData() {
        DoctorModel doctorModel1 = new DoctorModel("marwan", "eyes", "active", "R.drawable.doctor_pic_3");
        doctors.add(doctorModel1);
        DoctorModel doctorModel2 = new DoctorModel("Ahmed", "skin", "not active", "R.drawable.doctor_pic_2");
        doctors.add(doctorModel2);
        DoctorModel doctorModel3 = new DoctorModel("Mohamed", "hair", "active", "R.drawable.doctor_pic_4");
        doctors.add(doctorModel3);
        DoctorModel doctorModel4 = new DoctorModel("hussein", "stomach", "not active", "R.drawable.doctor_pic");
        doctors.add(doctorModel4);
        DoctorModel doctorModel5 = new DoctorModel("Mahmoud", "eyes", "active", "R.drawable.doctor_pic_3");
        doctors.add(doctorModel5);
    }

    public void selectDoctor(View view) {
        Intent intent = new Intent(SelectDoctorActivity.this, CreateCallActivity.class);
        startActivity(intent);
    }
}