package com.example.LLD.BookDoctorAppointment.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Patient {
    String name;
    String contactNumber;
    Map<Doctor, List<Slot>> bookedSlot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Map<Doctor, List<Slot>> getBookedSlot() {
        return bookedSlot;
    }

    public void setBookedSlot(
            Map<Doctor, List<Slot>> bookedSlot) {
        this.bookedSlot = bookedSlot;
    }

    public Patient(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.bookedSlot = new HashMap<>();
    }
}
