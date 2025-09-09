package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

    static Map<String, ItemInfo> items = new HashMap<>();

    static {
        // BAGEL
        items.put("BGLO", new ItemInfo("Bagel", "BAGEL", 0.49, "Onion" ));
        items.put("BGLP", new ItemInfo("Bagel", "BAGEL", 0.39, "Plain" ));
        items.put("BGLE", new ItemInfo("Bagel", "BAGEL", 0.49, "Everything" ));
        items.put("BGLS", new ItemInfo("Bagel", "BAGEL", 0.49, "Sesame" ));

        //COFFEE
        items.put("COFB", new ItemInfo("Coffe", "COFFEE", 0.99, "Black"));
        items.put("COFW", new ItemInfo("Coffe", "COFFEE", 1.19, "White"));
        items.put("COFC", new ItemInfo("Coffe", "COFFEE", 1.29, "Capuccino"));
        items.put("COFL", new ItemInfo("Coffe", "COFFEE", 1.29, "Latte"));

        //FILLING
        items.put("FILB", new ItemInfo("Filling", "FILLING", 0.12, "Bacon" ));
        items.put("FILE", new ItemInfo("Filling", "FILLING", 0.12, "Egg" ));
        items.put("FILC", new ItemInfo("Filling", "FILLING", 0.12, "Cheese" ));
        items.put("FILX", new ItemInfo("Filling", "FILLING", 0.12, "Cream Cheese" ));
        items.put("FILS", new ItemInfo("Filling", "FILLING", 0.12, "Smoked Salmon" ));
        items.put("FILH", new ItemInfo("Filling", "FILLING", 0.12, "Ham" ));
    }


    public static boolean has(String sku) {
        return items.containsKey(sku);
    }

    public double priceOf(String sku) {
        ItemInfo info = items.get(sku);
        return info != null ? info.getPrice() : 0.0;
    }

    public String typeOf(String sku){
        ItemInfo info = items.get(sku);
        if (info == null){
            throw new IllegalArgumentException("invalid sku: " + sku);
        }
        return info.getType();
    }

    public String nameOf(String sku){
        ItemInfo info = items.get(sku);
        if (info == null){
            throw new IllegalArgumentException("invalid sku: " + sku);
        }
        return info.getName();
    }

    public String variantOf(String sku) {
        ItemInfo info = items.get(sku);
        return info != null ? info.getVariant() : null;

    }

    public ArrayList<String> allSkus(){
        return new ArrayList<>(items.keySet());
    }


}