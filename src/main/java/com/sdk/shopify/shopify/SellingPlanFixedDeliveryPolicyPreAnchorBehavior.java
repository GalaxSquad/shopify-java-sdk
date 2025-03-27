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
* The fulfillment or delivery behavior of the first fulfillment when the orderis placed before the
* anchor.
*/
public enum SellingPlanFixedDeliveryPolicyPreAnchorBehavior {
    /**
    * Orders placed can be fulfilled / delivered immediately. Orders placed inside a cutoff can be
    * fulfilled / delivered at the next anchor.
    */
    ASAP,

    /**
    * Orders placed can be fulfilled / delivered at the next anchor date.
    * Orders placed inside a cutoff will skip the next anchor and can be fulfilled /
    * delivered at the following anchor.
    */
    NEXT,

    UNKNOWN_VALUE;

    public static SellingPlanFixedDeliveryPolicyPreAnchorBehavior fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ASAP": {
                return ASAP;
            }

            case "NEXT": {
                return NEXT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ASAP: {
                return "ASAP";
            }

            case NEXT: {
                return "NEXT";
            }

            default: {
                return "";
            }
        }
    }
}

