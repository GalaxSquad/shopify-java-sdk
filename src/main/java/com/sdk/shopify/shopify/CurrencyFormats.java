// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* Currency formats configured for the merchant. These formats are available to use within Liquid.
*/
public class CurrencyFormats extends AbstractResponse<CurrencyFormats> {
    public CurrencyFormats() {
    }

    public CurrencyFormats(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "moneyFormat": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "moneyInEmailsFormat": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "moneyWithCurrencyFormat": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "moneyWithCurrencyInEmailsFormat": {
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
        return "CurrencyFormats";
    }

    /**
    * Money without currency in HTML.
    */

    public String getMoneyFormat() {
        return (String) get("moneyFormat");
    }

    public CurrencyFormats setMoneyFormat(String arg) {
        optimisticData.put(getKey("moneyFormat"), arg);
        return this;
    }

    /**
    * Money without currency in emails.
    */

    public String getMoneyInEmailsFormat() {
        return (String) get("moneyInEmailsFormat");
    }

    public CurrencyFormats setMoneyInEmailsFormat(String arg) {
        optimisticData.put(getKey("moneyInEmailsFormat"), arg);
        return this;
    }

    /**
    * Money with currency in HTML.
    */

    public String getMoneyWithCurrencyFormat() {
        return (String) get("moneyWithCurrencyFormat");
    }

    public CurrencyFormats setMoneyWithCurrencyFormat(String arg) {
        optimisticData.put(getKey("moneyWithCurrencyFormat"), arg);
        return this;
    }

    /**
    * Money with currency in emails.
    */

    public String getMoneyWithCurrencyInEmailsFormat() {
        return (String) get("moneyWithCurrencyInEmailsFormat");
    }

    public CurrencyFormats setMoneyWithCurrencyInEmailsFormat(String arg) {
        optimisticData.put(getKey("moneyWithCurrencyInEmailsFormat"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "moneyFormat": return false;

            case "moneyInEmailsFormat": return false;

            case "moneyWithCurrencyFormat": return false;

            case "moneyWithCurrencyInEmailsFormat": return false;

            default: return false;
        }
    }
}

