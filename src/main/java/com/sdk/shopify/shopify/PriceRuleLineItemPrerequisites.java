// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Single or multiple line item products, product variants or collections required for the price rule
* to be applicable, can also be provided in combination.
*/
public class PriceRuleLineItemPrerequisites extends AbstractResponse<PriceRuleLineItemPrerequisites> {
    public PriceRuleLineItemPrerequisites() {
    }

    public PriceRuleLineItemPrerequisites(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "collections": {
                    responseData.put(key, new CollectionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

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
        return "PriceRuleLineItemPrerequisites";
    }

    /**
    * The collections required for the price rule to be applicable.
    */

    public CollectionConnection getCollections() {
        return (CollectionConnection) get("collections");
    }

    public PriceRuleLineItemPrerequisites setCollections(CollectionConnection arg) {
        optimisticData.put(getKey("collections"), arg);
        return this;
    }

    /**
    * The product variants required for the price rule to be applicable.
    */

    public ProductVariantConnection getProductVariants() {
        return (ProductVariantConnection) get("productVariants");
    }

    public PriceRuleLineItemPrerequisites setProductVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("productVariants"), arg);
        return this;
    }

    /**
    * The products required for the price rule to be applicable.
    */

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public PriceRuleLineItemPrerequisites setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "collections": return true;

            case "productVariants": return true;

            case "products": return true;

            default: return false;
        }
    }
}

