// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Provides the capabilities of a metafield definition.
*/
public class MetafieldCapabilities extends AbstractResponse<MetafieldCapabilities> {
    public MetafieldCapabilities() {
    }

    public MetafieldCapabilities(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adminFilterable": {
                    responseData.put(key, new MetafieldCapabilityAdminFilterable(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "smartCollectionCondition": {
                    responseData.put(key, new MetafieldCapabilitySmartCollectionCondition(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "uniqueValues": {
                    responseData.put(key, new MetafieldCapabilityUniqueValues(jsonAsObject(field.getValue(), key)));

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
        return "MetafieldCapabilities";
    }

    /**
    * Indicate whether a metafield definition is configured for filtering.
    */

    public MetafieldCapabilityAdminFilterable getAdminFilterable() {
        return (MetafieldCapabilityAdminFilterable) get("adminFilterable");
    }

    public MetafieldCapabilities setAdminFilterable(MetafieldCapabilityAdminFilterable arg) {
        optimisticData.put(getKey("adminFilterable"), arg);
        return this;
    }

    /**
    * Indicate whether a metafield definition can be used as a smart collection condition.
    */

    public MetafieldCapabilitySmartCollectionCondition getSmartCollectionCondition() {
        return (MetafieldCapabilitySmartCollectionCondition) get("smartCollectionCondition");
    }

    public MetafieldCapabilities setSmartCollectionCondition(MetafieldCapabilitySmartCollectionCondition arg) {
        optimisticData.put(getKey("smartCollectionCondition"), arg);
        return this;
    }

    /**
    * Indicate whether the metafield values for a metafield definition are required to be unique.
    */

    public MetafieldCapabilityUniqueValues getUniqueValues() {
        return (MetafieldCapabilityUniqueValues) get("uniqueValues");
    }

    public MetafieldCapabilities setUniqueValues(MetafieldCapabilityUniqueValues arg) {
        optimisticData.put(getKey("uniqueValues"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adminFilterable": return true;

            case "smartCollectionCondition": return true;

            case "uniqueValues": return true;

            default: return false;
        }
    }
}

