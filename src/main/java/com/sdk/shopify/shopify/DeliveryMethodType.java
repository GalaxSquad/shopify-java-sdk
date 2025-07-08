// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible method types that a delivery method can have.
*/
public enum DeliveryMethodType {
    /**
    * The order is delivered using a local delivery service.
    */
    LOCAL,

    /**
    * Non-physical items, no delivery needed.
    */
    NONE,

    /**
    * The order is delivered to a pickup point.
    */
    PICKUP_POINT,

    /**
    * The order is picked up by the customer.
    */
    PICK_UP,

    /**
    * In-store sale, no delivery needed.
    */
    RETAIL,

    /**
    * The order is shipped.
    */
    SHIPPING,

    UNKNOWN_VALUE;

    public static DeliveryMethodType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "LOCAL": {
                return LOCAL;
            }

            case "NONE": {
                return NONE;
            }

            case "PICKUP_POINT": {
                return PICKUP_POINT;
            }

            case "PICK_UP": {
                return PICK_UP;
            }

            case "RETAIL": {
                return RETAIL;
            }

            case "SHIPPING": {
                return SHIPPING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case LOCAL: {
                return "LOCAL";
            }

            case NONE: {
                return "NONE";
            }

            case PICKUP_POINT: {
                return "PICKUP_POINT";
            }

            case PICK_UP: {
                return "PICK_UP";
            }

            case RETAIL: {
                return "RETAIL";
            }

            case SHIPPING: {
                return "SHIPPING";
            }

            default: {
                return "";
            }
        }
    }
}

