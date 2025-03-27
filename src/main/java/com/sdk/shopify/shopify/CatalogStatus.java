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
* The state of a catalog.
*/
public enum CatalogStatus {
    /**
    * The catalog is active.
    */
    ACTIVE,

    /**
    * The catalog is archived.
    */
    ARCHIVED,

    /**
    * The catalog is in draft.
    */
    DRAFT,

    UNKNOWN_VALUE;

    public static CatalogStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "ARCHIVED": {
                return ARCHIVED;
            }

            case "DRAFT": {
                return DRAFT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE: {
                return "ACTIVE";
            }

            case ARCHIVED: {
                return "ARCHIVED";
            }

            case DRAFT: {
                return "DRAFT";
            }

            default: {
                return "";
            }
        }
    }
}

