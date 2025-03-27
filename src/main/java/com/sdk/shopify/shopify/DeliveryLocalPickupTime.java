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
* Possible pickup time values that a location enabled for local pickup can have.
*/
public enum DeliveryLocalPickupTime {
    /**
    * Usually ready in 5+ days.
    */
    FIVE_OR_MORE_DAYS,

    /**
    * Usually ready in 4 hours.
    */
    FOUR_HOURS,

    /**
    * Usually ready in 1 hour.
    */
    ONE_HOUR,

    /**
    * Usually ready in 24 hours.
    */
    TWENTY_FOUR_HOURS,

    /**
    * Usually ready in 2 hours.
    */
    TWO_HOURS,

    /**
    * Usually ready in 2-4 days.
    */
    TWO_TO_FOUR_DAYS,

    UNKNOWN_VALUE;

    public static DeliveryLocalPickupTime fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FIVE_OR_MORE_DAYS": {
                return FIVE_OR_MORE_DAYS;
            }

            case "FOUR_HOURS": {
                return FOUR_HOURS;
            }

            case "ONE_HOUR": {
                return ONE_HOUR;
            }

            case "TWENTY_FOUR_HOURS": {
                return TWENTY_FOUR_HOURS;
            }

            case "TWO_HOURS": {
                return TWO_HOURS;
            }

            case "TWO_TO_FOUR_DAYS": {
                return TWO_TO_FOUR_DAYS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FIVE_OR_MORE_DAYS: {
                return "FIVE_OR_MORE_DAYS";
            }

            case FOUR_HOURS: {
                return "FOUR_HOURS";
            }

            case ONE_HOUR: {
                return "ONE_HOUR";
            }

            case TWENTY_FOUR_HOURS: {
                return "TWENTY_FOUR_HOURS";
            }

            case TWO_HOURS: {
                return "TWO_HOURS";
            }

            case TWO_TO_FOUR_DAYS: {
                return "TWO_TO_FOUR_DAYS";
            }

            default: {
                return "";
            }
        }
    }
}

