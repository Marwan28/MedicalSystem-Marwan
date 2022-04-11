package com.example.medicalui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoctorCallAdapter extends  RecyclerView.Adapter<DoctorCallAdapter.DoctorCallHolder>{
    ArrayList<DoctorCallModel> list;
    private ItemClickListener itemClickListener;

    public DoctorCallAdapter(ArrayList<DoctorCallModel> list, ItemClickListener itemClickListener) {
        this.list = list;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public DoctorCallHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.doctor_call_details, parent, false);
        DoctorCallHolder doctorCallHolder = new DoctorCallHolder(view);
        return doctorCallHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorCallHolder holder, int position) {
        DoctorCallModel doctorCallModel = list.get(position);
        holder.name.setText(doctorCallModel.getName());
        holder.date.setText(doctorCallModel.getDate());
        holder.accept.setOnClickListener(view ->{
            itemClickListener.onItemClick(list.get(position));
        });
        holder.busy.setOnClickListener(view ->{
            itemClickListener.onItemClick(list.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public interface ItemClickListener{
        void onItemClick(DoctorCallModel doctorCallModel);
    }

    class DoctorCallHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView date;
        Button accept;
        Button busy;
        public DoctorCallHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_doctor_call_name);
            date = itemView.findViewById(R.id.tv_doctor_call_date);
            accept = itemView.findViewById(R.id.btn_doctor_call_accept);
            busy = itemView.findViewById(R.id.btn_doctor_call_busy);
        }
    }
}
