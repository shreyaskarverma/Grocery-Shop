package org.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroceryShopTest {

    @Test
    void shouldAddItemToCart()
    {
        Rate rate= new Rate(20,WeightType.KG);
        GroceryItem onion= new GroceryItem(rate, GroceryItemType.ONION);
        Quantity quantity= new Quantity(500,WeightType.GM);
        ShoppingCart cart= new ShoppingCart();

        cart.putItem(onion,quantity);

        assertTrue(cart.contains(onion));

    }
    @Test
    void shouldAddMultipleItemsToCart()
    {
        Rate rateOfOnion= new Rate(20,WeightType.KG);
        GroceryItem onion= new GroceryItem(rateOfOnion, GroceryItemType.ONION);
        Quantity quantityOfOnion= new Quantity(500,WeightType.GM);
        ShoppingCart cart= new ShoppingCart();
        cart.putItem(onion,quantityOfOnion);
        Rate rateOfApple= new Rate(200,WeightType.KG);
        GroceryItem apple= new GroceryItem(rateOfApple, GroceryItemType.APPLE);
        Quantity quantityOfApple= new Quantity(1,WeightType.KG);

        cart.putItem(apple,quantityOfApple);

        assertTrue(cart.contains(apple));

    }

    @Test
    void shouldShowBillForOneItem()
    {
        BillingCounter billingCounter =  new BillingCounter();
        ShoppingCart cart= new ShoppingCart();
        Rate rateOfOnion= new Rate(20,WeightType.KG);
        GroceryItem onion= new GroceryItem(rateOfOnion, GroceryItemType.ONION);
        Quantity quantityOfOnion= new Quantity(500,WeightType.GM);
        cart.putItem(onion,quantityOfOnion);

        billingCounter.calculateBill(cart);

        assertEquals(billingCounter.showBill(),10.0);


    }





}