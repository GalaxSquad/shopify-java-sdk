// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Targets all items the cart for a specified discount.
*/
public class AllDiscountItems extends AbstractResponse<AllDiscountItems> implements DiscountItems {
    public AllDiscountItems() {
    }

    public AllDiscountItems(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allItems": {
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
        return "AllDiscountItems";
    }

    /**
    * Whether all items are eligible for the discount. This value always returns `true`.
    */

    public Boolean getAllItems() {
        return (Boolean) get("allItems");
    }

    public AllDiscountItems setAllItems(Boolean arg) {
        optimisticData.put(getKey("allItems"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allItems": return false;

            default: return false;
        }
    }
}

