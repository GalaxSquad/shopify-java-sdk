// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Specifies the abandonment type.
*/
public enum AbandonmentAbandonmentType {
    /**
    * The abandonment event is an abandoned browse.
    */
    BROWSE,

    /**
    * The abandonment event is an abandoned cart.
    */
    CART,

    /**
    * The abandonment event is an abandoned checkout.
    */
    CHECKOUT,

    UNKNOWN_VALUE;

    public static AbandonmentAbandonmentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BROWSE": {
                return BROWSE;
            }

            case "CART": {
                return CART;
            }

            case "CHECKOUT": {
                return CHECKOUT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BROWSE: {
                return "BROWSE";
            }

            case CART: {
                return "CART";
            }

            case CHECKOUT: {
                return "CHECKOUT";
            }

            default: {
                return "";
            }
        }
    }
}

