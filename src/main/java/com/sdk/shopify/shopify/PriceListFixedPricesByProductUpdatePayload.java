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
* Return type for `priceListFixedPricesByProductUpdate` mutation.
*/
public class PriceListFixedPricesByProductUpdatePayload extends AbstractResponse<PriceListFixedPricesByProductUpdatePayload> {
    public PriceListFixedPricesByProductUpdatePayload() {
    }

    public PriceListFixedPricesByProductUpdatePayload(JsonObject fields) throws SchemaViolationError {
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

                case "pricesToAddProducts": {
                    List<Product> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Product> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new Product(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pricesToDeleteProducts": {
                    List<Product> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Product> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new Product(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<PriceListFixedPricesByProductBulkUpdateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PriceListFixedPricesByProductBulkUpdateUserError(jsonAsObject(element1, key)));
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
        return "PriceListFixedPricesByProductUpdatePayload";
    }

    /**
    * The price list for which the fixed prices were modified.
    */

    public PriceList getPriceList() {
        return (PriceList) get("priceList");
    }

    public PriceListFixedPricesByProductUpdatePayload setPriceList(PriceList arg) {
        optimisticData.put(getKey("priceList"), arg);
        return this;
    }

    /**
    * The product for which the fixed prices were added.
    */

    public List<Product> getPricesToAddProducts() {
        return (List<Product>) get("pricesToAddProducts");
    }

    public PriceListFixedPricesByProductUpdatePayload setPricesToAddProducts(List<Product> arg) {
        optimisticData.put(getKey("pricesToAddProducts"), arg);
        return this;
    }

    /**
    * The product for which the fixed prices were deleted.
    */

    public List<Product> getPricesToDeleteProducts() {
        return (List<Product>) get("pricesToDeleteProducts");
    }

    public PriceListFixedPricesByProductUpdatePayload setPricesToDeleteProducts(List<Product> arg) {
        optimisticData.put(getKey("pricesToDeleteProducts"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PriceListFixedPricesByProductBulkUpdateUserError> getUserErrors() {
        return (List<PriceListFixedPricesByProductBulkUpdateUserError>) get("userErrors");
    }

    public PriceListFixedPricesByProductUpdatePayload setUserErrors(List<PriceListFixedPricesByProductBulkUpdateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "priceList": return true;

            case "pricesToAddProducts": return true;

            case "pricesToDeleteProducts": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

