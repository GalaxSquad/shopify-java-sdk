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
* Return type for `delegateAccessTokenDestroy` mutation.
*/
public class DelegateAccessTokenDestroyPayload extends AbstractResponse<DelegateAccessTokenDestroyPayload> {
    public DelegateAccessTokenDestroyPayload() {
    }

    public DelegateAccessTokenDestroyPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "shop": {
                    responseData.put(key, new Shop(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<DelegateAccessTokenDestroyUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DelegateAccessTokenDestroyUserError(jsonAsObject(element1, key)));
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
        return "DelegateAccessTokenDestroyPayload";
    }

    /**
    * The user's shop.
    */

    public Shop getShop() {
        return (Shop) get("shop");
    }

    public DelegateAccessTokenDestroyPayload setShop(Shop arg) {
        optimisticData.put(getKey("shop"), arg);
        return this;
    }

    /**
    * The status of the delegate access token destroy operation. Returns true if successful.
    */

    public Boolean getStatus() {
        return (Boolean) get("status");
    }

    public DelegateAccessTokenDestroyPayload setStatus(Boolean arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DelegateAccessTokenDestroyUserError> getUserErrors() {
        return (List<DelegateAccessTokenDestroyUserError>) get("userErrors");
    }

    public DelegateAccessTokenDestroyPayload setUserErrors(List<DelegateAccessTokenDestroyUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "shop": return true;

            case "status": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

