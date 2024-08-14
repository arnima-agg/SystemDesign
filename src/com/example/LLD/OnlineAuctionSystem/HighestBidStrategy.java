package com.example.LLD.OnlineAuctionSystem;

import java.util.HashMap;
import java.util.Map;

import com.example.LLD.OnlineAuctionSystem.Entity.Auction;

public class HighestBidStrategy implements WinningStrategy{

    @Override
    public String getWinner(Auction auction) {
        Map<String, Integer> buyerBidMap = auction.getBuyerBidMap();
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(String name  : buyerBidMap.keySet()) {
            int amount = buyerBidMap.get(name);
            if(freqMap.containsKey(amount)) {
                freqMap.put(amount, freqMap.get(amount)+1);
            } else {
                freqMap.put(amount, 1);
            }
        }
        int maxBid = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() == 1 && entry.getKey() > maxBid) {
                maxBid = entry.getKey();
            }
        }
        String winner = "";
        if(maxBid == Integer.MIN_VALUE) {
            return null;
        } else {
            for(Map.Entry<String,Integer> entry : buyerBidMap.entrySet()) {
                if(entry.getValue() == maxBid) {
                    winner = entry.getKey();
                    break;
                }
            }
        }
        return winner;
    }
}
