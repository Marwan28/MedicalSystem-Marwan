package com.example.medicalui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskHolder>{
    ArrayList<TaskModel> list;
    private ItemClickListener itemClickListener;
    public TaskAdapter(ArrayList<TaskModel> list, ItemClickListener itemClickListener) {
        this.list = list;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public TaskHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_details, parent, false);
        TaskHolder taskHolder = new TaskHolder(view);
        return taskHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskHolder holder, int position) {
        TaskModel taskModel = list.get(position);
        holder.name.setText(taskModel.getName());
        holder.date.setText(taskModel.getDate());
        if (taskModel.getStatus().equals("Process")){
            holder.status.setImageResource(R.drawable.ic_task_process);
        }
        holder.itemView.setOnClickListener(view ->{
            itemClickListener.onItemClick(list.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public interface ItemClickListener{
        void onItemClick(TaskModel taskModel);
    }

    class TaskHolder extends RecyclerView.ViewHolder {
        TextView name, date;
        ImageView status;
        public TaskHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_task_name);
            date = itemView.findViewById(R.id.tv_task_date);
            status = itemView.findViewById(R.id.iv_task_status);
        }
    }
}
