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
* A token that's used to delegate unauthenticated access scopes to clients that need to access
* the unauthenticated [Storefront API](https://shopify.dev/docs/api/storefront).
* An app can have a maximum of 100 active storefront access
* tokens for each shop.
* [Get started with the Storefront
* API](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/getting-started)
* .
*/
public class StorefrontAccessToken extends AbstractResponse<StorefrontAccessToken> implements Node {
    public StorefrontAccessToken() {
    }

    public StorefrontAccessToken(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accessScopes": {
                    List<AccessScope> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AccessScope(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "accessToken": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "updatedAt": {
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

    public StorefrontAccessToken(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "StorefrontAccessToken";
    }

    /**
    * List of permissions associated with the token.
    */

    public List<AccessScope> getAccessScopes() {
        return (List<AccessScope>) get("accessScopes");
    }

    public StorefrontAccessToken setAccessScopes(List<AccessScope> arg) {
        optimisticData.put(getKey("accessScopes"), arg);
        return this;
    }

    /**
    * The issued public access token.
    */

    public String getAccessToken() {
        return (String) get("accessToken");
    }

    public StorefrontAccessToken setAccessToken(String arg) {
        optimisticData.put(getKey("accessToken"), arg);
        return this;
    }

    /**
    * The date and time when the public access token was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public StorefrontAccessToken setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * An arbitrary title for each token determined by the developer, used for reference         purposes.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public StorefrontAccessToken setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The date and time when the storefront access token was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public StorefrontAccessToken setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accessScopes": return true;

            case "accessToken": return false;

            case "createdAt": return false;

            case "id": return false;

            case "title": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

