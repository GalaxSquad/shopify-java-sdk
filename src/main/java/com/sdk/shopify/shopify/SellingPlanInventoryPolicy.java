// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The selling plan inventory policy.
*/
public class SellingPlanInventoryPolicy extends AbstractResponse<SellingPlanInventoryPolicy> {
    public SellingPlanInventoryPolicy() {
    }

    public SellingPlanInventoryPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "reserve": {
                    responseData.put(key, SellingPlanReserve.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "SellingPlanInventoryPolicy";
    }

    /**
    * When to reserve inventory for the order.
    */

    public SellingPlanReserve getReserve() {
        return (SellingPlanReserve) get("reserve");
    }

    public SellingPlanInventoryPolicy setReserve(SellingPlanReserve arg) {
        optimisticData.put(getKey("reserve"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "reserve": return false;

            default: return false;
        }
    }
}

