// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A child of a combined listing.
*/
public class CombinedListingChild extends AbstractResponse<CombinedListingChild> {
    public CombinedListingChild() {
    }

    public CombinedListingChild(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "parentVariant": {
                    responseData.put(key, new ProductVariant(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "product": {
                    responseData.put(key, new Product(jsonAsObject(field.getValue(), key)));

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
        return "CombinedListingChild";
    }

    /**
    * The parent variant.
    */

    public ProductVariant getParentVariant() {
        return (ProductVariant) get("parentVariant");
    }

    public CombinedListingChild setParentVariant(ProductVariant arg) {
        optimisticData.put(getKey("parentVariant"), arg);
        return this;
    }

    /**
    * The child product.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public CombinedListingChild setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "parentVariant": return true;

            case "product": return true;

            default: return false;
        }
    }
}

