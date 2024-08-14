package com.example.LLD.BookDoctorAppointment.Services;

import java.util.ArrayList;
import java.util.Map;

import com.example.LLD.BookDoctorAppointment.Entity.Doctor;
import com.example.LLD.BookDoctorAppointment.Entity.Patient;
import com.example.LLD.BookDoctorAppointment.Repository.PatientRepository;

public class PatientService {

    PatientRepository patientRepository = PatientRepository.getInstance();

    public void registerPatient(Patient patient) {
        if(patientRepository.isAlreadyRegistered(patient)) {
            System.out.println("Patient already registered");
        } else {
            patientRepository.setPatient(patient);
            System.out.println(patient.getName() + " registered successfully");
        }
    }

    public void getAllAppointments(String doctorName) {

    }

    public void getAllPatient() {
        patientRepository.getAllPatient();
    }
}
