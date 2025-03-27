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
* Return type for `delegateAccessTokenCreate` mutation.
*/
public class DelegateAccessTokenCreatePayload extends AbstractResponse<DelegateAccessTokenCreatePayload> {
    public DelegateAccessTokenCreatePayload() {
    }

    public DelegateAccessTokenCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "delegateAccessToken": {
                    DelegateAccessToken optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DelegateAccessToken(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shop": {
                    responseData.put(key, new Shop(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "userErrors": {
                    List<DelegateAccessTokenCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DelegateAccessTokenCreateUserError(jsonAsObject(element1, key)));
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
        return "DelegateAccessTokenCreatePayload";
    }

    /**
    * The delegate access token.
    */

    public DelegateAccessToken getDelegateAccessToken() {
        return (DelegateAccessToken) get("delegateAccessToken");
    }

    public DelegateAccessTokenCreatePayload setDelegateAccessToken(DelegateAccessToken arg) {
        optimisticData.put(getKey("delegateAccessToken"), arg);
        return this;
    }

    /**
    * The user's shop.
    */

    public Shop getShop() {
        return (Shop) get("shop");
    }

    public DelegateAccessTokenCreatePayload setShop(Shop arg) {
        optimisticData.put(getKey("shop"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DelegateAccessTokenCreateUserError> getUserErrors() {
        return (List<DelegateAccessTokenCreateUserError>) get("userErrors");
    }

    public DelegateAccessTokenCreatePayload setUserErrors(List<DelegateAccessTokenCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "delegateAccessToken": return true;

            case "shop": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

