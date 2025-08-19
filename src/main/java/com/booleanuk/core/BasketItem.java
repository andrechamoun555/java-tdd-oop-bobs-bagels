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

    public void increaseQuantity(int quantity){
    }

    public void decreaseQuantity(int quantity){
    }

    public double lineSumTotal(){
        // calculate the sum of each basket line
        return -1.0;
    }
}
