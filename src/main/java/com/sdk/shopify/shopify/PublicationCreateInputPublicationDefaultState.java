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
* The input fields for the possible values for the default state of a publication.
*/
public enum PublicationCreateInputPublicationDefaultState {
    /**
    * The publication is populated with all products.
    */
    ALL_PRODUCTS,

    /**
    * The publication is empty.
    */
    EMPTY,

    UNKNOWN_VALUE;

    public static PublicationCreateInputPublicationDefaultState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALL_PRODUCTS": {
                return ALL_PRODUCTS;
            }

            case "EMPTY": {
                return EMPTY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALL_PRODUCTS: {
                return "ALL_PRODUCTS";
            }

            case EMPTY: {
                return "EMPTY";
            }

            default: {
                return "";
            }
        }
    }
}

