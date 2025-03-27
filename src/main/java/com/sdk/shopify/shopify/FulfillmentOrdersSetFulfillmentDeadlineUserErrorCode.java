// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `FulfillmentOrdersSetFulfillmentDeadlineUserError`.
*/
public enum FulfillmentOrdersSetFulfillmentDeadlineUserErrorCode {
    /**
    * The fulfillment orders could not be found.
    */
    FULFILLMENT_ORDERS_NOT_FOUND,

    UNKNOWN_VALUE;

    public static FulfillmentOrdersSetFulfillmentDeadlineUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLMENT_ORDERS_NOT_FOUND": {
                return FULFILLMENT_ORDERS_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULFILLMENT_ORDERS_NOT_FOUND: {
                return "FULFILLMENT_ORDERS_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

