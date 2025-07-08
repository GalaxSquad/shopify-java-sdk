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
* The `Return` object represents the intent of a buyer to ship one or more items from an order back to
* a merchant
* or a third-party fulfillment location. A return is associated with an
* [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
* and can include multiple return [line
* items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem).
* Each return has a
* [status](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps#return-statuses),
* which indicates the state of the return.
* Use the `Return` object to capture the financial, logistical,
* and business intent of a return. For example, you can identify eligible items for a return and issue
* customers
* a refund for returned items on behalf of the merchant.
* Learn more about providing a
* [return management
* workflow](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-managemen
* t)
* for merchants. You can also manage
* [exchanges](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-exchanges),
* [reverse fulfillment
* orders](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-fulfillme
* nt-orders),
* and [reverse
* deliveries](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-deliv
* eries)
* on behalf of merchants.
*/
public class Return extends AbstractResponse<Return> implements Node {
    public Return() {
    }

    public Return(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "closedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

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

                case "requestApprovedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "suggestedFinancialOutcome": {
                    SuggestedReturnFinancialOutcome optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SuggestedReturnFinancialOutcome(jsonAsObject(field.getValue(), key));
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
    * The date and time when the return was closed.
    */

    public String getClosedAt() {
        return (String) get("closedAt");
    }

    public Return setClosedAt(String arg) {
        optimisticData.put(getKey("closedAt"), arg);
        return this;
    }

    /**
    * The date and time when the return was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Return setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
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
    * The date and time when the return was approved.
    */

    public String getRequestApprovedAt() {
        return (String) get("requestApprovedAt");
    }

    public Return setRequestApprovedAt(String arg) {
        optimisticData.put(getKey("requestApprovedAt"), arg);
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
    * A suggested financial outcome for the return.
    */

    public SuggestedReturnFinancialOutcome getSuggestedFinancialOutcome() {
        return (SuggestedReturnFinancialOutcome) get("suggestedFinancialOutcome");
    }

    public Return setSuggestedFinancialOutcome(SuggestedReturnFinancialOutcome arg) {
        optimisticData.put(getKey("suggestedFinancialOutcome"), arg);
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
            case "closedAt": return false;

            case "createdAt": return false;

            case "decline": return true;

            case "exchangeLineItems": return true;

            case "id": return false;

            case "name": return false;

            case "order": return true;

            case "refunds": return true;

            case "requestApprovedAt": return false;

            case "returnLineItems": return true;

            case "returnShippingFees": return true;

            case "reverseFulfillmentOrders": return true;

            case "status": return false;

            case "suggestedFinancialOutcome": return true;

            case "totalQuantity": return false;

            default: return false;
        }
    }
}

