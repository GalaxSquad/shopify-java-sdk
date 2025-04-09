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
* Return type for `fulfillmentOrderLineItemsPreparedForPickup` mutation.
*/
public class FulfillmentOrderLineItemsPreparedForPickupPayload extends AbstractResponse<FulfillmentOrderLineItemsPreparedForPickupPayload> {
    public FulfillmentOrderLineItemsPreparedForPickupPayload() {
    }

    public FulfillmentOrderLineItemsPreparedForPickupPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "userErrors": {
                    List<FulfillmentOrderLineItemsPreparedForPickupUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderLineItemsPreparedForPickupUserError(jsonAsObject(element1, key)));
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
        return "FulfillmentOrderLineItemsPreparedForPickupPayload";
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<FulfillmentOrderLineItemsPreparedForPickupUserError> getUserErrors() {
        return (List<FulfillmentOrderLineItemsPreparedForPickupUserError>) get("userErrors");
    }

    public FulfillmentOrderLineItemsPreparedForPickupPayload setUserErrors(List<FulfillmentOrderLineItemsPreparedForPickupUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "userErrors": return true;

            default: return false;
        }
    }
}

