// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `paymentCustomizationUpdate` mutation.
*/
public class PaymentCustomizationUpdatePayload extends AbstractResponse<PaymentCustomizationUpdatePayload> {
    public PaymentCustomizationUpdatePayload() {
    }

    public PaymentCustomizationUpdatePayload(JsonObject fields) throws SchemaViolationError {
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
        return "PaymentCustomizationUpdatePayload";
    }

    /**
    * Returns the updated payment customization.
    */

    public PaymentCustomization getPaymentCustomization() {
        return (PaymentCustomization) get("paymentCustomization");
    }

    public PaymentCustomizationUpdatePayload setPaymentCustomization(PaymentCustomization arg) {
        optimisticData.put(getKey("paymentCustomization"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PaymentCustomizationError> getUserErrors() {
        return (List<PaymentCustomizationError>) get("userErrors");
    }

    public PaymentCustomizationUpdatePayload setUserErrors(List<PaymentCustomizationError> arg) {
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

