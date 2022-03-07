package com.example.medicalui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {
    ArrayList<NotificationModel> notifications = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        recyclerView = findViewById(R.id.rv_notification);
        prepareData();
        NotificationAdapter notificationAdapter = new NotificationAdapter(notifications);
        recyclerView.setAdapter(notificationAdapter);
    }
    private  void prepareData(){
        NotificationModel notificationModel1 = new NotificationModel("Marwan Abdelwahab","you have new task from manager at eyes department with dr. mohamed and nurse esraa", "07:28AM", "new");
        notifications.add(notificationModel1);
        NotificationModel notificationModel2 = new NotificationModel("Marwan Abdelwahab","you have new task from manager at eyes department with dr. Ahmed", "07:28PM", "new");
        notifications.add(notificationModel2);
        NotificationModel notificationModel3 = new NotificationModel("Marwan Abdelwahab","you have new task from manager", "05:03AM", "old");
        notifications.add(notificationModel3);
        NotificationModel notificationModel4 = new NotificationModel("Marwan Abdelwahab","you have new task from manager", "06:01AM", "old");
        notifications.add(notificationModel4);
    }
}