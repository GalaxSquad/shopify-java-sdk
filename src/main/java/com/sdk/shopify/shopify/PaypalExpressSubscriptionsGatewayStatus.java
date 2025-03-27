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
* Represents a valid PayPal Express subscriptions gateway status.
*/
public enum PaypalExpressSubscriptionsGatewayStatus {
    /**
    * The status is disabled.
    */
    DISABLED,

    /**
    * The status is enabled.
    */
    ENABLED,

    /**
    * The status is pending.
    */
    PENDING,

    UNKNOWN_VALUE;

    public static PaypalExpressSubscriptionsGatewayStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DISABLED": {
                return DISABLED;
            }

            case "ENABLED": {
                return ENABLED;
            }

            case "PENDING": {
                return PENDING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DISABLED: {
                return "DISABLED";
            }

            case ENABLED: {
                return "ENABLED";
            }

            case PENDING: {
                return "PENDING";
            }

            default: {
                return "";
            }
        }
    }
}

