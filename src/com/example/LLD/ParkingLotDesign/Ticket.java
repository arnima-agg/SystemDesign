package com.example.LLD.ParkingLotDesign;

import java.util.Date;

public class Ticket {
    int ticketId;
    Date issueAt;
    Date paidAt;
    double fees;

    public Ticket(int ticketid) {
        this.issueAt = new Date();
        this.ticketId = ticketid;
    }

    public void freeSpot(double fees) {
        this.paidAt = new Date();
        this.fees = fees;
    }
}
