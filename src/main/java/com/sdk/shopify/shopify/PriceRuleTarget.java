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
* The type of lines (line_item or shipping_line) to which the price rule applies.
*/
public enum PriceRuleTarget {
    /**
    * The price rule applies to line items.
    */
    LINE_ITEM,

    /**
    * The price rule applies to shipping lines.
    */
    SHIPPING_LINE,

    UNKNOWN_VALUE;

    public static PriceRuleTarget fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "LINE_ITEM": {
                return LINE_ITEM;
            }

            case "SHIPPING_LINE": {
                return SHIPPING_LINE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case LINE_ITEM: {
                return "LINE_ITEM";
            }

            case SHIPPING_LINE: {
                return "SHIPPING_LINE";
            }

            default: {
                return "";
            }
        }
    }
}

