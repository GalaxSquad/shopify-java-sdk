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
* The prerequisite for the discount to be applicable. For example, the discount might require a
* customer to buy a minimum quantity of select items. Alternatively, the discount might require a
* customer to spend a minimum amount on select items.
*/
public class UnknownDiscountCustomerBuysValue extends AbstractResponse<UnknownDiscountCustomerBuysValue> implements DiscountCustomerBuysValue {
    public UnknownDiscountCustomerBuysValue() {
    }

    public UnknownDiscountCustomerBuysValue(JsonObject fields) throws SchemaViolationError {
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

    public static DiscountCustomerBuysValue create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DiscountPurchaseAmount": {
                return new DiscountPurchaseAmount(fields);
            }

            case "DiscountQuantity": {
                return new DiscountQuantity(fields);
            }

            default: {
                return new UnknownDiscountCustomerBuysValue(fields);
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

