// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `subscriptionBillingCycleEditDelete` mutation.
*/
public class SubscriptionBillingCycleEditDeletePayload extends AbstractResponse<SubscriptionBillingCycleEditDeletePayload> {
    public SubscriptionBillingCycleEditDeletePayload() {
    }

    public SubscriptionBillingCycleEditDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billingCycles": {
                    List<SubscriptionBillingCycle> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SubscriptionBillingCycle> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new SubscriptionBillingCycle(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<SubscriptionBillingCycleUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SubscriptionBillingCycleUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "SubscriptionBillingCycleEditDeletePayload";
    }

    /**
    * The list of updated billing cycles.
    */

    public List<SubscriptionBillingCycle> getBillingCycles() {
        return (List<SubscriptionBillingCycle>) get("billingCycles");
    }

    public SubscriptionBillingCycleEditDeletePayload setBillingCycles(List<SubscriptionBillingCycle> arg) {
        optimisticData.put(getKey("billingCycles"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SubscriptionBillingCycleUserError> getUserErrors() {
        return (List<SubscriptionBillingCycleUserError>) get("userErrors");
    }

    public SubscriptionBillingCycleEditDeletePayload setUserErrors(List<SubscriptionBillingCycleUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingCycles": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

