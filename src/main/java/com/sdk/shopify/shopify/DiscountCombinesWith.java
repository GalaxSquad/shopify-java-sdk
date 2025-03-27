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
* The [discount
* classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
* that you can use in combination with
* [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
*/
public class DiscountCombinesWith extends AbstractResponse<DiscountCombinesWith> {
    public DiscountCombinesWith() {
    }

    public DiscountCombinesWith(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "orderDiscounts": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "productDiscounts": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "shippingDiscounts": {
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
        return "DiscountCombinesWith";
    }

    /**
    * Whether the discount combines with the
    * [order
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */

    public Boolean getOrderDiscounts() {
        return (Boolean) get("orderDiscounts");
    }

    public DiscountCombinesWith setOrderDiscounts(Boolean arg) {
        optimisticData.put(getKey("orderDiscounts"), arg);
        return this;
    }

    /**
    * Whether the discount combines with the
    * [product
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */

    public Boolean getProductDiscounts() {
        return (Boolean) get("productDiscounts");
    }

    public DiscountCombinesWith setProductDiscounts(Boolean arg) {
        optimisticData.put(getKey("productDiscounts"), arg);
        return this;
    }

    /**
    * Whether the discount combines with the
    * [shipping
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */

    public Boolean getShippingDiscounts() {
        return (Boolean) get("shippingDiscounts");
    }

    public DiscountCombinesWith setShippingDiscounts(Boolean arg) {
        optimisticData.put(getKey("shippingDiscounts"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "orderDiscounts": return false;

            case "productDiscounts": return false;

            case "shippingDiscounts": return false;

            default: return false;
        }
    }
}

