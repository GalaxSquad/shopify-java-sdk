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
* Days of the week from Monday to Sunday.
*/
public enum DayOfTheWeek {
    /**
    * Friday.
    */
    FRIDAY,

    /**
    * Monday.
    */
    MONDAY,

    /**
    * Saturday.
    */
    SATURDAY,

    /**
    * Sunday.
    */
    SUNDAY,

    /**
    * Thursday.
    */
    THURSDAY,

    /**
    * Tuesday.
    */
    TUESDAY,

    /**
    * Wednesday.
    */
    WEDNESDAY,

    UNKNOWN_VALUE;

    public static DayOfTheWeek fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FRIDAY": {
                return FRIDAY;
            }

            case "MONDAY": {
                return MONDAY;
            }

            case "SATURDAY": {
                return SATURDAY;
            }

            case "SUNDAY": {
                return SUNDAY;
            }

            case "THURSDAY": {
                return THURSDAY;
            }

            case "TUESDAY": {
                return TUESDAY;
            }

            case "WEDNESDAY": {
                return WEDNESDAY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FRIDAY: {
                return "FRIDAY";
            }

            case MONDAY: {
                return "MONDAY";
            }

            case SATURDAY: {
                return "SATURDAY";
            }

            case SUNDAY: {
                return "SUNDAY";
            }

            case THURSDAY: {
                return "THURSDAY";
            }

            case TUESDAY: {
                return "TUESDAY";
            }

            case WEDNESDAY: {
                return "WEDNESDAY";
            }

            default: {
                return "";
            }
        }
    }
}

