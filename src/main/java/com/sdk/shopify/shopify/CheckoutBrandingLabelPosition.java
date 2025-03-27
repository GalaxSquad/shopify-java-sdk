// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible values for the label position.
*/
public enum CheckoutBrandingLabelPosition {
    /**
    * The Inside label position.
    */
    INSIDE,

    /**
    * The Outside label position.
    */
    OUTSIDE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingLabelPosition fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INSIDE": {
                return INSIDE;
            }

            case "OUTSIDE": {
                return OUTSIDE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INSIDE: {
                return "INSIDE";
            }

            case OUTSIDE: {
                return "OUTSIDE";
            }

            default: {
                return "";
            }
        }
    }
}

