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
