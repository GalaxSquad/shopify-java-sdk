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
* Return type for `commentApprove` mutation.
*/
public class CommentApprovePayload extends AbstractResponse<CommentApprovePayload> {
    public CommentApprovePayload() {
    }

    public CommentApprovePayload(JsonObject fields) throws SchemaViolationError {
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
                    List<CommentApproveUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CommentApproveUserError(jsonAsObject(element1, key)));
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
        return "CommentApprovePayload";
    }

    /**
    * The comment that was approved.
    */

    public Comment getComment() {
        return (Comment) get("comment");
    }

    public CommentApprovePayload setComment(Comment arg) {
        optimisticData.put(getKey("comment"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CommentApproveUserError> getUserErrors() {
        return (List<CommentApproveUserError>) get("userErrors");
    }

    public CommentApprovePayload setUserErrors(List<CommentApproveUserError> arg) {
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

