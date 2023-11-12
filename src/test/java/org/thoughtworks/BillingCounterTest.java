package org.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingCounterTest {

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

    @Test
    void shouldShowBillForTwoItems()
    {
        BillingCounter billingCounter =  new BillingCounter();
        ShoppingCart cart= new ShoppingCart();
        Rate rateOfOnion= new Rate(20,WeightType.KG);
        GroceryItem onion= new GroceryItem(rateOfOnion, GroceryItemType.ONION);
        Quantity quantityOfOnion= new Quantity(500,WeightType.GM);
        cart.putItem(onion,quantityOfOnion);
        Rate rateOfApple= new Rate(200,WeightType.KG);
        GroceryItem apple= new GroceryItem(rateOfApple, GroceryItemType.APPLE);
        Quantity quantityOfApple= new Quantity(1,WeightType.KG);
        cart.putItem(apple,quantityOfApple);

        billingCounter.calculateBill(cart);

        assertEquals(billingCounter.showBill(),210.0);


    }

    @Test
    void shouldShowBillForThreeItems()
    {
        BillingCounter billingCounter =  new BillingCounter();
        ShoppingCart cart= new ShoppingCart();
        Rate rateOfOnion= new Rate(20,WeightType.KG);
        GroceryItem onion= new GroceryItem(rateOfOnion, GroceryItemType.ONION);
        Quantity quantityOfOnion= new Quantity(500,WeightType.GM);
        cart.putItem(onion,quantityOfOnion);
        Rate rateOfApple= new Rate(200,WeightType.KG);
        GroceryItem apple= new GroceryItem(rateOfApple, GroceryItemType.APPLE);
        Quantity quantityOfApple= new Quantity(1,WeightType.KG);
        cart.putItem(apple,quantityOfApple);
        Rate rateOfRice= new Rate(34.5,WeightType.KG);
        GroceryItem rice= new GroceryItem(rateOfRice, GroceryItemType.RICE);
        Quantity quantityOfRice= new Quantity(3,WeightType.KG);
        cart.putItem(rice,quantityOfRice);

        billingCounter.calculateBill(cart);

        assertEquals(billingCounter.showBill(),313.5);


    }






}