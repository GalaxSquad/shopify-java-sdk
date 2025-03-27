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
* The set of valid sort keys for the CompanyContact query.
*/
public enum CompanyContactSortKeys {
    /**
    * Sort by the `company_id` value.
    */
    COMPANY_ID,

    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `email` value.
    */
    EMAIL,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `name` value.
    */
    NAME,

    /**
    * Sort by the `name_email` value.
    */
    NAME_EMAIL,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `title` value.
    */
    TITLE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static CompanyContactSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMPANY_ID": {
                return COMPANY_ID;
            }

            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "EMAIL": {
                return EMAIL;
            }

            case "ID": {
                return ID;
            }

            case "NAME": {
                return NAME;
            }

            case "NAME_EMAIL": {
                return NAME_EMAIL;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TITLE": {
                return TITLE;
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
            case COMPANY_ID: {
                return "COMPANY_ID";
            }

            case CREATED_AT: {
                return "CREATED_AT";
            }

            case EMAIL: {
                return "EMAIL";
            }

            case ID: {
                return "ID";
            }

            case NAME: {
                return "NAME";
            }

            case NAME_EMAIL: {
                return "NAME_EMAIL";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TITLE: {
                return "TITLE";
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

