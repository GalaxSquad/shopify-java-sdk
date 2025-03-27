// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Provides users access to services and/or features for a duration of time.
*/
public class AppSubscription extends AbstractResponse<AppSubscription> implements Node {
    public AppSubscription() {
    }

    public AppSubscription(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "currentPeriodEnd": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItems": {
                    List<AppSubscriptionLineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AppSubscriptionLineItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "returnUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "status": {
                    responseData.put(key, AppSubscriptionStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "test": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "trialDays": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

    public AppSubscription(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "AppSubscription";
    }

    /**
    * The date and time when the app subscription was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public AppSubscription setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The date and time when the current app subscription period ends. Returns `null` if the subscription
    * isn't active.
    */

    public String getCurrentPeriodEnd() {
        return (String) get("currentPeriodEnd");
    }

    public AppSubscription setCurrentPeriodEnd(String arg) {
        optimisticData.put(getKey("currentPeriodEnd"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The plans attached to the app subscription.
    */

    public List<AppSubscriptionLineItem> getLineItems() {
        return (List<AppSubscriptionLineItem>) get("lineItems");
    }

    public AppSubscription setLineItems(List<AppSubscriptionLineItem> arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * The name of the app subscription.
    */

    public String getName() {
        return (String) get("name");
    }

    public AppSubscription setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The URL that the merchant is redirected to after approving the app subscription.
    */

    public String getReturnUrl() {
        return (String) get("returnUrl");
    }

    public AppSubscription setReturnUrl(String arg) {
        optimisticData.put(getKey("returnUrl"), arg);
        return this;
    }

    /**
    * The status of the app subscription.
    */

    public AppSubscriptionStatus getStatus() {
        return (AppSubscriptionStatus) get("status");
    }

    public AppSubscription setStatus(AppSubscriptionStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Specifies whether the app subscription is a test transaction.
    */

    public Boolean getTest() {
        return (Boolean) get("test");
    }

    public AppSubscription setTest(Boolean arg) {
        optimisticData.put(getKey("test"), arg);
        return this;
    }

    /**
    * The number of free trial days, starting at the subscription's creation date, by which billing is
    * delayed.
    */

    public Integer getTrialDays() {
        return (Integer) get("trialDays");
    }

    public AppSubscription setTrialDays(Integer arg) {
        optimisticData.put(getKey("trialDays"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "currentPeriodEnd": return false;

            case "id": return false;

            case "lineItems": return true;

            case "name": return false;

            case "returnUrl": return false;

            case "status": return false;

            case "test": return false;

            case "trialDays": return false;

            default: return false;
        }
    }
}

