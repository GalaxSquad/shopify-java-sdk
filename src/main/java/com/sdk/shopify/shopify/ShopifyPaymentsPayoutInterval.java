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
* The interval at which payouts are sent to the connected bank account.
*/
public enum ShopifyPaymentsPayoutInterval {
    /**
    * Each business day.
    */
    DAILY,

    /**
    * Payouts will not be automatically made.
    */
    MANUAL,

    /**
    * Each month, on the day of month specified by monthlyAnchor.
    */
    MONTHLY,

    /**
    * Each week, on the day of week specified by weeklyAnchor.
    */
    WEEKLY,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsPayoutInterval fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DAILY": {
                return DAILY;
            }

            case "MANUAL": {
                return MANUAL;
            }

            case "MONTHLY": {
                return MONTHLY;
            }

            case "WEEKLY": {
                return WEEKLY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DAILY: {
                return "DAILY";
            }

            case MANUAL: {
                return "MANUAL";
            }

            case MONTHLY: {
                return "MONTHLY";
            }

            case WEEKLY: {
                return "WEEKLY";
            }

            default: {
                return "";
            }
        }
    }
}

