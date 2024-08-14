package com.example.LLD.BookDoctorAppointment;

import java.util.List;

import com.example.LLD.BookDoctorAppointment.Entity.Doctor;

public interface RankingStrategy {
    public void getRanking(List<Doctor> doctors);
}
