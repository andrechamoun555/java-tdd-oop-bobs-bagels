package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class InventoryTest {

    @Test
    public void returnTrueForValidSku(){
        Inventory inventory = new Inventory();
        String validSku = "BGLO";

        Assertions.assertTrue(inventory.has(validSku));
    }

    @Test
    public void returnFalseForInvalidSku(){
        Inventory inventory = new Inventory();
        String invalidSku = "BGLL";
        Assertions.assertFalse(inventory.has(invalidSku));
    }

    @Test
    public void returnPriceOfValidSku(){
        Inventory inventory = new Inventory();
        String validSku = "BGLO";
        double price = 0.49;

        double result = inventory.priceOf(validSku);

        Assertions.assertEquals(price, result);
    }

    @Test
    public void returnPriceOfInvalidSku(){
        Inventory inventory = new Inventory();
        double inValidPrice = inventory.priceOf("BGLL");
        Assertions.assertFalse(inValidPrice > 0);
    }

    @Test
    public void returnNameOfValidSku(){
        Inventory inventory = new Inventory();

        String validSku = "BAGEL";
        String name = inventory.nameOf(validSku);
        Assertions.assertEquals(validSku, name);
    }

    @Test
    public void returnNameOfInvalidSku(){
        Inventory inventory = new Inventory();
        String invalidSku = "NON EXIST SKU";
        String name = inventory.nameOf(invalidSku);
        Assertions.assertNull(name);
    }

    @Test
    public void returnVariantOfValidSku(){
        Inventory inventory = new Inventory();
        String validSku = "Onion";

        String variant = inventory.variantOf(validSku);
        Assertions.assertEquals(validSku, variant);
    }

    @Test
    public void returnVariantOfInvalidSku(){
        Inventory inventory = new Inventory();
        String invalidSku = "Onion";
        String variant = inventory.variantOf(invalidSku);
        Assertions.assertNull(variant);
    }

    @Test
    public void returnAllValidSku() {
        Inventory inventory = new Inventory();

        ArrayList<String> list = new ArrayList<>();
        list.add("BGLO");
        list.add("COFW");

        ArrayList<String> actual = inventory.allSkus();
        Assertions.assertEquals(list, actual);
        Assertions.assertFalse(list.isEmpty());

    }

}
