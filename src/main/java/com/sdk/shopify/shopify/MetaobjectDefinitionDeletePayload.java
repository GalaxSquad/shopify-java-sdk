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
* Return type for `metaobjectDefinitionDelete` mutation.
*/
public class MetaobjectDefinitionDeletePayload extends AbstractResponse<MetaobjectDefinitionDeletePayload> {
    public MetaobjectDefinitionDeletePayload() {
    }

    public MetaobjectDefinitionDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MetaobjectUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetaobjectUserError(jsonAsObject(element1, key)));
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
        return "MetaobjectDefinitionDeletePayload";
    }

    /**
    * The ID of the deleted metaobjects definition.
    */

    public ID getDeletedId() {
        return (ID) get("deletedId");
    }

    public MetaobjectDefinitionDeletePayload setDeletedId(ID arg) {
        optimisticData.put(getKey("deletedId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MetaobjectUserError> getUserErrors() {
        return (List<MetaobjectUserError>) get("userErrors");
    }

    public MetaobjectDefinitionDeletePayload setUserErrors(List<MetaobjectUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

