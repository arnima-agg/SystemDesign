package com.example.LLD.BookDoctorAppointment.Entity;

public class Slot {
    String startTime;
    String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Slot(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
