// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The minimum quantity of items required for the discount to apply.
*/
public class DiscountMinimumQuantity extends AbstractResponse<DiscountMinimumQuantity> implements DiscountMinimumRequirement {
    public DiscountMinimumQuantity() {
    }

    public DiscountMinimumQuantity(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "greaterThanOrEqualToQuantity": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "DiscountMinimumQuantity";
    }

    /**
    * The minimum quantity of items that's required for the discount to be applied.
    */

    public String getGreaterThanOrEqualToQuantity() {
        return (String) get("greaterThanOrEqualToQuantity");
    }

    public DiscountMinimumQuantity setGreaterThanOrEqualToQuantity(String arg) {
        optimisticData.put(getKey("greaterThanOrEqualToQuantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "greaterThanOrEqualToQuantity": return false;

            default: return false;
        }
    }
}

