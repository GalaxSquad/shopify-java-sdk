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
* An amount that's allocated to a line based on an associated discount application.
*/
public class DiscountAllocation extends AbstractResponse<DiscountAllocation> {
    public DiscountAllocation() {
    }

    public DiscountAllocation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allocatedAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountApplication": {
                    responseData.put(key, UnknownDiscountApplication.create(jsonAsObject(field.getValue(), key)));

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
        return "DiscountAllocation";
    }

    /**
    * The money amount that's allocated to a line based on the associated discount application in shop and
    * presentment currencies.
    */

    public MoneyBag getAllocatedAmountSet() {
        return (MoneyBag) get("allocatedAmountSet");
    }

    public DiscountAllocation setAllocatedAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("allocatedAmountSet"), arg);
        return this;
    }

    /**
    * The discount application that the allocated amount originated from.
    */

    public DiscountApplication getDiscountApplication() {
        return (DiscountApplication) get("discountApplication");
    }

    public DiscountAllocation setDiscountApplication(DiscountApplication arg) {
        optimisticData.put(getKey("discountApplication"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allocatedAmountSet": return true;

            case "discountApplication": return false;

            default: return false;
        }
    }
}

