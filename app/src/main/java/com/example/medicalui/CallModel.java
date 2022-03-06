package com.example.medicalui;

public class CallModel {
    String callOwner;
    String callDate;
    String status;

    public CallModel(String callOwner, String callDate, String status) {
        this.callOwner = callOwner;
        this.callDate = callDate;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCallOwner() {
        return callOwner;
    }

    public void setCallOwner(String callOwner) {
        this.callOwner = callOwner;
    }

    public String getCallDate() {
        return callDate;
    }

    public void setCallDate(String callDate) {
        this.callDate = callDate;
    }

    @Override
    public String toString() {
        return "CallModel{" +
                "callOwner='" + callOwner + '\'' +
                ", callDate='" + callDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
