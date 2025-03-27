// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `FulfillmentOrderReleaseHoldUserError`.
*/
public enum FulfillmentOrderReleaseHoldUserErrorCode {
    /**
    * The fulfillment order wasn't found.
    */
    FULFILLMENT_ORDER_NOT_FOUND,

    /**
    * The app doesn't have access to release the fulfillment hold.
    */
    INVALID_ACCESS,

    UNKNOWN_VALUE;

    public static FulfillmentOrderReleaseHoldUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLMENT_ORDER_NOT_FOUND": {
                return FULFILLMENT_ORDER_NOT_FOUND;
            }

            case "INVALID_ACCESS": {
                return INVALID_ACCESS;
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

            case INVALID_ACCESS: {
                return "INVALID_ACCESS";
            }

            default: {
                return "";
            }
        }
    }
}

