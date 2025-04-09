// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The type of value given to a customer when a discount is applied to an order. For example, the
* application of the discount might give the customer a percentage off a specified item.
* Alternatively, the application of the discount might give the customer a monetary value in a given
* currency off an order.
*/
public class UnknownPricingValue extends AbstractResponse<UnknownPricingValue> implements PricingValue {
    public UnknownPricingValue() {
    }

    public UnknownPricingValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static PricingValue create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "MoneyV2": {
                return new MoneyV2(fields);
            }

            case "PricingPercentageValue": {
                return new PricingPercentageValue(fields);
            }

            default: {
                return new UnknownPricingValue(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

