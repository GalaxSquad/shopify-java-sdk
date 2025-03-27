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
* A customer's payment method.
*/
public class CustomerPaymentMethod extends AbstractResponse<CustomerPaymentMethod> implements Node {
    public CustomerPaymentMethod() {
    }

    public CustomerPaymentMethod(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customer": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "instrument": {
                    CustomerPaymentInstrument optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCustomerPaymentInstrument.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "revokedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "revokedReason": {
                    CustomerPaymentMethodRevocationReason optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CustomerPaymentMethodRevocationReason.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContracts": {
                    responseData.put(key, new SubscriptionContractConnection(jsonAsObject(field.getValue(), key)));

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

    public CustomerPaymentMethod(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CustomerPaymentMethod";
    }

    /**
    * The customer to whom the payment method belongs.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public CustomerPaymentMethod setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * The ID of this payment method.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The instrument for this payment method.
    */

    public CustomerPaymentInstrument getInstrument() {
        return (CustomerPaymentInstrument) get("instrument");
    }

    public CustomerPaymentMethod setInstrument(CustomerPaymentInstrument arg) {
        optimisticData.put(getKey("instrument"), arg);
        return this;
    }

    /**
    * The time that the payment method was revoked.
    */

    public String getRevokedAt() {
        return (String) get("revokedAt");
    }

    public CustomerPaymentMethod setRevokedAt(String arg) {
        optimisticData.put(getKey("revokedAt"), arg);
        return this;
    }

    /**
    * The revocation reason for this payment method.
    */

    public CustomerPaymentMethodRevocationReason getRevokedReason() {
        return (CustomerPaymentMethodRevocationReason) get("revokedReason");
    }

    public CustomerPaymentMethod setRevokedReason(CustomerPaymentMethodRevocationReason arg) {
        optimisticData.put(getKey("revokedReason"), arg);
        return this;
    }

    /**
    * List Subscription Contracts.
    */

    public SubscriptionContractConnection getSubscriptionContracts() {
        return (SubscriptionContractConnection) get("subscriptionContracts");
    }

    public CustomerPaymentMethod setSubscriptionContracts(SubscriptionContractConnection arg) {
        optimisticData.put(getKey("subscriptionContracts"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customer": return true;

            case "id": return false;

            case "instrument": return false;

            case "revokedAt": return false;

            case "revokedReason": return false;

            case "subscriptionContracts": return true;

            default: return false;
        }
    }
}

