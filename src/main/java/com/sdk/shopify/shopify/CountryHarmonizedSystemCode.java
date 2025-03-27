// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The country-specific harmonized system code and ISO country code for an inventory item.
*/
public class CountryHarmonizedSystemCode extends AbstractResponse<CountryHarmonizedSystemCode> {
    public CountryHarmonizedSystemCode() {
    }

    public CountryHarmonizedSystemCode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countryCode": {
                    responseData.put(key, CountryCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "harmonizedSystemCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "CountryHarmonizedSystemCode";
    }

    /**
    * The ISO 3166-1 alpha-2 country code for the country that issued the specified harmonized system
    * code.
    */

    public CountryCode getCountryCode() {
        return (CountryCode) get("countryCode");
    }

    public CountryHarmonizedSystemCode setCountryCode(CountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The country-specific harmonized system code. These are usually longer than 6 digits.
    */

    public String getHarmonizedSystemCode() {
        return (String) get("harmonizedSystemCode");
    }

    public CountryHarmonizedSystemCode setHarmonizedSystemCode(String arg) {
        optimisticData.put(getKey("harmonizedSystemCode"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCode": return false;

            case "harmonizedSystemCode": return false;

            default: return false;
        }
    }
}

