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
* The percentage value of the discount.
*/
public class SubscriptionDiscountPercentageValue extends AbstractResponse<SubscriptionDiscountPercentageValue> implements SubscriptionDiscountValue {
    public SubscriptionDiscountPercentageValue() {
    }

    public SubscriptionDiscountPercentageValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "percentage": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "SubscriptionDiscountPercentageValue";
    }

    /**
    * The percentage value of the discount.
    */

    public Integer getPercentage() {
        return (Integer) get("percentage");
    }

    public SubscriptionDiscountPercentageValue setPercentage(Integer arg) {
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

