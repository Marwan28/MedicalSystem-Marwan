package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class TasksActivity extends AppCompatActivity {
    ArrayList<TaskModel> tasks = new ArrayList<>();
    RecyclerView recyclerView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        textView = findViewById(R.id.search_tasks);
        prepareData();
        recyclerView = findViewById(R.id.rv_tasks);
        TaskAdapter taskAdapter = new TaskAdapter(tasks, new TaskAdapter.ItemClickListener() {
            @Override
            public void onItemClick(TaskModel taskModel) {
                Intent intent = new Intent(TasksActivity.this, TaskDetailsActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(taskAdapter);
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
        TaskModel taskModel1 = new TaskModel("Task1", "05 . 05 . 2022", "Finished");
        tasks.add(taskModel1);
        TaskModel taskModel2 = new TaskModel("Task2", "10 . 05 . 2022", "Process");
        tasks.add(taskModel2);
        TaskModel taskModel3 = new TaskModel("Task3", "15 . 05 . 2022", "Finished");
        tasks.add(taskModel3);
        TaskModel taskModel4 = new TaskModel("Task4", "20 . 05 . 2022", "Process");
        tasks.add(taskModel4);
        TaskModel taskModel5 = new TaskModel("Task5", "25 . 05 . 2022", "Finished");
        tasks.add(taskModel5);
    }
}