package org.thoughtworks;

import java.util.HashMap;
import java.util.Map;

public class GroceryShop {

    private Cost billAmount;
    private final Map<GroceryItem,Rate> inventory = new HashMap<>();

    public GroceryShop()
    {
        billAmount= new Cost(0.0, Currency.INR);
    }

    public void add(GroceryItem item, Rate rate)
    {
        inventory.put(item,rate);
    }

    public void calculateBill(ShoppingCart cart)
    {
        Map<GroceryItem, Quantity> items = cart.items();
        for (Map.Entry<GroceryItem, Quantity> entry : items.entrySet())
        {
            GroceryItem item = entry.getKey();
            Quantity quantity = entry.getValue();
            Rate rateOfItem= inventory.get(item);
            Cost cost= rateOfItem.convert(quantity);
            billAmount= billAmount.add(cost);
        }
    }

    public Cost showBill()
    {
        return billAmount;
    }
}
