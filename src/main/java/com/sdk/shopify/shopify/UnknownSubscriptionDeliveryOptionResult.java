// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The result of the query to fetch delivery options for the subscription contract.
*/
public class UnknownSubscriptionDeliveryOptionResult extends AbstractResponse<UnknownSubscriptionDeliveryOptionResult> implements SubscriptionDeliveryOptionResult {
    public UnknownSubscriptionDeliveryOptionResult() {
    }

    public UnknownSubscriptionDeliveryOptionResult(JsonObject fields) throws SchemaViolationError {
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

    public static SubscriptionDeliveryOptionResult create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SubscriptionDeliveryOptionResultFailure": {
                return new SubscriptionDeliveryOptionResultFailure(fields);
            }

            case "SubscriptionDeliveryOptionResultSuccess": {
                return new SubscriptionDeliveryOptionResultSuccess(fields);
            }

            default: {
                return new UnknownSubscriptionDeliveryOptionResult(fields);
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

