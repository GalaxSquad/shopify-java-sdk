// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the cart transform feature configuration for the shop.
*/
public class CartTransformFeature extends AbstractResponse<CartTransformFeature> {
    public CartTransformFeature() {
    }

    public CartTransformFeature(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "eligibleOperations": {
                    responseData.put(key, new CartTransformEligibleOperations(jsonAsObject(field.getValue(), key)));

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
        return "CartTransformFeature";
    }

    /**
    * The cart transform operations eligible for the shop.
    */

    public CartTransformEligibleOperations getEligibleOperations() {
        return (CartTransformEligibleOperations) get("eligibleOperations");
    }

    public CartTransformFeature setEligibleOperations(CartTransformEligibleOperations arg) {
        optimisticData.put(getKey("eligibleOperations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "eligibleOperations": return true;

            default: return false;
        }
    }
}

