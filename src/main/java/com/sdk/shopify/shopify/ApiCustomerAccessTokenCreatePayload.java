// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApiCustomerAccessTokenCreatePayload extends AbstractResponse<ApiCustomerAccessTokenCreatePayload> {
    public ApiCustomerAccessTokenCreatePayload() {
    }

    public ApiCustomerAccessTokenCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "apiCustomerAccessToken": {
                    ApiCustomerAccessToken optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ApiCustomerAccessToken(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "clientMutationId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "ApiCustomerAccessTokenCreatePayload";
    }

    public ApiCustomerAccessToken getApiCustomerAccessToken() {
        return (ApiCustomerAccessToken) get("apiCustomerAccessToken");
    }

    public ApiCustomerAccessTokenCreatePayload setApiCustomerAccessToken(ApiCustomerAccessToken arg) {
        optimisticData.put(getKey("apiCustomerAccessToken"), arg);
        return this;
    }

    public String getClientMutationId() {
        return (String) get("clientMutationId");
    }

    public ApiCustomerAccessTokenCreatePayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationId"), arg);
        return this;
    }

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public ApiCustomerAccessTokenCreatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "apiCustomerAccessToken": return true;

            case "clientMutationId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

