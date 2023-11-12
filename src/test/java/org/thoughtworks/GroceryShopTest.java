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

}