// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The possible colors.
*/
public enum CheckoutBrandingColorSelection {
    /**
    * Transparent color selection.
    */
    TRANSPARENT,

    UNKNOWN_VALUE;

    public static CheckoutBrandingColorSelection fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "TRANSPARENT": {
                return TRANSPARENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case TRANSPARENT: {
                return "TRANSPARENT";
            }

            default: {
                return "";
            }
        }
    }
}

