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
* The `Refund` object represents a financial record of money returned to a customer from an order.
* It provides a comprehensive view of all refunded amounts, transactions, and restocking instructions
* associated with returning products or correcting order issues.
* The `Refund` object provides information to:
* - Process customer returns and issue payments back to customers
* - Handle partial or full refunds for line items with optional inventory restocking
* - Refund shipping costs, duties, and additional fees
* - Issue store credit refunds as an alternative to original payment method returns
* - Track and reconcile all financial transactions related to refunds
* Each `Refund` object maintains detailed records of what was refunded, how much was refunded,
* which payment transactions were involved, and any inventory restocking that occurred. The refund
* can include multiple components such as product line items, shipping charges, taxes, duties, and
* additional fees, all calculated with proper currency handling for international orders.
* Refunds are always associated with an
* [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
* and can optionally be linked to a
* [return](https://shopify.dev/docs/api/admin-graphql/latest/objects/Return)
* if the refund was initiated through the returns process. The refund tracks both the presentment
* currency
* (what the customer sees) and the shop currency for accurate financial reporting.
* > Note:
* > The existence of a `Refund` object doesn't guarantee that the money has been returned to the
* customer.
* > The actual financial processing happens through associated
* > [`OrderTransaction`](https://shopify.dev/docs/api/admin-graphql/latest/objects/OrderTransaction)
* > objects, which can be in various states, such as pending, processing, success, or failure.
* > To determine if money has actually been refunded, check the
* >
* [status](https://shopify.dev/docs/api/admin-graphql/latest/objects/OrderTransaction#field-OrderTrans
* action.fields.status)
* > of the associated transactions.
* Learn more about
* [managing
* returns](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management
* ),
* [refunding
* duties](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/view-and-refund-duties),
* and
* [processing refunds](https://shopify.dev/docs/api/admin-graphql/latest/mutations/refundCreate).
*/
public class Refund extends AbstractResponse<Refund> implements LegacyInteroperability, Node {
    public Refund() {
    }

    public Refund(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "duties": {
                    List<RefundDuty> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<RefundDuty> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new RefundDuty(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "order": {
                    responseData.put(key, new Order(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "orderAdjustments": {
                    responseData.put(key, new OrderAdjustmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "refundLineItems": {
                    responseData.put(key, new RefundLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "refundShippingLines": {
                    responseData.put(key, new RefundShippingLineConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "return": {
                    Return optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Return(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "staffMember": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalRefundedSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "transactions": {
                    responseData.put(key, new OrderTransactionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public Refund(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Refund";
    }

    /**
    * The date and time when the refund was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Refund setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A list of the refunded duties as part of this refund.
    */

    public List<RefundDuty> getDuties() {
        return (List<RefundDuty>) get("duties");
    }

    public Refund setDuties(List<RefundDuty> arg) {
        optimisticData.put(getKey("duties"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public Refund setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The optional note associated with the refund.
    */

    public String getNote() {
        return (String) get("note");
    }

    public Refund setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The order associated with the refund.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public Refund setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The order adjustments that are attached with the refund.
    */

    public OrderAdjustmentConnection getOrderAdjustments() {
        return (OrderAdjustmentConnection) get("orderAdjustments");
    }

    public Refund setOrderAdjustments(OrderAdjustmentConnection arg) {
        optimisticData.put(getKey("orderAdjustments"), arg);
        return this;
    }

    /**
    * The `RefundLineItem` resources attached to the refund.
    */

    public RefundLineItemConnection getRefundLineItems() {
        return (RefundLineItemConnection) get("refundLineItems");
    }

    public Refund setRefundLineItems(RefundLineItemConnection arg) {
        optimisticData.put(getKey("refundLineItems"), arg);
        return this;
    }

    /**
    * The `RefundShippingLine` resources attached to the refund.
    */

    public RefundShippingLineConnection getRefundShippingLines() {
        return (RefundShippingLineConnection) get("refundShippingLines");
    }

    public Refund setRefundShippingLines(RefundShippingLineConnection arg) {
        optimisticData.put(getKey("refundShippingLines"), arg);
        return this;
    }

    /**
    * The return associated with the refund.
    */

    public Return getReturn() {
        return (Return) get("return");
    }

    public Refund setReturn(Return arg) {
        optimisticData.put(getKey("return"), arg);
        return this;
    }

    /**
    * The staff member who created the refund.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public Refund setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    /**
    * The total amount across all transactions for the refund, in shop and presentment currencies.
    */

    public MoneyBag getTotalRefundedSet() {
        return (MoneyBag) get("totalRefundedSet");
    }

    public Refund setTotalRefundedSet(MoneyBag arg) {
        optimisticData.put(getKey("totalRefundedSet"), arg);
        return this;
    }

    /**
    * The transactions associated with the refund.
    */

    public OrderTransactionConnection getTransactions() {
        return (OrderTransactionConnection) get("transactions");
    }

    public Refund setTransactions(OrderTransactionConnection arg) {
        optimisticData.put(getKey("transactions"), arg);
        return this;
    }

    /**
    * The date and time when the refund was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Refund setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "duties": return true;

            case "id": return false;

            case "legacyResourceId": return false;

            case "note": return false;

            case "order": return true;

            case "orderAdjustments": return true;

            case "refundLineItems": return true;

            case "refundShippingLines": return true;

            case "return": return true;

            case "staffMember": return true;

            case "totalRefundedSet": return true;

            case "transactions": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

