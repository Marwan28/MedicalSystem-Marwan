package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class DoctorCallsActivity extends AppCompatActivity {
    ArrayList<DoctorCallModel> doctorCalls = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_calls);
        prepareData();
        recyclerView = findViewById(R.id.rv_doctor_calls);
        DoctorCallAdapter doctorCallAdapter = new DoctorCallAdapter(doctorCalls, new DoctorCallAdapter.ItemClickListener() {
            @Override
            public void onItemClick(DoctorCallModel doctorCallModel) {
                Intent intent = new Intent(DoctorCallsActivity.this, CaseDetailsActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(doctorCallAdapter);

    }
    private void prepareData() {
        DoctorCallModel doctorModel1 = new DoctorCallModel("Ebrahem Khaled", "24 . 04 . 2021");
        doctorCalls.add(doctorModel1);
        DoctorCallModel doctorModel2 = new DoctorCallModel("Ebrahem Khaled", "24 . 04 . 2021");
        doctorCalls.add(doctorModel2);
        DoctorCallModel doctorModel3 = new DoctorCallModel("Ebrahem Khaled", "24 . 04 . 2021");
        doctorCalls.add(doctorModel3);

    }
}