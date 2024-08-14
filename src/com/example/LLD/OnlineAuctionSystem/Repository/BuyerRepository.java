package com.example.LLD.OnlineAuctionSystem.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.OnlineAuctionSystem.Entity.Auction;
import com.example.LLD.OnlineAuctionSystem.Entity.Buyer;

public class BuyerRepository {


    List<Buyer> buyers;
    Map<String, Auction> buyerAuctionMap;

    public BuyerRepository() {
        this.buyers = new ArrayList<>();
        this.buyerAuctionMap = new HashMap<>();
    }

    public List<Buyer> getAllBuyers() {
        return buyers;
    }

    public Map<String, Auction> getBuyerAuctionMap() {
        return buyerAuctionMap;
    }
}
