// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* One type of value given to a customer when a discount is applied to an order.
* The application of a discount with this value gives the customer the specified percentage off a
* specified item.
*/
public class PricingPercentageValue extends AbstractResponse<PricingPercentageValue> implements PricingValue {
    public PricingPercentageValue() {
    }

    public PricingPercentageValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "percentage": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "PricingPercentageValue";
    }

    /**
    * The percentage value of the object. This is a number between -100 (free) and 0 (no discount).
    */

    public Double getPercentage() {
        return (Double) get("percentage");
    }

    public PricingPercentageValue setPercentage(Double arg) {
        optimisticData.put(getKey("percentage"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "percentage": return false;

            default: return false;
        }
    }
}

