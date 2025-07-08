// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The price of a product variant in a specific country.
* Prices vary between countries.
*/
public class ProductVariantContextualPricing extends AbstractResponse<ProductVariantContextualPricing> {
    public ProductVariantContextualPricing() {
    }

    public ProductVariantContextualPricing(JsonObject fields) throws SchemaViolationError {
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

                case "quantityPriceBreaks": {
                    responseData.put(key, new QuantityPriceBreakConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantityRule": {
                    responseData.put(key, new QuantityRule(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "unitPrice": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "ProductVariantContextualPricing";
    }

    /**
    * The final compare-at price after all adjustments are applied.
    */

    public MoneyV2 getCompareAtPrice() {
        return (MoneyV2) get("compareAtPrice");
    }

    public ProductVariantContextualPricing setCompareAtPrice(MoneyV2 arg) {
        optimisticData.put(getKey("compareAtPrice"), arg);
        return this;
    }

    /**
    * The final price after all adjustments are applied.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public ProductVariantContextualPricing setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * A list of quantity breaks for the product variant.
    */

    public QuantityPriceBreakConnection getQuantityPriceBreaks() {
        return (QuantityPriceBreakConnection) get("quantityPriceBreaks");
    }

    public ProductVariantContextualPricing setQuantityPriceBreaks(QuantityPriceBreakConnection arg) {
        optimisticData.put(getKey("quantityPriceBreaks"), arg);
        return this;
    }

    /**
    * The quantity rule applied for a given context.
    */

    public QuantityRule getQuantityRule() {
        return (QuantityRule) get("quantityRule");
    }

    public ProductVariantContextualPricing setQuantityRule(QuantityRule arg) {
        optimisticData.put(getKey("quantityRule"), arg);
        return this;
    }

    /**
    * The unit price value for the given context based on the variant measurement.
    */

    public MoneyV2 getUnitPrice() {
        return (MoneyV2) get("unitPrice");
    }

    public ProductVariantContextualPricing setUnitPrice(MoneyV2 arg) {
        optimisticData.put(getKey("unitPrice"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "compareAtPrice": return true;

            case "price": return true;

            case "quantityPriceBreaks": return true;

            case "quantityRule": return true;

            case "unitPrice": return true;

            default: return false;
        }
    }
}

