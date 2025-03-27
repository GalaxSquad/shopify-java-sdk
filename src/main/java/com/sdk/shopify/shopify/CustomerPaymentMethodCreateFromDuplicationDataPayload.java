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
* Return type for `customerPaymentMethodCreateFromDuplicationData` mutation.
*/
public class CustomerPaymentMethodCreateFromDuplicationDataPayload extends AbstractResponse<CustomerPaymentMethodCreateFromDuplicationDataPayload> {
    public CustomerPaymentMethodCreateFromDuplicationDataPayload() {
    }

    public CustomerPaymentMethodCreateFromDuplicationDataPayload(JsonObject fields) throws SchemaViolationError {
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

                case "userErrors": {
                    List<CustomerPaymentMethodCreateFromDuplicationDataUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerPaymentMethodCreateFromDuplicationDataUserError(jsonAsObject(element1, key)));
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
        return "CustomerPaymentMethodCreateFromDuplicationDataPayload";
    }

    /**
    * The customer payment method.
    */

    public CustomerPaymentMethod getCustomerPaymentMethod() {
        return (CustomerPaymentMethod) get("customerPaymentMethod");
    }

    public CustomerPaymentMethodCreateFromDuplicationDataPayload setCustomerPaymentMethod(CustomerPaymentMethod arg) {
        optimisticData.put(getKey("customerPaymentMethod"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CustomerPaymentMethodCreateFromDuplicationDataUserError> getUserErrors() {
        return (List<CustomerPaymentMethodCreateFromDuplicationDataUserError>) get("userErrors");
    }

    public CustomerPaymentMethodCreateFromDuplicationDataPayload setUserErrors(List<CustomerPaymentMethodCreateFromDuplicationDataUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerPaymentMethod": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

