// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `FulfillmentOrderRescheduleUserError`.
*/
public enum FulfillmentOrderRescheduleUserErrorCode {
    /**
    * Fulfillment order could not be found.
    */
    FULFILLMENT_ORDER_NOT_FOUND,

    UNKNOWN_VALUE;

    public static FulfillmentOrderRescheduleUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLMENT_ORDER_NOT_FOUND": {
                return FULFILLMENT_ORDER_NOT_FOUND;
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

            default: {
                return "";
            }
        }
    }
}

