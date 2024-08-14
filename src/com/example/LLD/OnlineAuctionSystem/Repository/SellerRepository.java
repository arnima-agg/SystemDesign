package com.example.LLD.OnlineAuctionSystem.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.OnlineAuctionSystem.Entity.Auction;
import com.example.LLD.OnlineAuctionSystem.Entity.Buyer;
import com.example.LLD.OnlineAuctionSystem.Entity.Seller;

public class SellerRepository {

    List<Seller> sellers;
    Map<String, Auction> sellerAuctionMap;

    public SellerRepository() {
        this.sellers = new ArrayList<>();
        this.sellerAuctionMap = new HashMap<>();
    }

    public List<Seller> getAllSellers() {
        return sellers;
    }

    public Map<String, Auction> getSellerAuctionMap() {
        return sellerAuctionMap;
    }
}
