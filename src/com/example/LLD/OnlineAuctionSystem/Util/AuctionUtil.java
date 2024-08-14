package com.example.LLD.OnlineAuctionSystem.Util;

import java.util.List;

import com.example.LLD.OnlineAuctionSystem.Entity.Auction;

public class AuctionUtil {

    public static Auction getAuctionByName(String auctionName, List<Auction> auctions) {
        for(Auction auction : auctions) {
            if(auction.getName().equals(auctionName)) {
                return auction;
            }
        }
        return null;
    }
}
