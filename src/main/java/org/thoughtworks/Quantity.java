package org.thoughtworks;

public class Quantity {
    private final double value;
    private final WeightType type;

    Quantity(double value,WeightType type)
    {
        this.type=type;
        this.value=value;
    }

    public double convertTo(WeightType targetType)
    {
        return type.convert(value,targetType);
    }

}
