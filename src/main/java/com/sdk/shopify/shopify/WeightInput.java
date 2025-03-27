// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
