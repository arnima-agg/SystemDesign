package com.example.LLD.OnlineAuctionSystem.Entity;

import java.util.HashMap;
import java.util.Map;

public class Auction {
    String name;
    int minimumLimit;
    int maximumLimit;
    String seller;
    boolean isActive;
    Map<String,Integer> buyerBidMap;

    public Auction(String name,int minimumLimit,int maximumLimit, String seller ) {
        this.name = name;
        this.seller = seller;
        this.minimumLimit = minimumLimit;
        this.maximumLimit = maximumLimit;
        this.isActive = true;
        buyerBidMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getBuyerBidMap() {
        return buyerBidMap;
    }

    public void setBuyerBidMap(Map<String, Integer> buyerBidMap) {
        this.buyerBidMap = buyerBidMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinimumLimit() {
        return minimumLimit;
    }

    public void setMinimumLimit(int minimumLimit) {
        this.minimumLimit = minimumLimit;
    }

    public int getMaximumLimit() {
        return maximumLimit;
    }

    public void setMaximumLimit(int maximumLimit) {
        this.maximumLimit = maximumLimit;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
