// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import java.io.Serializable;

public class WeightInput implements Serializable {
    private double value;

    private WeightUnit unit;

    public WeightInput(double value, WeightUnit unit) {
        this.value = value;

        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public WeightInput setValue(double value) {
        this.value = value;
        return this;
    }

    public WeightUnit getUnit() {
        return unit;
    }

    public WeightInput setUnit(WeightUnit unit) {
        this.unit = unit;
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
        _queryBuilder.append("unit:");
        _queryBuilder.append(unit.toString());

        _queryBuilder.append('}');
    }
}
