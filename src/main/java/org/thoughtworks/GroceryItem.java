package org.thoughtworks;

import java.util.Objects;

public class GroceryItem {
    Rate rate;
    GroceryItemType type;

    GroceryItem(Rate rate, GroceryItemType type)
    {
        this.rate=rate;
        this.type=type;
    }

    public double getCost(Quantity quantity)
    {
        return rate.convertTo(WeightType.GM) * quantity.convertTo(WeightType.GM) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroceryItem that = (GroceryItem) o;
        return this.type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rate, type);
    }
}
