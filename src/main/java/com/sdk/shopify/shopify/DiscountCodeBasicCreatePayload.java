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
* Return type for `discountCodeBasicCreate` mutation.
*/
public class DiscountCodeBasicCreatePayload extends AbstractResponse<DiscountCodeBasicCreatePayload> {
    public DiscountCodeBasicCreatePayload() {
    }

    public DiscountCodeBasicCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "codeDiscountNode": {
                    DiscountCodeNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeNode(jsonAsObject(field.getValue(), key));
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
        return "DiscountCodeBasicCreatePayload";
    }

    /**
    * The discount code that was created.
    */

    public DiscountCodeNode getCodeDiscountNode() {
        return (DiscountCodeNode) get("codeDiscountNode");
    }

    public DiscountCodeBasicCreatePayload setCodeDiscountNode(DiscountCodeNode arg) {
        optimisticData.put(getKey("codeDiscountNode"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DiscountUserError> getUserErrors() {
        return (List<DiscountUserError>) get("userErrors");
    }

    public DiscountCodeBasicCreatePayload setUserErrors(List<DiscountUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "codeDiscountNode": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

