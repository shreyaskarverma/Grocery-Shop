package org.thoughtworks;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<GroceryItem,Quantity> itemList= new HashMap<>();

    public void add(GroceryItem item, Quantity quantity)
    {
        itemList.put(item,quantity);
    }

    public Map<GroceryItem,Quantity> items() {
        return itemList;
    }

    public boolean contains(GroceryItem item)
    {
        return itemList.containsKey(item);
    }


}
