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
* The financial details of a fulfillment order line item.
*/
public class FulfillmentOrderLineItemFinancialSummary extends AbstractResponse<FulfillmentOrderLineItemFinancialSummary> {
    public FulfillmentOrderLineItemFinancialSummary() {
    }

    public FulfillmentOrderLineItemFinancialSummary(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "approximateDiscountedUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountAllocations": {
                    List<FinancialSummaryDiscountAllocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FinancialSummaryDiscountAllocation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "originalUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
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

    public String getGraphQlTypeName() {
        return "FulfillmentOrderLineItemFinancialSummary";
    }

    /**
    * The approximate split price of a line item unit, in shop and presentment currencies. This value
    * doesn't include discounts applied to the entire order.For the full picture of applied discounts, see
    * discountAllocations.
    */

    public MoneyBag getApproximateDiscountedUnitPriceSet() {
        return (MoneyBag) get("approximateDiscountedUnitPriceSet");
    }

    public FulfillmentOrderLineItemFinancialSummary setApproximateDiscountedUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("approximateDiscountedUnitPriceSet"), arg);
        return this;
    }

    /**
    * The discounts that have been allocated onto the line item by discount applications, not including
    * order edits and refunds.
    */

    public List<FinancialSummaryDiscountAllocation> getDiscountAllocations() {
        return (List<FinancialSummaryDiscountAllocation>) get("discountAllocations");
    }

    public FulfillmentOrderLineItemFinancialSummary setDiscountAllocations(List<FinancialSummaryDiscountAllocation> arg) {
        optimisticData.put(getKey("discountAllocations"), arg);
        return this;
    }

    /**
    * The variant unit price without discounts applied, in shop and presentment currencies.
    */

    public MoneyBag getOriginalUnitPriceSet() {
        return (MoneyBag) get("originalUnitPriceSet");
    }

    public FulfillmentOrderLineItemFinancialSummary setOriginalUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalUnitPriceSet"), arg);
        return this;
    }

    /**
    * Number of line items that this financial summary applies to.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public FulfillmentOrderLineItemFinancialSummary setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "approximateDiscountedUnitPriceSet": return true;

            case "discountAllocations": return true;

            case "originalUnitPriceSet": return true;

            case "quantity": return false;

            default: return false;
        }
    }
}

