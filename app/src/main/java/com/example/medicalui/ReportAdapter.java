package com.example.medicalui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.ReportHolder>{
    ArrayList<ReportModel> list;
    private ItemClickListener itemClickListener;

    public ReportAdapter(ArrayList<ReportModel> list, ItemClickListener itemClickListener) {
        this.list = list;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ReportHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.report_datails, parent, false);
        ReportHolder reportHolder = new ReportHolder(view);
        return reportHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReportHolder holder, int position) {
        ReportModel reportModel = list.get(position);
        holder.name.setText(reportModel.getName());
        holder.date.setText(reportModel.getDate());
        if (reportModel.getStatus().equals("Process")){
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
        void onItemClick(ReportModel reportModel);
    }
    class ReportHolder extends RecyclerView.ViewHolder{
        TextView name, date;
        ImageView status;
        public ReportHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_report_name);
            date = itemView.findViewById(R.id.tv_report_date);
            status = itemView.findViewById(R.id.iv_report_status);
        }
    }
}
