package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private int capacity;
    private final List<BasketItem> lines = new ArrayList<>();
    private final Inventory inventory = new Inventory();

    public Basket(int capacity) {
        setCapacity(capacity);
    }

    public Basket() {
        this(5);
    }

    public String addItem(String sku) {
        if (!Inventory.has(sku)){
            return "Not in Stock";
        }

        if (isFull()) {
            return "Basket is full";
        }

        lines.add(new BasketItem(sku,1));
        return "Added";
    }

    public String removeItem(String sku) {
        for (int i = 0; i < lines.size(); i++) {
            BasketItem line = lines.get(i);
            if (line.getSku().equals(sku)) {
                if (line.getQuantity() > 1) {
                    line.setQuantity(line.getQuantity() - 1);
                } else {
                    lines.remove(i);
                }
                return "Removed";
            }
        }
        return "Item not in basket";
    }

    public boolean isFull() {
        if (lines.size() >= capacity) {
            return true;
        }
        return false;

    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;

    }


    public double total() {
        double sum = 0.0;
        for (BasketItem item : lines) {
            ItemInfo info = Inventory.items.get(item.getSku());
            if (info != null) {
                sum += info.getPrice() * item.getQuantity();
            }
        }
        return sum;
    }

    public double checkPrice(String sku) {
        if(!inventory.items.containsKey(sku)){
            throw new IllegalArgumentException("invalid sku" + sku);
        }
        return inventory.priceOf(sku);
    }

    public int getCapacity() {
        return capacity;
    }
}

// Basket.total() --> loops line --> calls each entry.LineTotal --> adds them --> return the sum

