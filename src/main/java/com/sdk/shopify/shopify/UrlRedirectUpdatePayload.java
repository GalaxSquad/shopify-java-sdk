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
* Return type for `urlRedirectUpdate` mutation.
*/
public class UrlRedirectUpdatePayload extends AbstractResponse<UrlRedirectUpdatePayload> {
    public UrlRedirectUpdatePayload() {
    }

    public UrlRedirectUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "urlRedirect": {
                    UrlRedirect optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirect(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UrlRedirectUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UrlRedirectUserError(jsonAsObject(element1, key)));
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
        return "UrlRedirectUpdatePayload";
    }

    /**
    * Returns the updated URL redirect.
    */

    public UrlRedirect getUrlRedirect() {
        return (UrlRedirect) get("urlRedirect");
    }

    public UrlRedirectUpdatePayload setUrlRedirect(UrlRedirect arg) {
        optimisticData.put(getKey("urlRedirect"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UrlRedirectUserError> getUserErrors() {
        return (List<UrlRedirectUserError>) get("userErrors");
    }

    public UrlRedirectUpdatePayload setUserErrors(List<UrlRedirectUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "urlRedirect": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

