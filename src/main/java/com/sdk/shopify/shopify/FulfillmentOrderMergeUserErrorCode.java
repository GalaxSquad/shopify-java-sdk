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
* Possible error codes that can be returned by `FulfillmentOrderMergeUserError`.
*/
public enum FulfillmentOrderMergeUserErrorCode {
    /**
    * The fulfillment order could not be found.
    */
    FULFILLMENT_ORDER_NOT_FOUND,

    /**
    * The fulfillment order line item quantity must be greater than 0.
    */
    GREATER_THAN,

    /**
    * The fulfillment order line item quantity is invalid.
    */
    INVALID_LINE_ITEM_QUANTITY,

    UNKNOWN_VALUE;

    public static FulfillmentOrderMergeUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLMENT_ORDER_NOT_FOUND": {
                return FULFILLMENT_ORDER_NOT_FOUND;
            }

            case "GREATER_THAN": {
                return GREATER_THAN;
            }

            case "INVALID_LINE_ITEM_QUANTITY": {
                return INVALID_LINE_ITEM_QUANTITY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULFILLMENT_ORDER_NOT_FOUND: {
                return "FULFILLMENT_ORDER_NOT_FOUND";
            }

            case GREATER_THAN: {
                return "GREATER_THAN";
            }

            case INVALID_LINE_ITEM_QUANTITY: {
                return "INVALID_LINE_ITEM_QUANTITY";
            }

            default: {
                return "";
            }
        }
    }
}

