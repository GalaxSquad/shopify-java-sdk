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
* A preview of the results of a customer merge request.
*/
public class CustomerMergePreview extends AbstractResponse<CustomerMergePreview> {
    public CustomerMergePreview() {
    }

    public CustomerMergePreview(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "alternateFields": {
                    CustomerMergePreviewAlternateFields optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerMergePreviewAlternateFields(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "blockingFields": {
                    CustomerMergePreviewBlockingFields optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerMergePreviewBlockingFields(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerMergeErrors": {
                    List<CustomerMergeError> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CustomerMergeError> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new CustomerMergeError(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "defaultFields": {
                    CustomerMergePreviewDefaultFields optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerMergePreviewDefaultFields(jsonAsObject(field.getValue(), key));
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
        return "CustomerMergePreview";
    }

    /**
    * The fields that can be used to override the default fields.
    */

    public CustomerMergePreviewAlternateFields getAlternateFields() {
        return (CustomerMergePreviewAlternateFields) get("alternateFields");
    }

    public CustomerMergePreview setAlternateFields(CustomerMergePreviewAlternateFields arg) {
        optimisticData.put(getKey("alternateFields"), arg);
        return this;
    }

    /**
    * The fields that will block the merge if the two customers are merged.
    */

    public CustomerMergePreviewBlockingFields getBlockingFields() {
        return (CustomerMergePreviewBlockingFields) get("blockingFields");
    }

    public CustomerMergePreview setBlockingFields(CustomerMergePreviewBlockingFields arg) {
        optimisticData.put(getKey("blockingFields"), arg);
        return this;
    }

    /**
    * The errors blocking the customer merge.
    */

    public List<CustomerMergeError> getCustomerMergeErrors() {
        return (List<CustomerMergeError>) get("customerMergeErrors");
    }

    public CustomerMergePreview setCustomerMergeErrors(List<CustomerMergeError> arg) {
        optimisticData.put(getKey("customerMergeErrors"), arg);
        return this;
    }

    /**
    * The fields that will be kept if the two customers are merged.
    */

    public CustomerMergePreviewDefaultFields getDefaultFields() {
        return (CustomerMergePreviewDefaultFields) get("defaultFields");
    }

    public CustomerMergePreview setDefaultFields(CustomerMergePreviewDefaultFields arg) {
        optimisticData.put(getKey("defaultFields"), arg);
        return this;
    }

    /**
    * The resulting customer ID if the two customers are merged.
    */

    public ID getResultingCustomerId() {
        return (ID) get("resultingCustomerId");
    }

    public CustomerMergePreview setResultingCustomerId(ID arg) {
        optimisticData.put(getKey("resultingCustomerId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alternateFields": return true;

            case "blockingFields": return true;

            case "customerMergeErrors": return true;

            case "defaultFields": return true;

            case "resultingCustomerId": return false;

            default: return false;
        }
    }
}

