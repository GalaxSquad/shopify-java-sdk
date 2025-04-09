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
* Return type for `fulfillmentOrderSplit` mutation.
*/
public class FulfillmentOrderSplitPayload extends AbstractResponse<FulfillmentOrderSplitPayload> {
    public FulfillmentOrderSplitPayload() {
    }

    public FulfillmentOrderSplitPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentOrderSplits": {
                    List<FulfillmentOrderSplitResult> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<FulfillmentOrderSplitResult> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new FulfillmentOrderSplitResult(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<FulfillmentOrderSplitUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderSplitUserError(jsonAsObject(element1, key)));
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
        return "FulfillmentOrderSplitPayload";
    }

    /**
    * The result of the fulfillment order splits.
    */

    public List<FulfillmentOrderSplitResult> getFulfillmentOrderSplits() {
        return (List<FulfillmentOrderSplitResult>) get("fulfillmentOrderSplits");
    }

    public FulfillmentOrderSplitPayload setFulfillmentOrderSplits(List<FulfillmentOrderSplitResult> arg) {
        optimisticData.put(getKey("fulfillmentOrderSplits"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<FulfillmentOrderSplitUserError> getUserErrors() {
        return (List<FulfillmentOrderSplitUserError>) get("userErrors");
    }

    public FulfillmentOrderSplitPayload setUserErrors(List<FulfillmentOrderSplitUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentOrderSplits": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

