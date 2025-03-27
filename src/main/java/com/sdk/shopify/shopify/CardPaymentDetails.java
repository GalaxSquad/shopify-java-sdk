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
* Card payment details related to a transaction.
*/
public class CardPaymentDetails extends AbstractResponse<CardPaymentDetails> implements BasePaymentDetails, PaymentDetails {
    public CardPaymentDetails() {
    }

    public CardPaymentDetails(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "avsResultCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bin": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "company": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cvvResultCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "expirationMonth": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "expirationYear": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "number": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentMethodName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "wallet": {
                    DigitalWallet optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = DigitalWallet.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CardPaymentDetails";
    }

    /**
    * The response code from the address verification system (AVS). The code is always a single letter.
    */

    public String getAvsResultCode() {
        return (String) get("avsResultCode");
    }

    public CardPaymentDetails setAvsResultCode(String arg) {
        optimisticData.put(getKey("avsResultCode"), arg);
        return this;
    }

    /**
    * The issuer identification number (IIN), formerly known as bank identification number (BIN) of the
    * customer's credit card. This is made up of the first few digits of the credit card number.
    */

    public String getBin() {
        return (String) get("bin");
    }

    public CardPaymentDetails setBin(String arg) {
        optimisticData.put(getKey("bin"), arg);
        return this;
    }

    /**
    * The name of the company that issued the customer's credit card.
    */

    public String getCompany() {
        return (String) get("company");
    }

    public CardPaymentDetails setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * The response code from the credit card company indicating whether the customer entered the card
    * security code, or card verification value, correctly. The code is a single letter or empty string.
    */

    public String getCvvResultCode() {
        return (String) get("cvvResultCode");
    }

    public CardPaymentDetails setCvvResultCode(String arg) {
        optimisticData.put(getKey("cvvResultCode"), arg);
        return this;
    }

    /**
    * The month in which the used credit card expires.
    */

    public Integer getExpirationMonth() {
        return (Integer) get("expirationMonth");
    }

    public CardPaymentDetails setExpirationMonth(Integer arg) {
        optimisticData.put(getKey("expirationMonth"), arg);
        return this;
    }

    /**
    * The year in which the used credit card expires.
    */

    public Integer getExpirationYear() {
        return (Integer) get("expirationYear");
    }

    public CardPaymentDetails setExpirationYear(Integer arg) {
        optimisticData.put(getKey("expirationYear"), arg);
        return this;
    }

    /**
    * The holder of the credit card.
    */

    public String getName() {
        return (String) get("name");
    }

    public CardPaymentDetails setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The customer's credit card number, with most of the leading digits redacted.
    */

    public String getNumber() {
        return (String) get("number");
    }

    public CardPaymentDetails setNumber(String arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    /**
    * The name of payment method used by the buyer.
    */

    public String getPaymentMethodName() {
        return (String) get("paymentMethodName");
    }

    public CardPaymentDetails setPaymentMethodName(String arg) {
        optimisticData.put(getKey("paymentMethodName"), arg);
        return this;
    }

    /**
    * Digital wallet used for the payment.
    */

    public DigitalWallet getWallet() {
        return (DigitalWallet) get("wallet");
    }

    public CardPaymentDetails setWallet(DigitalWallet arg) {
        optimisticData.put(getKey("wallet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "avsResultCode": return false;

            case "bin": return false;

            case "company": return false;

            case "cvvResultCode": return false;

            case "expirationMonth": return false;

            case "expirationYear": return false;

            case "name": return false;

            case "number": return false;

            case "paymentMethodName": return false;

            case "wallet": return false;

            default: return false;
        }
    }
}

