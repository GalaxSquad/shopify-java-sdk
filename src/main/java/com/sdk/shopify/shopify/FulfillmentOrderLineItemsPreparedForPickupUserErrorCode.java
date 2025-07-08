// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `FulfillmentOrderLineItemsPreparedForPickupUserError`.
*/
public enum FulfillmentOrderLineItemsPreparedForPickupUserErrorCode {
    /**
    * Invalid fulfillment order ID provided.
    */
    FULFILLMENT_ORDER_INVALID,

    /**
    * The fulfillment order does not have any line items that can be prepared.
    */
    NO_LINE_ITEMS_TO_PREPARE_FOR_FULFILLMENT_ORDER,

    /**
    * Unable to prepare quantity.
    */
    UNABLE_TO_PREPARE_QUANTITY,

    UNKNOWN_VALUE;

    public static FulfillmentOrderLineItemsPreparedForPickupUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLMENT_ORDER_INVALID": {
                return FULFILLMENT_ORDER_INVALID;
            }

            case "NO_LINE_ITEMS_TO_PREPARE_FOR_FULFILLMENT_ORDER": {
                return NO_LINE_ITEMS_TO_PREPARE_FOR_FULFILLMENT_ORDER;
            }

            case "UNABLE_TO_PREPARE_QUANTITY": {
                return UNABLE_TO_PREPARE_QUANTITY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULFILLMENT_ORDER_INVALID: {
                return "FULFILLMENT_ORDER_INVALID";
            }

            case NO_LINE_ITEMS_TO_PREPARE_FOR_FULFILLMENT_ORDER: {
                return "NO_LINE_ITEMS_TO_PREPARE_FOR_FULFILLMENT_ORDER";
            }

            case UNABLE_TO_PREPARE_QUANTITY: {
                return "UNABLE_TO_PREPARE_QUANTITY";
            }

            default: {
                return "";
            }
        }
    }
}

