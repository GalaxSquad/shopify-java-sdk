// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The country code and whether the country is a part of the 'Rest Of World' shipping zone.
*/
public class DeliveryCountryCodeOrRestOfWorld extends AbstractResponse<DeliveryCountryCodeOrRestOfWorld> {
    public DeliveryCountryCodeOrRestOfWorld() {
    }

    public DeliveryCountryCodeOrRestOfWorld(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countryCode": {
                    CountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "DeliveryCountryCodeOrRestOfWorld";
    }

    /**
    * The country code in the ISO 3166-1 alpha-2 format.
    */

    public CountryCode getCountryCode() {
        return (CountryCode) get("countryCode");
    }

    public DeliveryCountryCodeOrRestOfWorld setCountryCode(CountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * Whether the country is a part of the 'Rest of World' shipping zone.
    */

    public Boolean getRestOfWorld() {
        return (Boolean) get("restOfWorld");
    }

    public DeliveryCountryCodeOrRestOfWorld setRestOfWorld(Boolean arg) {
        optimisticData.put(getKey("restOfWorld"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCode": return false;

            case "restOfWorld": return false;

            default: return false;
        }
    }
}

