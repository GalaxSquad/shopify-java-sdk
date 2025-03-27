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
* The type used for targeting a set of customers who are eligible for the discount. For example, the
* discount might be available to all customers or it might only be available to a specific set of
* customers. You can define the set of customers by targeting a list of customer segments, or by
* targeting a list of specific customers.
*/
public class UnknownDiscountCustomerSelection extends AbstractResponse<UnknownDiscountCustomerSelection> implements DiscountCustomerSelection {
    public UnknownDiscountCustomerSelection() {
    }

    public UnknownDiscountCustomerSelection(JsonObject fields) throws SchemaViolationError {
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

    public static DiscountCustomerSelection create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DiscountCustomerAll": {
                return new DiscountCustomerAll(fields);
            }

            case "DiscountCustomerSegments": {
                return new DiscountCustomerSegments(fields);
            }

            case "DiscountCustomers": {
                return new DiscountCustomers(fields);
            }

            default: {
                return new UnknownDiscountCustomerSelection(fields);
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

