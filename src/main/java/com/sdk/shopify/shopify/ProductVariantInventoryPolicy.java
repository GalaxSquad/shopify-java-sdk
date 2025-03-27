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
* The valid values for the inventory policy of a product variant once it is out of stock.
*/
public enum ProductVariantInventoryPolicy {
    /**
    * Customers can buy this product variant after it's out of stock.
    */
    CONTINUE,

    /**
    * Customers can't buy this product variant after it's out of stock.
    */
    DENY,

    UNKNOWN_VALUE;

    public static ProductVariantInventoryPolicy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONTINUE": {
                return CONTINUE;
            }

            case "DENY": {
                return DENY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONTINUE: {
                return "CONTINUE";
            }

            case DENY: {
                return "DENY";
            }

            default: {
                return "";
            }
        }
    }
}

