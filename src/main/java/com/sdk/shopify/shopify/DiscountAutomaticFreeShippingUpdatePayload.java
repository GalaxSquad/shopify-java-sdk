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
* Return type for `discountAutomaticFreeShippingUpdate` mutation.
*/
public class DiscountAutomaticFreeShippingUpdatePayload extends AbstractResponse<DiscountAutomaticFreeShippingUpdatePayload> {
    public DiscountAutomaticFreeShippingUpdatePayload() {
    }

    public DiscountAutomaticFreeShippingUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "automaticDiscountNode": {
                    DiscountAutomaticNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticNode(jsonAsObject(field.getValue(), key));
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
        return "DiscountAutomaticFreeShippingUpdatePayload";
    }

    /**
    * The automatic discount that was updated.
    */

    public DiscountAutomaticNode getAutomaticDiscountNode() {
        return (DiscountAutomaticNode) get("automaticDiscountNode");
    }

    public DiscountAutomaticFreeShippingUpdatePayload setAutomaticDiscountNode(DiscountAutomaticNode arg) {
        optimisticData.put(getKey("automaticDiscountNode"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DiscountUserError> getUserErrors() {
        return (List<DiscountUserError>) get("userErrors");
    }

    public DiscountAutomaticFreeShippingUpdatePayload setUserErrors(List<DiscountUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "automaticDiscountNode": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

