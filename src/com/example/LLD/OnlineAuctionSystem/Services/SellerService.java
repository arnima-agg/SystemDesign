package com.example.LLD.OnlineAuctionSystem.Services;

import java.util.List;
import java.util.Map;

import com.example.LLD.OnlineAuctionSystem.Entity.Auction;
import com.example.LLD.OnlineAuctionSystem.Entity.Seller;

import static com.example.LLD.OnlineAuctionSystem.Repository.AuctionRepository.getAllAuction;
import com.example.LLD.OnlineAuctionSystem.Repository.SellerRepository;
import com.example.LLD.OnlineAuctionSystem.Util.SellerUtil;
import com.example.LLD.OnlineAuctionSystem.WinningStrategy;

import static com.example.LLD.OnlineAuctionSystem.Util.AuctionUtil.getAuctionByName;

public class SellerService {
    SellerRepository sellerRepository = new SellerRepository();
    SellerUtil sellerUtil = new SellerUtil();
    List<Seller> sellers = sellerRepository.getAllSellers();
    Map<String, Auction> sellerAuctionMap = sellerRepository.getSellerAuctionMap();
    List<Auction> auctionList = getAllAuction();

    WinningStrategy winningStrategy;

    public SellerService(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public void addSeller(String sellerName) {
        Seller seller = new Seller(sellerName);
        sellers.add(seller);
        System.out.println("Welcome " + sellerName);
    }

    public void createAuction(String auctionName, int minBid, int maxBid, String sellerName) {
        Seller seller = sellerUtil.getSellerByName(sellerName, sellers);
        if(seller == null) {
            throw new RuntimeException("Seller not found");
        }
        Auction auction = new Auction(auctionName, minBid, maxBid, sellerName);
        sellerAuctionMap.put(sellerName, auction);
        auctionList.add(auction);
        System.out.println(auctionName +  " created successfully" + auctionList.size());
    }

    public void closeAuction(String auctionName) {
        Auction auction = getAuctionByName(auctionName, auctionList);
        if(auction == null || !auction.isActive()) {
            throw new RuntimeException("No auction found");
        }
        String winner = winningStrategy.getWinner(auction);
        if(winner == null) {
            System.out.println("No winner");
        } else {
            System.out.println("Winner : " + winner);
        }
        auction.setActive(false);
    }


}
