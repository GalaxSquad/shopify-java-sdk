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
* Return type for `publishablePublish` mutation.
*/
public class PublishablePublishPayload extends AbstractResponse<PublishablePublishPayload> {
    public PublishablePublishPayload() {
    }

    public PublishablePublishPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "publishable": {
                    Publishable optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownPublishable.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shop": {
                    responseData.put(key, new Shop(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "PublishablePublishPayload";
    }

    /**
    * Resource that has been published.
    */

    public Publishable getPublishable() {
        return (Publishable) get("publishable");
    }

    public PublishablePublishPayload setPublishable(Publishable arg) {
        optimisticData.put(getKey("publishable"), arg);
        return this;
    }

    /**
    * The user's shop.
    */

    public Shop getShop() {
        return (Shop) get("shop");
    }

    public PublishablePublishPayload setShop(Shop arg) {
        optimisticData.put(getKey("shop"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public PublishablePublishPayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "publishable": return false;

            case "shop": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

