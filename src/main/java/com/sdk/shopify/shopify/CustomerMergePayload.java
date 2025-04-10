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
* Return type for `customerMerge` mutation.
*/
public class CustomerMergePayload extends AbstractResponse<CustomerMergePayload> {
    public CustomerMergePayload() {
    }

    public CustomerMergePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "job": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "resultingCustomerId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CustomerMergeUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerMergeUserError(jsonAsObject(element1, key)));
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
        return "CustomerMergePayload";
    }

    /**
    * The asynchronous job for merging the customers.
    */

    public Job getJob() {
        return (Job) get("job");
    }

    public CustomerMergePayload setJob(Job arg) {
        optimisticData.put(getKey("job"), arg);
        return this;
    }

    /**
    * The ID of the customer resulting from the merge.
    */

    public ID getResultingCustomerId() {
        return (ID) get("resultingCustomerId");
    }

    public CustomerMergePayload setResultingCustomerId(ID arg) {
        optimisticData.put(getKey("resultingCustomerId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CustomerMergeUserError> getUserErrors() {
        return (List<CustomerMergeUserError>) get("userErrors");
    }

    public CustomerMergePayload setUserErrors(List<CustomerMergeUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "job": return true;

            case "resultingCustomerId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

