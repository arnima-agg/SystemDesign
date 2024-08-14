package com.example.LLD.OnlineAuctionSystem;

import com.example.LLD.OnlineAuctionSystem.Entity.Auction;

public interface WinningStrategy {

    public String getWinner(Auction auction);
}
