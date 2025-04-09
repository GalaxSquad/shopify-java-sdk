// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Describes the delivery method to use to get the physical goods to the customer.
*/
public class UnknownSubscriptionDeliveryMethod extends AbstractResponse<UnknownSubscriptionDeliveryMethod> implements SubscriptionDeliveryMethod {
    public UnknownSubscriptionDeliveryMethod() {
    }

    public UnknownSubscriptionDeliveryMethod(JsonObject fields) throws SchemaViolationError {
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

    public static SubscriptionDeliveryMethod create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SubscriptionDeliveryMethodLocalDelivery": {
                return new SubscriptionDeliveryMethodLocalDelivery(fields);
            }

            case "SubscriptionDeliveryMethodPickup": {
                return new SubscriptionDeliveryMethodPickup(fields);
            }

            case "SubscriptionDeliveryMethodShipping": {
                return new SubscriptionDeliveryMethodShipping(fields);
            }

            default: {
                return new UnknownSubscriptionDeliveryMethod(fields);
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

