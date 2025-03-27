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
* Represents the billing types of revenue attribution.
*/
public enum AppRevenueAttributionType {
    /**
    * App purchase related revenue collection.
    */
    APPLICATION_PURCHASE,

    /**
    * App subscription revenue collection.
    */
    APPLICATION_SUBSCRIPTION,

    /**
    * App usage-based revenue collection.
    */
    APPLICATION_USAGE,

    /**
    * Other app revenue collection type.
    */
    OTHER,

    UNKNOWN_VALUE;

    public static AppRevenueAttributionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APPLICATION_PURCHASE": {
                return APPLICATION_PURCHASE;
            }

            case "APPLICATION_SUBSCRIPTION": {
                return APPLICATION_SUBSCRIPTION;
            }

            case "APPLICATION_USAGE": {
                return APPLICATION_USAGE;
            }

            case "OTHER": {
                return OTHER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APPLICATION_PURCHASE: {
                return "APPLICATION_PURCHASE";
            }

            case APPLICATION_SUBSCRIPTION: {
                return "APPLICATION_SUBSCRIPTION";
            }

            case APPLICATION_USAGE: {
                return "APPLICATION_USAGE";
            }

            case OTHER: {
                return "OTHER";
            }

            default: {
                return "";
            }
        }
    }
}

