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
* Return type for `storefrontAccessTokenCreate` mutation.
*/
public class StorefrontAccessTokenCreatePayload extends AbstractResponse<StorefrontAccessTokenCreatePayload> {
    public StorefrontAccessTokenCreatePayload() {
    }

    public StorefrontAccessTokenCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "shop": {
                    responseData.put(key, new Shop(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "storefrontAccessToken": {
                    StorefrontAccessToken optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StorefrontAccessToken(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "StorefrontAccessTokenCreatePayload";
    }

    /**
    * The user's shop.
    */

    public Shop getShop() {
        return (Shop) get("shop");
    }

    public StorefrontAccessTokenCreatePayload setShop(Shop arg) {
        optimisticData.put(getKey("shop"), arg);
        return this;
    }

    /**
    * The storefront access token.
    */

    public StorefrontAccessToken getStorefrontAccessToken() {
        return (StorefrontAccessToken) get("storefrontAccessToken");
    }

    public StorefrontAccessTokenCreatePayload setStorefrontAccessToken(StorefrontAccessToken arg) {
        optimisticData.put(getKey("storefrontAccessToken"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public StorefrontAccessTokenCreatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "shop": return true;

            case "storefrontAccessToken": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

