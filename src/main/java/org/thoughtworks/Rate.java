package org.thoughtworks;

public class Rate {
    double value;
    WeightType unit;

    Rate(double value, WeightType unit)
    {
        this.value=value;
        this.unit= unit;
    }

    double convertTo(WeightType targetUnit)
    {
        return value/(unit.convert(1,targetUnit));
    }

}
