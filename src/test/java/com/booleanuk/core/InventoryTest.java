package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class InventoryTest {

    @Test
    public void returnTrueForValidSku() {
        Inventory inventory = new Inventory();
        String validSku = "BGLO";

        Assertions.assertTrue(inventory.has(validSku));
    }

    @Test
    void has_returnsTrueForValidSku() {
        Assertions.assertTrue(Inventory.has("BGLO")); // static call
    }

    @Test
    void has_returnsFalseForInvalidSku() {
        Assertions.assertFalse(Inventory.has("BGLL")); // static call
    }

    @Test
    public void returnFalseForInvalidSku() {
        Inventory inventory = new Inventory();
        String invalidSku = "BGLL";
        Assertions.assertFalse(inventory.has(invalidSku));
    }

    @Test
    public void returnPriceOfValidSku() {
        Inventory inventory = new Inventory();
        String validSku = "BGLO";
        double price = 0.49;

        double result = inventory.priceOf(validSku);

        Assertions.assertEquals(price, result);
    }

    @Test
    public void returnPriceOfInvalidSku() {
        Inventory inventory = new Inventory();
        double inValidPrice = inventory.priceOf("BGLL");
        Assertions.assertFalse(inValidPrice > 0);
    }

    @Test
    public void returnNameOfValidSku() {
        Inventory inventory = new Inventory();

        String validSku = "BGLO";
        String name = inventory.nameOf(validSku);
        Assertions.assertEquals("Bagel", name);
    }

    @Test
    public void returnNameOfInvalidSku() {
        Inventory inventory = new Inventory();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> inventory.nameOf("NON EXIST SKU"));
    }

    @Test
    public void returnVariantOfValidSku() {
        Inventory inventory = new Inventory();
        String sku = "BGLO";

        String variant = inventory.variantOf(sku);
        Assertions.assertEquals("Onion", variant);
    }

    @Test
    public void returnVariantOfInvalidSku() {
        Inventory inventory = new Inventory();
        String invalidSku = "Onion";
        String variant = inventory.variantOf(invalidSku);
        Assertions.assertNull(variant);
    }
}
