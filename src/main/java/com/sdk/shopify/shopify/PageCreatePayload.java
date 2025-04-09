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
* Return type for `pageCreate` mutation.
*/
public class PageCreatePayload extends AbstractResponse<PageCreatePayload> {
    public PageCreatePayload() {
    }

    public PageCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "page": {
                    Page optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Page(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<PageCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PageCreateUserError(jsonAsObject(element1, key)));
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
        return "PageCreatePayload";
    }

    /**
    * The page that was created.
    */

    public Page getPage() {
        return (Page) get("page");
    }

    public PageCreatePayload setPage(Page arg) {
        optimisticData.put(getKey("page"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PageCreateUserError> getUserErrors() {
        return (List<PageCreateUserError>) get("userErrors");
    }

    public PageCreatePayload setUserErrors(List<PageCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "page": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

