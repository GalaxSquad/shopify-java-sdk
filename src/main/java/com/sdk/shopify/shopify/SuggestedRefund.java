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
* Represents a refund suggested by Shopify based on the items being reimbursed. You can then use the
* suggested refund object to generate an actual refund.
*/
public class SuggestedRefund extends AbstractResponse<SuggestedRefund> {
    public SuggestedRefund() {
    }

    public SuggestedRefund(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedSubtotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "maximumRefundableSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "refundDuties": {
                    List<RefundDuty> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new RefundDuty(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "refundLineItems": {
                    List<RefundLineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new RefundLineItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "shipping": {
                    responseData.put(key, new ShippingRefund(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subtotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "suggestedTransactions": {
                    List<SuggestedOrderTransaction> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SuggestedOrderTransaction(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "totalCartDiscountAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalDutiesSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalTaxSet": {
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
        return "SuggestedRefund";
    }

    /**
    * The total monetary value to be refunded in shop and presentment currencies.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public SuggestedRefund setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * The sum of all the discounted prices of the line items being refunded.
    */

    public MoneyBag getDiscountedSubtotalSet() {
        return (MoneyBag) get("discountedSubtotalSet");
    }

    public SuggestedRefund setDiscountedSubtotalSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedSubtotalSet"), arg);
        return this;
    }

    /**
    * The total monetary value available to refund in shop and presentment currencies.
    */

    public MoneyBag getMaximumRefundableSet() {
        return (MoneyBag) get("maximumRefundableSet");
    }

    public SuggestedRefund setMaximumRefundableSet(MoneyBag arg) {
        optimisticData.put(getKey("maximumRefundableSet"), arg);
        return this;
    }

    /**
    * A list of duties to be refunded from the order.
    */

    public List<RefundDuty> getRefundDuties() {
        return (List<RefundDuty>) get("refundDuties");
    }

    public SuggestedRefund setRefundDuties(List<RefundDuty> arg) {
        optimisticData.put(getKey("refundDuties"), arg);
        return this;
    }

    /**
    * A list of line items to be refunded, along with restock instructions.
    */

    public List<RefundLineItem> getRefundLineItems() {
        return (List<RefundLineItem>) get("refundLineItems");
    }

    public SuggestedRefund setRefundLineItems(List<RefundLineItem> arg) {
        optimisticData.put(getKey("refundLineItems"), arg);
        return this;
    }

    /**
    * The shipping costs to be refunded from the order.
    */

    public ShippingRefund getShipping() {
        return (ShippingRefund) get("shipping");
    }

    public SuggestedRefund setShipping(ShippingRefund arg) {
        optimisticData.put(getKey("shipping"), arg);
        return this;
    }

    /**
    * The sum of all the prices of the line items being refunded in shop and presentment currencies.
    */

    public MoneyBag getSubtotalSet() {
        return (MoneyBag) get("subtotalSet");
    }

    public SuggestedRefund setSubtotalSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalSet"), arg);
        return this;
    }

    /**
    * A list of suggested order transactions.
    */

    public List<SuggestedOrderTransaction> getSuggestedTransactions() {
        return (List<SuggestedOrderTransaction>) get("suggestedTransactions");
    }

    public SuggestedRefund setSuggestedTransactions(List<SuggestedOrderTransaction> arg) {
        optimisticData.put(getKey("suggestedTransactions"), arg);
        return this;
    }

    /**
    * The total cart discount amount that was applied to all line items in this refund.
    */

    public MoneyBag getTotalCartDiscountAmountSet() {
        return (MoneyBag) get("totalCartDiscountAmountSet");
    }

    public SuggestedRefund setTotalCartDiscountAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("totalCartDiscountAmountSet"), arg);
        return this;
    }

    /**
    * The sum of all the duties being refunded from the order in shop and presentment currencies. The
    * value must be positive.
    */

    public MoneyBag getTotalDutiesSet() {
        return (MoneyBag) get("totalDutiesSet");
    }

    public SuggestedRefund setTotalDutiesSet(MoneyBag arg) {
        optimisticData.put(getKey("totalDutiesSet"), arg);
        return this;
    }

    /**
    * The sum of the taxes being refunded from the order in shop and presentment currencies. The value
    * must be positive.
    */

    public MoneyBag getTotalTaxSet() {
        return (MoneyBag) get("totalTaxSet");
    }

    public SuggestedRefund setTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amountSet": return true;

            case "discountedSubtotalSet": return true;

            case "maximumRefundableSet": return true;

            case "refundDuties": return true;

            case "refundLineItems": return true;

            case "shipping": return true;

            case "subtotalSet": return true;

            case "suggestedTransactions": return true;

            case "totalCartDiscountAmountSet": return true;

            case "totalDutiesSet": return true;

            case "totalTaxSet": return true;

            default: return false;
        }
    }
}

