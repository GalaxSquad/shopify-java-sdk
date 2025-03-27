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
* Return type for `marketRegionsDelete` mutation.
*/
public class MarketRegionsDeletePayload extends AbstractResponse<MarketRegionsDeletePayload> {
    public MarketRegionsDeletePayload() {
    }

    public MarketRegionsDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedIds": {
                    List<ID> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ID> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ID(jsonAsString(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MarketUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MarketUserError(jsonAsObject(element1, key)));
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
        return "MarketRegionsDeletePayload";
    }

    /**
    * The ID of the deleted market region.
    */

    public List<ID> getDeletedIds() {
        return (List<ID>) get("deletedIds");
    }

    public MarketRegionsDeletePayload setDeletedIds(List<ID> arg) {
        optimisticData.put(getKey("deletedIds"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MarketUserError> getUserErrors() {
        return (List<MarketUserError>) get("userErrors");
    }

    public MarketRegionsDeletePayload setUserErrors(List<MarketUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedIds": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

