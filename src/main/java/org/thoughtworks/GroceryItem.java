package org.thoughtworks;

import java.util.Objects;

public class GroceryItem {
    GroceryItemType type;
    String color;

    GroceryItem(GroceryItemType type,String color)
    {
        this.type=type;
        this.color=color;
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
        return Objects.hash(type);
    }
}
