package com.example.LLD.meetingScheduler;

import java.util.ArrayList;
import java.util.List;

public class Meeting {
    int meetingId;
    String description;
    List<User> users;
    Interval interval;

    public Meeting(int meetingId, String description, List<User> users, Interval interval) {
        this.meetingId = meetingId;
        this.description = description;
        this.users = users;
        this.interval = interval;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }
}
