// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The author of a comment.
*/
public class CommentAuthor extends AbstractResponse<CommentAuthor> {
    public CommentAuthor() {
    }

    public CommentAuthor(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "email": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
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
        return "CommentAuthor";
    }

    /**
    * The author's email.
    */

    public String getEmail() {
        return (String) get("email");
    }

    public CommentAuthor setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * The author’s name.
    */

    public String getName() {
        return (String) get("name");
    }

    public CommentAuthor setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "email": return false;

            case "name": return false;

            default: return false;
        }
    }
}

