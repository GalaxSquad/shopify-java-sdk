// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The status of a reverse fulfillment order.
*/
public enum ReverseFulfillmentOrderStatus {
    /**
    * The reverse fulfillment order has been canceled.
    */
    CANCELED,

    /**
    * The reverse fulfillment order has been completed.
    */
    CLOSED,

    /**
    * The reverse fulfillment order is in progress.
    */
    OPEN,

    UNKNOWN_VALUE;

    public static ReverseFulfillmentOrderStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELED": {
                return CANCELED;
            }

            case "CLOSED": {
                return CLOSED;
            }

            case "OPEN": {
                return OPEN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELED: {
                return "CANCELED";
            }

            case CLOSED: {
                return "CLOSED";
            }

            case OPEN: {
                return "OPEN";
            }

            default: {
                return "";
            }
        }
    }
}

