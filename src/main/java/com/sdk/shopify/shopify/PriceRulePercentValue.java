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
* The value of a percent price rule.
*/
public class PriceRulePercentValue extends AbstractResponse<PriceRulePercentValue> implements PriceRuleValue {
    public PriceRulePercentValue() {
    }

    public PriceRulePercentValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "percentage": {
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
        return "PriceRulePercentValue";
    }

    /**
    * The percent value of the price rule.
    */

    public Double getPercentage() {
        return (Double) get("percentage");
    }

    public PriceRulePercentValue setPercentage(Double arg) {
        optimisticData.put(getKey("percentage"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "percentage": return false;

            default: return false;
        }
    }
}

