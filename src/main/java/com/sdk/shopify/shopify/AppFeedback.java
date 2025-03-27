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
* Reports the status of shops and their resources and displays this information
* within Shopify admin. AppFeedback is used to notify merchants about steps they need to take
* to set up an app on their store.
*/
public class AppFeedback extends AbstractResponse<AppFeedback> {
    public AppFeedback() {
    }

    public AppFeedback(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "app": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "feedbackGeneratedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "link": {
                    Link optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Link(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "messages": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "state": {
                    responseData.put(key, ResourceFeedbackState.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "AppFeedback";
    }

    /**
    * The application associated to the feedback.
    */

    public App getApp() {
        return (App) get("app");
    }

    public AppFeedback setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The date and time when the app feedback was generated.
    */

    public String getFeedbackGeneratedAt() {
        return (String) get("feedbackGeneratedAt");
    }

    public AppFeedback setFeedbackGeneratedAt(String arg) {
        optimisticData.put(getKey("feedbackGeneratedAt"), arg);
        return this;
    }

    /**
    * A link to where merchants can resolve errors.
    */

    public Link getLink() {
        return (Link) get("link");
    }

    public AppFeedback setLink(Link arg) {
        optimisticData.put(getKey("link"), arg);
        return this;
    }

    /**
    * The feedback message presented to the merchant.
    */

    public List<UserError> getMessages() {
        return (List<UserError>) get("messages");
    }

    public AppFeedback setMessages(List<UserError> arg) {
        optimisticData.put(getKey("messages"), arg);
        return this;
    }

    /**
    * Conveys the state of the feedback and whether it requires merchant action or not.
    */

    public ResourceFeedbackState getState() {
        return (ResourceFeedbackState) get("state");
    }

    public AppFeedback setState(ResourceFeedbackState arg) {
        optimisticData.put(getKey("state"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "feedbackGeneratedAt": return false;

            case "link": return true;

            case "messages": return true;

            case "state": return false;

            default: return false;
        }
    }
}

