// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `metafieldDefinitionUnpin` mutation.
*/
public class MetafieldDefinitionUnpinPayload extends AbstractResponse<MetafieldDefinitionUnpinPayload> {
    public MetafieldDefinitionUnpinPayload() {
    }

    public MetafieldDefinitionUnpinPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "unpinnedDefinition": {
                    MetafieldDefinition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MetafieldDefinitionUnpinUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetafieldDefinitionUnpinUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "MetafieldDefinitionUnpinPayload";
    }

    /**
    * The metafield definition that was unpinned.
    */

    public MetafieldDefinition getUnpinnedDefinition() {
        return (MetafieldDefinition) get("unpinnedDefinition");
    }

    public MetafieldDefinitionUnpinPayload setUnpinnedDefinition(MetafieldDefinition arg) {
        optimisticData.put(getKey("unpinnedDefinition"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MetafieldDefinitionUnpinUserError> getUserErrors() {
        return (List<MetafieldDefinitionUnpinUserError>) get("userErrors");
    }

    public MetafieldDefinitionUnpinPayload setUserErrors(List<MetafieldDefinitionUnpinUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "unpinnedDefinition": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

