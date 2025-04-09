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
* Return type for `subscriptionBillingCycleScheduleEdit` mutation.
*/
public class SubscriptionBillingCycleScheduleEditPayload extends AbstractResponse<SubscriptionBillingCycleScheduleEditPayload> {
    public SubscriptionBillingCycleScheduleEditPayload() {
    }

    public SubscriptionBillingCycleScheduleEditPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billingCycle": {
                    SubscriptionBillingCycle optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycle(jsonAsObject(field.getValue(), key));
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
        return "SubscriptionBillingCycleScheduleEditPayload";
    }

    /**
    * The updated billing cycle.
    */

    public SubscriptionBillingCycle getBillingCycle() {
        return (SubscriptionBillingCycle) get("billingCycle");
    }

    public SubscriptionBillingCycleScheduleEditPayload setBillingCycle(SubscriptionBillingCycle arg) {
        optimisticData.put(getKey("billingCycle"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SubscriptionBillingCycleUserError> getUserErrors() {
        return (List<SubscriptionBillingCycleUserError>) get("userErrors");
    }

    public SubscriptionBillingCycleScheduleEditPayload setUserErrors(List<SubscriptionBillingCycleUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingCycle": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

