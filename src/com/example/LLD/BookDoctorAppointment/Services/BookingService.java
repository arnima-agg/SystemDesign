package com.example.LLD.BookDoctorAppointment.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.BookDoctorAppointment.Entity.Appointment;
import com.example.LLD.BookDoctorAppointment.Entity.Doctor;
import com.example.LLD.BookDoctorAppointment.Entity.Patient;
import com.example.LLD.BookDoctorAppointment.Entity.Slot;
import com.example.LLD.BookDoctorAppointment.Repository.DoctorRepository;
import com.example.LLD.BookDoctorAppointment.Repository.PatientRepository;
import com.example.LLD.BookDoctorAppointment.Utils.Util;

public class BookingService {

    DoctorRepository doctorRepository = DoctorRepository.getInstance();
    PatientRepository patientRepository = PatientRepository.getInstance();

    public BookingService() {

    }

    private Map<String, Appointment> bookingMap = new HashMap<>();
    private Map<String, List<Slot>> patientBooking = new HashMap<>();

    public void bookAppointment(String patientName, String doctorName, String startTime) {
        Patient patient = patientRepository.getPatientByName(patientName);
        Doctor doctor = doctorRepository.getDoctorByName(doctorName);

        String bookingId = Util.generateUUID();
        String endTime = Util.fetchEndTime(startTime);
        Slot slot = new Slot(startTime, endTime);
        Appointment appointment = new Appointment(doctor, patient, slot, bookingId);
        bookingMap.put(bookingId, appointment);
        List<Slot> slots = new ArrayList<>();
        if(patientBooking.containsKey(patientName)) {
            slots = patientBooking.get(patientName);
        }
        slots.add(slot);
        patientBooking.put(patientName, slots);
        doctor.getSlots().put(slot, false);

        System.out.println("Appointment booked successfully " + bookingId);

    }

    public void showAllAppointment() {
        //iterate over the booking map
    }

    public void cancelAppointment(String bookingId) {
        Appointment booking  = bookingMap.get(bookingId);
        Patient patient = booking.getPatient();
        Doctor doctor = booking.getDoctor();
        Slot slot = booking.getTimeSlot();
        if(!bookingMap.containsKey(bookingId)) {
            throw new RuntimeException("No booking present");
        }
        bookingMap.remove(bookingId);
        List<Slot> bookedSlots = patientBooking.get(patient.getName());
        if(!bookedSlots.contains(slot)) {
            throw new RuntimeException("Slot not present");
        }
        bookedSlots.remove(slot);
        doctor.getSlots().put(slot, true);
    }
}
