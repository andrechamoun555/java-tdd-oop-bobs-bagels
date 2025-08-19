package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemInfoTest {

    @Test
    public void testGetItem() {
        String expectedName = "Bagel";
        String expectedType = "BAGEL";
        double expectedPrice = 0.49;
        String expectedVariant = "Onion";

        ItemInfo itemInfo = new ItemInfo(expectedName, expectedType, expectedPrice, expectedVariant );
        String actualName = itemInfo.getName();
        String actualType = itemInfo.getType();
        double actualPrice = itemInfo.getPrice();
        String actualVariant = itemInfo.getVariant();

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedVariant, actualVariant);

    }
}
