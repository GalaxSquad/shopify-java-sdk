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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `customerPaymentMethodCreditCardUpdate` mutation.
*/
public class CustomerPaymentMethodCreditCardUpdatePayload extends AbstractResponse<CustomerPaymentMethodCreditCardUpdatePayload> {
    public CustomerPaymentMethodCreditCardUpdatePayload() {
    }

    public CustomerPaymentMethodCreditCardUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerPaymentMethod": {
                    CustomerPaymentMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethod(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "processing": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "CustomerPaymentMethodCreditCardUpdatePayload";
    }

    /**
    * The customer payment method.
    */

    public CustomerPaymentMethod getCustomerPaymentMethod() {
        return (CustomerPaymentMethod) get("customerPaymentMethod");
    }

    public CustomerPaymentMethodCreditCardUpdatePayload setCustomerPaymentMethod(CustomerPaymentMethod arg) {
        optimisticData.put(getKey("customerPaymentMethod"), arg);
        return this;
    }

    /**
    * If the card verification result is processing. When this is true, customer_payment_method will be
    * null.
    */

    public Boolean getProcessing() {
        return (Boolean) get("processing");
    }

    public CustomerPaymentMethodCreditCardUpdatePayload setProcessing(Boolean arg) {
        optimisticData.put(getKey("processing"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public CustomerPaymentMethodCreditCardUpdatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerPaymentMethod": return true;

            case "processing": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

