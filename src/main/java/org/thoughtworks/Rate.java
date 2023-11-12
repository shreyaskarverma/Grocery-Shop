package org.thoughtworks;

public class Rate {
    double value;
    WeightType unit;

    Rate(double value, WeightType unit)
    {
        this.value=value;
        this.unit= unit;
    }

}
