// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The result of splitting a fulfillment order.
*/
public class FulfillmentOrderSplitResult extends AbstractResponse<FulfillmentOrderSplitResult> {
    public FulfillmentOrderSplitResult() {
    }

    public FulfillmentOrderSplitResult(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentOrder": {
                    responseData.put(key, new FulfillmentOrder(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "remainingFulfillmentOrder": {
                    responseData.put(key, new FulfillmentOrder(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "replacementFulfillmentOrder": {
                    FulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrder(jsonAsObject(field.getValue(), key));
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
        return "FulfillmentOrderSplitResult";
    }

    /**
    * The original fulfillment order as a result of the split.
    */

    public FulfillmentOrder getFulfillmentOrder() {
        return (FulfillmentOrder) get("fulfillmentOrder");
    }

    public FulfillmentOrderSplitResult setFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("fulfillmentOrder"), arg);
        return this;
    }

    /**
    * The remaining fulfillment order as a result of the split.
    */

    public FulfillmentOrder getRemainingFulfillmentOrder() {
        return (FulfillmentOrder) get("remainingFulfillmentOrder");
    }

    public FulfillmentOrderSplitResult setRemainingFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("remainingFulfillmentOrder"), arg);
        return this;
    }

    /**
    * The replacement fulfillment order if the original fulfillment order wasn't in a state to be split.
    */

    public FulfillmentOrder getReplacementFulfillmentOrder() {
        return (FulfillmentOrder) get("replacementFulfillmentOrder");
    }

    public FulfillmentOrderSplitResult setReplacementFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("replacementFulfillmentOrder"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentOrder": return true;

            case "remainingFulfillmentOrder": return true;

            case "replacementFulfillmentOrder": return true;

            default: return false;
        }
    }
}

