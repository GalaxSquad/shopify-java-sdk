// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The font selection.
*/
public enum CheckoutBrandingTypographyFont {
    /**
    * The primary font.
    */
    PRIMARY,

    /**
    * The secondary font.
    */
    SECONDARY,

    UNKNOWN_VALUE;

    public static CheckoutBrandingTypographyFont fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PRIMARY": {
                return PRIMARY;
            }

            case "SECONDARY": {
                return SECONDARY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PRIMARY: {
                return "PRIMARY";
            }

            case SECONDARY: {
                return "SECONDARY";
            }

            default: {
                return "";
            }
        }
    }
}

