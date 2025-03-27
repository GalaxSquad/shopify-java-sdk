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
* Represents the origin of a price, either fixed (defined on the price list) or relative (calculated
* using a price list adjustment configuration). For examples, refer to
* [PriceList](https://shopify.dev/api/admin-graphql/latest/queries/priceList#section-examples).
*/
public enum PriceListPriceOriginType {
    /**
    * The price is defined on the price list.
    */
    FIXED,

    /**
    * The price is relative to the adjustment type and value.
    */
    RELATIVE,

    UNKNOWN_VALUE;

    public static PriceListPriceOriginType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FIXED": {
                return FIXED;
            }

            case "RELATIVE": {
                return RELATIVE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FIXED: {
                return "FIXED";
            }

            case RELATIVE: {
                return "RELATIVE";
            }

            default: {
                return "";
            }
        }
    }
}

