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
* Return type for `customerPaymentMethodGetDuplicationData` mutation.
*/
public class CustomerPaymentMethodGetDuplicationDataPayload extends AbstractResponse<CustomerPaymentMethodGetDuplicationDataPayload> {
    public CustomerPaymentMethodGetDuplicationDataPayload() {
    }

    public CustomerPaymentMethodGetDuplicationDataPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "encryptedDuplicationData": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CustomerPaymentMethodGetDuplicationDataUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerPaymentMethodGetDuplicationDataUserError(jsonAsObject(element1, key)));
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
        return "CustomerPaymentMethodGetDuplicationDataPayload";
    }

    /**
    * The encrypted data from the payment method to be duplicated.
    */

    public String getEncryptedDuplicationData() {
        return (String) get("encryptedDuplicationData");
    }

    public CustomerPaymentMethodGetDuplicationDataPayload setEncryptedDuplicationData(String arg) {
        optimisticData.put(getKey("encryptedDuplicationData"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CustomerPaymentMethodGetDuplicationDataUserError> getUserErrors() {
        return (List<CustomerPaymentMethodGetDuplicationDataUserError>) get("userErrors");
    }

    public CustomerPaymentMethodGetDuplicationDataPayload setUserErrors(List<CustomerPaymentMethodGetDuplicationDataUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "encryptedDuplicationData": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

