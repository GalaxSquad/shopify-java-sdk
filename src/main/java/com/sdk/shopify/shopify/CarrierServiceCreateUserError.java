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
* An error that occurs during the execution of `CarrierServiceCreate`.
*/
public class CarrierServiceCreateUserError extends AbstractResponse<CarrierServiceCreateUserError> implements DisplayableError {
    public CarrierServiceCreateUserError() {
    }

    public CarrierServiceCreateUserError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    CarrierServiceCreateUserErrorCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CarrierServiceCreateUserErrorCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "field": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(jsonAsString(element1, key));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

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
        return "CarrierServiceCreateUserError";
    }

    /**
    * The error code.
    */

    public CarrierServiceCreateUserErrorCode getCode() {
        return (CarrierServiceCreateUserErrorCode) get("code");
    }

    public CarrierServiceCreateUserError setCode(CarrierServiceCreateUserErrorCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The path to the input field that caused the error.
    */

    public List<String> getField() {
        return (List<String>) get("field");
    }

    public CarrierServiceCreateUserError setField(List<String> arg) {
        optimisticData.put(getKey("field"), arg);
        return this;
    }

    /**
    * The error message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public CarrierServiceCreateUserError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "field": return false;

            case "message": return false;

            default: return false;
        }
    }
}

