package com.example.LLD.BookDoctorAppointment;

import java.util.List;

import com.example.LLD.BookDoctorAppointment.Entity.Doctor;
import com.example.LLD.BookDoctorAppointment.Entity.Slot;

public class TimeBasedRankingStrategy implements RankingStrategy {
    @Override public void getRanking(List<Doctor> doctors) {
//        for(Doctor doctor : doctors) {
//            int countAvailable = 0;
//            for(Slot slot : doctor.slots) {
//                if(slot.isAvailable == true) {
//                    System.out.println(doctor.name + " " + slot.startTime + "-" + slot.endTime);
//                    countAvailable++;
//                }
//            }
//            if(countAvailable == 0) {
//                System.out.println(doctor.name + " No slots available");
//                return;
//            }
//        }
    }
}
