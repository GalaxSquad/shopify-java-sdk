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

import java.util.Map;

/**
* Represents the delivery frequency associated to the selling plan (for example, deliver every month,
* or deliver
* every other week). The selling plan delivery policy and associated records (selling plan groups,
* selling plans,
* pricing policies, and billing policy) are deleted 48 hours after a merchant uninstalls their
* subscriptions app.
* We recommend backing up these records if you need to restore them later.
*/
public class UnknownSellingPlanDeliveryPolicy extends AbstractResponse<UnknownSellingPlanDeliveryPolicy> implements SellingPlanDeliveryPolicy {
    public UnknownSellingPlanDeliveryPolicy() {
    }

    public UnknownSellingPlanDeliveryPolicy(JsonObject fields) throws SchemaViolationError {
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

    public static SellingPlanDeliveryPolicy create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SellingPlanFixedDeliveryPolicy": {
                return new SellingPlanFixedDeliveryPolicy(fields);
            }

            case "SellingPlanRecurringDeliveryPolicy": {
                return new SellingPlanRecurringDeliveryPolicy(fields);
            }

            default: {
                return new UnknownSellingPlanDeliveryPolicy(fields);
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

