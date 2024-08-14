package com.example.LLD.OnlineAuctionSystem.Entity;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    String name;
    List<Auction> auctions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Auction> getAuctions() {
        return auctions;
    }

    public void setAuctions(List<Auction> auctions) {
        this.auctions = auctions;
    }

    public Buyer(String name) {
        this.name = name;
        auctions = new ArrayList<>();
    }
}
