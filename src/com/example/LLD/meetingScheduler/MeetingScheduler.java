package com.example.LLD.meetingScheduler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeetingScheduler {
    Map<Integer, Meeting> meetingMap = new HashMap<>();

    private static MeetingScheduler meetingScheduler;

    RoomCalendar roomCalendar = RoomCalendar.getInstance();
    private MeetingScheduler() {}

    public static MeetingScheduler getInstance() {
        if(meetingScheduler == null) {
            synchronized (MeetingScheduler.class) {
                if(meetingScheduler == null) {
                    meetingScheduler = new MeetingScheduler();
                }
            }
        }
        return meetingScheduler;
    }

    public void bookMeeting(String startTime, String endTime, List<User> users, String description) {
        List<Room> findAvailableRoom = roomCalendar.getAllAvailableRoom(startTime, endTime, users.size());
        if(findAvailableRoom.isEmpty()) {
            System.out.println("No room available");
            return;
        }
        roomCalendar.bookRoom(findAvailableRoom.get(0).getRoomId(), startTime, endTime);
        int meetingId = generateMeetingId();
        Interval interval = new Interval(startTime, endTime);
        Meeting meeting = new Meeting(meetingId, description, users, interval);
        meetingMap.put(meeting.getMeetingId(), meeting);
        System.out.println("meeting booked with id " + meetingId + " in room " + findAvailableRoom.get(0).getRoomId());
    }

    public int generateMeetingId() {
        return (int)System.currentTimeMillis();
    }

}
