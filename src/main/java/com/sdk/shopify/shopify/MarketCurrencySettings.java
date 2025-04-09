// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A market's currency settings.
*/
public class MarketCurrencySettings extends AbstractResponse<MarketCurrencySettings> {
    public MarketCurrencySettings() {
    }

    public MarketCurrencySettings(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "baseCurrency": {
                    responseData.put(key, new CurrencySetting(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "localCurrencies": {
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
        return "MarketCurrencySettings";
    }

    /**
    * The currency which this market's prices are defined in, and the
    * currency which its customers must use if local currencies are disabled.
    */

    public CurrencySetting getBaseCurrency() {
        return (CurrencySetting) get("baseCurrency");
    }

    public MarketCurrencySettings setBaseCurrency(CurrencySetting arg) {
        optimisticData.put(getKey("baseCurrency"), arg);
        return this;
    }

    /**
    * Whether or not local currencies are enabled. If enabled, then prices will
    * be converted to give each customer the best experience based on their
    * region. If disabled, then all customers in this market will see prices
    * in the market's base currency. For single country markets this will be true when
    * the market's base currency is the same as the default currency for the region.
    */

    public Boolean getLocalCurrencies() {
        return (Boolean) get("localCurrencies");
    }

    public MarketCurrencySettings setLocalCurrencies(Boolean arg) {
        optimisticData.put(getKey("localCurrencies"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "baseCurrency": return true;

            case "localCurrencies": return false;

            default: return false;
        }
    }
}

