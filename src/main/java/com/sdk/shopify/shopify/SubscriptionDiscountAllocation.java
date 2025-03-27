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
* Represents what a particular discount reduces from a line price.
*/
public class SubscriptionDiscountAllocation extends AbstractResponse<SubscriptionDiscountAllocation> {
    public SubscriptionDiscountAllocation() {
    }

    public SubscriptionDiscountAllocation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discount": {
                    responseData.put(key, UnknownSubscriptionDiscount.create(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionDiscountAllocation";
    }

    /**
    * Allocation amount.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public SubscriptionDiscountAllocation setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * Discount that created the allocation.
    */

    public SubscriptionDiscount getDiscount() {
        return (SubscriptionDiscount) get("discount");
    }

    public SubscriptionDiscountAllocation setDiscount(SubscriptionDiscount arg) {
        optimisticData.put(getKey("discount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "discount": return false;

            default: return false;
        }
    }
}

