// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The delivery option for a subscription contract.
*/
public class UnknownSubscriptionDeliveryOption extends AbstractResponse<UnknownSubscriptionDeliveryOption> implements SubscriptionDeliveryOption {
    public UnknownSubscriptionDeliveryOption() {
    }

    public UnknownSubscriptionDeliveryOption(JsonObject fields) throws SchemaViolationError {
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

    public static SubscriptionDeliveryOption create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SubscriptionLocalDeliveryOption": {
                return new SubscriptionLocalDeliveryOption(fields);
            }

            case "SubscriptionPickupOption": {
                return new SubscriptionPickupOption(fields);
            }

            case "SubscriptionShippingOption": {
                return new SubscriptionShippingOption(fields);
            }

            default: {
                return new UnknownSubscriptionDeliveryOption(fields);
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

