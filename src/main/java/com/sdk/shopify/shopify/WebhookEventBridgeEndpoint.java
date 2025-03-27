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

import java.util.Map;

/**
* An Amazon EventBridge partner event source to which webhook subscriptions publish events.
*/
public class WebhookEventBridgeEndpoint extends AbstractResponse<WebhookEventBridgeEndpoint> implements WebhookSubscriptionEndpoint {
    public WebhookEventBridgeEndpoint() {
    }

    public WebhookEventBridgeEndpoint(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "arn": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "WebhookEventBridgeEndpoint";
    }

    /**
    * The ARN of this EventBridge partner event source.
    */

    public String getArn() {
        return (String) get("arn");
    }

    public WebhookEventBridgeEndpoint setArn(String arg) {
        optimisticData.put(getKey("arn"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "arn": return false;

            default: return false;
        }
    }
}

