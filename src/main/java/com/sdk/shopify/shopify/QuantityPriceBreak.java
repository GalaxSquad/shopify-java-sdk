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

import java.util.Map;

/**
* Quantity price breaks lets you offer different rates that are based on the
* amount of a specific variant being ordered.
*/
public class QuantityPriceBreak extends AbstractResponse<QuantityPriceBreak> implements Node {
    public QuantityPriceBreak() {
    }

    public QuantityPriceBreak(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "minimumQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "price": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "priceList": {
                    responseData.put(key, new PriceList(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "variant": {
                    responseData.put(key, new ProductVariant(jsonAsObject(field.getValue(), key)));

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

    public QuantityPriceBreak(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "QuantityPriceBreak";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Minimum quantity required to reach new quantity break price.
    */

    public Integer getMinimumQuantity() {
        return (Integer) get("minimumQuantity");
    }

    public QuantityPriceBreak setMinimumQuantity(Integer arg) {
        optimisticData.put(getKey("minimumQuantity"), arg);
        return this;
    }

    /**
    * The price of variant after reaching the minimum quanity.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public QuantityPriceBreak setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The price list associated with this quantity break.
    */

    public PriceList getPriceList() {
        return (PriceList) get("priceList");
    }

    public QuantityPriceBreak setPriceList(PriceList arg) {
        optimisticData.put(getKey("priceList"), arg);
        return this;
    }

    /**
    * The product variant associated with this quantity break.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public QuantityPriceBreak setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "minimumQuantity": return false;

            case "price": return true;

            case "priceList": return true;

            case "variant": return true;

            default: return false;
        }
    }
}

