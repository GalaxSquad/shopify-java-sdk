// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `customerCancelDataErasure` mutation.
*/
public class CustomerCancelDataErasurePayload extends AbstractResponse<CustomerCancelDataErasurePayload> {
    public CustomerCancelDataErasurePayload() {
    }

    public CustomerCancelDataErasurePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CustomerCancelDataErasureUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerCancelDataErasureUserError(jsonAsObject(element1, key)));
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
        return "CustomerCancelDataErasurePayload";
    }

    /**
    * The ID of the customer whose pending data erasure has been cancelled.
    */

    public ID getCustomerId() {
        return (ID) get("customerId");
    }

    public CustomerCancelDataErasurePayload setCustomerId(ID arg) {
        optimisticData.put(getKey("customerId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CustomerCancelDataErasureUserError> getUserErrors() {
        return (List<CustomerCancelDataErasureUserError>) get("userErrors");
    }

    public CustomerCancelDataErasurePayload setUserErrors(List<CustomerCancelDataErasureUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

