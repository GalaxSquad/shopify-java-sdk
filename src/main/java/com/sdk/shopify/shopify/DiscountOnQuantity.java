// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The quantity of items discounted, the discount value, and how the discount will be applied.
*/
public class DiscountOnQuantity extends AbstractResponse<DiscountOnQuantity> implements DiscountCustomerGetsValue {
    public DiscountOnQuantity() {
    }

    public DiscountOnQuantity(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "effect": {
                    responseData.put(key, UnknownDiscountEffect.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, new DiscountQuantity(jsonAsObject(field.getValue(), key)));

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
        return "DiscountOnQuantity";
    }

    /**
    * The discount's effect on qualifying items.
    */

    public DiscountEffect getEffect() {
        return (DiscountEffect) get("effect");
    }

    public DiscountOnQuantity setEffect(DiscountEffect arg) {
        optimisticData.put(getKey("effect"), arg);
        return this;
    }

    /**
    * The number of items being discounted. The customer must have at least this many items of specified
    * products or product variants in their order to be eligible for the discount.
    */

    public DiscountQuantity getQuantity() {
        return (DiscountQuantity) get("quantity");
    }

    public DiscountOnQuantity setQuantity(DiscountQuantity arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "effect": return false;

            case "quantity": return true;

            default: return false;
        }
    }
}

