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
* Possible error codes that can be returned by `FulfillmentOrderHoldUserError`.
*/
public enum FulfillmentOrderHoldUserErrorCode {
    /**
    * The handle provided for the fulfillment hold is already in use by this app for another hold on this
    * fulfillment order.
    */
    DUPLICATE_FULFILLMENT_HOLD_HANDLE,

    /**
    * The maximum number of fulfillment holds for this fulfillment order has been reached for this app. An
    * app can only have up to 10 holds on a single fulfillment order at any one time.
    */
    FULFILLMENT_ORDER_HOLD_LIMIT_REACHED,

    /**
    * The fulfillment order could not be found.
    */
    FULFILLMENT_ORDER_NOT_FOUND,

    /**
    * The fulfillment order is not in a splittable state.
    */
    FULFILLMENT_ORDER_NOT_SPLITTABLE,

    /**
    * The fulfillment order line item quantity must be greater than 0.
    */
    GREATER_THAN_ZERO,

    /**
    * The fulfillment order line item quantity is invalid.
    */
    INVALID_LINE_ITEM_QUANTITY,

    /**
    * The input value is already taken.
    */
    TAKEN,

    UNKNOWN_VALUE;

    public static FulfillmentOrderHoldUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DUPLICATE_FULFILLMENT_HOLD_HANDLE": {
                return DUPLICATE_FULFILLMENT_HOLD_HANDLE;
            }

            case "FULFILLMENT_ORDER_HOLD_LIMIT_REACHED": {
                return FULFILLMENT_ORDER_HOLD_LIMIT_REACHED;
            }

            case "FULFILLMENT_ORDER_NOT_FOUND": {
                return FULFILLMENT_ORDER_NOT_FOUND;
            }

            case "FULFILLMENT_ORDER_NOT_SPLITTABLE": {
                return FULFILLMENT_ORDER_NOT_SPLITTABLE;
            }

            case "GREATER_THAN_ZERO": {
                return GREATER_THAN_ZERO;
            }

            case "INVALID_LINE_ITEM_QUANTITY": {
                return INVALID_LINE_ITEM_QUANTITY;
            }

            case "TAKEN": {
                return TAKEN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DUPLICATE_FULFILLMENT_HOLD_HANDLE: {
                return "DUPLICATE_FULFILLMENT_HOLD_HANDLE";
            }

            case FULFILLMENT_ORDER_HOLD_LIMIT_REACHED: {
                return "FULFILLMENT_ORDER_HOLD_LIMIT_REACHED";
            }

            case FULFILLMENT_ORDER_NOT_FOUND: {
                return "FULFILLMENT_ORDER_NOT_FOUND";
            }

            case FULFILLMENT_ORDER_NOT_SPLITTABLE: {
                return "FULFILLMENT_ORDER_NOT_SPLITTABLE";
            }

            case GREATER_THAN_ZERO: {
                return "GREATER_THAN_ZERO";
            }

            case INVALID_LINE_ITEM_QUANTITY: {
                return "INVALID_LINE_ITEM_QUANTITY";
            }

            case TAKEN: {
                return "TAKEN";
            }

            default: {
                return "";
            }
        }
    }
}

