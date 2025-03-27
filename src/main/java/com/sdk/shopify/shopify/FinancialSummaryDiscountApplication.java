// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Discount applications capture the intentions of a discount source at
* the time of application on an order's line items or shipping lines.
*/
public class FinancialSummaryDiscountApplication extends AbstractResponse<FinancialSummaryDiscountApplication> {
    public FinancialSummaryDiscountApplication() {
    }

    public FinancialSummaryDiscountApplication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allocationMethod": {
                    responseData.put(key, DiscountApplicationAllocationMethod.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "targetSelection": {
                    responseData.put(key, DiscountApplicationTargetSelection.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "targetType": {
                    responseData.put(key, DiscountApplicationTargetType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "FinancialSummaryDiscountApplication";
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */

    public DiscountApplicationAllocationMethod getAllocationMethod() {
        return (DiscountApplicationAllocationMethod) get("allocationMethod");
    }

    public FinancialSummaryDiscountApplication setAllocationMethod(DiscountApplicationAllocationMethod arg) {
        optimisticData.put(getKey("allocationMethod"), arg);
        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */

    public DiscountApplicationTargetSelection getTargetSelection() {
        return (DiscountApplicationTargetSelection) get("targetSelection");
    }

    public FinancialSummaryDiscountApplication setTargetSelection(DiscountApplicationTargetSelection arg) {
        optimisticData.put(getKey("targetSelection"), arg);
        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */

    public DiscountApplicationTargetType getTargetType() {
        return (DiscountApplicationTargetType) get("targetType");
    }

    public FinancialSummaryDiscountApplication setTargetType(DiscountApplicationTargetType arg) {
        optimisticData.put(getKey("targetType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allocationMethod": return false;

            case "targetSelection": return false;

            case "targetType": return false;

            default: return false;
        }
    }
}

