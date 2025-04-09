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
* Return type for `fulfillmentOrderHold` mutation.
*/
public class FulfillmentOrderHoldPayload extends AbstractResponse<FulfillmentOrderHoldPayload> {
    public FulfillmentOrderHoldPayload() {
    }

    public FulfillmentOrderHoldPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentHold": {
                    FulfillmentHold optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentHold(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrder": {
                    FulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "remainingFulfillmentOrder": {
                    FulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<FulfillmentOrderHoldUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderHoldUserError(jsonAsObject(element1, key)));
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
        return "FulfillmentOrderHoldPayload";
    }

    /**
    * The fulfillment hold created for the fulfillment order. Null if no hold was created.
    */

    public FulfillmentHold getFulfillmentHold() {
        return (FulfillmentHold) get("fulfillmentHold");
    }

    public FulfillmentOrderHoldPayload setFulfillmentHold(FulfillmentHold arg) {
        optimisticData.put(getKey("fulfillmentHold"), arg);
        return this;
    }

    /**
    * The fulfillment order on which a fulfillment hold was applied.
    */

    public FulfillmentOrder getFulfillmentOrder() {
        return (FulfillmentOrder) get("fulfillmentOrder");
    }

    public FulfillmentOrderHoldPayload setFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("fulfillmentOrder"), arg);
        return this;
    }

    /**
    * The remaining fulfillment order containing the line items to which the hold wasn't applied,
    * if specific line items were specified to be placed on hold.
    */

    public FulfillmentOrder getRemainingFulfillmentOrder() {
        return (FulfillmentOrder) get("remainingFulfillmentOrder");
    }

    public FulfillmentOrderHoldPayload setRemainingFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("remainingFulfillmentOrder"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<FulfillmentOrderHoldUserError> getUserErrors() {
        return (List<FulfillmentOrderHoldUserError>) get("userErrors");
    }

    public FulfillmentOrderHoldPayload setUserErrors(List<FulfillmentOrderHoldUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentHold": return true;

            case "fulfillmentOrder": return true;

            case "remainingFulfillmentOrder": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

