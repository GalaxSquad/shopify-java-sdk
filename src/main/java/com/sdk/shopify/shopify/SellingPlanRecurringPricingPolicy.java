// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a recurring selling plan pricing policy. It applies after the fixed pricing policy. By
* using the afterCycle parameter, you can specify the cycle when the recurring pricing policy comes
* into effect. Recurring pricing policies are not available for deferred purchase options.
*/
public class SellingPlanRecurringPricingPolicy extends AbstractResponse<SellingPlanRecurringPricingPolicy> implements SellingPlanPricingPolicy, SellingPlanPricingPolicyBase {
    public SellingPlanRecurringPricingPolicy() {
    }

    public SellingPlanRecurringPricingPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adjustmentType": {
                    responseData.put(key, SellingPlanPricingPolicyAdjustmentType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "adjustmentValue": {
                    responseData.put(key, UnknownSellingPlanPricingPolicyAdjustmentValue.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "afterCycle": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
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

    public String getGraphQlTypeName() {
        return "SellingPlanRecurringPricingPolicy";
    }

    /**
    * The price adjustment type.
    */

    public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
        return (SellingPlanPricingPolicyAdjustmentType) get("adjustmentType");
    }

    public SellingPlanRecurringPricingPolicy setAdjustmentType(SellingPlanPricingPolicyAdjustmentType arg) {
        optimisticData.put(getKey("adjustmentType"), arg);
        return this;
    }

    /**
    * The price adjustment value.
    */

    public SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue() {
        return (SellingPlanPricingPolicyAdjustmentValue) get("adjustmentValue");
    }

    public SellingPlanRecurringPricingPolicy setAdjustmentValue(SellingPlanPricingPolicyAdjustmentValue arg) {
        optimisticData.put(getKey("adjustmentValue"), arg);
        return this;
    }

    /**
    * Cycle after which this pricing policy applies.
    */

    public Integer getAfterCycle() {
        return (Integer) get("afterCycle");
    }

    public SellingPlanRecurringPricingPolicy setAfterCycle(Integer arg) {
        optimisticData.put(getKey("afterCycle"), arg);
        return this;
    }

    /**
    * The date and time when the recurring selling plan pricing policy was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SellingPlanRecurringPricingPolicy setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustmentType": return false;

            case "adjustmentValue": return false;

            case "afterCycle": return false;

            case "createdAt": return false;

            default: return false;
        }
    }
}

