// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The plan attached to an app subscription.
*/
public class AppSubscriptionLineItem extends AbstractResponse<AppSubscriptionLineItem> {
    public AppSubscriptionLineItem() {
    }

    public AppSubscriptionLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "plan": {
                    responseData.put(key, new AppPlanV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "usageRecords": {
                    responseData.put(key, new AppUsageRecordConnection(jsonAsObject(field.getValue(), key)));

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
        return "AppSubscriptionLineItem";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public AppSubscriptionLineItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The pricing model for the app subscription.
    */

    public AppPlanV2 getPlan() {
        return (AppPlanV2) get("plan");
    }

    public AppSubscriptionLineItem setPlan(AppPlanV2 arg) {
        optimisticData.put(getKey("plan"), arg);
        return this;
    }

    /**
    * A list of the store's usage records for a usage pricing plan.
    */

    public AppUsageRecordConnection getUsageRecords() {
        return (AppUsageRecordConnection) get("usageRecords");
    }

    public AppSubscriptionLineItem setUsageRecords(AppUsageRecordConnection arg) {
        optimisticData.put(getKey("usageRecords"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "plan": return true;

            case "usageRecords": return true;

            default: return false;
        }
    }
}

