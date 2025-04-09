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
* Return type for `fulfillmentOrderMove` mutation.
*/
public class FulfillmentOrderMovePayload extends AbstractResponse<FulfillmentOrderMovePayload> {
    public FulfillmentOrderMovePayload() {
    }

    public FulfillmentOrderMovePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "movedFulfillmentOrder": {
                    FulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalFulfillmentOrder": {
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
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "FulfillmentOrderMovePayload";
    }

    /**
    * The fulfillment order which now contains the moved line items and is assigned to the destination
    * location.
    * If the original fulfillment order doesn't have any line items which are fully or partially
    * fulfilled, the original fulfillment order will be moved to the new location.
    * However if this isn't the case, the moved fulfillment order will differ from the original one.
    */

    public FulfillmentOrder getMovedFulfillmentOrder() {
        return (FulfillmentOrder) get("movedFulfillmentOrder");
    }

    public FulfillmentOrderMovePayload setMovedFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("movedFulfillmentOrder"), arg);
        return this;
    }

    /**
    * The final state of the original fulfillment order.
    * As a result of the move operation, the original fulfillment order might be moved to the new location
    * or remain in the original location. The original fulfillment order might have the same status or be
    * closed.
    */

    public FulfillmentOrder getOriginalFulfillmentOrder() {
        return (FulfillmentOrder) get("originalFulfillmentOrder");
    }

    public FulfillmentOrderMovePayload setOriginalFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("originalFulfillmentOrder"), arg);
        return this;
    }

    /**
    * This field is deprecated.
    */

    public FulfillmentOrder getRemainingFulfillmentOrder() {
        return (FulfillmentOrder) get("remainingFulfillmentOrder");
    }

    public FulfillmentOrderMovePayload setRemainingFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("remainingFulfillmentOrder"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public FulfillmentOrderMovePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "movedFulfillmentOrder": return true;

            case "originalFulfillmentOrder": return true;

            case "remainingFulfillmentOrder": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

