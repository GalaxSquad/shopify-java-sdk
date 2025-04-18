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
* Return type for `urlRedirectImportSubmit` mutation.
*/
public class UrlRedirectImportSubmitPayload extends AbstractResponse<UrlRedirectImportSubmitPayload> {
    public UrlRedirectImportSubmitPayload() {
    }

    public UrlRedirectImportSubmitPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "job": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UrlRedirectImportUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UrlRedirectImportUserError(jsonAsObject(element1, key)));
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
        return "UrlRedirectImportSubmitPayload";
    }

    /**
    * The asynchronous job importing the redirects.
    */

    public Job getJob() {
        return (Job) get("job");
    }

    public UrlRedirectImportSubmitPayload setJob(Job arg) {
        optimisticData.put(getKey("job"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UrlRedirectImportUserError> getUserErrors() {
        return (List<UrlRedirectImportUserError>) get("userErrors");
    }

    public UrlRedirectImportSubmitPayload setUserErrors(List<UrlRedirectImportUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "job": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

