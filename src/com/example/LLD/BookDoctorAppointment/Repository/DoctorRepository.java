package com.example.LLD.BookDoctorAppointment.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.print.Doc;

import com.example.LLD.BookDoctorAppointment.Entity.Doctor;
import com.example.LLD.BookDoctorAppointment.Enums.Speciality;

public class DoctorRepository {

    private Map<String, Doctor> doctorMap = new HashMap<>();
    private Map<Speciality, List<Doctor>> doctorSpecialityMap = new HashMap<>();
    private static DoctorRepository instance;

    private DoctorRepository() {

    }

    public static DoctorRepository getInstance() {
        if( null == instance) {
            instance = new DoctorRepository();
        }

        return instance;
    }
    public boolean isAlreadyRegistered(Doctor doctor) {
        if(doctorMap.containsKey(doctor.getName())) {
            return true;
        }
        return false;
    }

    public Doctor getDoctorByName(String doctorName) {
        if(!doctorMap.containsKey(doctorName)) {
            throw new RuntimeException("No doctor present");
        }
        return doctorMap.get(doctorName);
    }

    public void saveDoctor(Doctor doctor) {
        doctorMap.put(doctor.getName(), doctor);
    }

    public void saveDoctorWithSpeciality(Speciality speciality, Doctor doctor) {
        List<Doctor> doctors = new ArrayList<>();
        if(doctorSpecialityMap.containsKey(speciality)) {
            doctors = doctorSpecialityMap.get(speciality);
        }
        doctors.add(doctor);
        doctorSpecialityMap.put(speciality,doctors );
    }

    public List<Doctor> getDoctorWithSpeciality(Speciality speciality) {
        if(!doctorSpecialityMap.containsKey(speciality)) {
            return null;
        }
        return doctorSpecialityMap.get(speciality);
    }

    public Map<String, Doctor> getDoctorMap() {
        return doctorMap;
    }

    public void setDoctorMap(Map<String, Doctor> doctorMap) {
        this.doctorMap = doctorMap;
    }

    public Map<Speciality, List<Doctor>> getDoctorSpecialityMap() {
        return doctorSpecialityMap;
    }

    public void setDoctorSpecialityMap(
            Map<Speciality, List<Doctor>> doctorSpecialityMap) {
        this.doctorSpecialityMap = doctorSpecialityMap;
    }
}
