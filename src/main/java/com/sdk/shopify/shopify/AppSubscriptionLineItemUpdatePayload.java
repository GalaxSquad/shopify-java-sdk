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
* Return type for `appSubscriptionLineItemUpdate` mutation.
*/
public class AppSubscriptionLineItemUpdatePayload extends AbstractResponse<AppSubscriptionLineItemUpdatePayload> {
    public AppSubscriptionLineItemUpdatePayload() {
    }

    public AppSubscriptionLineItemUpdatePayload(JsonObject fields) throws SchemaViolationError {
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
        return "AppSubscriptionLineItemUpdatePayload";
    }

    /**
    * The updated app subscription.
    */

    public AppSubscription getAppSubscription() {
        return (AppSubscription) get("appSubscription");
    }

    public AppSubscriptionLineItemUpdatePayload setAppSubscription(AppSubscription arg) {
        optimisticData.put(getKey("appSubscription"), arg);
        return this;
    }

    /**
    * The URL where the merchant approves or declines the updated app subscription line item.
    */

    public String getConfirmationUrl() {
        return (String) get("confirmationUrl");
    }

    public AppSubscriptionLineItemUpdatePayload setConfirmationUrl(String arg) {
        optimisticData.put(getKey("confirmationUrl"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public AppSubscriptionLineItemUpdatePayload setUserErrors(List<UserError> arg) {
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

