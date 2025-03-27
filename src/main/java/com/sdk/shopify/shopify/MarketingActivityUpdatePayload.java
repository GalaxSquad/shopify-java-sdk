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
* Return type for `marketingActivityUpdate` mutation.
*/
public class MarketingActivityUpdatePayload extends AbstractResponse<MarketingActivityUpdatePayload> {
    public MarketingActivityUpdatePayload() {
    }

    public MarketingActivityUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "marketingActivity": {
                    MarketingActivity optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivity(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "redirectPath": {
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
        return "MarketingActivityUpdatePayload";
    }

    /**
    * The updated marketing activity.
    */

    public MarketingActivity getMarketingActivity() {
        return (MarketingActivity) get("marketingActivity");
    }

    public MarketingActivityUpdatePayload setMarketingActivity(MarketingActivity arg) {
        optimisticData.put(getKey("marketingActivity"), arg);
        return this;
    }

    /**
    * The redirect path from the embedded editor to the Shopify admin.
    */

    public String getRedirectPath() {
        return (String) get("redirectPath");
    }

    public MarketingActivityUpdatePayload setRedirectPath(String arg) {
        optimisticData.put(getKey("redirectPath"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public MarketingActivityUpdatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "marketingActivity": return true;

            case "redirectPath": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

