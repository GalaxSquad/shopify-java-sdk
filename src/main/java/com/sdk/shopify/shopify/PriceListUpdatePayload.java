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
* Return type for `priceListUpdate` mutation.
*/
public class PriceListUpdatePayload extends AbstractResponse<PriceListUpdatePayload> {
    public PriceListUpdatePayload() {
    }

    public PriceListUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "priceList": {
                    PriceList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<PriceListUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PriceListUserError(jsonAsObject(element1, key)));
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
        return "PriceListUpdatePayload";
    }

    /**
    * The updated price list.
    */

    public PriceList getPriceList() {
        return (PriceList) get("priceList");
    }

    public PriceListUpdatePayload setPriceList(PriceList arg) {
        optimisticData.put(getKey("priceList"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PriceListUserError> getUserErrors() {
        return (List<PriceListUserError>) get("userErrors");
    }

    public PriceListUpdatePayload setUserErrors(List<PriceListUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "priceList": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

