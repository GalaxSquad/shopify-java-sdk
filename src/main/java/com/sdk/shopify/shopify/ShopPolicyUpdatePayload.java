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
* Return type for `shopPolicyUpdate` mutation.
*/
public class ShopPolicyUpdatePayload extends AbstractResponse<ShopPolicyUpdatePayload> {
    public ShopPolicyUpdatePayload() {
    }

    public ShopPolicyUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "shopPolicy": {
                    ShopPolicy optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopPolicy(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ShopPolicyUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopPolicyUserError(jsonAsObject(element1, key)));
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
        return "ShopPolicyUpdatePayload";
    }

    /**
    * The shop policy that has been updated.
    */

    public ShopPolicy getShopPolicy() {
        return (ShopPolicy) get("shopPolicy");
    }

    public ShopPolicyUpdatePayload setShopPolicy(ShopPolicy arg) {
        optimisticData.put(getKey("shopPolicy"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ShopPolicyUserError> getUserErrors() {
        return (List<ShopPolicyUserError>) get("userErrors");
    }

    public ShopPolicyUpdatePayload setUserErrors(List<ShopPolicyUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "shopPolicy": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

