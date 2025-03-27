// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A mail service provided by the participant.
*/
public class DeliveryParticipantService extends AbstractResponse<DeliveryParticipantService> {
    public DeliveryParticipantService() {
    }

    public DeliveryParticipantService(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "active": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "DeliveryParticipantService";
    }

    /**
    * Whether the service is active.
    */

    public Boolean getActive() {
        return (Boolean) get("active");
    }

    public DeliveryParticipantService setActive(Boolean arg) {
        optimisticData.put(getKey("active"), arg);
        return this;
    }

    /**
    * The name of the service.
    */

    public String getName() {
        return (String) get("name");
    }

    public DeliveryParticipantService setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "active": return false;

            case "name": return false;

            default: return false;
        }
    }
}

