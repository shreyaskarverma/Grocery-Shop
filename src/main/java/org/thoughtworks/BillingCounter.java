package org.thoughtworks;

import java.util.Map;

public class BillingCounter {

    private double billAmount;

    public BillingCounter()
    {
        billAmount=0.0;
    }

    public void calculateBill(ShoppingCart cart)
    {
        Map<GroceryItem, Quantity> items = cart.getItems();
        for (Map.Entry<GroceryItem, Quantity> entry : items.entrySet())
        {
            GroceryItem item = entry.getKey();
            Quantity quantity = entry.getValue();
            billAmount+= item.getCost(quantity);
        }

    }

    public double showBill()
    {
        return billAmount;
    }
}
