package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void ConstructorStartEmptySetsCapacity() {
        Basket basket = new Basket(5);

        Assertions.assertEquals(5, basket.getCapacity());
        Assertions.assertFalse(basket.isFull());
    }

    @Test
    public void zeroCapicityIsFull() {
        Basket basket = new Basket(0);
        Assertions.assertEquals(0, basket.getCapacity());
        Assertions.assertTrue(basket.isFull());
    }

    @Test
    public void addNewItem_createsLine_andAffectsTotal() {
        Basket basket = new Basket(5);

        String msg = basket.addItem("BGLO"); // 0.49
        Assertions.assertEquals("Added", msg);
        Assertions.assertEquals(0.49, basket.total(), 1e-6);
        Assertions.assertFalse(basket.isFull());
    }
    @Test
    public void addSkuIncrementQtyAffectTotal() {
        Basket basket = new Basket(5);
        basket.addItem("BGLO");
        basket.addItem("BGLO");

        Assertions.assertEquals(0.98, basket.total(), 1e-6);
    }

    @Test
    void remove_decrements_thenRemoves_andMessages() {
        Basket basket = new Basket(5);

        basket.addItem("BGLO");
        basket.addItem("BGLO");

        String msg1 = basket.removeItem("BGLO");
        Assertions.assertEquals("Removed", msg1);
        Assertions.assertEquals(0.49, basket.total(), 1e-6);

        String msg2 = basket.removeItem("BGLO");
        Assertions.assertEquals("Removed", msg2);
        Assertions.assertEquals(0.0, basket.total(), 1e-6);

        Assertions.assertEquals("Item not in basket", basket.removeItem("BGLO"));
    }

    @Test
    void checkPrice_delegatesToInventory() {
        Basket basket = new Basket(5);
        Assertions.assertEquals(0.49, basket.checkPrice("BGLO"), 1e-6);
        Assertions.assertEquals(1.19, basket.checkPrice("COFW"), 1e-6);
    }

}
