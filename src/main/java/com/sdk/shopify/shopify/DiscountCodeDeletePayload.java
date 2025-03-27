// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `discountCodeDelete` mutation.
*/
public class DiscountCodeDeletePayload extends AbstractResponse<DiscountCodeDeletePayload> {
    public DiscountCodeDeletePayload() {
    }

    public DiscountCodeDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedCodeDiscountId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<DiscountUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DiscountUserError(jsonAsObject(element1, key)));
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
        return "DiscountCodeDeletePayload";
    }

    /**
    * The ID of the code discount that was deleted.
    */

    public ID getDeletedCodeDiscountId() {
        return (ID) get("deletedCodeDiscountId");
    }

    public DiscountCodeDeletePayload setDeletedCodeDiscountId(ID arg) {
        optimisticData.put(getKey("deletedCodeDiscountId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DiscountUserError> getUserErrors() {
        return (List<DiscountUserError>) get("userErrors");
    }

    public DiscountCodeDeletePayload setUserErrors(List<DiscountUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedCodeDiscountId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

