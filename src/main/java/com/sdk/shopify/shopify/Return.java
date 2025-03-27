// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents a return.
*/
public class Return extends AbstractResponse<Return> implements Node {
    public Return() {
    }

    public Return(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "decline": {
                    ReturnDecline optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnDecline(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "exchangeLineItems": {
                    responseData.put(key, new ExchangeLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "order": {
                    responseData.put(key, new Order(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "refunds": {
                    responseData.put(key, new RefundConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "returnLineItems": {
                    responseData.put(key, new ReturnLineItemTypeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "returnShippingFees": {
                    List<ReturnShippingFee> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ReturnShippingFee(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "reverseFulfillmentOrders": {
                    responseData.put(key, new ReverseFulfillmentOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, ReturnStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "suggestedRefund": {
                    SuggestedReturnRefund optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SuggestedReturnRefund(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

    public Return(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Return";
    }

    /**
    * Additional information about the declined return.
    */

    public ReturnDecline getDecline() {
        return (ReturnDecline) get("decline");
    }

    public Return setDecline(ReturnDecline arg) {
        optimisticData.put(getKey("decline"), arg);
        return this;
    }

    /**
    * The exchange line items attached to the return.
    */

    public ExchangeLineItemConnection getExchangeLineItems() {
        return (ExchangeLineItemConnection) get("exchangeLineItems");
    }

    public Return setExchangeLineItems(ExchangeLineItemConnection arg) {
        optimisticData.put(getKey("exchangeLineItems"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the return.
    */

    public String getName() {
        return (String) get("name");
    }

    public Return setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The order that the return belongs to.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public Return setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The list of refunds associated with the return.
    */

    public RefundConnection getRefunds() {
        return (RefundConnection) get("refunds");
    }

    public Return setRefunds(RefundConnection arg) {
        optimisticData.put(getKey("refunds"), arg);
        return this;
    }

    /**
    * The return line items attached to the return.
    */

    public ReturnLineItemTypeConnection getReturnLineItems() {
        return (ReturnLineItemTypeConnection) get("returnLineItems");
    }

    public Return setReturnLineItems(ReturnLineItemTypeConnection arg) {
        optimisticData.put(getKey("returnLineItems"), arg);
        return this;
    }

    /**
    * The return shipping fees for the return.
    */

    public List<ReturnShippingFee> getReturnShippingFees() {
        return (List<ReturnShippingFee>) get("returnShippingFees");
    }

    public Return setReturnShippingFees(List<ReturnShippingFee> arg) {
        optimisticData.put(getKey("returnShippingFees"), arg);
        return this;
    }

    /**
    * The list of reverse fulfillment orders for the return.
    */

    public ReverseFulfillmentOrderConnection getReverseFulfillmentOrders() {
        return (ReverseFulfillmentOrderConnection) get("reverseFulfillmentOrders");
    }

    public Return setReverseFulfillmentOrders(ReverseFulfillmentOrderConnection arg) {
        optimisticData.put(getKey("reverseFulfillmentOrders"), arg);
        return this;
    }

    /**
    * The status of the return.
    */

    public ReturnStatus getStatus() {
        return (ReturnStatus) get("status");
    }

    public Return setStatus(ReturnStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * A suggested refund for the return.
    */

    public SuggestedReturnRefund getSuggestedRefund() {
        return (SuggestedReturnRefund) get("suggestedRefund");
    }

    public Return setSuggestedRefund(SuggestedReturnRefund arg) {
        optimisticData.put(getKey("suggestedRefund"), arg);
        return this;
    }

    /**
    * The sum of all return line item quantities for the return.
    */

    public Integer getTotalQuantity() {
        return (Integer) get("totalQuantity");
    }

    public Return setTotalQuantity(Integer arg) {
        optimisticData.put(getKey("totalQuantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "decline": return true;

            case "exchangeLineItems": return true;

            case "id": return false;

            case "name": return false;

            case "order": return true;

            case "refunds": return true;

            case "returnLineItems": return true;

            case "returnShippingFees": return true;

            case "reverseFulfillmentOrders": return true;

            case "status": return false;

            case "suggestedRefund": return true;

            case "totalQuantity": return false;

            default: return false;
        }
    }
}

