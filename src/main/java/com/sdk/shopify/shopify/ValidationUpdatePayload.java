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
* Return type for `validationUpdate` mutation.
*/
public class ValidationUpdatePayload extends AbstractResponse<ValidationUpdatePayload> {
    public ValidationUpdatePayload() {
    }

    public ValidationUpdatePayload(JsonObject fields) throws SchemaViolationError {
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
        return "ValidationUpdatePayload";
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ValidationUserError> getUserErrors() {
        return (List<ValidationUserError>) get("userErrors");
    }

    public ValidationUpdatePayload setUserErrors(List<ValidationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    /**
    * The updated validation.
    */

    public Validation getValidation() {
        return (Validation) get("validation");
    }

    public ValidationUpdatePayload setValidation(Validation arg) {
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

