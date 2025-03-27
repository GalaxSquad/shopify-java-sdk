// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Information about the admin filterable capability on a metafield definition.
*/
public class MetafieldCapabilityAdminFilterable extends AbstractResponse<MetafieldCapabilityAdminFilterable> {
    public MetafieldCapabilityAdminFilterable() {
    }

    public MetafieldCapabilityAdminFilterable(JsonObject fields) throws SchemaViolationError {
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

                case "status": {
                    responseData.put(key, MetafieldDefinitionAdminFilterStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "MetafieldCapabilityAdminFilterable";
    }

    /**
    * Indicates if the definition is eligible to have the capability.
    */

    public Boolean getEligible() {
        return (Boolean) get("eligible");
    }

    public MetafieldCapabilityAdminFilterable setEligible(Boolean arg) {
        optimisticData.put(getKey("eligible"), arg);
        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public MetafieldCapabilityAdminFilterable setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    /**
    * Determines the metafield definition's filter status for use in admin filtering.
    */

    public MetafieldDefinitionAdminFilterStatus getStatus() {
        return (MetafieldDefinitionAdminFilterStatus) get("status");
    }

    public MetafieldCapabilityAdminFilterable setStatus(MetafieldDefinitionAdminFilterStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "eligible": return false;

            case "enabled": return false;

            case "status": return false;

            default: return false;
        }
    }
}

