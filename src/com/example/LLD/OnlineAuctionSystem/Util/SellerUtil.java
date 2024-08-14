package com.example.LLD.OnlineAuctionSystem.Util;

import java.util.List;

import com.example.LLD.OnlineAuctionSystem.Entity.Seller;
import com.example.LLD.OnlineAuctionSystem.Repository.SellerRepository;

public class SellerUtil {

    public Seller getSellerByName(String sellerName, List<Seller> sellerList) {
        for(Seller seller : sellerList) {
            if(seller.getName().equals(sellerName)) {
                return seller;
            }
        }
        return null;
    }
}
