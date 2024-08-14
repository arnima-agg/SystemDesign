package com.example.LLD.BookDoctorAppointment;

import com.example.LLD.BookDoctorAppointment.Entity.Appointment;
import com.example.LLD.BookDoctorAppointment.Entity.Doctor;
import com.example.LLD.BookDoctorAppointment.Entity.Patient;
import com.example.LLD.BookDoctorAppointment.Enums.Speciality;
import com.example.LLD.BookDoctorAppointment.Repository.DoctorRepository;
import com.example.LLD.BookDoctorAppointment.Repository.PatientRepository;
import com.example.LLD.BookDoctorAppointment.Services.BookingService;
import com.example.LLD.BookDoctorAppointment.Services.DoctorService;
import com.example.LLD.BookDoctorAppointment.Services.PatientService;
import com.example.LLD.FoodOrderingSystem.HighestRatingStrategy;
import com.example.LLD.OnlineAuctionSystem.HighestBidStrategy;
import com.example.LLD.OnlineAuctionSystem.Repository.SellerRepository;
import com.example.LLD.OnlineAuctionSystem.Services.SellerService;

public class Main {

    public static void main(String args[]) {

        DoctorService doctorService = new DoctorService();

        PatientService patientService = new PatientService();


        BookingService bookingService = new BookingService();

        doctorService.registerDoctor("Curious", Speciality.CARDIOLOGIST);
      //  doctorService.addAvailableSlots("Curious", "9:00", "10:30");
        doctorService.addAvailableSlots("Curious", "09:00", "10:00");
        doctorService.addAvailableSlots("Curious", "12:00", "13:00");
        doctorService.addAvailableSlots("Curious", "13:00", "14:00");

        doctorService.registerDoctor("Dreadful", Speciality.DERMA);
        doctorService.addAvailableSlots("Dreadful", "09:00", "10:00");
        doctorService.addAvailableSlots("Dreadful", "10:00", "11:00");
        doctorService.addAvailableSlots("Dreadful", "14:00", "15:00");

        doctorService.getAvailableSlotsBySpeciality(Speciality.DERMA);
        Patient patient = new Patient("PatientA", "1234");
        patientService.registerPatient(patient);
        patientService.getAllPatient();
        bookingService.bookAppointment("PatientA", "Curious", "9:00");
    }
}
