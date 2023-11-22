package org.thoughtworks;

public class Rate {
    private final Cost cost;
    private final Quantity quantity;

    Rate(Cost cost, Quantity quantity)
    {
        this.cost=cost;
        this.quantity = quantity;
    }

    public Cost convert(Quantity newQuantity)
    {
        double quantityFactor= newQuantity.convertTo(WeightType.GM)/ this.quantity.convertTo(WeightType.GM);
        return cost.multiply(quantityFactor);
    }

}
