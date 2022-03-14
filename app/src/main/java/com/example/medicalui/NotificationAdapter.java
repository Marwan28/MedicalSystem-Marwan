package com.example.medicalui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationHolder> {
    ArrayList<NotificationModel> list;

    public NotificationAdapter(ArrayList<NotificationModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public NotificationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_details, parent, false);
        NotificationHolder notificationHolder = new NotificationHolder(view);
        return notificationHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationHolder holder, int position) {
        NotificationModel notificationModel = list.get(position);
        holder.name.setText(notificationModel.getName());
        holder.desc.setText(notificationModel.getDescription());
        holder.time.setText(notificationModel.getTime());
        if (notificationModel.getStatus().equals("new")){
            holder.status.setImageResource(R.drawable.ic_new_notification);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class NotificationHolder extends RecyclerView.ViewHolder{
        TextView name, desc, time;
        ImageView status;
        public NotificationHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_notification_name);
            desc = itemView.findViewById(R.id.tv_notification_description);
            time = itemView.findViewById(R.id.tv_notification_time);
            status = itemView.findViewById(R.id.iv_notification_status);
        }
    }

}
