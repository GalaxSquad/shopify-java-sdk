// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The compare-at price and price of a variant sharing a currency.
*/
public class ProductVariantPricePair extends AbstractResponse<ProductVariantPricePair> {
    public ProductVariantPricePair() {
    }

    public ProductVariantPricePair(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "compareAtPrice": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "ProductVariantPricePair";
    }

    /**
    * The compare-at price of the variant with associated currency.
    */

    public MoneyV2 getCompareAtPrice() {
        return (MoneyV2) get("compareAtPrice");
    }

    public ProductVariantPricePair setCompareAtPrice(MoneyV2 arg) {
        optimisticData.put(getKey("compareAtPrice"), arg);
        return this;
    }

    /**
    * The price of the variant with associated currency.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public ProductVariantPricePair setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "compareAtPrice": return true;

            case "price": return true;

            default: return false;
        }
    }
}

