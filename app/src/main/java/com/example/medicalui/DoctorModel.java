package com.example.medicalui;

import android.graphics.drawable.Drawable;

public class DoctorModel {
    String doctor_name;
    String doctor_specialist;
    String doctor_status;
    String doctor_pic_src;

    public DoctorModel(String doctor_name, String doctor_specialist, String doctor_status, String doctor_pic_src) {
        this.doctor_name = doctor_name;
        this.doctor_specialist = doctor_specialist;
        this.doctor_status = doctor_status;
        this.doctor_pic_src = doctor_pic_src;
    }

    @Override
    public String toString() {
        return "DoctorModel{" +
                "doctor_name='" + doctor_name + '\'' +
                ", doctor_specialist='" + doctor_specialist + '\'' +
                ", doctor_status='" + doctor_status + '\'' +
                ", doctor_pic_src='" + doctor_pic_src + '\'' +
                '}';
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_specialist() {
        return doctor_specialist;
    }

    public void setDoctor_specialist(String doctor_specialist) {
        this.doctor_specialist = doctor_specialist;
    }

    public String getDoctor_status() {
        return doctor_status;
    }

    public void setDoctor_status(String doctor_status) {
        this.doctor_status = doctor_status;
    }

    public String getDoctor_pic_src() {
        return doctor_pic_src;
    }

    public void setDoctor_pic_src(String doctor_pic_src) {
        this.doctor_pic_src = doctor_pic_src;
    }
}
