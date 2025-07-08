// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The order's status in terms of fulfilled line items.
*/
public enum OrderCreateFulfillmentStatus {
    /**
    * Every line item in the order has been fulfilled.
    */
    FULFILLED,

    /**
    * At least one line item in the order has been fulfilled.
    */
    PARTIAL,

    /**
    * Every line item in the order has been restocked and the order canceled.
    */
    RESTOCKED,

    UNKNOWN_VALUE;

    public static OrderCreateFulfillmentStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLED": {
                return FULFILLED;
            }

            case "PARTIAL": {
                return PARTIAL;
            }

            case "RESTOCKED": {
                return RESTOCKED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULFILLED: {
                return "FULFILLED";
            }

            case PARTIAL: {
                return "PARTIAL";
            }

            case RESTOCKED: {
                return "RESTOCKED";
            }

            default: {
                return "";
            }
        }
    }
}

