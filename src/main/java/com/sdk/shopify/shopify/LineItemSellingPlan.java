// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the selling plan for a line item.
*/
public class LineItemSellingPlan extends AbstractResponse<LineItemSellingPlan> {
    public LineItemSellingPlan() {
    }

    public LineItemSellingPlan(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "sellingPlanId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "LineItemSellingPlan";
    }

    /**
    * The name of the selling plan for display purposes.
    */

    public String getName() {
        return (String) get("name");
    }

    public LineItemSellingPlan setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The ID of the selling plan associated with the line item.
    */

    public ID getSellingPlanId() {
        return (ID) get("sellingPlanId");
    }

    public LineItemSellingPlan setSellingPlanId(ID arg) {
        optimisticData.put(getKey("sellingPlanId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "sellingPlanId": return false;

            default: return false;
        }
    }
}

