// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A returnable fulfillment, which is an order that has been delivered
* and is eligible to be returned to the merchant.
*/
public class ReturnableFulfillment extends AbstractResponse<ReturnableFulfillment> implements Node {
    public ReturnableFulfillment() {
    }

    public ReturnableFulfillment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillment": {
                    responseData.put(key, new Fulfillment(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "returnableFulfillmentLineItems": {
                    responseData.put(key, new ReturnableFulfillmentLineItemConnection(jsonAsObject(field.getValue(), key)));

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

    public ReturnableFulfillment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReturnableFulfillment";
    }

    /**
    * The fulfillment that the returnable fulfillment refers to.
    */

    public Fulfillment getFulfillment() {
        return (Fulfillment) get("fulfillment");
    }

    public ReturnableFulfillment setFulfillment(Fulfillment arg) {
        optimisticData.put(getKey("fulfillment"), arg);
        return this;
    }

    /**
    * The unique ID of the Returnable Fulfillment.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The list of returnable fulfillment line items.
    */

    public ReturnableFulfillmentLineItemConnection getReturnableFulfillmentLineItems() {
        return (ReturnableFulfillmentLineItemConnection) get("returnableFulfillmentLineItems");
    }

    public ReturnableFulfillment setReturnableFulfillmentLineItems(ReturnableFulfillmentLineItemConnection arg) {
        optimisticData.put(getKey("returnableFulfillmentLineItems"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillment": return true;

            case "id": return false;

            case "returnableFulfillmentLineItems": return true;

            default: return false;
        }
    }
}

