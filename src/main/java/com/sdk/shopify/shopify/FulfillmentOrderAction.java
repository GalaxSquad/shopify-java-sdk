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
* The actions that can be taken on a fulfillment order.
*/
public enum FulfillmentOrderAction {
    /**
    * Cancels a fulfillment order. The corresponding mutation for this action is `fulfillmentOrderCancel`.
    */
    CANCEL_FULFILLMENT_ORDER,

    /**
    * Creates a fulfillment for selected line items in the fulfillment order. The corresponding mutation
    * for this action is `fulfillmentCreateV2`.
    */
    CREATE_FULFILLMENT,

    /**
    * Opens an external URL to initiate the fulfillment process outside Shopify. This action should be
    * paired with `FulfillmentOrderSupportedAction.externalUrl`.
    */
    EXTERNAL,

    /**
    * Applies a fulfillment hold on the fulfillment order. The corresponding mutation for this action is
    * `fulfillmentOrderHold`.
    */
    HOLD,

    /**
    * Marks the fulfillment order as open. The corresponding mutation for this action is
    * `fulfillmentOrderOpen`.
    */
    MARK_AS_OPEN,

    /**
    * Merges a fulfillment order. The corresponding mutation for this action is `fulfillmentOrderMerge`.
    */
    MERGE,

    /**
    * Moves a fulfillment order. The corresponding mutation for this action is `fulfillmentOrderMove`.
    */
    MOVE,

    /**
    * Releases the fulfillment hold on the fulfillment order. The corresponding mutation for this action
    * is `fulfillmentOrderReleaseHold`.
    */
    RELEASE_HOLD,

    /**
    * Sends a cancellation request to the fulfillment service of a fulfillment order. The corresponding
    * mutation for this action is `fulfillmentOrderSubmitCancellationRequest`.
    */
    REQUEST_CANCELLATION,

    /**
    * Sends a request for fulfilling selected line items in a fulfillment order to a fulfillment service.
    * The corresponding mutation for this action is `fulfillmentOrderSubmitFulfillmentRequest`.
    */
    REQUEST_FULFILLMENT,

    /**
    * Splits a fulfillment order. The corresponding mutation for this action is `fulfillmentOrderSplit`.
    */
    SPLIT,

    UNKNOWN_VALUE;

    public static FulfillmentOrderAction fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCEL_FULFILLMENT_ORDER": {
                return CANCEL_FULFILLMENT_ORDER;
            }

            case "CREATE_FULFILLMENT": {
                return CREATE_FULFILLMENT;
            }

            case "EXTERNAL": {
                return EXTERNAL;
            }

            case "HOLD": {
                return HOLD;
            }

            case "MARK_AS_OPEN": {
                return MARK_AS_OPEN;
            }

            case "MERGE": {
                return MERGE;
            }

            case "MOVE": {
                return MOVE;
            }

            case "RELEASE_HOLD": {
                return RELEASE_HOLD;
            }

            case "REQUEST_CANCELLATION": {
                return REQUEST_CANCELLATION;
            }

            case "REQUEST_FULFILLMENT": {
                return REQUEST_FULFILLMENT;
            }

            case "SPLIT": {
                return SPLIT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCEL_FULFILLMENT_ORDER: {
                return "CANCEL_FULFILLMENT_ORDER";
            }

            case CREATE_FULFILLMENT: {
                return "CREATE_FULFILLMENT";
            }

            case EXTERNAL: {
                return "EXTERNAL";
            }

            case HOLD: {
                return "HOLD";
            }

            case MARK_AS_OPEN: {
                return "MARK_AS_OPEN";
            }

            case MERGE: {
                return "MERGE";
            }

            case MOVE: {
                return "MOVE";
            }

            case RELEASE_HOLD: {
                return "RELEASE_HOLD";
            }

            case REQUEST_CANCELLATION: {
                return "REQUEST_CANCELLATION";
            }

            case REQUEST_FULFILLMENT: {
                return "REQUEST_FULFILLMENT";
            }

            case SPLIT: {
                return "SPLIT";
            }

            default: {
                return "";
            }
        }
    }
}

