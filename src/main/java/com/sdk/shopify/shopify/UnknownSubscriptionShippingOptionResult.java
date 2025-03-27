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
* The result of the query to fetch shipping options for the subscription contract.
*/
public class UnknownSubscriptionShippingOptionResult extends AbstractResponse<UnknownSubscriptionShippingOptionResult> implements SubscriptionShippingOptionResult {
    public UnknownSubscriptionShippingOptionResult() {
    }

    public UnknownSubscriptionShippingOptionResult(JsonObject fields) throws SchemaViolationError {
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

    public static SubscriptionShippingOptionResult create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SubscriptionShippingOptionResultFailure": {
                return new SubscriptionShippingOptionResultFailure(fields);
            }

            case "SubscriptionShippingOptionResultSuccess": {
                return new SubscriptionShippingOptionResultSuccess(fields);
            }

            default: {
                return new UnknownSubscriptionShippingOptionResult(fields);
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

