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
* A token that delegates a set of scopes from the original permission.
* To learn more about creating delegate access tokens, refer to
* [Delegate OAuth access tokens to
* subsystems](https://shopify.dev/docs/apps/build/authentication-authorization/access-tokens/use-deleg
* ate-tokens).
*/
public class DelegateAccessToken extends AbstractResponse<DelegateAccessToken> {
    public DelegateAccessToken() {
    }

    public DelegateAccessToken(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accessScopes": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "accessToken": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createdAt": {
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
        return "DelegateAccessToken";
    }

    /**
    * The list of permissions associated with the token.
    */

    public List<String> getAccessScopes() {
        return (List<String>) get("accessScopes");
    }

    public DelegateAccessToken setAccessScopes(List<String> arg) {
        optimisticData.put(getKey("accessScopes"), arg);
        return this;
    }

    /**
    * The issued delegate access token.
    */

    public String getAccessToken() {
        return (String) get("accessToken");
    }

    public DelegateAccessToken setAccessToken(String arg) {
        optimisticData.put(getKey("accessToken"), arg);
        return this;
    }

    /**
    * The date and time when the delegate access token was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DelegateAccessToken setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accessScopes": return false;

            case "accessToken": return false;

            case "createdAt": return false;

            default: return false;
        }
    }
}

