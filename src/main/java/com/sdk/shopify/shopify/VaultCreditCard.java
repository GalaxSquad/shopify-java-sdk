// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a credit card payment instrument.
*/
public class VaultCreditCard extends AbstractResponse<VaultCreditCard> implements PaymentInstrument {
    public VaultCreditCard() {
    }

    public VaultCreditCard(JsonObject fields) throws SchemaViolationError {
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

                case "expired": {
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

                case "lastDigits": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public String getGraphQlTypeName() {
        return "VaultCreditCard";
    }

    /**
    * The billing address of the card.
    */

    public CustomerCreditCardBillingAddress getBillingAddress() {
        return (CustomerCreditCardBillingAddress) get("billingAddress");
    }

    public VaultCreditCard setBillingAddress(CustomerCreditCardBillingAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * The brand for the card.
    */

    public String getBrand() {
        return (String) get("brand");
    }

    public VaultCreditCard setBrand(String arg) {
        optimisticData.put(getKey("brand"), arg);
        return this;
    }

    /**
    * Whether the card has been expired.
    */

    public Boolean getExpired() {
        return (Boolean) get("expired");
    }

    public VaultCreditCard setExpired(Boolean arg) {
        optimisticData.put(getKey("expired"), arg);
        return this;
    }

    /**
    * The expiry month of the card.
    */

    public Integer getExpiryMonth() {
        return (Integer) get("expiryMonth");
    }

    public VaultCreditCard setExpiryMonth(Integer arg) {
        optimisticData.put(getKey("expiryMonth"), arg);
        return this;
    }

    /**
    * The expiry year of the card.
    */

    public Integer getExpiryYear() {
        return (Integer) get("expiryYear");
    }

    public VaultCreditCard setExpiryYear(Integer arg) {
        optimisticData.put(getKey("expiryYear"), arg);
        return this;
    }

    /**
    * The last four digits for the card.
    */

    public String getLastDigits() {
        return (String) get("lastDigits");
    }

    public VaultCreditCard setLastDigits(String arg) {
        optimisticData.put(getKey("lastDigits"), arg);
        return this;
    }

    /**
    * The name of the card holder.
    */

    public String getName() {
        return (String) get("name");
    }

    public VaultCreditCard setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingAddress": return true;

            case "brand": return false;

            case "expired": return false;

            case "expiryMonth": return false;

            case "expiryYear": return false;

            case "lastDigits": return false;

            case "name": return false;

            default: return false;
        }
    }
}

