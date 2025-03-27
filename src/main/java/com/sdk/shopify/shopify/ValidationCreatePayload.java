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
* Return type for `validationCreate` mutation.
*/
public class ValidationCreatePayload extends AbstractResponse<ValidationCreatePayload> {
    public ValidationCreatePayload() {
    }

    public ValidationCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "userErrors": {
                    List<ValidationUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ValidationUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "validation": {
                    Validation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Validation(jsonAsObject(field.getValue(), key));
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
        return "ValidationCreatePayload";
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ValidationUserError> getUserErrors() {
        return (List<ValidationUserError>) get("userErrors");
    }

    public ValidationCreatePayload setUserErrors(List<ValidationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    /**
    * The created validation.
    */

    public Validation getValidation() {
        return (Validation) get("validation");
    }

    public ValidationCreatePayload setValidation(Validation arg) {
        optimisticData.put(getKey("validation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "userErrors": return true;

            case "validation": return true;

            default: return false;
        }
    }
}

