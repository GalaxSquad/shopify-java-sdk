// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Identifies a metafield definition by its owner type, namespace, and key.
*/
public class MetafieldDefinitionIdentifier extends AbstractResponse<MetafieldDefinitionIdentifier> {
    public MetafieldDefinitionIdentifier() {
    }

    public MetafieldDefinitionIdentifier(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "namespace": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "ownerType": {
                    responseData.put(key, MetafieldOwnerType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "MetafieldDefinitionIdentifier";
    }

    /**
    * The unique identifier for the metafield definition within its namespace.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MetafieldDefinitionIdentifier setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The container for a group of metafields that the metafield definition is associated with.
    */

    public String getNamespace() {
        return (String) get("namespace");
    }

    public MetafieldDefinitionIdentifier setNamespace(String arg) {
        optimisticData.put(getKey("namespace"), arg);
        return this;
    }

    /**
    * The resource type that the metafield definition is attached to.
    */

    public MetafieldOwnerType getOwnerType() {
        return (MetafieldOwnerType) get("ownerType");
    }

    public MetafieldDefinitionIdentifier setOwnerType(MetafieldOwnerType arg) {
        optimisticData.put(getKey("ownerType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "key": return false;

            case "namespace": return false;

            case "ownerType": return false;

            default: return false;
        }
    }
}

