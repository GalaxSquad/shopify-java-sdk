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
* Possible error codes that can be returned by `ProductChangeStatusUserError`.
*/
public enum ProductChangeStatusUserErrorCode {
    /**
    * Cannot be unarchived because combined listings are not compatible with this store.
    */
    COMBINED_LISTINGS_NOT_COMPATIBLE_WITH_SHOP,

    /**
    * Product could not be found.
    */
    PRODUCT_NOT_FOUND,

    UNKNOWN_VALUE;

    public static ProductChangeStatusUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMBINED_LISTINGS_NOT_COMPATIBLE_WITH_SHOP": {
                return COMBINED_LISTINGS_NOT_COMPATIBLE_WITH_SHOP;
            }

            case "PRODUCT_NOT_FOUND": {
                return PRODUCT_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COMBINED_LISTINGS_NOT_COMPATIBLE_WITH_SHOP: {
                return "COMBINED_LISTINGS_NOT_COMPATIBLE_WITH_SHOP";
            }

            case PRODUCT_NOT_FOUND: {
                return "PRODUCT_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

