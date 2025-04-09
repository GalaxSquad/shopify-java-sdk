// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible values for the background style.
*/
public enum CheckoutBrandingBackgroundStyle {
    /**
    * The None background style.
    */
    NONE,

    /**
    * The Solid background style.
    */
    SOLID,

    UNKNOWN_VALUE;

    public static CheckoutBrandingBackgroundStyle fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NONE": {
                return NONE;
            }

            case "SOLID": {
                return SOLID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NONE: {
                return "NONE";
            }

            case SOLID: {
                return "SOLID";
            }

            default: {
                return "";
            }
        }
    }
}

