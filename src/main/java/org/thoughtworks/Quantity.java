package org.thoughtworks;

public class Quantity {
    double value;
    WeightType type;

    Quantity(double value,WeightType type)
    {
        this.type=type;
        this.value=value;
    }

    double convertTo(WeightType targetType)
    {
        return type.convert(value,targetType);
    }

}
