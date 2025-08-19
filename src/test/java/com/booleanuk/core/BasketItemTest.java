package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketItemTest {

    @Test
    public void testConstructor(){
        String expectedSku = "sku";
        int expectedQuantity = 1;

        BasketItem basketItem = new BasketItem(expectedSku, expectedQuantity);
        String actualSku = basketItem.getSku();
        int actualQuantity = basketItem.getQuantity();

        Assertions.assertEquals(expectedSku, actualSku);

    }

    @Test
    public void testIfQuantityIncrease(){
        String expectedSku = "BGLO";
        BasketItem basketItem = new BasketItem(expectedSku, 1);

        basketItem.increaseQuantity(1);
        Assertions.assertEquals(2, basketItem.getQuantity());
    }

    @Test
    public void testIfQuantityDecrease(){
        String expectedSku = "BGLO";
        BasketItem basketItem = new BasketItem(expectedSku, 2);
        basketItem.decreaseQuantity(1);
        Assertions.assertEquals(1, basketItem.getQuantity());
    }

    @Test
    public void testLineSumOfTotal(){
        BasketItem basketItem = new BasketItem("BGLO", 2);
        double expected = 2 * 0.49;

        Assertions.assertEquals(expected, basketItem.lineSumTotal());
    }
}
