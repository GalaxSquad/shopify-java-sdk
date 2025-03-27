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
* Represents valid selling plan interval.
*/
public enum SellingPlanInterval {
    /**
    * Day interval.
    */
    DAY,

    /**
    * Month interval.
    */
    MONTH,

    /**
    * Week interval.
    */
    WEEK,

    /**
    * Year interval.
    */
    YEAR,

    UNKNOWN_VALUE;

    public static SellingPlanInterval fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DAY": {
                return DAY;
            }

            case "MONTH": {
                return MONTH;
            }

            case "WEEK": {
                return WEEK;
            }

            case "YEAR": {
                return YEAR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DAY: {
                return "DAY";
            }

            case MONTH: {
                return "MONTH";
            }

            case WEEK: {
                return "WEEK";
            }

            case YEAR: {
                return "YEAR";
            }

            default: {
                return "";
            }
        }
    }
}

