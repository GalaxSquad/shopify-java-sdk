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
* Return type for `appSubscriptionCreate` mutation.
*/
public class AppSubscriptionCreatePayload extends AbstractResponse<AppSubscriptionCreatePayload> {
    public AppSubscriptionCreatePayload() {
    }

    public AppSubscriptionCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appSubscription": {
                    AppSubscription optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppSubscription(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "confirmationUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "AppSubscriptionCreatePayload";
    }

    /**
    * The newly-created app subscription.
    */

    public AppSubscription getAppSubscription() {
        return (AppSubscription) get("appSubscription");
    }

    public AppSubscriptionCreatePayload setAppSubscription(AppSubscription arg) {
        optimisticData.put(getKey("appSubscription"), arg);
        return this;
    }

    /**
    * The URL pointing to the page where the merchant approves or declines the charges for an app
    * subscription.
    */

    public String getConfirmationUrl() {
        return (String) get("confirmationUrl");
    }

    public AppSubscriptionCreatePayload setConfirmationUrl(String arg) {
        optimisticData.put(getKey("confirmationUrl"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public AppSubscriptionCreatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appSubscription": return true;

            case "confirmationUrl": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

