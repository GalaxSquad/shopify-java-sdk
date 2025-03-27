// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `commentNotSpam` mutation.
*/
public class CommentNotSpamPayload extends AbstractResponse<CommentNotSpamPayload> {
    public CommentNotSpamPayload() {
    }

    public CommentNotSpamPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "comment": {
                    Comment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Comment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CommentNotSpamUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CommentNotSpamUserError(jsonAsObject(element1, key)));
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
        return "CommentNotSpamPayload";
    }

    /**
    * The comment that was marked as not spam.
    */

    public Comment getComment() {
        return (Comment) get("comment");
    }

    public CommentNotSpamPayload setComment(Comment arg) {
        optimisticData.put(getKey("comment"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CommentNotSpamUserError> getUserErrors() {
        return (List<CommentNotSpamUserError>) get("userErrors");
    }

    public CommentNotSpamPayload setUserErrors(List<CommentNotSpamUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "comment": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

