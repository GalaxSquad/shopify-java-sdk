// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `FulfillmentOrderSplitUserError`.
*/
public enum FulfillmentOrderSplitUserErrorCode {
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

    /**
    * The fulfillment order must have at least one line item input to split.
    */
    NO_LINE_ITEMS_PROVIDED_TO_SPLIT,

    UNKNOWN_VALUE;

    public static FulfillmentOrderSplitUserErrorCode fromGraphQl(String value) {
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

            case "NO_LINE_ITEMS_PROVIDED_TO_SPLIT": {
                return NO_LINE_ITEMS_PROVIDED_TO_SPLIT;
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

            case NO_LINE_ITEMS_PROVIDED_TO_SPLIT: {
                return "NO_LINE_ITEMS_PROVIDED_TO_SPLIT";
            }

            default: {
                return "";
            }
        }
    }
}

