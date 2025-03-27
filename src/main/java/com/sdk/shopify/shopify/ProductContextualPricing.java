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
* The price of a product in a specific country.
* Prices vary between countries.
* Refer to
* [Product](https://shopify.dev/docs/api/admin-graphql/latest/queries/product?example=Get+the+price+ra
* nge+for+a+product+for+buyers+from+Canada)
* for more information on how to use this object.
*/
public class ProductContextualPricing extends AbstractResponse<ProductContextualPricing> {
    public ProductContextualPricing() {
    }

    public ProductContextualPricing(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fixedQuantityRulesCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "maxVariantPricing": {
                    ProductVariantContextualPricing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantContextualPricing(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "minVariantPricing": {
                    ProductVariantContextualPricing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantContextualPricing(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceRange": {
                    responseData.put(key, new ProductPriceRangeV2(jsonAsObject(field.getValue(), key)));

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
        return "ProductContextualPricing";
    }

    /**
    * The number of fixed quantity rules for the product's variants on the price list.
    */

    public Integer getFixedQuantityRulesCount() {
        return (Integer) get("fixedQuantityRulesCount");
    }

    public ProductContextualPricing setFixedQuantityRulesCount(Integer arg) {
        optimisticData.put(getKey("fixedQuantityRulesCount"), arg);
        return this;
    }

    /**
    * The pricing of the variant with the highest price in the given context.
    */

    public ProductVariantContextualPricing getMaxVariantPricing() {
        return (ProductVariantContextualPricing) get("maxVariantPricing");
    }

    public ProductContextualPricing setMaxVariantPricing(ProductVariantContextualPricing arg) {
        optimisticData.put(getKey("maxVariantPricing"), arg);
        return this;
    }

    /**
    * The pricing of the variant with the lowest price in the given context.
    */

    public ProductVariantContextualPricing getMinVariantPricing() {
        return (ProductVariantContextualPricing) get("minVariantPricing");
    }

    public ProductContextualPricing setMinVariantPricing(ProductVariantContextualPricing arg) {
        optimisticData.put(getKey("minVariantPricing"), arg);
        return this;
    }

    /**
    * The minimum and maximum prices of a product, expressed in decimal numbers.
    * For example, if the product is priced between $10.00 and $50.00,
    * then the price range is $10.00 - $50.00.
    */

    public ProductPriceRangeV2 getPriceRange() {
        return (ProductPriceRangeV2) get("priceRange");
    }

    public ProductContextualPricing setPriceRange(ProductPriceRangeV2 arg) {
        optimisticData.put(getKey("priceRange"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fixedQuantityRulesCount": return false;

            case "maxVariantPricing": return true;

            case "minVariantPricing": return true;

            case "priceRange": return true;

            default: return false;
        }
    }
}

