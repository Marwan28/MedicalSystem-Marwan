package com.example.medicalui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.DoctorHolder>{
    ArrayList<DoctorModel> list;

    public DoctorAdapter(ArrayList<DoctorModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DoctorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.doctor_details, parent, false);
        DoctorHolder doctorHolder = new DoctorHolder(view);
        return doctorHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorHolder holder, int position) {
        DoctorModel doctorModel = list.get(position);
        holder.imageViewDoctor.setImageResource(R.drawable.doctor_pic_4);
        if(doctorModel.getDoctor_status()=="not active"){
            holder.imageViewStatus.setImageResource(R.drawable.ic_not_active);
        }
        holder.doctorName.setText(doctorModel.getDoctor_name());
        holder.doctorSpecialist.setText(doctorModel.getDoctor_specialist());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class DoctorHolder extends RecyclerView.ViewHolder {
        ImageView imageViewDoctor, imageViewStatus;
        TextView doctorName, doctorSpecialist;
        public DoctorHolder(@NonNull View itemView) {
            super(itemView);
            imageViewDoctor = itemView.findViewById(R.id.iv_doctor);
            imageViewStatus = itemView.findViewById(R.id.iv_active);
            doctorName = itemView.findViewById(R.id.tv_doctor);
            doctorSpecialist = itemView.findViewById(R.id.tv_specialist);
        }
    }
}
