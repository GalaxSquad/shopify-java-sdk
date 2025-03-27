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
* Return type for `sellingPlanGroupRemoveProducts` mutation.
*/
public class SellingPlanGroupRemoveProductsPayload extends AbstractResponse<SellingPlanGroupRemoveProductsPayload> {
    public SellingPlanGroupRemoveProductsPayload() {
    }

    public SellingPlanGroupRemoveProductsPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "removedProductIds": {
                    List<ID> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ID> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ID(jsonAsString(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<SellingPlanGroupUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SellingPlanGroupUserError(jsonAsObject(element1, key)));
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
        return "SellingPlanGroupRemoveProductsPayload";
    }

    /**
    * The removed product ids.
    */

    public List<ID> getRemovedProductIds() {
        return (List<ID>) get("removedProductIds");
    }

    public SellingPlanGroupRemoveProductsPayload setRemovedProductIds(List<ID> arg) {
        optimisticData.put(getKey("removedProductIds"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SellingPlanGroupUserError> getUserErrors() {
        return (List<SellingPlanGroupUserError>) get("userErrors");
    }

    public SellingPlanGroupRemoveProductsPayload setUserErrors(List<SellingPlanGroupUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "removedProductIds": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

