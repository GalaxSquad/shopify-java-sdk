// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The renderable capability of a metaobject definition.
*/
public class MetaobjectCapabilitiesRenderable extends AbstractResponse<MetaobjectCapabilitiesRenderable> {
    public MetaobjectCapabilitiesRenderable() {
    }

    public MetaobjectCapabilitiesRenderable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "data": {
                    MetaobjectCapabilityDefinitionDataRenderable optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectCapabilityDefinitionDataRenderable(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "MetaobjectCapabilitiesRenderable";
    }

    /**
    * The data associated with the renderable capability.
    */

    public MetaobjectCapabilityDefinitionDataRenderable getData() {
        return (MetaobjectCapabilityDefinitionDataRenderable) get("data");
    }

    public MetaobjectCapabilitiesRenderable setData(MetaobjectCapabilityDefinitionDataRenderable arg) {
        optimisticData.put(getKey("data"), arg);
        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public MetaobjectCapabilitiesRenderable setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "data": return true;

            case "enabled": return false;

            default: return false;
        }
    }
}

