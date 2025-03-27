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

/**
* The supported formats for webhook subscriptions.
*/
public enum WebhookSubscriptionFormat {
    JSON,

    XML,

    UNKNOWN_VALUE;

    public static WebhookSubscriptionFormat fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "JSON": {
                return JSON;
            }

            case "XML": {
                return XML;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case JSON: {
                return "JSON";
            }

            case XML: {
                return "XML";
            }

            default: {
                return "";
            }
        }
    }
}

