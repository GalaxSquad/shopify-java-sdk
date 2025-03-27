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
* The type of page where a shareable price rule URL lands.
*/
public enum PriceRuleShareableUrlTargetType {
    /**
    * The URL lands on a collection page.
    */
    COLLECTION,

    /**
    * The URL lands on a home page.
    */
    HOME,

    /**
    * The URL lands on a product page.
    */
    PRODUCT,

    UNKNOWN_VALUE;

    public static PriceRuleShareableUrlTargetType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COLLECTION": {
                return COLLECTION;
            }

            case "HOME": {
                return HOME;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COLLECTION: {
                return "COLLECTION";
            }

            case HOME: {
                return "HOME";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            default: {
                return "";
            }
        }
    }
}

