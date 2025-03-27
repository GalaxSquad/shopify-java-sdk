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
* A list of products and product variants that the discount can have as a prerequisite or a list of
* products and product variants to which the discount can be applied.
*/
public class DiscountProducts extends AbstractResponse<DiscountProducts> implements DiscountItems {
    public DiscountProducts() {
    }

    public DiscountProducts(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "productVariants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "products": {
                    responseData.put(key, new ProductConnection(jsonAsObject(field.getValue(), key)));

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
        return "DiscountProducts";
    }

    /**
    * The list of product variants that the discount can have as a prerequisite or the list of product
    * variants to which the discount can be applied.
    */

    public ProductVariantConnection getProductVariants() {
        return (ProductVariantConnection) get("productVariants");
    }

    public DiscountProducts setProductVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("productVariants"), arg);
        return this;
    }

    /**
    * The list of products that the discount can have as a prerequisite or the list of products to which
    * the discount can be applied.
    */

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public DiscountProducts setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "productVariants": return true;

            case "products": return true;

            default: return false;
        }
    }
}

