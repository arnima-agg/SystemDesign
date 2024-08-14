package com.example.LLD.BookDoctorAppointment.Repository;

import java.util.HashMap;
import java.util.Map;

import com.example.LLD.BookDoctorAppointment.Entity.Doctor;
import com.example.LLD.BookDoctorAppointment.Entity.Patient;

public class PatientRepository {

    private static PatientRepository instance;

    private PatientRepository() {

    }

    public static PatientRepository getInstance() {
        if( null == instance) {
            instance = new PatientRepository();
        }
        return instance;
    }

    private Map<String, Patient> patientMap = new HashMap<>();
    public Map<String, Patient> getPatientMap() {
        return patientMap;
    }

    public void setPatientMap(Map<String, Patient> patientMap) {
        this.patientMap = patientMap;
    }

    public boolean isAlreadyRegistered(Patient patient) {
        if(patientMap.containsKey(patient.getName())) {
            return true;
        }
        return false;
    }

    public Patient getPatientByName(String patientName) {
        if(!patientMap.containsKey(patientName)) {
            throw new RuntimeException("No patient present");
        }
        return patientMap.get(patientName);
    }

    public void setPatient(Patient patient) {
        patientMap.put(patient.getName(), patient);
    }

    public void getAllPatient() {
        for(Map.Entry<String, Patient> mp : patientMap.entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue().getContactNumber());
        }
    }

}
