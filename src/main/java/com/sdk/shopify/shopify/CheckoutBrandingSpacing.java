// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible values for the spacing.
*/
public enum CheckoutBrandingSpacing {
    /**
    * The Base spacing.
    */
    BASE,

    /**
    * The Extra Loose spacing.
    */
    EXTRA_LOOSE,

    /**
    * The Extra Tight spacing.
    */
    EXTRA_TIGHT,

    /**
    * The Loose spacing.
    */
    LOOSE,

    /**
    * The None spacing.
    */
    NONE,

    /**
    * The Tight spacing.
    */
    TIGHT,

    UNKNOWN_VALUE;

    public static CheckoutBrandingSpacing fromGraphQl(String value) {
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

            case "EXTRA_TIGHT": {
                return EXTRA_TIGHT;
            }

            case "LOOSE": {
                return LOOSE;
            }

            case "NONE": {
                return NONE;
            }

            case "TIGHT": {
                return TIGHT;
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

            case EXTRA_TIGHT: {
                return "EXTRA_TIGHT";
            }

            case LOOSE: {
                return "LOOSE";
            }

            case NONE: {
                return "NONE";
            }

            case TIGHT: {
                return "TIGHT";
            }

            default: {
                return "";
            }
        }
    }
}

