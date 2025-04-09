// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A rate provided by a merchant-defined rate or a participant.
*/
public class UnknownDeliveryRateProvider extends AbstractResponse<UnknownDeliveryRateProvider> implements DeliveryRateProvider {
    public UnknownDeliveryRateProvider() {
    }

    public UnknownDeliveryRateProvider(JsonObject fields) throws SchemaViolationError {
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

    public static DeliveryRateProvider create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DeliveryParticipant": {
                return new DeliveryParticipant(fields);
            }

            case "DeliveryRateDefinition": {
                return new DeliveryRateDefinition(fields);
            }

            default: {
                return new UnknownDeliveryRateProvider(fields);
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

