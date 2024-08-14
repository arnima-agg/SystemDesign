package com.example.LLD.BookDoctorAppointment.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.BookDoctorAppointment.Enums.Speciality;

public class Doctor {
    String name;
    Speciality speciality;
    Map<Slot, Boolean> slots;

    public Doctor(String name, Speciality speciality) {
        this.name = name;
        this.speciality = speciality;
        this.slots = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Map<Slot, Boolean> getSlots() {
        return slots;
    }

    public void setSlots(Map<Slot, Boolean> slots) {
        this.slots = slots;
    }
}
