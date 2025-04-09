// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible values for the font weight.
*/
public enum CheckoutBrandingTypographyWeight {
    /**
    * The base weight.
    */
    BASE,

    /**
    * The bold weight.
    */
    BOLD,

    UNKNOWN_VALUE;

    public static CheckoutBrandingTypographyWeight fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "BOLD": {
                return BOLD;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BASE: {
                return "BASE";
            }

            case BOLD: {
                return "BOLD";
            }

            default: {
                return "";
            }
        }
    }
}

