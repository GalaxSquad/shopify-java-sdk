// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* A reverse delivery is a post-fulfillment object that represents a buyer sending a package to a
* merchant.
* For example, a buyer requests a return, and a merchant sends the buyer a shipping label.
* The reverse delivery contains the context of the items sent back, how they're being sent back
* (for example, a shipping label), and the current state of the delivery (tracking information).
*/
public class ReverseDelivery extends AbstractResponse<ReverseDelivery> implements Node {
    public ReverseDelivery() {
    }

    public ReverseDelivery(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deliverable": {
                    ReverseDeliveryDeliverable optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownReverseDeliveryDeliverable.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reverseDeliveryLineItems": {
                    responseData.put(key, new ReverseDeliveryLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "reverseFulfillmentOrder": {
                    responseData.put(key, new ReverseFulfillmentOrder(jsonAsObject(field.getValue(), key)));

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

    public ReverseDelivery(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReverseDelivery";
    }

    /**
    * The deliverable associated with the reverse delivery.
    */

    public ReverseDeliveryDeliverable getDeliverable() {
        return (ReverseDeliveryDeliverable) get("deliverable");
    }

    public ReverseDelivery setDeliverable(ReverseDeliveryDeliverable arg) {
        optimisticData.put(getKey("deliverable"), arg);
        return this;
    }

    /**
    * The ID of the reverse delivery.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The reverse delivery line items attached to the reverse delivery.
    */

    public ReverseDeliveryLineItemConnection getReverseDeliveryLineItems() {
        return (ReverseDeliveryLineItemConnection) get("reverseDeliveryLineItems");
    }

    public ReverseDelivery setReverseDeliveryLineItems(ReverseDeliveryLineItemConnection arg) {
        optimisticData.put(getKey("reverseDeliveryLineItems"), arg);
        return this;
    }

    /**
    * The `ReverseFulfillmentOrder` associated with the reverse delivery.
    */

    public ReverseFulfillmentOrder getReverseFulfillmentOrder() {
        return (ReverseFulfillmentOrder) get("reverseFulfillmentOrder");
    }

    public ReverseDelivery setReverseFulfillmentOrder(ReverseFulfillmentOrder arg) {
        optimisticData.put(getKey("reverseFulfillmentOrder"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deliverable": return false;

            case "id": return false;

            case "reverseDeliveryLineItems": return true;

            case "reverseFulfillmentOrder": return true;

            default: return false;
        }
    }
}

