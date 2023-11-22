package org.thoughtworks;

import java.util.Objects;

public class Cost {
    private final double value;
    private final Currency currency;

    Cost(double value, Currency currency)
    {
        this.value=value;
        this.currency=currency;
    }

    public Cost add(Cost cost)
    {
        return new Cost(value + cost.value, currency);
    }

    public Cost multiply(double multiplyingFactor)
    {
        return new Cost(value*multiplyingFactor,currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cost that = (Cost) o;
        return (this.value == that.value && this.currency == that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
