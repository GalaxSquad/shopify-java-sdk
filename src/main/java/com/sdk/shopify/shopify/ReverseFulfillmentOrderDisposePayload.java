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
* Return type for `reverseFulfillmentOrderDispose` mutation.
*/
public class ReverseFulfillmentOrderDisposePayload extends AbstractResponse<ReverseFulfillmentOrderDisposePayload> {
    public ReverseFulfillmentOrderDisposePayload() {
    }

    public ReverseFulfillmentOrderDisposePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "reverseFulfillmentOrderLineItems": {
                    List<ReverseFulfillmentOrderLineItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReverseFulfillmentOrderLineItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ReverseFulfillmentOrderLineItem(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ReturnUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ReturnUserError(jsonAsObject(element1, key)));
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
        return "ReverseFulfillmentOrderDisposePayload";
    }

    /**
    * The disposed reverse fulfillment order line items.
    */

    public List<ReverseFulfillmentOrderLineItem> getReverseFulfillmentOrderLineItems() {
        return (List<ReverseFulfillmentOrderLineItem>) get("reverseFulfillmentOrderLineItems");
    }

    public ReverseFulfillmentOrderDisposePayload setReverseFulfillmentOrderLineItems(List<ReverseFulfillmentOrderLineItem> arg) {
        optimisticData.put(getKey("reverseFulfillmentOrderLineItems"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ReturnUserError> getUserErrors() {
        return (List<ReturnUserError>) get("userErrors");
    }

    public ReverseFulfillmentOrderDisposePayload setUserErrors(List<ReturnUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "reverseFulfillmentOrderLineItems": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

