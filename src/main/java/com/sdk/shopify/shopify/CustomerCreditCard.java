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
* Represents a card instrument for customer payment method.
*/
public class CustomerCreditCard extends AbstractResponse<CustomerCreditCard> implements CustomerPaymentInstrument {
    public CustomerCreditCard() {
    }

    public CustomerCreditCard(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billingAddress": {
                    CustomerCreditCardBillingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerCreditCardBillingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "brand": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "expiresSoon": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "expiryMonth": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "expiryYear": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "firstDigits": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isRevocable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "lastDigits": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "maskedNumber": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "source": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "virtualLastDigits": {
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
        return "CustomerCreditCard";
    }

    /**
    * The billing address of the card.
    */

    public CustomerCreditCardBillingAddress getBillingAddress() {
        return (CustomerCreditCardBillingAddress) get("billingAddress");
    }

    public CustomerCreditCard setBillingAddress(CustomerCreditCardBillingAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * The brand of the card.
    */

    public String getBrand() {
        return (String) get("brand");
    }

    public CustomerCreditCard setBrand(String arg) {
        optimisticData.put(getKey("brand"), arg);
        return this;
    }

    /**
    * Whether the card is about to expire.
    */

    public Boolean getExpiresSoon() {
        return (Boolean) get("expiresSoon");
    }

    public CustomerCreditCard setExpiresSoon(Boolean arg) {
        optimisticData.put(getKey("expiresSoon"), arg);
        return this;
    }

    /**
    * The expiry month of the card.
    */

    public Integer getExpiryMonth() {
        return (Integer) get("expiryMonth");
    }

    public CustomerCreditCard setExpiryMonth(Integer arg) {
        optimisticData.put(getKey("expiryMonth"), arg);
        return this;
    }

    /**
    * The expiry year of the card.
    */

    public Integer getExpiryYear() {
        return (Integer) get("expiryYear");
    }

    public CustomerCreditCard setExpiryYear(Integer arg) {
        optimisticData.put(getKey("expiryYear"), arg);
        return this;
    }

    /**
    * The card's BIN number.
    */

    public String getFirstDigits() {
        return (String) get("firstDigits");
    }

    public CustomerCreditCard setFirstDigits(String arg) {
        optimisticData.put(getKey("firstDigits"), arg);
        return this;
    }

    /**
    * The payment method can be revoked if there are no active subscription contracts.
    */

    public Boolean getIsRevocable() {
        return (Boolean) get("isRevocable");
    }

    public CustomerCreditCard setIsRevocable(Boolean arg) {
        optimisticData.put(getKey("isRevocable"), arg);
        return this;
    }

    /**
    * The last 4 digits of the card.
    */

    public String getLastDigits() {
        return (String) get("lastDigits");
    }

    public CustomerCreditCard setLastDigits(String arg) {
        optimisticData.put(getKey("lastDigits"), arg);
        return this;
    }

    /**
    * The masked card number with only the last 4 digits displayed.
    */

    public String getMaskedNumber() {
        return (String) get("maskedNumber");
    }

    public CustomerCreditCard setMaskedNumber(String arg) {
        optimisticData.put(getKey("maskedNumber"), arg);
        return this;
    }

    /**
    * The name of the card holder.
    */

    public String getName() {
        return (String) get("name");
    }

    public CustomerCreditCard setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The source of the card if coming from a wallet such as Apple Pay.
    */

    public String getSource() {
        return (String) get("source");
    }

    public CustomerCreditCard setSource(String arg) {
        optimisticData.put(getKey("source"), arg);
        return this;
    }

    /**
    * The last 4 digits of the Device Account Number.
    */

    public String getVirtualLastDigits() {
        return (String) get("virtualLastDigits");
    }

    public CustomerCreditCard setVirtualLastDigits(String arg) {
        optimisticData.put(getKey("virtualLastDigits"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingAddress": return true;

            case "brand": return false;

            case "expiresSoon": return false;

            case "expiryMonth": return false;

            case "expiryYear": return false;

            case "firstDigits": return false;

            case "isRevocable": return false;

            case "lastDigits": return false;

            case "maskedNumber": return false;

            case "name": return false;

            case "source": return false;

            case "virtualLastDigits": return false;

            default: return false;
        }
    }
}

