// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the details of a specific type of product within the [Shopify product
* taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
*/
public class StandardizedProductType extends AbstractResponse<StandardizedProductType> {
    public StandardizedProductType() {
    }

    public StandardizedProductType(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "productTaxonomyNode": {
                    ProductTaxonomyNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductTaxonomyNode(jsonAsObject(field.getValue(), key));
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
        return "StandardizedProductType";
    }

    /**
    * The product taxonomy node associated with the standardized product type.
    */

    public ProductTaxonomyNode getProductTaxonomyNode() {
        return (ProductTaxonomyNode) get("productTaxonomyNode");
    }

    public StandardizedProductType setProductTaxonomyNode(ProductTaxonomyNode arg) {
        optimisticData.put(getKey("productTaxonomyNode"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "productTaxonomyNode": return true;

            default: return false;
        }
    }
}

