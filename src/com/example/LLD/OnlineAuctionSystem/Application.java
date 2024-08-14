package com.example.LLD.OnlineAuctionSystem;

import com.example.LLD.OnlineAuctionSystem.Entity.Buyer;
import com.example.LLD.OnlineAuctionSystem.Services.BuyerService;
import com.example.LLD.OnlineAuctionSystem.Services.SellerService;

public class Application {

    public static void main(String args[]) {
        BuyerService buyerService = new BuyerService();
        SellerService sellerService = new SellerService(new HighestBidStrategy());


        sellerService.addSeller("seller1");
        buyerService.createBuyer("buyer1");
        buyerService.createBuyer("buyer2");
        buyerService.createBuyer("buyer3");

        sellerService.createAuction("A1", 10, 50, "seller1");
        buyerService.createBid("buyer1", "A1", 17);
        buyerService.createBid("buyer2", "A1", 15);
        buyerService.updateBid("buyer2", "A1", 19);
        buyerService.createBid("buyer3", "A1", 19);
        sellerService.closeAuction("A1");

        sellerService.addSeller("seller2");
        sellerService.createAuction("A2", 5, 20, "seller2");
        //this should fail gracefully
        //buyerService.createBid("buyer3", "A2", 25);
        buyerService.createBid("buyer2", "A2", 5);
        buyerService.withdrawBid("buyer2", "A2");
        sellerService.closeAuction("A2");




    }
}
