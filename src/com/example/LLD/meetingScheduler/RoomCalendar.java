package com.example.LLD.meetingScheduler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RoomCalendar {

    private static RoomCalendar roomCalendar;
    private RoomCalendar() {}

    public static RoomCalendar getInstance() {
        if(roomCalendar == null) {
            synchronized (RoomCalendar.class) {
                if(roomCalendar == null) {
                    roomCalendar = new RoomCalendar();
                }
            }
        }
        return roomCalendar;
    }

    Map<Integer, List<Interval>> roomMeetingDetail = new HashMap<>();
    Map<Integer, Room> roomMap = new HashMap<>();

    public List<Room> getAllAvailableRoom(String startTime, String endTime, int capacity) {
        Interval newInterval = new Interval(startTime, endTime);
        List<Room> result = new ArrayList<>();
        for(Map.Entry<Integer, List<Interval>> entry : roomMeetingDetail.entrySet()) {
            List<Interval> intervals = entry.getValue();
            Room room = roomMap.get(entry.getKey());
            boolean isAvailable = true;
            if(room.getCapacity() >= capacity) {
                for(Interval interval : intervals) {
                    if(interval.startTime.equals(newInterval.startTime) && interval.endTime.equals(newInterval.endTime)) {
                        isAvailable = false;
                        break;
                    }
                }
                if(isAvailable) {
                    result.add(room);
                }
            }


        }
        return result;
    }

    public void bookRoom(int roomId, String startTime, String endTime) {
        Interval interval = new Interval(startTime, endTime);
        List<Interval> roomCalendar = new ArrayList<>();
        if(roomMeetingDetail.containsKey(roomId)) {
            roomCalendar = roomMeetingDetail.get(roomId);
        }
        roomCalendar.add(interval);
        roomMeetingDetail.put(roomId, roomCalendar);
        System.out.println("Room booked " + roomId + " from " + startTime + " to " + endTime);
    }

    public void createRoom(int roomId, int capacity) {
        Room room = new Room(roomId, capacity);
        roomMap.put(roomId, room);
        roomMeetingDetail.put(roomId, new ArrayList<>());
        System.out.println("room created successfully");
    }
}
