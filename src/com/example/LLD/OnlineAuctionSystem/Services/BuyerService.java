package com.example.LLD.OnlineAuctionSystem.Services;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.example.LLD.OnlineAuctionSystem.Entity.Auction;
import com.example.LLD.OnlineAuctionSystem.Entity.Buyer;
import com.example.LLD.OnlineAuctionSystem.Repository.AuctionRepository;
import com.example.LLD.OnlineAuctionSystem.Repository.BuyerRepository;

import static com.example.LLD.OnlineAuctionSystem.Util.AuctionUtil.getAuctionByName;

public class BuyerService {
    BuyerRepository buyerRepository = new BuyerRepository();
    AuctionRepository auctionRepository = new AuctionRepository();

    List<Buyer> buyers = buyerRepository.getAllBuyers();
    List<Auction> auctions = auctionRepository.getAllAuction();
    Map<String, Auction> buyerMap = buyerRepository.getBuyerAuctionMap();

    public void createBuyer(String name) {
        Buyer buyer = new Buyer(name);
        buyers.add(buyer);
        System.out.println("Welcome " + name);
    }

    public void createBid(String buyerName, String auctionName, int amount) {
        System.out.println(auctions.size());
        Auction auction = getAuctionByName(auctionName, auctions);
        if(Objects.isNull(auction) || !auction.isActive()) {
            throw new RuntimeException("No auction found");
        }

        if(amount < auction.getMinimumLimit() || amount > auction.getMaximumLimit()) {
            throw new RuntimeException("Bid amount is out of range");
        }
        buyerMap.put(buyerName, auction);
        auction.getBuyerBidMap().put(buyerName, amount);
        System.out.println(  "bid created successfully");
    }

    public void withdrawBid(String buyerName, String auctionName) {
        Auction auction = getAuctionByName(auctionName, auctions);
        if(auction == null || !auction.isActive()) {
            throw new RuntimeException("No auction found");
        }
        auction.getBuyerBidMap().remove(buyerName);
        System.out.println( "bid withdrawn successfully");
    }

    public void updateBid(String buyerName, String auctionName, int amount) {
        Auction auction = getAuctionByName(auctionName, auctions);
        if(auction == null || !auction.isActive()) {
            throw new RuntimeException("No auction found");
        }
        auction.getBuyerBidMap().put(buyerName, amount);
        System.out.println(  "bid updated successfully");


    }
}
