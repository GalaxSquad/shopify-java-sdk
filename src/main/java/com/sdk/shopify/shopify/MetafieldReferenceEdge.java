// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An auto-generated type which holds one MetafieldReference and a cursor during pagination.
*/
public class MetafieldReferenceEdge extends AbstractResponse<MetafieldReferenceEdge> {
    public MetafieldReferenceEdge() {
    }

    public MetafieldReferenceEdge(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cursor": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "node": {
                    MetafieldReference optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownMetafieldReference.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "MetafieldReferenceEdge";
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */

    public String getCursor() {
        return (String) get("cursor");
    }

    public MetafieldReferenceEdge setCursor(String arg) {
        optimisticData.put(getKey("cursor"), arg);
        return this;
    }

    /**
    * The item at the end of MetafieldReferenceEdge.
    */

    public MetafieldReference getNode() {
        return (MetafieldReference) get("node");
    }

    public MetafieldReferenceEdge setNode(MetafieldReference arg) {
        optimisticData.put(getKey("node"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cursor": return false;

            case "node": return false;

            default: return false;
        }
    }
}

