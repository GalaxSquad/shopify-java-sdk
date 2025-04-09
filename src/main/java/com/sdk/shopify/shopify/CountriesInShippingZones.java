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
* The list of all the countries from the combined shipping zones for the shop.
*/
public class CountriesInShippingZones extends AbstractResponse<CountriesInShippingZones> {
    public CountriesInShippingZones() {
    }

    public CountriesInShippingZones(JsonObject fields) throws SchemaViolationError {
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
        return "CountriesInShippingZones";
    }

    /**
    * The list of all the countries from all the combined shipping zones.
    */

    public List<CountryCode> getCountryCodes() {
        return (List<CountryCode>) get("countryCodes");
    }

    public CountriesInShippingZones setCountryCodes(List<CountryCode> arg) {
        optimisticData.put(getKey("countryCodes"), arg);
        return this;
    }

    /**
    * Whether 'Rest of World' has been defined in any of the shipping zones.
    */

    public Boolean getIncludeRestOfWorld() {
        return (Boolean) get("includeRestOfWorld");
    }

    public CountriesInShippingZones setIncludeRestOfWorld(Boolean arg) {
        optimisticData.put(getKey("includeRestOfWorld"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCodes": return false;

            case "includeRestOfWorld": return false;

            default: return false;
        }
    }
}

