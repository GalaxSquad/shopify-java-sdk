// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The possible header positions.
*/
public enum CheckoutBrandingHeaderPosition {
    /**
    * Inline position.
    */
    INLINE,

    /**
    * Secondary inline position.
    */
    INLINE_SECONDARY,

    /**
    * Start position.
    */
    START,

    UNKNOWN_VALUE;

    public static CheckoutBrandingHeaderPosition fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INLINE": {
                return INLINE;
            }

            case "INLINE_SECONDARY": {
                return INLINE_SECONDARY;
            }

            case "START": {
                return START;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INLINE: {
                return "INLINE";
            }

            case INLINE_SECONDARY: {
                return "INLINE_SECONDARY";
            }

            case START: {
                return "START";
            }

            default: {
                return "";
            }
        }
    }
}

