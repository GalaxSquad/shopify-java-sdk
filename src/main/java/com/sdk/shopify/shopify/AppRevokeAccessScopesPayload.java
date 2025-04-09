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
* Return type for `appRevokeAccessScopes` mutation.
*/
public class AppRevokeAccessScopesPayload extends AbstractResponse<AppRevokeAccessScopesPayload> {
    public AppRevokeAccessScopesPayload() {
    }

    public AppRevokeAccessScopesPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "revoked": {
                    List<AccessScope> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AccessScope> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new AccessScope(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<AppRevokeAccessScopesAppRevokeScopeError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AppRevokeAccessScopesAppRevokeScopeError(jsonAsObject(element1, key)));
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
        return "AppRevokeAccessScopesPayload";
    }

    /**
    * The list of scope handles that have been revoked.
    */

    public List<AccessScope> getRevoked() {
        return (List<AccessScope>) get("revoked");
    }

    public AppRevokeAccessScopesPayload setRevoked(List<AccessScope> arg) {
        optimisticData.put(getKey("revoked"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<AppRevokeAccessScopesAppRevokeScopeError> getUserErrors() {
        return (List<AppRevokeAccessScopesAppRevokeScopeError>) get("userErrors");
    }

    public AppRevokeAccessScopesPayload setUserErrors(List<AppRevokeAccessScopesAppRevokeScopeError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "revoked": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

