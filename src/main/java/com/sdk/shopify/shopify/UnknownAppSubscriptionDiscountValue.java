// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The value of the discount.
*/
public class UnknownAppSubscriptionDiscountValue extends AbstractResponse<UnknownAppSubscriptionDiscountValue> implements AppSubscriptionDiscountValue {
    public UnknownAppSubscriptionDiscountValue() {
    }

    public UnknownAppSubscriptionDiscountValue(JsonObject fields) throws SchemaViolationError {
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

    public static AppSubscriptionDiscountValue create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AppSubscriptionDiscountAmount": {
                return new AppSubscriptionDiscountAmount(fields);
            }

            case "AppSubscriptionDiscountPercentage": {
                return new AppSubscriptionDiscountPercentage(fields);
            }

            default: {
                return new UnknownAppSubscriptionDiscountValue(fields);
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

