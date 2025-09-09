package com.booleanuk.core;

public class BasketItem {
    private String sku;
    private int quantity;

    public BasketItem(String sku, int quantity) {
        this.sku = sku;
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void increaseQuantity(int quantity){
        if (quantity <= 0){
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity){
        if (quantity <= 0){
            throw new IllegalArgumentException("amount must be greater than zero.");
        }
        this.quantity -= quantity;
    }

    public double lineSumTotal(){
        Inventory inventory = new Inventory();
        return this.quantity * inventory.priceOf(this.sku);
    }
}
