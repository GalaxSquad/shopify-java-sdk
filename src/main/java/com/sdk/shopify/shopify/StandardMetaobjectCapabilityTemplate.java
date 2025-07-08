// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Describes a capability that is enabled on a Metaobject Definition.
*/
public class StandardMetaobjectCapabilityTemplate extends AbstractResponse<StandardMetaobjectCapabilityTemplate> {
    public StandardMetaobjectCapabilityTemplate() {
    }

    public StandardMetaobjectCapabilityTemplate(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "capabilityType": {
                    responseData.put(key, MetaobjectCapabilityType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "StandardMetaobjectCapabilityTemplate";
    }

    /**
    * The type of capability that's enabled for the metaobject definition.
    */

    public MetaobjectCapabilityType getCapabilityType() {
        return (MetaobjectCapabilityType) get("capabilityType");
    }

    public StandardMetaobjectCapabilityTemplate setCapabilityType(MetaobjectCapabilityType arg) {
        optimisticData.put(getKey("capabilityType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "capabilityType": return false;

            default: return false;
        }
    }
}

