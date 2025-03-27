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
* The list of country codes and information whether the countries
* are a part of the 'Rest Of World' shipping zone.
*/
public class DeliveryCountryCodesOrRestOfWorld extends AbstractResponse<DeliveryCountryCodesOrRestOfWorld> {
    public DeliveryCountryCodesOrRestOfWorld() {
    }

    public DeliveryCountryCodesOrRestOfWorld(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countryCodes": {
                    List<CountryCode> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(CountryCode.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "restOfWorld": {
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
        return "DeliveryCountryCodesOrRestOfWorld";
    }

    /**
    * List of applicable country codes in the ISO 3166-1 alpha-2 format.
    */

    public List<CountryCode> getCountryCodes() {
        return (List<CountryCode>) get("countryCodes");
    }

    public DeliveryCountryCodesOrRestOfWorld setCountryCodes(List<CountryCode> arg) {
        optimisticData.put(getKey("countryCodes"), arg);
        return this;
    }

    /**
    * Whether the countries are a part of the 'Rest of World' shipping zone.
    */

    public Boolean getRestOfWorld() {
        return (Boolean) get("restOfWorld");
    }

    public DeliveryCountryCodesOrRestOfWorld setRestOfWorld(Boolean arg) {
        optimisticData.put(getKey("restOfWorld"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCodes": return false;

            case "restOfWorld": return false;

            default: return false;
        }
    }
}

