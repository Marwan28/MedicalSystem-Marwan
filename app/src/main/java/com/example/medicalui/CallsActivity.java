package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.sql.Date;
import java.util.ArrayList;

public class CallsActivity extends AppCompatActivity {
    ArrayList<CallModel>calls = new ArrayList<>();
    RecyclerView recyclerView;
    TextView textView;
    //DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls);
        recyclerView = findViewById(R.id.rv_calls);
        textView = findViewById(R.id.search_calls);
        //datePicker =findViewById(R.id.date_picker);
        //MaterialDatePicker.Builder materialDateBuilder = MaterialDatePicker.Builder.datePicker();
        //materialDateBuilder.setTitleText("select date");
        //final MaterialDatePicker materialDatePicker = materialDateBuilder.build();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //materialDatePicker.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                showBottomSheetDialog();
            }
        });
        /*materialDatePicker.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        // if the user clicks on the positive
                        // button that is ok button update the
                        // selected date
                        textView.setText(materialDatePicker.getHeaderText());
                        // in the above statement, getHeaderText
                        // is the selected date preview from the
                        // dialog
                    }
                });*/
        prepareData();
        CallAdapter callAdapter = new CallAdapter(calls);
        recyclerView.setAdapter(callAdapter);
    }
    private void prepareData() {
        CallModel callModel1 = new CallModel("Ebrahem Khaled", "24 . 04 . 2021", "Done");
        calls.add(callModel1);
        CallModel callModel2 = new CallModel("Ebrahem Khaled", "24 . 04 . 2021", "Waiting");
        calls.add(callModel2);
        CallModel callModel3 = new CallModel("Ebrahem Khaled", "24 . 04 . 2021", "Done");
        calls.add(callModel3);
        CallModel callModel4 = new CallModel("Ebrahem Khaled", "24 . 04 . 2021", "Waiting");
        calls.add(callModel4);
        CallModel callModel5 = new CallModel("Ebrahem Khaled", "24 . 04 . 2021", "Done");
        calls.add(callModel5);
    }
    private void showBottomSheetDialog(){
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_search_calls);
        bottomSheetDialog.show();
    }

    public void addCall(View view) {
        Intent intent = new Intent(CallsActivity.this, CreateCallActivity.class);
        startActivity(intent);
    }
}