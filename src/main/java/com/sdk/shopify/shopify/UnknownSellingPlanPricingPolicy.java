// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the type of pricing associated to the selling plan (for example, a $10 or 20% discount
* that is set
* for a limited period or that is fixed for the duration of the subscription). Selling plan pricing
* policies and
* associated records (selling plan groups, selling plans, billing policy, and delivery policy) are
* deleted 48
* hours after a merchant uninstalls their subscriptions app. We recommend backing up these records if
* you need
* to restore them later.
*/
public class UnknownSellingPlanPricingPolicy extends AbstractResponse<UnknownSellingPlanPricingPolicy> implements SellingPlanPricingPolicy {
    public UnknownSellingPlanPricingPolicy() {
    }

    public UnknownSellingPlanPricingPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static SellingPlanPricingPolicy create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SellingPlanFixedPricingPolicy": {
                return new SellingPlanFixedPricingPolicy(fields);
            }

            case "SellingPlanRecurringPricingPolicy": {
                return new SellingPlanRecurringPricingPolicy(fields);
            }

            default: {
                return new UnknownSellingPlanPricingPolicy(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

