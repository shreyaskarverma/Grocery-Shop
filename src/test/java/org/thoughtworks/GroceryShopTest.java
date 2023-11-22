package org.thoughtworks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroceryShopTest {
    GroceryShop groceryShop;

    @BeforeEach
    void setUp()
    {
        groceryShop =  new GroceryShop();
        GroceryItem onion = new GroceryItem(GroceryItemType.ONION,"Pink");
        Rate onionRate = new Rate(new Cost(20.0,Currency.INR), new Quantity(1.0,WeightType.KG));
        GroceryItem tomato = new GroceryItem(GroceryItemType.TOMATO, "Red");
        Rate tomatoRate = new Rate(new Cost(30.0,Currency.INR), new Quantity(1.0,WeightType.KG));
        GroceryItem apple = new GroceryItem(GroceryItemType.APPLE, "Red");
        Rate appleRate = new Rate(new Cost(200.0,Currency.INR), new Quantity(1.0,WeightType.KG));
        GroceryItem kiwi = new GroceryItem(GroceryItemType.KIWI, "Brown");
        Rate kiwiRate = new Rate(new Cost(50.0,Currency.INR), new Quantity(1.0,WeightType.KG));
        GroceryItem salt = new GroceryItem(GroceryItemType.SALT, "White");
        Rate saltRate = new Rate(new Cost(10.0,Currency.INR), new Quantity(1.0,WeightType.GM));
        GroceryItem rice = new GroceryItem(GroceryItemType.RICE, "White");
        Rate riceRate = new Rate(new Cost(34.5,Currency.INR), new Quantity(1.0,WeightType.KG));

        groceryShop.add(onion,onionRate);
        groceryShop.add(tomato,tomatoRate);
        groceryShop.add(apple,appleRate);
        groceryShop.add(kiwi,kiwiRate);
        groceryShop.add(salt,saltRate);
        groceryShop.add(rice,riceRate);

    }

    @Test
    void shouldAddItemToCart()
    {
        GroceryItem onion = new GroceryItem(GroceryItemType.ONION,"Pink");
        Quantity quantity= new Quantity(500,WeightType.GM);
        ShoppingCart cart= new ShoppingCart();

        cart.add(onion,quantity);

        assertTrue(cart.contains(onion));

    }
    @Test
    void shouldAddMultipleItemsToCart()
    {
        GroceryItem onion= new GroceryItem(GroceryItemType.ONION,"Pink");
        Quantity quantityOfOnion= new Quantity(500,WeightType.GM);
        ShoppingCart cart= new ShoppingCart();
        cart.add(onion,quantityOfOnion);
        GroceryItem apple= new GroceryItem(GroceryItemType.APPLE, "Red");
        Quantity quantityOfApple= new Quantity(1,WeightType.KG);

        cart.add(apple,quantityOfApple);

        assertTrue(cart.contains(apple));

    }

    @Test
    void shouldShowBillForOneItem()
    {
        ShoppingCart cart= new ShoppingCart();
        GroceryItem onion= new GroceryItem(GroceryItemType.ONION,"Pink");
        Quantity quantityOfOnion= new Quantity(500,WeightType.GM);
        cart.add(onion,quantityOfOnion);

        groceryShop.calculateBill(cart);

        assertEquals(groceryShop.showBill(),new Cost(10.0,Currency.INR));


    }

    @Test
    void shouldShowBillForTwoItems()
    {
        ShoppingCart cart= new ShoppingCart();
        GroceryItem onion= new GroceryItem(GroceryItemType.ONION,"Pink");
        Quantity quantityOfOnion= new Quantity(500,WeightType.GM);
        cart.add(onion,quantityOfOnion);
        GroceryItem apple= new GroceryItem(GroceryItemType.APPLE, "Red");
        Quantity quantityOfApple= new Quantity(1,WeightType.KG);
        cart.add(apple,quantityOfApple);

        groceryShop.calculateBill(cart);

        assertEquals(groceryShop.showBill(),new Cost(210.0,Currency.INR));


    }

    @Test
    void shouldShowBillForThreeItems()
    {
        ShoppingCart cart= new ShoppingCart();
        GroceryItem onion= new GroceryItem(GroceryItemType.ONION,"Pink");
        Quantity quantityOfOnion= new Quantity(500,WeightType.GM);
        cart.add(onion,quantityOfOnion);
        GroceryItem apple= new GroceryItem(GroceryItemType.APPLE, "Red");
        Quantity quantityOfApple= new Quantity(1,WeightType.KG);
        cart.add(apple,quantityOfApple);
        GroceryItem rice= new GroceryItem(GroceryItemType.RICE, "White");
        Quantity quantityOfRice= new Quantity(3,WeightType.KG);
        cart.add(rice,quantityOfRice);

        groceryShop.calculateBill(cart);

        assertEquals(groceryShop.showBill(),new Cost(313.5,Currency.INR));


    }






}