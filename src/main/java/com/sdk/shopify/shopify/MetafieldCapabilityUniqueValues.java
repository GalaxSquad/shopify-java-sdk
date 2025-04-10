// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Information about the unique values capability on a metafield definition.
*/
public class MetafieldCapabilityUniqueValues extends AbstractResponse<MetafieldCapabilityUniqueValues> {
    public MetafieldCapabilityUniqueValues() {
    }

    public MetafieldCapabilityUniqueValues(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "eligible": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "enabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "MetafieldCapabilityUniqueValues";
    }

    /**
    * Indicates if the definition is eligible to have the capability.
    */

    public Boolean getEligible() {
        return (Boolean) get("eligible");
    }

    public MetafieldCapabilityUniqueValues setEligible(Boolean arg) {
        optimisticData.put(getKey("eligible"), arg);
        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public MetafieldCapabilityUniqueValues setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "eligible": return false;

            case "enabled": return false;

            default: return false;
        }
    }
}

