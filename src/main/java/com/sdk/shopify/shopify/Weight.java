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

import java.util.Map;

/**
* A weight, which includes a numeric value and a unit of measurement.
*/
public class Weight extends AbstractResponse<Weight> implements DeliveryConditionCriteria {
    public Weight() {
    }

    public Weight(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "unit": {
                    responseData.put(key, WeightUnit.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Weight";
    }

    /**
    * The unit of measurement for `value`.
    */

    public WeightUnit getUnit() {
        return (WeightUnit) get("unit");
    }

    public Weight setUnit(WeightUnit arg) {
        optimisticData.put(getKey("unit"), arg);
        return this;
    }

    /**
    * The weight value using the unit system specified with `unit`.
    */

    public Double getValue() {
        return (Double) get("value");
    }

    public Weight setValue(Double arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "unit": return false;

            case "value": return false;

            default: return false;
        }
    }
}

