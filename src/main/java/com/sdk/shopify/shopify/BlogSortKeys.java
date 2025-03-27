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
* The set of valid sort keys for the Blog query.
*/
public enum BlogSortKeys {
    /**
    * Sort by the `handle` value.
    */
    HANDLE,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `title` value.
    */
    TITLE,

    UNKNOWN_VALUE;

    public static BlogSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "HANDLE": {
                return HANDLE;
            }

            case "ID": {
                return ID;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TITLE": {
                return TITLE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case HANDLE: {
                return "HANDLE";
            }

            case ID: {
                return "ID";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TITLE: {
                return "TITLE";
            }

            default: {
                return "";
            }
        }
    }
}

