// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A group of one or more items in a return that will be processed at a fulfillment service.
* There can be more than one reverse fulfillment order for a return at a given location.
*/
public class ReverseFulfillmentOrder extends AbstractResponse<ReverseFulfillmentOrder> implements Node {
    public ReverseFulfillmentOrder() {
    }

    public ReverseFulfillmentOrder(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItems": {
                    responseData.put(key, new ReverseFulfillmentOrderLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "order": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reverseDeliveries": {
                    responseData.put(key, new ReverseDeliveryConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, ReverseFulfillmentOrderStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "thirdPartyConfirmation": {
                    ReverseFulfillmentOrderThirdPartyConfirmation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseFulfillmentOrderThirdPartyConfirmation(jsonAsObject(field.getValue(), key));
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

    public ReverseFulfillmentOrder(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReverseFulfillmentOrder";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The list of reverse fulfillment order line items for the reverse fulfillment order.
    */

    public ReverseFulfillmentOrderLineItemConnection getLineItems() {
        return (ReverseFulfillmentOrderLineItemConnection) get("lineItems");
    }

    public ReverseFulfillmentOrder setLineItems(ReverseFulfillmentOrderLineItemConnection arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * The order associated with the reverse fulfillment order.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public ReverseFulfillmentOrder setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The list of reverse deliveries for the reverse fulfillment order.
    */

    public ReverseDeliveryConnection getReverseDeliveries() {
        return (ReverseDeliveryConnection) get("reverseDeliveries");
    }

    public ReverseFulfillmentOrder setReverseDeliveries(ReverseDeliveryConnection arg) {
        optimisticData.put(getKey("reverseDeliveries"), arg);
        return this;
    }

    /**
    * The status of the reverse fulfillment order.
    */

    public ReverseFulfillmentOrderStatus getStatus() {
        return (ReverseFulfillmentOrderStatus) get("status");
    }

    public ReverseFulfillmentOrder setStatus(ReverseFulfillmentOrderStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The current confirmation for the reverse fulfillment order from a third-party logistics service. 
    * If no third-party service is involved, then this value is `nil`.
    */

    public ReverseFulfillmentOrderThirdPartyConfirmation getThirdPartyConfirmation() {
        return (ReverseFulfillmentOrderThirdPartyConfirmation) get("thirdPartyConfirmation");
    }

    public ReverseFulfillmentOrder setThirdPartyConfirmation(ReverseFulfillmentOrderThirdPartyConfirmation arg) {
        optimisticData.put(getKey("thirdPartyConfirmation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "lineItems": return true;

            case "order": return true;

            case "reverseDeliveries": return true;

            case "status": return false;

            case "thirdPartyConfirmation": return true;

            default: return false;
        }
    }
}

