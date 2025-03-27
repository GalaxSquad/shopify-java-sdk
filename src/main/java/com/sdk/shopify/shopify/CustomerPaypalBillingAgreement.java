// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a PayPal instrument for customer payment method.
*/
public class CustomerPaypalBillingAgreement extends AbstractResponse<CustomerPaypalBillingAgreement> implements CustomerPaymentInstrument {
    public CustomerPaypalBillingAgreement() {
    }

    public CustomerPaypalBillingAgreement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billingAddress": {
                    CustomerPaymentInstrumentBillingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentInstrumentBillingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inactive": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isRevocable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "paypalAccountEmail": {
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
        return "CustomerPaypalBillingAgreement";
    }

    /**
    * The billing address of this payment method.
    */

    public CustomerPaymentInstrumentBillingAddress getBillingAddress() {
        return (CustomerPaymentInstrumentBillingAddress) get("billingAddress");
    }

    public CustomerPaypalBillingAgreement setBillingAddress(CustomerPaymentInstrumentBillingAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * Whether the PayPal billing agreement is inactive.
    */

    public Boolean getInactive() {
        return (Boolean) get("inactive");
    }

    public CustomerPaypalBillingAgreement setInactive(Boolean arg) {
        optimisticData.put(getKey("inactive"), arg);
        return this;
    }

    /**
    * Whether the payment method can be revoked.The payment method can be revoked if there are no active
    * subscription contracts.
    */

    public Boolean getIsRevocable() {
        return (Boolean) get("isRevocable");
    }

    public CustomerPaypalBillingAgreement setIsRevocable(Boolean arg) {
        optimisticData.put(getKey("isRevocable"), arg);
        return this;
    }

    /**
    * The customers's PayPal account email address.
    */

    public String getPaypalAccountEmail() {
        return (String) get("paypalAccountEmail");
    }

    public CustomerPaypalBillingAgreement setPaypalAccountEmail(String arg) {
        optimisticData.put(getKey("paypalAccountEmail"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingAddress": return true;

            case "inactive": return false;

            case "isRevocable": return false;

            case "paypalAccountEmail": return false;

            default: return false;
        }
    }
}

