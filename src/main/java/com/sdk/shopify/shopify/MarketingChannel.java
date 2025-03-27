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
* The medium through which the marketing activity and event reached consumers. This is used for
* reporting aggregation.
*/
public enum MarketingChannel {
    /**
    * Displayed ads.
    */
    DISPLAY,

    /**
    * Email.
    */
    EMAIL,

    /**
    * Referral links.
    */
    REFERRAL,

    /**
    * Paid search.
    */
    SEARCH,

    /**
    * Social media.
    */
    SOCIAL,

    UNKNOWN_VALUE;

    public static MarketingChannel fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DISPLAY": {
                return DISPLAY;
            }

            case "EMAIL": {
                return EMAIL;
            }

            case "REFERRAL": {
                return REFERRAL;
            }

            case "SEARCH": {
                return SEARCH;
            }

            case "SOCIAL": {
                return SOCIAL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DISPLAY: {
                return "DISPLAY";
            }

            case EMAIL: {
                return "EMAIL";
            }

            case REFERRAL: {
                return "REFERRAL";
            }

            case SEARCH: {
                return "SEARCH";
            }

            case SOCIAL: {
                return "SOCIAL";
            }

            default: {
                return "";
            }
        }
    }
}

