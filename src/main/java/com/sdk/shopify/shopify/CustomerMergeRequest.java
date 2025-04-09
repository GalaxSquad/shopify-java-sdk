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
* A merge request for merging two customers.
*/
public class CustomerMergeRequest extends AbstractResponse<CustomerMergeRequest> {
    public CustomerMergeRequest() {
    }

    public CustomerMergeRequest(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerMergeErrors": {
                    List<CustomerMergeError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerMergeError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "jobId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "resultingCustomerId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, CustomerMergeRequestStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "CustomerMergeRequest";
    }

    /**
    * The merge errors that occurred during the customer merge request.
    */

    public List<CustomerMergeError> getCustomerMergeErrors() {
        return (List<CustomerMergeError>) get("customerMergeErrors");
    }

    public CustomerMergeRequest setCustomerMergeErrors(List<CustomerMergeError> arg) {
        optimisticData.put(getKey("customerMergeErrors"), arg);
        return this;
    }

    /**
    * The UUID of the merge job.
    */

    public ID getJobId() {
        return (ID) get("jobId");
    }

    public CustomerMergeRequest setJobId(ID arg) {
        optimisticData.put(getKey("jobId"), arg);
        return this;
    }

    /**
    * The ID of the customer resulting from the merge.
    */

    public ID getResultingCustomerId() {
        return (ID) get("resultingCustomerId");
    }

    public CustomerMergeRequest setResultingCustomerId(ID arg) {
        optimisticData.put(getKey("resultingCustomerId"), arg);
        return this;
    }

    /**
    * The status of the customer merge request.
    */

    public CustomerMergeRequestStatus getStatus() {
        return (CustomerMergeRequestStatus) get("status");
    }

    public CustomerMergeRequest setStatus(CustomerMergeRequestStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerMergeErrors": return true;

            case "jobId": return false;

            case "resultingCustomerId": return false;

            case "status": return false;

            default: return false;
        }
    }
}

