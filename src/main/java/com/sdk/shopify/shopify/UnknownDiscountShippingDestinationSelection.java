// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The type used to target the eligible countries of an order's shipping destination for which the
* discount applies. For example, the discount might be applicable when shipping to all countries, or
* only to a set of countries.
*/
public class UnknownDiscountShippingDestinationSelection extends AbstractResponse<UnknownDiscountShippingDestinationSelection> implements DiscountShippingDestinationSelection {
    public UnknownDiscountShippingDestinationSelection() {
    }

    public UnknownDiscountShippingDestinationSelection(JsonObject fields) throws SchemaViolationError {
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

    public static DiscountShippingDestinationSelection create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DiscountCountries": {
                return new DiscountCountries(fields);
            }

            case "DiscountCountryAll": {
                return new DiscountCountryAll(fields);
            }

            default: {
                return new UnknownDiscountShippingDestinationSelection(fields);
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

