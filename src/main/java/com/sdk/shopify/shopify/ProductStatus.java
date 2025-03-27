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
* The possible product statuses.
*/
public enum ProductStatus {
    /**
    * The product is ready to sell and can be published to sales channels and apps. Products with an
    * active status aren't automatically published to sales channels, such as the online store, or apps.
    * By default, existing products are set to active.
    */
    ACTIVE,

    /**
    * The product is no longer being sold and isn't available to customers on sales channels and apps.
    */
    ARCHIVED,

    /**
    * The product isn't ready to sell and is unavailable to customers on sales channels and apps. By
    * default, duplicated and unarchived products are set to draft.
    */
    DRAFT,

    UNKNOWN_VALUE;

    public static ProductStatus fromGraphQl(String value) {
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

