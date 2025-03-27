// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The publishable capability of a metaobject definition.
*/
public class MetaobjectCapabilitiesPublishable extends AbstractResponse<MetaobjectCapabilitiesPublishable> {
    public MetaobjectCapabilitiesPublishable() {
    }

    public MetaobjectCapabilitiesPublishable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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
        return "MetaobjectCapabilitiesPublishable";
    }

    /**
    * Indicates if the capability is enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public MetaobjectCapabilitiesPublishable setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "enabled": return false;

            default: return false;
        }
    }
}

