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
* Local payment methods payment details related to a transaction.
*/
public class LocalPaymentMethodsPaymentDetails extends AbstractResponse<LocalPaymentMethodsPaymentDetails> implements BasePaymentDetails, PaymentDetails {
    public LocalPaymentMethodsPaymentDetails() {
    }

    public LocalPaymentMethodsPaymentDetails(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "paymentDescriptor": {
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
        return "LocalPaymentMethodsPaymentDetails";
    }

    /**
    * The descriptor by the payment provider. Only available for Amazon Pay and Buy with Prime.
    */

    public String getPaymentDescriptor() {
        return (String) get("paymentDescriptor");
    }

    public LocalPaymentMethodsPaymentDetails setPaymentDescriptor(String arg) {
        optimisticData.put(getKey("paymentDescriptor"), arg);
        return this;
    }

    /**
    * The name of payment method used by the buyer.
    */

    public String getPaymentMethodName() {
        return (String) get("paymentMethodName");
    }

    public LocalPaymentMethodsPaymentDetails setPaymentMethodName(String arg) {
        optimisticData.put(getKey("paymentMethodName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "paymentDescriptor": return false;

            case "paymentMethodName": return false;

            default: return false;
        }
    }
}

