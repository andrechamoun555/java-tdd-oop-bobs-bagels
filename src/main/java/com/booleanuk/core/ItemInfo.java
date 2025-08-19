package com.booleanuk.core;

public class ItemInfo {
    private String name;
    private String type;
    private double price;
    private String variant;


    public ItemInfo(String name, String type, double price, String variant) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.variant = variant;
    }


    public String getName() {
        return name;
    }

    public String getVariant() {
        return variant;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

}
