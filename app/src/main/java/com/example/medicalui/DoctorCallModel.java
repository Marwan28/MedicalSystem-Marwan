package com.example.medicalui;

public class DoctorCallModel {
    String name;
    String date;

    public DoctorCallModel(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DoctorCallModel{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
