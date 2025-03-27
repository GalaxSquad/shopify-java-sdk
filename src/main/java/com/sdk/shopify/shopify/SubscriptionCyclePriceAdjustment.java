// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a Subscription Line Pricing Cycle Adjustment.
*/
public class SubscriptionCyclePriceAdjustment extends AbstractResponse<SubscriptionCyclePriceAdjustment> {
    public SubscriptionCyclePriceAdjustment() {
    }

    public SubscriptionCyclePriceAdjustment(JsonObject fields) throws SchemaViolationError {
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
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "computedPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionCyclePriceAdjustment";
    }

    /**
    * Price adjustment type.
    */

    public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
        return (SellingPlanPricingPolicyAdjustmentType) get("adjustmentType");
    }

    public SubscriptionCyclePriceAdjustment setAdjustmentType(SellingPlanPricingPolicyAdjustmentType arg) {
        optimisticData.put(getKey("adjustmentType"), arg);
        return this;
    }

    /**
    * Price adjustment value.
    */

    public SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue() {
        return (SellingPlanPricingPolicyAdjustmentValue) get("adjustmentValue");
    }

    public SubscriptionCyclePriceAdjustment setAdjustmentValue(SellingPlanPricingPolicyAdjustmentValue arg) {
        optimisticData.put(getKey("adjustmentValue"), arg);
        return this;
    }

    /**
    * The number of cycles required before this pricing policy applies.
    */

    public Integer getAfterCycle() {
        return (Integer) get("afterCycle");
    }

    public SubscriptionCyclePriceAdjustment setAfterCycle(Integer arg) {
        optimisticData.put(getKey("afterCycle"), arg);
        return this;
    }

    /**
    * The computed price after the adjustments applied.
    */

    public MoneyV2 getComputedPrice() {
        return (MoneyV2) get("computedPrice");
    }

    public SubscriptionCyclePriceAdjustment setComputedPrice(MoneyV2 arg) {
        optimisticData.put(getKey("computedPrice"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustmentType": return false;

            case "adjustmentValue": return false;

            case "afterCycle": return false;

            case "computedPrice": return true;

            default: return false;
        }
    }
}

