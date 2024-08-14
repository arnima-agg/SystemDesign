package com.example.LLD.vendingmachine;

public class Item {
    private int itemId;
    private String itemName;
    private int price;
    private boolean isAvailable;

    public Item(int itemId, String itemName, int price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
