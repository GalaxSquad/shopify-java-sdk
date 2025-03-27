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
* Resource limits of a shop.
*/
public class ShopResourceLimits extends AbstractResponse<ShopResourceLimits> {
    public ShopResourceLimits() {
    }

    public ShopResourceLimits(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "locationLimit": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "maxProductOptions": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "maxProductVariants": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "redirectLimitReached": {
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
        return "ShopResourceLimits";
    }

    /**
    * Maximum number of locations allowed.
    */

    public Integer getLocationLimit() {
        return (Integer) get("locationLimit");
    }

    public ShopResourceLimits setLocationLimit(Integer arg) {
        optimisticData.put(getKey("locationLimit"), arg);
        return this;
    }

    /**
    * Maximum number of product options allowed.
    */

    public Integer getMaxProductOptions() {
        return (Integer) get("maxProductOptions");
    }

    public ShopResourceLimits setMaxProductOptions(Integer arg) {
        optimisticData.put(getKey("maxProductOptions"), arg);
        return this;
    }

    /**
    * The maximum number of variants allowed per product.
    */

    public Integer getMaxProductVariants() {
        return (Integer) get("maxProductVariants");
    }

    public ShopResourceLimits setMaxProductVariants(Integer arg) {
        optimisticData.put(getKey("maxProductVariants"), arg);
        return this;
    }

    /**
    * Whether the shop has reached the limit of the number of URL redirects it can make for resources.
    */

    public Boolean getRedirectLimitReached() {
        return (Boolean) get("redirectLimitReached");
    }

    public ShopResourceLimits setRedirectLimitReached(Boolean arg) {
        optimisticData.put(getKey("redirectLimitReached"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "locationLimit": return false;

            case "maxProductOptions": return false;

            case "maxProductVariants": return false;

            case "redirectLimitReached": return false;

            default: return false;
        }
    }
}

