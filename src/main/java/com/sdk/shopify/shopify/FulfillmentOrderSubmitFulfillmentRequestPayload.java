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
* Return type for `fulfillmentOrderSubmitFulfillmentRequest` mutation.
*/
public class FulfillmentOrderSubmitFulfillmentRequestPayload extends AbstractResponse<FulfillmentOrderSubmitFulfillmentRequestPayload> {
    public FulfillmentOrderSubmitFulfillmentRequestPayload() {
    }

    public FulfillmentOrderSubmitFulfillmentRequestPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "originalFulfillmentOrder": {
                    FulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "submittedFulfillmentOrder": {
                    FulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unsubmittedFulfillmentOrder": {
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
        return "FulfillmentOrderSubmitFulfillmentRequestPayload";
    }

    /**
    * The original fulfillment order intended to request fulfillment for.
    */

    public FulfillmentOrder getOriginalFulfillmentOrder() {
        return (FulfillmentOrder) get("originalFulfillmentOrder");
    }

    public FulfillmentOrderSubmitFulfillmentRequestPayload setOriginalFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("originalFulfillmentOrder"), arg);
        return this;
    }

    /**
    * The fulfillment order that was submitted to the fulfillment service. This will be the same as
    * the original fulfillment order field. The exception to this is partial fulfillment requests or
    * fulfillment request for cancelled or incomplete fulfillment orders.
    */

    public FulfillmentOrder getSubmittedFulfillmentOrder() {
        return (FulfillmentOrder) get("submittedFulfillmentOrder");
    }

    public FulfillmentOrderSubmitFulfillmentRequestPayload setSubmittedFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("submittedFulfillmentOrder"), arg);
        return this;
    }

    /**
    * This field will only be present for partial fulfillment requests. This will represent the new
    * fulfillment order with the remaining line items not submitted to the fulfillment service.
    */

    public FulfillmentOrder getUnsubmittedFulfillmentOrder() {
        return (FulfillmentOrder) get("unsubmittedFulfillmentOrder");
    }

    public FulfillmentOrderSubmitFulfillmentRequestPayload setUnsubmittedFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("unsubmittedFulfillmentOrder"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public FulfillmentOrderSubmitFulfillmentRequestPayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "originalFulfillmentOrder": return true;

            case "submittedFulfillmentOrder": return true;

            case "unsubmittedFulfillmentOrder": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

