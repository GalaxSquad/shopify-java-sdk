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

public class InventoryItemMeasurementInput implements Serializable {
    private Input<WeightInput> weight = Input.undefined();

    public WeightInput getWeight() {
        return weight.getValue();
    }

    public Input<WeightInput> getWeightInput() {
        return weight;
    }

    public InventoryItemMeasurementInput setWeight(WeightInput weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    public InventoryItemMeasurementInput setWeightInput(Input<WeightInput> weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weight = weight;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.weight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("weight:");
            if (weight.getValue() != null) {
                weight.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
