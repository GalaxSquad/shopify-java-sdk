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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `marketingActivityCreate` mutation.
*/
public class MarketingActivityCreatePayload extends AbstractResponse<MarketingActivityCreatePayload> {
    public MarketingActivityCreatePayload() {
    }

    public MarketingActivityCreatePayload(JsonObject fields) throws SchemaViolationError {
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
        return "MarketingActivityCreatePayload";
    }

    /**
    * The created marketing activity.
    */

    public MarketingActivity getMarketingActivity() {
        return (MarketingActivity) get("marketingActivity");
    }

    public MarketingActivityCreatePayload setMarketingActivity(MarketingActivity arg) {
        optimisticData.put(getKey("marketingActivity"), arg);
        return this;
    }

    /**
    * The path to return back to shopify admin from embedded editor.
    */

    public String getRedirectPath() {
        return (String) get("redirectPath");
    }

    public MarketingActivityCreatePayload setRedirectPath(String arg) {
        optimisticData.put(getKey("redirectPath"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public MarketingActivityCreatePayload setUserErrors(List<UserError> arg) {
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

