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
* The kinds of request merchants can make to a fulfillment service.
*/
public enum FulfillmentOrderMerchantRequestKind {
    /**
    * The merchant requests cancellation of an `IN_PROGRESS` fulfillment order.
    */
    CANCELLATION_REQUEST,

    /**
    * The merchant requests fulfillment for an `OPEN` fulfillment order.
    */
    FULFILLMENT_REQUEST,

    UNKNOWN_VALUE;

    public static FulfillmentOrderMerchantRequestKind fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELLATION_REQUEST": {
                return CANCELLATION_REQUEST;
            }

            case "FULFILLMENT_REQUEST": {
                return FULFILLMENT_REQUEST;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELLATION_REQUEST: {
                return "CANCELLATION_REQUEST";
            }

            case FULFILLMENT_REQUEST: {
                return "FULFILLMENT_REQUEST";
            }

            default: {
                return "";
            }
        }
    }
}

