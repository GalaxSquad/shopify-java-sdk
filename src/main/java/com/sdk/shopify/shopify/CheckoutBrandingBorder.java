// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible values for the border.
*/
public enum CheckoutBrandingBorder {
    /**
    * The Block End border.
    */
    BLOCK_END,

    /**
    * The Full border.
    */
    FULL,

    /**
    * The None border.
    */
    NONE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingBorder fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLOCK_END": {
                return BLOCK_END;
            }

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
            case BLOCK_END: {
                return "BLOCK_END";
            }

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

