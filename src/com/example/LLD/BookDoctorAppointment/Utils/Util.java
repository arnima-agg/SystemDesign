package com.example.LLD.BookDoctorAppointment.Utils;

import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.time.LocalTime;

public class Util {

    public static String generateUUID() {
        long timestamp = System.currentTimeMillis();
        UUID uuid = UUID.randomUUID();
        String uniqueUUID = timestamp+" "+uuid;
        return uniqueUUID;
    }

    public static LocalTime convertStringToTime(String str){
        String[] time = str.split(":");
        return LocalTime.of(Integer.parseInt(time[0]),Integer.parseInt(time[1]));
    }

    public static String fetchEndTime(String startTime) {
        LocalTime time = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("H:mm"));
        LocalTime newTime = time.plusMinutes(60);
        String newTimeString = newTime.format(DateTimeFormatter.ofPattern("H:mm"));
        System.out.println(newTimeString);
        return newTimeString;
    }

}
