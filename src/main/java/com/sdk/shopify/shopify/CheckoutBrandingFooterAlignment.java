// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible values for the footer alignment.
*/
public enum CheckoutBrandingFooterAlignment {
    /**
    * The checkout footer alignment Center value.
    */
    CENTER,

    /**
    * The checkout footer alignment End value.
    */
    END,

    /**
    * The checkout footer alignment Start value.
    */
    START,

    UNKNOWN_VALUE;

    public static CheckoutBrandingFooterAlignment fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CENTER": {
                return CENTER;
            }

            case "END": {
                return END;
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
            case CENTER: {
                return "CENTER";
            }

            case END: {
                return "END";
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

