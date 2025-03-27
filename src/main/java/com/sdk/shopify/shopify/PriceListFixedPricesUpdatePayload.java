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
* Return type for `priceListFixedPricesUpdate` mutation.
*/
public class PriceListFixedPricesUpdatePayload extends AbstractResponse<PriceListFixedPricesUpdatePayload> {
    public PriceListFixedPricesUpdatePayload() {
    }

    public PriceListFixedPricesUpdatePayload(JsonObject fields) throws SchemaViolationError {
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

                case "priceList": {
                    PriceList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pricesAdded": {
                    List<PriceListPrice> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PriceListPrice> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new PriceListPrice(jsonAsObject(element1, key)));
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
        return "PriceListFixedPricesUpdatePayload";
    }

    /**
    * A list of deleted variant IDs for prices.
    */

    public List<ID> getDeletedFixedPriceVariantIds() {
        return (List<ID>) get("deletedFixedPriceVariantIds");
    }

    public PriceListFixedPricesUpdatePayload setDeletedFixedPriceVariantIds(List<ID> arg) {
        optimisticData.put(getKey("deletedFixedPriceVariantIds"), arg);
        return this;
    }

    /**
    * The price list for which the fixed prices were modified.
    */

    public PriceList getPriceList() {
        return (PriceList) get("priceList");
    }

    public PriceListFixedPricesUpdatePayload setPriceList(PriceList arg) {
        optimisticData.put(getKey("priceList"), arg);
        return this;
    }

    /**
    * The prices that were added to the price list.
    */

    public List<PriceListPrice> getPricesAdded() {
        return (List<PriceListPrice>) get("pricesAdded");
    }

    public PriceListFixedPricesUpdatePayload setPricesAdded(List<PriceListPrice> arg) {
        optimisticData.put(getKey("pricesAdded"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PriceListPriceUserError> getUserErrors() {
        return (List<PriceListPriceUserError>) get("userErrors");
    }

    public PriceListFixedPricesUpdatePayload setUserErrors(List<PriceListPriceUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedFixedPriceVariantIds": return false;

            case "priceList": return true;

            case "pricesAdded": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

