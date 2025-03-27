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
* Return type for `blogCreate` mutation.
*/
public class BlogCreatePayload extends AbstractResponse<BlogCreatePayload> {
    public BlogCreatePayload() {
    }

    public BlogCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "blog": {
                    Blog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Blog(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<BlogCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new BlogCreateUserError(jsonAsObject(element1, key)));
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
        return "BlogCreatePayload";
    }

    /**
    * The blog that was created.
    */

    public Blog getBlog() {
        return (Blog) get("blog");
    }

    public BlogCreatePayload setBlog(Blog arg) {
        optimisticData.put(getKey("blog"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<BlogCreateUserError> getUserErrors() {
        return (List<BlogCreateUserError>) get("userErrors");
    }

    public BlogCreatePayload setUserErrors(List<BlogCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "blog": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

