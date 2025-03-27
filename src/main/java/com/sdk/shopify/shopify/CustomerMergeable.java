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
* An object that represents whether a customer can be merged with another customer.
*/
public class CustomerMergeable extends AbstractResponse<CustomerMergeable> {
    public CustomerMergeable() {
    }

    public CustomerMergeable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "errorFields": {
                    List<CustomerMergeErrorFieldType> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(CustomerMergeErrorFieldType.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "isMergeable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "mergeInProgress": {
                    CustomerMergeRequest optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerMergeRequest(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reason": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "CustomerMergeable";
    }

    /**
    * The list of fields preventing the customer from being merged.
    */

    public List<CustomerMergeErrorFieldType> getErrorFields() {
        return (List<CustomerMergeErrorFieldType>) get("errorFields");
    }

    public CustomerMergeable setErrorFields(List<CustomerMergeErrorFieldType> arg) {
        optimisticData.put(getKey("errorFields"), arg);
        return this;
    }

    /**
    * Whether the customer can be merged with another customer.
    */

    public Boolean getIsMergeable() {
        return (Boolean) get("isMergeable");
    }

    public CustomerMergeable setIsMergeable(Boolean arg) {
        optimisticData.put(getKey("isMergeable"), arg);
        return this;
    }

    /**
    * The merge request if one is currently in progress.
    */

    public CustomerMergeRequest getMergeInProgress() {
        return (CustomerMergeRequest) get("mergeInProgress");
    }

    public CustomerMergeable setMergeInProgress(CustomerMergeRequest arg) {
        optimisticData.put(getKey("mergeInProgress"), arg);
        return this;
    }

    /**
    * The reason why the customer can't be merged with another customer.
    */

    public String getReason() {
        return (String) get("reason");
    }

    public CustomerMergeable setReason(String arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "errorFields": return false;

            case "isMergeable": return false;

            case "mergeInProgress": return true;

            case "reason": return false;

            default: return false;
        }
    }
}

