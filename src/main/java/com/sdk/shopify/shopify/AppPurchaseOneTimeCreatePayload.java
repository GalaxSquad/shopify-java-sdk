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
* Return type for `appPurchaseOneTimeCreate` mutation.
*/
public class AppPurchaseOneTimeCreatePayload extends AbstractResponse<AppPurchaseOneTimeCreatePayload> {
    public AppPurchaseOneTimeCreatePayload() {
    }

    public AppPurchaseOneTimeCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appPurchaseOneTime": {
                    AppPurchaseOneTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppPurchaseOneTime(jsonAsObject(field.getValue(), key));
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
        return "AppPurchaseOneTimeCreatePayload";
    }

    /**
    * The newly created app one-time purchase.
    */

    public AppPurchaseOneTime getAppPurchaseOneTime() {
        return (AppPurchaseOneTime) get("appPurchaseOneTime");
    }

    public AppPurchaseOneTimeCreatePayload setAppPurchaseOneTime(AppPurchaseOneTime arg) {
        optimisticData.put(getKey("appPurchaseOneTime"), arg);
        return this;
    }

    /**
    * The URL that the merchant can access to approve or decline the newly created app one-time purchase.
    * If the merchant declines, then the merchant is redirected to the app and receives a notification
    * message stating that the charge was declined.
    * If the merchant approves and they're successfully invoiced, then the state of the charge changes
    * from `pending` to `active`.
    * You get paid after the charge is activated.
    */

    public String getConfirmationUrl() {
        return (String) get("confirmationUrl");
    }

    public AppPurchaseOneTimeCreatePayload setConfirmationUrl(String arg) {
        optimisticData.put(getKey("confirmationUrl"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public AppPurchaseOneTimeCreatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appPurchaseOneTime": return true;

            case "confirmationUrl": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

