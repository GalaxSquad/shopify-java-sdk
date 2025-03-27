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
* The minimum subtotal required for the discount to apply.
*/
public class DiscountMinimumSubtotal extends AbstractResponse<DiscountMinimumSubtotal> implements DiscountMinimumRequirement {
    public DiscountMinimumSubtotal() {
    }

    public DiscountMinimumSubtotal(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "greaterThanOrEqualToSubtotal": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "DiscountMinimumSubtotal";
    }

    /**
    * The minimum subtotal that's required for the discount to be applied.
    */

    public MoneyV2 getGreaterThanOrEqualToSubtotal() {
        return (MoneyV2) get("greaterThanOrEqualToSubtotal");
    }

    public DiscountMinimumSubtotal setGreaterThanOrEqualToSubtotal(MoneyV2 arg) {
        optimisticData.put(getKey("greaterThanOrEqualToSubtotal"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "greaterThanOrEqualToSubtotal": return true;

            default: return false;
        }
    }
}

