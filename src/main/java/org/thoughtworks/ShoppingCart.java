package org.thoughtworks;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<GroceryItem,Quantity> itemList;

    ShoppingCart()
    {
        itemList= new HashMap<>();
    }
    public void putItem(GroceryItem item,Quantity quantity)
    {
        itemList.put(item,quantity);
    }

    public Map<GroceryItem,Quantity> getItems() {
        return itemList;
    }

    public boolean contains(GroceryItem item)
    {
        return itemList.containsKey(item);
    }


}
