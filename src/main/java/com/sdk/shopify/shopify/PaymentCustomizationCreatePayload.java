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
* Return type for `paymentCustomizationCreate` mutation.
*/
public class PaymentCustomizationCreatePayload extends AbstractResponse<PaymentCustomizationCreatePayload> {
    public PaymentCustomizationCreatePayload() {
    }

    public PaymentCustomizationCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "paymentCustomization": {
                    PaymentCustomization optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentCustomization(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<PaymentCustomizationError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PaymentCustomizationError(jsonAsObject(element1, key)));
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
        return "PaymentCustomizationCreatePayload";
    }

    /**
    * Returns the created payment customization.
    */

    public PaymentCustomization getPaymentCustomization() {
        return (PaymentCustomization) get("paymentCustomization");
    }

    public PaymentCustomizationCreatePayload setPaymentCustomization(PaymentCustomization arg) {
        optimisticData.put(getKey("paymentCustomization"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PaymentCustomizationError> getUserErrors() {
        return (List<PaymentCustomizationError>) get("userErrors");
    }

    public PaymentCustomizationCreatePayload setUserErrors(List<PaymentCustomizationError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "paymentCustomization": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

