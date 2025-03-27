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
* The type of minimum requirement that must be met for the discount to be applied. For example, a
* customer must spend a minimum subtotal to be eligible for the discount. Alternatively, a customer
* must purchase a minimum quantity of items to be eligible for the discount.
*/
public class UnknownDiscountMinimumRequirement extends AbstractResponse<UnknownDiscountMinimumRequirement> implements DiscountMinimumRequirement {
    public UnknownDiscountMinimumRequirement() {
    }

    public UnknownDiscountMinimumRequirement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static DiscountMinimumRequirement create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DiscountMinimumQuantity": {
                return new DiscountMinimumQuantity(fields);
            }

            case "DiscountMinimumSubtotal": {
                return new DiscountMinimumSubtotal(fields);
            }

            default: {
                return new UnknownDiscountMinimumRequirement(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

