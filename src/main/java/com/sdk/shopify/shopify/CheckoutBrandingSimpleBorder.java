// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible values for the simple border.
*/
public enum CheckoutBrandingSimpleBorder {
    /**
    * The Full simple border.
    */
    FULL,

    /**
    * The None simple border.
    */
    NONE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingSimpleBorder fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULL": {
                return FULL;
            }

            case "NONE": {
                return NONE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULL: {
                return "FULL";
            }

            case NONE: {
                return "NONE";
            }

            default: {
                return "";
            }
        }
    }
}

