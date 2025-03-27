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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* An order with edits applied but not saved.
*/
public class CalculatedOrder extends AbstractResponse<CalculatedOrder> implements Node {
    public CalculatedOrder() {
    }

    public CalculatedOrder(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addedDiscountApplications": {
                    responseData.put(key, new CalculatedDiscountApplicationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "addedLineItems": {
                    responseData.put(key, new CalculatedLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "cartDiscountAmountSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItems": {
                    responseData.put(key, new CalculatedLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "notificationPreviewHtml": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "notificationPreviewTitle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "originalOrder": {
                    responseData.put(key, new Order(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shippingLines": {
                    List<CalculatedShippingLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CalculatedShippingLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "stagedChanges": {
                    responseData.put(key, new OrderStagedChangeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subtotalLineItemsQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "subtotalPriceSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxLines": {
                    List<TaxLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TaxLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "totalOutstandingSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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

    public CalculatedOrder(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CalculatedOrder";
    }

    /**
    * Returns only the new discount applications being added to the order in the current edit.
    */

    public CalculatedDiscountApplicationConnection getAddedDiscountApplications() {
        return (CalculatedDiscountApplicationConnection) get("addedDiscountApplications");
    }

    public CalculatedOrder setAddedDiscountApplications(CalculatedDiscountApplicationConnection arg) {
        optimisticData.put(getKey("addedDiscountApplications"), arg);
        return this;
    }

    /**
    * Returns only the new line items being added to the order during the current edit.
    */

    public CalculatedLineItemConnection getAddedLineItems() {
        return (CalculatedLineItemConnection) get("addedLineItems");
    }

    public CalculatedOrder setAddedLineItems(CalculatedLineItemConnection arg) {
        optimisticData.put(getKey("addedLineItems"), arg);
        return this;
    }

    /**
    * Amount of the order-level discount (doesn't contain any line item discounts) in shop and presentment
    * currencies.
    */

    public MoneyBag getCartDiscountAmountSet() {
        return (MoneyBag) get("cartDiscountAmountSet");
    }

    public CalculatedOrder setCartDiscountAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("cartDiscountAmountSet"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Returns all items on the order that existed before starting the edit.
    * Will include any changes that have been made.
    * Will not include line items added during the current edit.
    */

    public CalculatedLineItemConnection getLineItems() {
        return (CalculatedLineItemConnection) get("lineItems");
    }

    public CalculatedOrder setLineItems(CalculatedLineItemConnection arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * The HTML of the customer notification for the order edit.
    */

    public String getNotificationPreviewHtml() {
        return (String) get("notificationPreviewHtml");
    }

    public CalculatedOrder setNotificationPreviewHtml(String arg) {
        optimisticData.put(getKey("notificationPreviewHtml"), arg);
        return this;
    }

    /**
    * The customer notification title.
    */

    public String getNotificationPreviewTitle() {
        return (String) get("notificationPreviewTitle");
    }

    public CalculatedOrder setNotificationPreviewTitle(String arg) {
        optimisticData.put(getKey("notificationPreviewTitle"), arg);
        return this;
    }

    /**
    * The order without any changes applied.
    */

    public Order getOriginalOrder() {
        return (Order) get("originalOrder");
    }

    public CalculatedOrder setOriginalOrder(Order arg) {
        optimisticData.put(getKey("originalOrder"), arg);
        return this;
    }

    /**
    * Returns the shipping lines on the order that existed before starting the edit.
    * Will include any changes that have been made as well as shipping lines added during the current
    * edit.
    * Returns only the first 250 shipping lines.
    */

    public List<CalculatedShippingLine> getShippingLines() {
        return (List<CalculatedShippingLine>) get("shippingLines");
    }

    public CalculatedOrder setShippingLines(List<CalculatedShippingLine> arg) {
        optimisticData.put(getKey("shippingLines"), arg);
        return this;
    }

    /**
    * List of changes made to the order during the current edit.
    */

    public OrderStagedChangeConnection getStagedChanges() {
        return (OrderStagedChangeConnection) get("stagedChanges");
    }

    public CalculatedOrder setStagedChanges(OrderStagedChangeConnection arg) {
        optimisticData.put(getKey("stagedChanges"), arg);
        return this;
    }

    /**
    * The sum of the quantities for the line items that contribute to the order's subtotal.
    */

    public Integer getSubtotalLineItemsQuantity() {
        return (Integer) get("subtotalLineItemsQuantity");
    }

    public CalculatedOrder setSubtotalLineItemsQuantity(Integer arg) {
        optimisticData.put(getKey("subtotalLineItemsQuantity"), arg);
        return this;
    }

    /**
    * The subtotal of the line items, in shop and presentment currencies, after all the discounts are
    * applied.  The subtotal doesn't include shipping.  The subtotal includes taxes for taxes-included
    * orders and excludes taxes for taxes-excluded orders.
    */

    public MoneyBag getSubtotalPriceSet() {
        return (MoneyBag) get("subtotalPriceSet");
    }

    public CalculatedOrder setSubtotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalPriceSet"), arg);
        return this;
    }

    /**
    * Taxes charged for the line item.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public CalculatedOrder setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Total price of the order less the total amount received from the customer in shop and presentment
    * currencies.
    */

    public MoneyBag getTotalOutstandingSet() {
        return (MoneyBag) get("totalOutstandingSet");
    }

    public CalculatedOrder setTotalOutstandingSet(MoneyBag arg) {
        optimisticData.put(getKey("totalOutstandingSet"), arg);
        return this;
    }

    /**
    * Total amount of the order (includes taxes and discounts) in shop and presentment currencies.
    */

    public MoneyBag getTotalPriceSet() {
        return (MoneyBag) get("totalPriceSet");
    }

    public CalculatedOrder setTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalPriceSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addedDiscountApplications": return true;

            case "addedLineItems": return true;

            case "cartDiscountAmountSet": return true;

            case "id": return false;

            case "lineItems": return true;

            case "notificationPreviewHtml": return false;

            case "notificationPreviewTitle": return false;

            case "originalOrder": return true;

            case "shippingLines": return true;

            case "stagedChanges": return true;

            case "subtotalLineItemsQuantity": return false;

            case "subtotalPriceSet": return true;

            case "taxLines": return true;

            case "totalOutstandingSet": return true;

            case "totalPriceSet": return true;

            default: return false;
        }
    }
}

