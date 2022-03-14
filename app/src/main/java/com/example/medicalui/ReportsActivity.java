package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class ReportsActivity extends AppCompatActivity {
    ArrayList<ReportModel> reports = new ArrayList<>();
    RecyclerView recyclerView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        textView = findViewById(R.id.search_reports);
        prepareData();
        recyclerView = findViewById(R.id.rv_reports);
        ReportAdapter reportAdapter =  new ReportAdapter(reports, new ReportAdapter.ItemClickListener() {
            @Override
            public void onItemClick(ReportModel reportModel) {
                Intent intent = new Intent(ReportsActivity.this, ReportDetailsActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(reportAdapter);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomSheetDialog();
            }
        });
    }
    private void showBottomSheetDialog(){
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_search_calls);
        bottomSheetDialog.show();
    }
    private void prepareData(){

        ReportModel reportModel1 = new ReportModel("Task1", "10 . 05 . 2022", "Process");
        reports.add(reportModel1);
        ReportModel reportModel2 = new ReportModel("Task2", "15 . 05 . 2022", "Finished");
        reports.add(reportModel2);
        ReportModel reportModel3 = new ReportModel("Task3", "20 . 05 . 2022", "Process");
        reports.add(reportModel3);
        ReportModel reportModel4 = new ReportModel("Task4", "25 . 05 . 2022", "Finished");
        reports.add(reportModel4);
        ReportModel reportModel5 = new ReportModel("Task5", "05 . 05 . 2022", "Finished");
        reports.add(reportModel5);
    }

    public void addReport(View view) {
        Intent intent = new Intent(ReportsActivity.this, CreateReportActivity.class);
        startActivity(intent);
    }
}