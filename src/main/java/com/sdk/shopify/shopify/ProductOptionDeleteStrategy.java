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
* The set of strategies available for use on the `productOptionDelete` mutation.
*/
public enum ProductOptionDeleteStrategy {
    /**
    * The default strategy, the specified `Option` may only have one corresponding `value`.
    */
    DEFAULT,

    /**
    * An `Option` with multiple `values` can be deleted, but the operation only succeeds if no product
    * variants get deleted.
    */
    NON_DESTRUCTIVE,

    /**
    * An `Option` with multiple `values` can be deleted. Remaining variants will be deleted, highest
    * `position` first, in the event of duplicates being detected.
    */
    POSITION,

    UNKNOWN_VALUE;

    public static ProductOptionDeleteStrategy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DEFAULT": {
                return DEFAULT;
            }

            case "NON_DESTRUCTIVE": {
                return NON_DESTRUCTIVE;
            }

            case "POSITION": {
                return POSITION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DEFAULT: {
                return "DEFAULT";
            }

            case NON_DESTRUCTIVE: {
                return "NON_DESTRUCTIVE";
            }

            case POSITION: {
                return "POSITION";
            }

            default: {
                return "";
            }
        }
    }
}

