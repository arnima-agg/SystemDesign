package com.example.LLD.meetingScheduler;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        User user1 = new User(1, "abc@Gmail.com");
        User user2 = new User(2, "def@Gmail.com");
        User user3 = new User(3, "arnima@Gmail.com");

        RoomCalendar roomCalendar = RoomCalendar.getInstance();
        MeetingScheduler meetingScheduler = MeetingScheduler.getInstance();

        roomCalendar.createRoom(1, 5);
        roomCalendar.createRoom(2, 3);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user3);
        List<User> userList1 = new ArrayList<>();
        userList1.add(user1);
        userList1.add(user2);
        userList1.add(user3);
        userList1.add(user3);
        meetingScheduler.bookMeeting("10:00", "11:00", userList, "sync up");
        meetingScheduler.bookMeeting("10:00", "11:00", userList1, "sync up");
    }
}
