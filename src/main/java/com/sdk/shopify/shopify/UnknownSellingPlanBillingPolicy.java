// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the billing frequency associated to the selling plan (for example, bill every week, or
* bill every
* three months). The selling plan billing policy and associated records (selling plan groups, selling
* plans, pricing
* policies, and delivery policy) are deleted 48 hours after a merchant uninstalls their subscriptions
* app.
* We recommend backing up these records if you need to restore them later.
*/
public class UnknownSellingPlanBillingPolicy extends AbstractResponse<UnknownSellingPlanBillingPolicy> implements SellingPlanBillingPolicy {
    public UnknownSellingPlanBillingPolicy() {
    }

    public UnknownSellingPlanBillingPolicy(JsonObject fields) throws SchemaViolationError {
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

    public static SellingPlanBillingPolicy create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SellingPlanFixedBillingPolicy": {
                return new SellingPlanFixedBillingPolicy(fields);
            }

            case "SellingPlanRecurringBillingPolicy": {
                return new SellingPlanRecurringBillingPolicy(fields);
            }

            default: {
                return new UnknownSellingPlanBillingPolicy(fields);
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

