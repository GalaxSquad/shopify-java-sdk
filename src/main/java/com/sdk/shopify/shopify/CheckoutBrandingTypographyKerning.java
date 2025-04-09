// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible values for the typography kerning.
*/
public enum CheckoutBrandingTypographyKerning {
    /**
    * Base or default kerning.
    */
    BASE,

    /**
    * Extra loose kerning, leaving even more space in between characters.
    */
    EXTRA_LOOSE,

    /**
    * Loose kerning, leaving more space than the default in between characters.
    */
    LOOSE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingTypographyKerning fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "EXTRA_LOOSE": {
                return EXTRA_LOOSE;
            }

            case "LOOSE": {
                return LOOSE;
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

            case EXTRA_LOOSE: {
                return "EXTRA_LOOSE";
            }

            case LOOSE: {
                return "LOOSE";
            }

            default: {
                return "";
            }
        }
    }
}

