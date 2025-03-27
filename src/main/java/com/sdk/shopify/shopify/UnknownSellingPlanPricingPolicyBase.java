// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents selling plan pricing policy common fields.
*/
public class UnknownSellingPlanPricingPolicyBase extends AbstractResponse<UnknownSellingPlanPricingPolicyBase> implements SellingPlanPricingPolicyBase {
    public UnknownSellingPlanPricingPolicyBase() {
    }

    public UnknownSellingPlanPricingPolicyBase(JsonObject fields) throws SchemaViolationError {
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

    public static SellingPlanPricingPolicyBase create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SellingPlanFixedPricingPolicy": {
                return new SellingPlanFixedPricingPolicy(fields);
            }

            case "SellingPlanRecurringPricingPolicy": {
                return new SellingPlanRecurringPricingPolicy(fields);
            }

            default: {
                return new UnknownSellingPlanPricingPolicyBase(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The price adjustment type.
    */

    public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
        return (SellingPlanPricingPolicyAdjustmentType) get("adjustmentType");
    }

    public UnknownSellingPlanPricingPolicyBase setAdjustmentType(SellingPlanPricingPolicyAdjustmentType arg) {
        optimisticData.put(getKey("adjustmentType"), arg);
        return this;
    }

    /**
    * The price adjustment value.
    */

    public SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue() {
        return (SellingPlanPricingPolicyAdjustmentValue) get("adjustmentValue");
    }

    public UnknownSellingPlanPricingPolicyBase setAdjustmentValue(SellingPlanPricingPolicyAdjustmentValue arg) {
        optimisticData.put(getKey("adjustmentValue"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustmentType": return false;

            case "adjustmentValue": return false;

            default: return false;
        }
    }
}

