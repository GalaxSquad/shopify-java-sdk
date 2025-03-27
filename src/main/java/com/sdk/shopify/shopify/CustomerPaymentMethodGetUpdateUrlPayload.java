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
* Return type for `customerPaymentMethodGetUpdateUrl` mutation.
*/
public class CustomerPaymentMethodGetUpdateUrlPayload extends AbstractResponse<CustomerPaymentMethodGetUpdateUrlPayload> {
    public CustomerPaymentMethodGetUpdateUrlPayload() {
    }

    public CustomerPaymentMethodGetUpdateUrlPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "updatePaymentMethodUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CustomerPaymentMethodGetUpdateUrlUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerPaymentMethodGetUpdateUrlUserError(jsonAsObject(element1, key)));
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
        return "CustomerPaymentMethodGetUpdateUrlPayload";
    }

    /**
    * The URL to redirect the customer to update the payment method.
    */

    public String getUpdatePaymentMethodUrl() {
        return (String) get("updatePaymentMethodUrl");
    }

    public CustomerPaymentMethodGetUpdateUrlPayload setUpdatePaymentMethodUrl(String arg) {
        optimisticData.put(getKey("updatePaymentMethodUrl"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CustomerPaymentMethodGetUpdateUrlUserError> getUserErrors() {
        return (List<CustomerPaymentMethodGetUpdateUrlUserError>) get("userErrors");
    }

    public CustomerPaymentMethodGetUpdateUrlPayload setUserErrors(List<CustomerPaymentMethodGetUpdateUrlUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "updatePaymentMethodUrl": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

