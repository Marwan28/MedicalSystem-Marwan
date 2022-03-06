package com.example.medicalui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.CallHolder> {
    ArrayList<CallModel> list;

    public CallAdapter(ArrayList<CallModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CallHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_details, parent, false);
        CallHolder callHolder = new CallHolder(view);
        return callHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CallHolder holder, int position) {
        CallModel callModel = list.get(position);
        holder.callOwner.setText(callModel.getCallOwner());
        holder.callDate.setText(callModel.getCallDate());
        if (callModel.getStatus()=="Waiting"){
            holder.status.setImageResource(R.drawable.ic_waiting_call);
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class CallHolder extends RecyclerView.ViewHolder {
        TextView callOwner, callDate;
        ImageView status;
        public CallHolder(@NonNull View itemView) {
            super(itemView);
            callOwner = itemView.findViewById(R.id.tv_call_owner);
            callDate = itemView.findViewById(R.id.tv_call_date);
            status = itemView.findViewById(R.id.iv_call_status);
        }
    }
}
