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
* Return type for `priceListFixedPricesDelete` mutation.
*/
public class PriceListFixedPricesDeletePayload extends AbstractResponse<PriceListFixedPricesDeletePayload> {
    public PriceListFixedPricesDeletePayload() {
    }

    public PriceListFixedPricesDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedFixedPriceVariantIds": {
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
                    List<PriceListPriceUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PriceListPriceUserError(jsonAsObject(element1, key)));
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
        return "PriceListFixedPricesDeletePayload";
    }

    /**
    * A list of product variant IDs whose fixed prices were removed from the price list.
    */

    public List<ID> getDeletedFixedPriceVariantIds() {
        return (List<ID>) get("deletedFixedPriceVariantIds");
    }

    public PriceListFixedPricesDeletePayload setDeletedFixedPriceVariantIds(List<ID> arg) {
        optimisticData.put(getKey("deletedFixedPriceVariantIds"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PriceListPriceUserError> getUserErrors() {
        return (List<PriceListPriceUserError>) get("userErrors");
    }

    public PriceListFixedPricesDeletePayload setUserErrors(List<PriceListPriceUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedFixedPriceVariantIds": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

