// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible header alignments.
*/
public enum CheckoutBrandingHeaderAlignment {
    /**
    * Center alignment.
    */
    CENTER,

    /**
    * End alignment.
    */
    END,

    /**
    * Start alignment.
    */
    START,

    UNKNOWN_VALUE;

    public static CheckoutBrandingHeaderAlignment fromGraphQl(String value) {
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

