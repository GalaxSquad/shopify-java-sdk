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
* The price range of the product.
*/
public class ProductPriceRange extends AbstractResponse<ProductPriceRange> {
    public ProductPriceRange() {
    }

    public ProductPriceRange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "maxVariantPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "minVariantPrice": {
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
        return "ProductPriceRange";
    }

    /**
    * The highest variant's price.
    */

    public MoneyV2 getMaxVariantPrice() {
        return (MoneyV2) get("maxVariantPrice");
    }

    public ProductPriceRange setMaxVariantPrice(MoneyV2 arg) {
        optimisticData.put(getKey("maxVariantPrice"), arg);
        return this;
    }

    /**
    * The lowest variant's price.
    */

    public MoneyV2 getMinVariantPrice() {
        return (MoneyV2) get("minVariantPrice");
    }

    public ProductPriceRange setMinVariantPrice(MoneyV2 arg) {
        optimisticData.put(getKey("minVariantPrice"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "maxVariantPrice": return true;

            case "minVariantPrice": return true;

            default: return false;
        }
    }
}

