// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* Information about the smart collection condition capability on a metafield definition.
*/
public class MetafieldCapabilitySmartCollectionCondition extends AbstractResponse<MetafieldCapabilitySmartCollectionCondition> {
    public MetafieldCapabilitySmartCollectionCondition() {
    }

    public MetafieldCapabilitySmartCollectionCondition(JsonObject fields) throws SchemaViolationError {
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
        return "MetafieldCapabilitySmartCollectionCondition";
    }

    /**
    * Indicates if the definition is eligible to have the capability.
    */

    public Boolean getEligible() {
        return (Boolean) get("eligible");
    }

    public MetafieldCapabilitySmartCollectionCondition setEligible(Boolean arg) {
        optimisticData.put(getKey("eligible"), arg);
        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public MetafieldCapabilitySmartCollectionCondition setEnabled(Boolean arg) {
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

