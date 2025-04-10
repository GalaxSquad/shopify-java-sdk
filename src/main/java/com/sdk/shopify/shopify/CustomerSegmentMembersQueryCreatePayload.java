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
* Return type for `customerSegmentMembersQueryCreate` mutation.
*/
public class CustomerSegmentMembersQueryCreatePayload extends AbstractResponse<CustomerSegmentMembersQueryCreatePayload> {
    public CustomerSegmentMembersQueryCreatePayload() {
    }

    public CustomerSegmentMembersQueryCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerSegmentMembersQuery": {
                    CustomerSegmentMembersQuery optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerSegmentMembersQuery(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CustomerSegmentMembersQueryUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerSegmentMembersQueryUserError(jsonAsObject(element1, key)));
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
        return "CustomerSegmentMembersQueryCreatePayload";
    }

    /**
    * The newly created customer segment members query.
    */

    public CustomerSegmentMembersQuery getCustomerSegmentMembersQuery() {
        return (CustomerSegmentMembersQuery) get("customerSegmentMembersQuery");
    }

    public CustomerSegmentMembersQueryCreatePayload setCustomerSegmentMembersQuery(CustomerSegmentMembersQuery arg) {
        optimisticData.put(getKey("customerSegmentMembersQuery"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CustomerSegmentMembersQueryUserError> getUserErrors() {
        return (List<CustomerSegmentMembersQueryUserError>) get("userErrors");
    }

    public CustomerSegmentMembersQueryCreatePayload setUserErrors(List<CustomerSegmentMembersQueryUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerSegmentMembersQuery": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

