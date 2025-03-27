// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A country which comprises a market.
*/
public class MarketRegionCountry extends AbstractResponse<MarketRegionCountry> implements MarketRegion, Node {
    public MarketRegionCountry() {
    }

    public MarketRegionCountry(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, CountryCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "currency": {
                    responseData.put(key, new CurrencySetting(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
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

    public MarketRegionCountry(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "MarketRegionCountry";
    }

    /**
    * The ISO code identifying the country.
    */

    public CountryCode getCode() {
        return (CountryCode) get("code");
    }

    public MarketRegionCountry setCode(CountryCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The currency which this country uses given its market settings.
    */

    public CurrencySetting getCurrency() {
        return (CurrencySetting) get("currency");
    }

    public MarketRegionCountry setCurrency(CurrencySetting arg) {
        optimisticData.put(getKey("currency"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the region.
    */

    public String getName() {
        return (String) get("name");
    }

    public MarketRegionCountry setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "currency": return true;

            case "id": return false;

            case "name": return false;

            default: return false;
        }
    }
}

