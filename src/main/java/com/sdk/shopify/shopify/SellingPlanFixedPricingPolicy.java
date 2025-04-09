// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the pricing policy of a subscription or deferred purchase option selling plan.
* The selling plan fixed pricing policy works with the billing and delivery policy
* to determine the final price. Discounts are divided among fulfillments.
* For example, a subscription with a $10 discount and two deliveries will have a $5
* discount applied to each delivery.
*/
public class SellingPlanFixedPricingPolicy extends AbstractResponse<SellingPlanFixedPricingPolicy> implements SellingPlanPricingPolicy, SellingPlanPricingPolicyBase {
    public SellingPlanFixedPricingPolicy() {
    }

    public SellingPlanFixedPricingPolicy(JsonObject fields) throws SchemaViolationError {
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
        return "SellingPlanFixedPricingPolicy";
    }

    /**
    * The price adjustment type.
    */

    public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
        return (SellingPlanPricingPolicyAdjustmentType) get("adjustmentType");
    }

    public SellingPlanFixedPricingPolicy setAdjustmentType(SellingPlanPricingPolicyAdjustmentType arg) {
        optimisticData.put(getKey("adjustmentType"), arg);
        return this;
    }

    /**
    * The price adjustment value.
    */

    public SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue() {
        return (SellingPlanPricingPolicyAdjustmentValue) get("adjustmentValue");
    }

    public SellingPlanFixedPricingPolicy setAdjustmentValue(SellingPlanPricingPolicyAdjustmentValue arg) {
        optimisticData.put(getKey("adjustmentValue"), arg);
        return this;
    }

    /**
    * The date and time when the fixed selling plan pricing policy was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SellingPlanFixedPricingPolicy setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustmentType": return false;

            case "adjustmentValue": return false;

            case "createdAt": return false;

            default: return false;
        }
    }
}

