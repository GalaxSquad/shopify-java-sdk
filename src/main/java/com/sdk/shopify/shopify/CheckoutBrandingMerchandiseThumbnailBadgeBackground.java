// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The merchandise thumbnail badge background.
*/
public enum CheckoutBrandingMerchandiseThumbnailBadgeBackground {
    /**
    * The Accent background.
    */
    ACCENT,

    /**
    * The Base background.
    */
    BASE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingMerchandiseThumbnailBadgeBackground fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCENT": {
                return ACCENT;
            }

            case "BASE": {
                return BASE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCENT: {
                return "ACCENT";
            }

            case BASE: {
                return "BASE";
            }

            default: {
                return "";
            }
        }
    }
}

