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
* The set of valid sort keys for the Company query.
*/
public enum CompanySortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `name` value.
    */
    NAME,

    /**
    * Sort by the `order_count` value.
    */
    ORDER_COUNT,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `since_date` value.
    */
    SINCE_DATE,

    /**
    * Sort by the `total_spent` value.
    */
    TOTAL_SPENT,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static CompanySortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "ID": {
                return ID;
            }

            case "NAME": {
                return NAME;
            }

            case "ORDER_COUNT": {
                return ORDER_COUNT;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "SINCE_DATE": {
                return SINCE_DATE;
            }

            case "TOTAL_SPENT": {
                return TOTAL_SPENT;
            }

            case "UPDATED_AT": {
                return UPDATED_AT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CREATED_AT: {
                return "CREATED_AT";
            }

            case ID: {
                return "ID";
            }

            case NAME: {
                return "NAME";
            }

            case ORDER_COUNT: {
                return "ORDER_COUNT";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case SINCE_DATE: {
                return "SINCE_DATE";
            }

            case TOTAL_SPENT: {
                return "TOTAL_SPENT";
            }

            case UPDATED_AT: {
                return "UPDATED_AT";
            }

            default: {
                return "";
            }
        }
    }
}

