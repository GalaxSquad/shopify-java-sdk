// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `priceListFixedPricesAdd` mutation.
*/
public class PriceListFixedPricesAddPayload extends AbstractResponse<PriceListFixedPricesAddPayload> {
    public PriceListFixedPricesAddPayload() {
    }

    public PriceListFixedPricesAddPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "prices": {
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
        return "PriceListFixedPricesAddPayload";
    }

    /**
    * The list of fixed prices that were added to or updated in the price list.
    */

    public List<PriceListPrice> getPrices() {
        return (List<PriceListPrice>) get("prices");
    }

    public PriceListFixedPricesAddPayload setPrices(List<PriceListPrice> arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PriceListPriceUserError> getUserErrors() {
        return (List<PriceListPriceUserError>) get("userErrors");
    }

    public PriceListFixedPricesAddPayload setUserErrors(List<PriceListPriceUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "prices": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

