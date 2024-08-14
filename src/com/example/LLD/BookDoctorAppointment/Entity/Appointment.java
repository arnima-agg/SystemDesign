package com.example.LLD.BookDoctorAppointment.Entity;

import com.example.LLD.BookDoctorAppointment.Entity.Doctor;
import com.example.LLD.BookDoctorAppointment.Entity.Patient;
import com.example.LLD.BookDoctorAppointment.Entity.Slot;

public class Appointment {
    Doctor doctorName;
    Patient patient;
    Slot timeSlot;
    String bookingId;

    public Appointment(Doctor doctor, Patient patient, Slot timeSlot, String bookingId) {
        this.doctorName = doctor;
        this.patient = patient;
        this.timeSlot = timeSlot;
        this.bookingId = bookingId;
    }

    public Doctor getDoctor() {
        return doctorName;
    }

    public void setDoctorName(Doctor doctorName) {
        this.doctorName = doctorName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Slot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Slot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
