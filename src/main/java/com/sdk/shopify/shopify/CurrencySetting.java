// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A setting for a presentment currency.
*/
public class CurrencySetting extends AbstractResponse<CurrencySetting> {
    public CurrencySetting() {
    }

    public CurrencySetting(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "currencyCode": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "currencyName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "enabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "rateUpdatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "CurrencySetting";
    }

    /**
    * The currency's ISO code.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public CurrencySetting setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * The full name of the currency.
    */

    public String getCurrencyName() {
        return (String) get("currencyName");
    }

    public CurrencySetting setCurrencyName(String arg) {
        optimisticData.put(getKey("currencyName"), arg);
        return this;
    }

    /**
    * Whether the currency is enabled or not. An enabled currency setting is visible to buyers and allows
    * orders to be generated with that currency as presentment.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public CurrencySetting setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    /**
    * The date and time when the active exchange rate for the currency was last modified. It can be the
    * automatic rate's creation date, or the manual rate's last updated at date if active.
    */

    public String getRateUpdatedAt() {
        return (String) get("rateUpdatedAt");
    }

    public CurrencySetting setRateUpdatedAt(String arg) {
        optimisticData.put(getKey("rateUpdatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "currencyCode": return false;

            case "currencyName": return false;

            case "enabled": return false;

            case "rateUpdatedAt": return false;

            default: return false;
        }
    }
}

