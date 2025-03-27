// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The `DiscountCountryAll` object lets you target all countries as shipping destination for discount
* eligibility.
*/
public class DiscountCountryAll extends AbstractResponse<DiscountCountryAll> implements DiscountShippingDestinationSelection {
    public DiscountCountryAll() {
    }

    public DiscountCountryAll(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allCountries": {
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
        return "DiscountCountryAll";
    }

    /**
    * Whether the discount can be applied to all countries as shipping destination. This value is always
    * `true`.
    */

    public Boolean getAllCountries() {
        return (Boolean) get("allCountries");
    }

    public DiscountCountryAll setAllCountries(Boolean arg) {
        optimisticData.put(getKey("allCountries"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allCountries": return false;

            default: return false;
        }
    }
}

