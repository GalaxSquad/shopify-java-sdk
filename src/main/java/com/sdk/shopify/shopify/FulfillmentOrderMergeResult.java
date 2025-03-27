// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The result of merging a set of fulfillment orders.
*/
public class FulfillmentOrderMergeResult extends AbstractResponse<FulfillmentOrderMergeResult> {
    public FulfillmentOrderMergeResult() {
    }

    public FulfillmentOrderMergeResult(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentOrder": {
                    responseData.put(key, new FulfillmentOrder(jsonAsObject(field.getValue(), key)));

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
        return "FulfillmentOrderMergeResult";
    }

    /**
    * The new fulfillment order as a result of the merge.
    */

    public FulfillmentOrder getFulfillmentOrder() {
        return (FulfillmentOrder) get("fulfillmentOrder");
    }

    public FulfillmentOrderMergeResult setFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("fulfillmentOrder"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentOrder": return true;

            default: return false;
        }
    }
}

