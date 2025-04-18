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
* Return type for `sellingPlanGroupCreate` mutation.
*/
public class SellingPlanGroupCreatePayload extends AbstractResponse<SellingPlanGroupCreatePayload> {
    public SellingPlanGroupCreatePayload() {
    }

    public SellingPlanGroupCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "sellingPlanGroup": {
                    SellingPlanGroup optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroup(jsonAsObject(field.getValue(), key));
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
        return "SellingPlanGroupCreatePayload";
    }

    /**
    * The created selling plan group object.
    */

    public SellingPlanGroup getSellingPlanGroup() {
        return (SellingPlanGroup) get("sellingPlanGroup");
    }

    public SellingPlanGroupCreatePayload setSellingPlanGroup(SellingPlanGroup arg) {
        optimisticData.put(getKey("sellingPlanGroup"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SellingPlanGroupUserError> getUserErrors() {
        return (List<SellingPlanGroupUserError>) get("userErrors");
    }

    public SellingPlanGroupCreatePayload setUserErrors(List<SellingPlanGroupUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "sellingPlanGroup": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

