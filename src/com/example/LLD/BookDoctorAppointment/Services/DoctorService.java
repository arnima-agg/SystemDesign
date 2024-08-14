package com.example.LLD.BookDoctorAppointment.Services;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.print.Doc;

import com.example.LLD.BookDoctorAppointment.Entity.Doctor;
import com.example.LLD.BookDoctorAppointment.Entity.Slot;
import com.example.LLD.BookDoctorAppointment.Enums.Speciality;
import com.example.LLD.BookDoctorAppointment.Repository.DoctorRepository;
import com.example.LLD.BookDoctorAppointment.Utils.Util;

public class DoctorService {

    DoctorRepository doctorRepository = DoctorRepository.getInstance();

    public void registerDoctor(String doctorName, Speciality speciality) {
        Doctor doctor = new Doctor(doctorName, speciality);
        if(doctorRepository.isAlreadyRegistered(doctor)) {
            throw new RuntimeException("doctor already present");
        }
        List<Doctor> doctors = new ArrayList<>();
        doctorRepository.saveDoctor(doctor);
        doctorRepository.saveDoctorWithSpeciality(speciality, doctor);

        System.out.println("Welcome " + doctorName);

    }

    public void addAvailableSlots(String doctorName, String startTime, String endTime) {
        Doctor doctor = doctorRepository.getDoctorByName(doctorName);

        LocalTime start = Util.convertStringToTime(startTime);
        LocalTime end = Util.convertStringToTime(endTime);
        Slot slot = new Slot(startTime, endTime);
        if(ChronoUnit.MINUTES.between(start,end)%60 == 30){
            throw new RuntimeException("add correct time");
        } else {
            doctor.getSlots().put(slot, true);
            System.out.println("Done Doc!");
        }
    }

    public void getAvailableSlotsBySpeciality(Speciality speciality) {

        List<Doctor> doctors = doctorRepository.getDoctorWithSpeciality(speciality);
        if(Objects.isNull(doctors)) {
            throw new RuntimeException("no doc available");
        }
        for(Doctor doctor : doctors) {
            getAllFreeSlots(doctor.getName());
        }
    }

    private void getAllAppointments(String doctorName) {
        Doctor doctor = doctorRepository.getDoctorByName(doctorName);
        Map<Slot, Boolean> doctorSlots = doctor.getSlots();
        for(Map.Entry<Slot, Boolean> slot : doctorSlots.entrySet()) {
            if(slot.getValue() == false) {
                System.out.print(slot.getKey() + " ");
            }
        }
        System.out.println();
    }

    private void getAllFreeSlots(String doctorName) {
        Doctor doctor = doctorRepository.getDoctorByName(doctorName);
        Map<Slot, Boolean> doctorSlots = doctor.getSlots();
        for(Map.Entry<Slot, Boolean> slot : doctorSlots.entrySet()) {
            if(slot.getValue()) {
                System.out.print(slot.getKey().getStartTime() + " " + slot.getKey().getEndTime());
            }
        }
        System.out.println();
    }

}
