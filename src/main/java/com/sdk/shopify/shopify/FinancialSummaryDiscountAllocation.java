// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An amount that's allocated to a line item based on an associated discount application.
*/
public class FinancialSummaryDiscountAllocation extends AbstractResponse<FinancialSummaryDiscountAllocation> {
    public FinancialSummaryDiscountAllocation() {
    }

    public FinancialSummaryDiscountAllocation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "approximateAllocatedAmountPerItem": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountApplication": {
                    responseData.put(key, new FinancialSummaryDiscountApplication(jsonAsObject(field.getValue(), key)));

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
        return "FinancialSummaryDiscountAllocation";
    }

    /**
    * The money amount that's allocated per unit on the associated line based on the discount application
    * in shop and presentment currencies. If the allocated amount for the line cannot be evenly divided by
    * the quantity, then this amount will be an approximate amount, avoiding fractional pennies. For
    * example, if the associated line had a quantity of 3 with a discount of 4 cents, then the discount
    * distribution would be [0.01, 0.01, 0.02]. This field returns the highest number of the distribution.
    * In this example, this would be 0.02.
    */

    public MoneyBag getApproximateAllocatedAmountPerItem() {
        return (MoneyBag) get("approximateAllocatedAmountPerItem");
    }

    public FinancialSummaryDiscountAllocation setApproximateAllocatedAmountPerItem(MoneyBag arg) {
        optimisticData.put(getKey("approximateAllocatedAmountPerItem"), arg);
        return this;
    }

    /**
    * The discount application that the allocated amount originated from.
    */

    public FinancialSummaryDiscountApplication getDiscountApplication() {
        return (FinancialSummaryDiscountApplication) get("discountApplication");
    }

    public FinancialSummaryDiscountAllocation setDiscountApplication(FinancialSummaryDiscountApplication arg) {
        optimisticData.put(getKey("discountApplication"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "approximateAllocatedAmountPerItem": return true;

            case "discountApplication": return true;

            default: return false;
        }
    }
}

