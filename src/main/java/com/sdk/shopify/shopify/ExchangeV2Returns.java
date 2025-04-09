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
* Return items associated to the exchange.
*/
public class ExchangeV2Returns extends AbstractResponse<ExchangeV2Returns> {
    public ExchangeV2Returns() {
    }

    public ExchangeV2Returns(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "lineItems": {
                    List<ExchangeV2LineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ExchangeV2LineItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "orderDiscountAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shippingRefundAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subtotalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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

                case "tipRefundAmountSet": {
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

    public String getGraphQlTypeName() {
        return "ExchangeV2Returns";
    }

    /**
    * The list of return items for the exchange.
    */

    public List<ExchangeV2LineItem> getLineItems() {
        return (List<ExchangeV2LineItem>) get("lineItems");
    }

    public ExchangeV2Returns setLineItems(List<ExchangeV2LineItem> arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * The amount of the order-level discount for the items and shipping being returned, which doesn't
    * contain any line item discounts.
    */

    public MoneyBag getOrderDiscountAmountSet() {
        return (MoneyBag) get("orderDiscountAmountSet");
    }

    public ExchangeV2Returns setOrderDiscountAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("orderDiscountAmountSet"), arg);
        return this;
    }

    /**
    * The amount of money to be refunded for shipping.
    */

    public MoneyBag getShippingRefundAmountSet() {
        return (MoneyBag) get("shippingRefundAmountSet");
    }

    public ExchangeV2Returns setShippingRefundAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("shippingRefundAmountSet"), arg);
        return this;
    }

    /**
    * The subtotal of the items being returned.
    */

    public MoneyBag getSubtotalPriceSet() {
        return (MoneyBag) get("subtotalPriceSet");
    }

    public ExchangeV2Returns setSubtotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalPriceSet"), arg);
        return this;
    }

    /**
    * The summary of all taxes of the items being returned.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public ExchangeV2Returns setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * The amount of money to be refunded for tip.
    */

    public MoneyBag getTipRefundAmountSet() {
        return (MoneyBag) get("tipRefundAmountSet");
    }

    public ExchangeV2Returns setTipRefundAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("tipRefundAmountSet"), arg);
        return this;
    }

    /**
    * The total value of the items being returned.
    */

    public MoneyBag getTotalPriceSet() {
        return (MoneyBag) get("totalPriceSet");
    }

    public ExchangeV2Returns setTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalPriceSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "lineItems": return true;

            case "orderDiscountAmountSet": return true;

            case "shippingRefundAmountSet": return true;

            case "subtotalPriceSet": return true;

            case "taxLines": return true;

            case "tipRefundAmountSet": return true;

            case "totalPriceSet": return true;

            default: return false;
        }
    }
}

