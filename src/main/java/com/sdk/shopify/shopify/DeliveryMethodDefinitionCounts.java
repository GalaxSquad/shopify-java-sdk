// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The number of method definitions for a zone, separated into merchant-owned and participant
* definitions.
*/
public class DeliveryMethodDefinitionCounts extends AbstractResponse<DeliveryMethodDefinitionCounts> {
    public DeliveryMethodDefinitionCounts() {
    }

    public DeliveryMethodDefinitionCounts(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "participantDefinitionsCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "rateDefinitionsCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "DeliveryMethodDefinitionCounts";
    }

    /**
    * The number of participant method definitions for the specified zone.
    */

    public Integer getParticipantDefinitionsCount() {
        return (Integer) get("participantDefinitionsCount");
    }

    public DeliveryMethodDefinitionCounts setParticipantDefinitionsCount(Integer arg) {
        optimisticData.put(getKey("participantDefinitionsCount"), arg);
        return this;
    }

    /**
    * The number of merchant-defined method definitions for the specified zone.
    */

    public Integer getRateDefinitionsCount() {
        return (Integer) get("rateDefinitionsCount");
    }

    public DeliveryMethodDefinitionCounts setRateDefinitionsCount(Integer arg) {
        optimisticData.put(getKey("rateDefinitionsCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "participantDefinitionsCount": return false;

            case "rateDefinitionsCount": return false;

            default: return false;
        }
    }
}

