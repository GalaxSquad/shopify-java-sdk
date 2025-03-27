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
* Return type for `sellingPlanGroupRemoveProductVariants` mutation.
*/
public class SellingPlanGroupRemoveProductVariantsPayload extends AbstractResponse<SellingPlanGroupRemoveProductVariantsPayload> {
    public SellingPlanGroupRemoveProductVariantsPayload() {
    }

    public SellingPlanGroupRemoveProductVariantsPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "removedProductVariantIds": {
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
        return "SellingPlanGroupRemoveProductVariantsPayload";
    }

    /**
    * The removed product variant ids.
    */

    public List<ID> getRemovedProductVariantIds() {
        return (List<ID>) get("removedProductVariantIds");
    }

    public SellingPlanGroupRemoveProductVariantsPayload setRemovedProductVariantIds(List<ID> arg) {
        optimisticData.put(getKey("removedProductVariantIds"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SellingPlanGroupUserError> getUserErrors() {
        return (List<SellingPlanGroupUserError>) get("userErrors");
    }

    public SellingPlanGroupRemoveProductVariantsPayload setUserErrors(List<SellingPlanGroupUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "removedProductVariantIds": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

