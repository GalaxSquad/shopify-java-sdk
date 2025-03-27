// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The compare-at price range of the product.
*/
public class ProductCompareAtPriceRange extends AbstractResponse<ProductCompareAtPriceRange> {
    public ProductCompareAtPriceRange() {
    }

    public ProductCompareAtPriceRange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "maxVariantCompareAtPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "minVariantCompareAtPrice": {
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
        return "ProductCompareAtPriceRange";
    }

    /**
    * The highest variant's compare-at price.
    */

    public MoneyV2 getMaxVariantCompareAtPrice() {
        return (MoneyV2) get("maxVariantCompareAtPrice");
    }

    public ProductCompareAtPriceRange setMaxVariantCompareAtPrice(MoneyV2 arg) {
        optimisticData.put(getKey("maxVariantCompareAtPrice"), arg);
        return this;
    }

    /**
    * The lowest variant's compare-at price.
    */

    public MoneyV2 getMinVariantCompareAtPrice() {
        return (MoneyV2) get("minVariantCompareAtPrice");
    }

    public ProductCompareAtPriceRange setMinVariantCompareAtPrice(MoneyV2 arg) {
        optimisticData.put(getKey("minVariantCompareAtPrice"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "maxVariantCompareAtPrice": return true;

            case "minVariantCompareAtPrice": return true;

            default: return false;
        }
    }
}

