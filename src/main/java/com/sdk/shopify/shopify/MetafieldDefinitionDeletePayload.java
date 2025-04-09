// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `metafieldDefinitionDelete` mutation.
*/
public class MetafieldDefinitionDeletePayload extends AbstractResponse<MetafieldDefinitionDeletePayload> {
    public MetafieldDefinitionDeletePayload() {
    }

    public MetafieldDefinitionDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedDefinitionId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MetafieldDefinitionDeleteUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetafieldDefinitionDeleteUserError(jsonAsObject(element1, key)));
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
        return "MetafieldDefinitionDeletePayload";
    }

    /**
    * The ID of the deleted metafield definition.
    */

    public ID getDeletedDefinitionId() {
        return (ID) get("deletedDefinitionId");
    }

    public MetafieldDefinitionDeletePayload setDeletedDefinitionId(ID arg) {
        optimisticData.put(getKey("deletedDefinitionId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MetafieldDefinitionDeleteUserError> getUserErrors() {
        return (List<MetafieldDefinitionDeleteUserError>) get("userErrors");
    }

    public MetafieldDefinitionDeletePayload setUserErrors(List<MetafieldDefinitionDeleteUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedDefinitionId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

