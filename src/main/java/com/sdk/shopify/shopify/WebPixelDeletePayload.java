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
* Return type for `webPixelDelete` mutation.
*/
public class WebPixelDeletePayload extends AbstractResponse<WebPixelDeletePayload> {
    public WebPixelDeletePayload() {
    }

    public WebPixelDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedWebPixelId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ErrorsWebPixelUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ErrorsWebPixelUserError(jsonAsObject(element1, key)));
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
        return "WebPixelDeletePayload";
    }

    /**
    * The ID of the web pixel settings that was deleted.
    */

    public ID getDeletedWebPixelId() {
        return (ID) get("deletedWebPixelId");
    }

    public WebPixelDeletePayload setDeletedWebPixelId(ID arg) {
        optimisticData.put(getKey("deletedWebPixelId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ErrorsWebPixelUserError> getUserErrors() {
        return (List<ErrorsWebPixelUserError>) get("userErrors");
    }

    public WebPixelDeletePayload setUserErrors(List<ErrorsWebPixelUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedWebPixelId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

