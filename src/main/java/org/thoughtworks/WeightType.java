package org.thoughtworks;

public enum WeightType {
    KG(1.0),
    GM(1000.0);

    private final double conversionFactor;

    WeightType(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convert(double value, WeightType targetUnit) {
        return value * (targetUnit.conversionFactor / this.conversionFactor);
    }
}
