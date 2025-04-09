// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The items to which this price rule applies. This may be multiple products, product variants,
* collections or combinations of the aforementioned.
*/
public class PriceRuleItemEntitlements extends AbstractResponse<PriceRuleItemEntitlements> {
    public PriceRuleItemEntitlements() {
    }

    public PriceRuleItemEntitlements(JsonObject fields) throws SchemaViolationError {
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

                case "targetAllLineItems": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "PriceRuleItemEntitlements";
    }

    /**
    * The collections to which the price rule applies.
    */

    public CollectionConnection getCollections() {
        return (CollectionConnection) get("collections");
    }

    public PriceRuleItemEntitlements setCollections(CollectionConnection arg) {
        optimisticData.put(getKey("collections"), arg);
        return this;
    }

    /**
    * The product variants to which the price rule applies.
    */

    public ProductVariantConnection getProductVariants() {
        return (ProductVariantConnection) get("productVariants");
    }

    public PriceRuleItemEntitlements setProductVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("productVariants"), arg);
        return this;
    }

    /**
    * The products to which the price rule applies.
    */

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public PriceRuleItemEntitlements setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
    * Whether the price rule applies to all line items.
    */

    public Boolean getTargetAllLineItems() {
        return (Boolean) get("targetAllLineItems");
    }

    public PriceRuleItemEntitlements setTargetAllLineItems(Boolean arg) {
        optimisticData.put(getKey("targetAllLineItems"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "collections": return true;

            case "productVariants": return true;

            case "products": return true;

            case "targetAllLineItems": return false;

            default: return false;
        }
    }
}

