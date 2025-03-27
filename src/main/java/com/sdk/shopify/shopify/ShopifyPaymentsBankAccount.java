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
* A bank account that can receive payouts.
*/
public class ShopifyPaymentsBankAccount extends AbstractResponse<ShopifyPaymentsBankAccount> implements Node {
    public ShopifyPaymentsBankAccount() {
    }

    public ShopifyPaymentsBankAccount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accountNumberLastDigits": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "bankName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country": {
                    responseData.put(key, CountryCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "currency": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "payouts": {
                    responseData.put(key, new ShopifyPaymentsPayoutConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, ShopifyPaymentsBankAccountStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public ShopifyPaymentsBankAccount(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsBankAccount";
    }

    /**
    * The last digits of the account number (the rest is redacted).
    */

    public String getAccountNumberLastDigits() {
        return (String) get("accountNumberLastDigits");
    }

    public ShopifyPaymentsBankAccount setAccountNumberLastDigits(String arg) {
        optimisticData.put(getKey("accountNumberLastDigits"), arg);
        return this;
    }

    /**
    * The name of the bank.
    */

    public String getBankName() {
        return (String) get("bankName");
    }

    public ShopifyPaymentsBankAccount setBankName(String arg) {
        optimisticData.put(getKey("bankName"), arg);
        return this;
    }

    /**
    * The country of the bank.
    */

    public CountryCode getCountry() {
        return (CountryCode) get("country");
    }

    public ShopifyPaymentsBankAccount setCountry(CountryCode arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The date that the bank account was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ShopifyPaymentsBankAccount setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The currency of the bank account.
    */

    public CurrencyCode getCurrency() {
        return (CurrencyCode) get("currency");
    }

    public ShopifyPaymentsBankAccount setCurrency(CurrencyCode arg) {
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
    * All current and previous payouts made between the account and the bank account.
    */

    public ShopifyPaymentsPayoutConnection getPayouts() {
        return (ShopifyPaymentsPayoutConnection) get("payouts");
    }

    public ShopifyPaymentsBankAccount setPayouts(ShopifyPaymentsPayoutConnection arg) {
        optimisticData.put(getKey("payouts"), arg);
        return this;
    }

    /**
    * The status of the bank account.
    */

    public ShopifyPaymentsBankAccountStatus getStatus() {
        return (ShopifyPaymentsBankAccountStatus) get("status");
    }

    public ShopifyPaymentsBankAccount setStatus(ShopifyPaymentsBankAccountStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accountNumberLastDigits": return false;

            case "bankName": return false;

            case "country": return false;

            case "createdAt": return false;

            case "currency": return false;

            case "id": return false;

            case "payouts": return true;

            case "status": return false;

            default: return false;
        }
    }
}

