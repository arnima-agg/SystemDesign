package com.example.LLD.OnlineAuctionSystem.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.LLD.OnlineAuctionSystem.Entity.Auction;

public class AuctionRepository {
    static List<Auction> auctionList;

    public AuctionRepository() {
        auctionList = new ArrayList<>();
    }

    public static List<Auction> getAllAuction() {
        return auctionList;
    }
}
