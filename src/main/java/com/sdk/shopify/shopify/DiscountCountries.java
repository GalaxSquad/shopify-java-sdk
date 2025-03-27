// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The shipping destinations where the discount can be applied.
*/
public class DiscountCountries extends AbstractResponse<DiscountCountries> implements DiscountShippingDestinationSelection {
    public DiscountCountries() {
    }

    public DiscountCountries(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countries": {
                    List<CountryCode> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(CountryCode.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "includeRestOfWorld": {
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
        return "DiscountCountries";
    }

    /**
    * The codes for the countries where the discount can be applied.
    */

    public List<CountryCode> getCountries() {
        return (List<CountryCode>) get("countries");
    }

    public DiscountCountries setCountries(List<CountryCode> arg) {
        optimisticData.put(getKey("countries"), arg);
        return this;
    }

    /**
    * Whether the discount is applicable to countries that haven't been defined in the shop's shipping
    * zones.
    */

    public Boolean getIncludeRestOfWorld() {
        return (Boolean) get("includeRestOfWorld");
    }

    public DiscountCountries setIncludeRestOfWorld(Boolean arg) {
        optimisticData.put(getKey("includeRestOfWorld"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countries": return false;

            case "includeRestOfWorld": return false;

            default: return false;
        }
    }
}

