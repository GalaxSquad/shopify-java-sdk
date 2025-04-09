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
* Return type for `customerSendAccountInviteEmail` mutation.
*/
public class CustomerSendAccountInviteEmailPayload extends AbstractResponse<CustomerSendAccountInviteEmailPayload> {
    public CustomerSendAccountInviteEmailPayload() {
    }

    public CustomerSendAccountInviteEmailPayload(JsonObject fields) throws SchemaViolationError {
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

                case "userErrors": {
                    List<CustomerSendAccountInviteEmailUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerSendAccountInviteEmailUserError(jsonAsObject(element1, key)));
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
        return "CustomerSendAccountInviteEmailPayload";
    }

    /**
    * The customer to whom an account invite email was sent.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public CustomerSendAccountInviteEmailPayload setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CustomerSendAccountInviteEmailUserError> getUserErrors() {
        return (List<CustomerSendAccountInviteEmailUserError>) get("userErrors");
    }

    public CustomerSendAccountInviteEmailPayload setUserErrors(List<CustomerSendAccountInviteEmailUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customer": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

