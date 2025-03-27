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
* The error blocking a customer merge.
*/
public class CustomerMergeError extends AbstractResponse<CustomerMergeError> {
    public CustomerMergeError() {
    }

    public CustomerMergeError(JsonObject fields) throws SchemaViolationError {
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

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "CustomerMergeError";
    }

    /**
    * The list of fields preventing the customer from being merged.
    */

    public List<CustomerMergeErrorFieldType> getErrorFields() {
        return (List<CustomerMergeErrorFieldType>) get("errorFields");
    }

    public CustomerMergeError setErrorFields(List<CustomerMergeErrorFieldType> arg) {
        optimisticData.put(getKey("errorFields"), arg);
        return this;
    }

    /**
    * The customer merge error message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public CustomerMergeError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "errorFields": return false;

            case "message": return false;

            default: return false;
        }
    }
}

