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
* Return type for `fulfillmentOrderReschedule` mutation.
*/
public class FulfillmentOrderReschedulePayload extends AbstractResponse<FulfillmentOrderReschedulePayload> {
    public FulfillmentOrderReschedulePayload() {
    }

    public FulfillmentOrderReschedulePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentOrder": {
                    FulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<FulfillmentOrderRescheduleUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderRescheduleUserError(jsonAsObject(element1, key)));
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
        return "FulfillmentOrderReschedulePayload";
    }

    /**
    * A fulfillment order with the rescheduled line items.
    * Fulfillment orders may be merged if they have the same `fulfillAt` datetime.
    * If the fulfillment order is merged then the resulting fulfillment order will be returned.
    * Otherwise the original fulfillment order will be returned with an updated `fulfillAt` datetime.
    */

    public FulfillmentOrder getFulfillmentOrder() {
        return (FulfillmentOrder) get("fulfillmentOrder");
    }

    public FulfillmentOrderReschedulePayload setFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("fulfillmentOrder"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<FulfillmentOrderRescheduleUserError> getUserErrors() {
        return (List<FulfillmentOrderRescheduleUserError>) get("userErrors");
    }

    public FulfillmentOrderReschedulePayload setUserErrors(List<FulfillmentOrderRescheduleUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentOrder": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

