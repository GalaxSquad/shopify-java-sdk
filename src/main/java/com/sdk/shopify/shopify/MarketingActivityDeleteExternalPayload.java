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
* Return type for `marketingActivityDeleteExternal` mutation.
*/
public class MarketingActivityDeleteExternalPayload extends AbstractResponse<MarketingActivityDeleteExternalPayload> {
    public MarketingActivityDeleteExternalPayload() {
    }

    public MarketingActivityDeleteExternalPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedMarketingActivityId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MarketingActivityUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MarketingActivityUserError(jsonAsObject(element1, key)));
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
        return "MarketingActivityDeleteExternalPayload";
    }

    /**
    * The ID of the marketing activity that was deleted, if one was deleted.
    */

    public ID getDeletedMarketingActivityId() {
        return (ID) get("deletedMarketingActivityId");
    }

    public MarketingActivityDeleteExternalPayload setDeletedMarketingActivityId(ID arg) {
        optimisticData.put(getKey("deletedMarketingActivityId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MarketingActivityUserError> getUserErrors() {
        return (List<MarketingActivityUserError>) get("userErrors");
    }

    public MarketingActivityDeleteExternalPayload setUserErrors(List<MarketingActivityUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedMarketingActivityId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

