// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

public class ApiCustomerAccessToken extends AbstractResponse<ApiCustomerAccessToken> {
    public ApiCustomerAccessToken() {
    }

    public ApiCustomerAccessToken(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accessToken": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "expiresAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public ApiCustomerAccessToken(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ApiCustomerAccessToken";
    }

    public String getAccessToken() {
        return (String) get("accessToken");
    }

    public ApiCustomerAccessToken setAccessToken(String arg) {
        optimisticData.put(getKey("accessToken"), arg);
        return this;
    }

    public String getExpiresAt() {
        return (String) get("expiresAt");
    }

    public ApiCustomerAccessToken setExpiresAt(String arg) {
        optimisticData.put(getKey("expiresAt"), arg);
        return this;
    }

    public ID getId() {
        return (ID) get("id");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accessToken": return false;

            case "expiresAt": return false;

            case "id": return false;

            default: return false;
        }
    }
}

