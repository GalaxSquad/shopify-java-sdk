// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import java.io.Serializable;

public class PriceListAdjustmentInput implements Serializable {
    private double value;

    private PriceListAdjustmentType type;

    public PriceListAdjustmentInput(double value, PriceListAdjustmentType type) {
        this.value = value;

        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public PriceListAdjustmentInput setValue(double value) {
        this.value = value;
        return this;
    }

    public PriceListAdjustmentType getType() {
        return type;
    }

    public PriceListAdjustmentInput setType(PriceListAdjustmentType type) {
        this.type = type;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        _queryBuilder.append(value);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        _queryBuilder.append(type.toString());

        _queryBuilder.append('}');
    }
}
