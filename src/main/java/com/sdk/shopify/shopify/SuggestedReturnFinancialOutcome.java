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
* Represents a return financial outcome suggested by Shopify based on the items being reimbursed. You
* can then use the suggested outcome object to generate an actual refund or invoice for the return.
*/
public class SuggestedReturnFinancialOutcome extends AbstractResponse<SuggestedReturnFinancialOutcome> {
    public SuggestedReturnFinancialOutcome() {
    }

    public SuggestedReturnFinancialOutcome(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discountedSubtotal": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "financialTransfer": {
                    ReturnOutcomeFinancialTransfer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownReturnOutcomeFinancialTransfer.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "maximumRefundable": {
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

                case "shipping": {
                    responseData.put(key, new ShippingRefund(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalAdditionalFees": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalCartDiscountAmount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalDuties": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalTax": {
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
        return "SuggestedReturnFinancialOutcome";
    }

    /**
    * The sum of all the discounted prices of the line items being refunded.
    */

    public MoneyBag getDiscountedSubtotal() {
        return (MoneyBag) get("discountedSubtotal");
    }

    public SuggestedReturnFinancialOutcome setDiscountedSubtotal(MoneyBag arg) {
        optimisticData.put(getKey("discountedSubtotal"), arg);
        return this;
    }

    /**
    * The financial transfer details for the return outcome.
    */

    public ReturnOutcomeFinancialTransfer getFinancialTransfer() {
        return (ReturnOutcomeFinancialTransfer) get("financialTransfer");
    }

    public SuggestedReturnFinancialOutcome setFinancialTransfer(ReturnOutcomeFinancialTransfer arg) {
        optimisticData.put(getKey("financialTransfer"), arg);
        return this;
    }

    /**
    * The total monetary value available to refund in shop and presentment currencies.
    */

    public MoneyBag getMaximumRefundable() {
        return (MoneyBag) get("maximumRefundable");
    }

    public SuggestedReturnFinancialOutcome setMaximumRefundable(MoneyBag arg) {
        optimisticData.put(getKey("maximumRefundable"), arg);
        return this;
    }

    /**
    * A list of duties to be refunded from the order.
    */

    public List<RefundDuty> getRefundDuties() {
        return (List<RefundDuty>) get("refundDuties");
    }

    public SuggestedReturnFinancialOutcome setRefundDuties(List<RefundDuty> arg) {
        optimisticData.put(getKey("refundDuties"), arg);
        return this;
    }

    /**
    * The shipping costs to be refunded from the order.
    */

    public ShippingRefund getShipping() {
        return (ShippingRefund) get("shipping");
    }

    public SuggestedReturnFinancialOutcome setShipping(ShippingRefund arg) {
        optimisticData.put(getKey("shipping"), arg);
        return this;
    }

    /**
    * The sum of all the additional fees being refunded in shop and presentment currencies. The value must
    * be positive.
    */

    public MoneyBag getTotalAdditionalFees() {
        return (MoneyBag) get("totalAdditionalFees");
    }

    public SuggestedReturnFinancialOutcome setTotalAdditionalFees(MoneyBag arg) {
        optimisticData.put(getKey("totalAdditionalFees"), arg);
        return this;
    }

    /**
    * The total cart discount amount that was applied to all line items in this refund.
    */

    public MoneyBag getTotalCartDiscountAmount() {
        return (MoneyBag) get("totalCartDiscountAmount");
    }

    public SuggestedReturnFinancialOutcome setTotalCartDiscountAmount(MoneyBag arg) {
        optimisticData.put(getKey("totalCartDiscountAmount"), arg);
        return this;
    }

    /**
    * The sum of all the duties being refunded from the order in shop and presentment currencies. The
    * value must be positive.
    */

    public MoneyBag getTotalDuties() {
        return (MoneyBag) get("totalDuties");
    }

    public SuggestedReturnFinancialOutcome setTotalDuties(MoneyBag arg) {
        optimisticData.put(getKey("totalDuties"), arg);
        return this;
    }

    /**
    * The sum of the taxes being refunded in shop and presentment currencies. The value must be positive.
    */

    public MoneyBag getTotalTax() {
        return (MoneyBag) get("totalTax");
    }

    public SuggestedReturnFinancialOutcome setTotalTax(MoneyBag arg) {
        optimisticData.put(getKey("totalTax"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discountedSubtotal": return true;

            case "financialTransfer": return false;

            case "maximumRefundable": return true;

            case "refundDuties": return true;

            case "shipping": return true;

            case "totalAdditionalFees": return true;

            case "totalCartDiscountAmount": return true;

            case "totalDuties": return true;

            case "totalTax": return true;

            default: return false;
        }
    }
}

