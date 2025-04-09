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
* Return type for `metafieldsDelete` mutation.
*/
public class MetafieldsDeletePayload extends AbstractResponse<MetafieldsDeletePayload> {
    public MetafieldsDeletePayload() {
    }

    public MetafieldsDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedMetafields": {
                    List<MetafieldIdentifier> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MetafieldIdentifier> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            MetafieldIdentifier optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new MetafieldIdentifier(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "MetafieldsDeletePayload";
    }

    /**
    * List of metafield identifiers that were deleted, null if the corresponding metafield isn't found.
    */

    public List<MetafieldIdentifier> getDeletedMetafields() {
        return (List<MetafieldIdentifier>) get("deletedMetafields");
    }

    public MetafieldsDeletePayload setDeletedMetafields(List<MetafieldIdentifier> arg) {
        optimisticData.put(getKey("deletedMetafields"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public MetafieldsDeletePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedMetafields": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

