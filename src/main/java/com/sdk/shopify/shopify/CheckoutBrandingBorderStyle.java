// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The container border style.
*/
public enum CheckoutBrandingBorderStyle {
    /**
    * The Base border style.
    */
    BASE,

    /**
    * The Dashed border style.
    */
    DASHED,

    /**
    * The Dotted border style.
    */
    DOTTED,

    UNKNOWN_VALUE;

    public static CheckoutBrandingBorderStyle fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "DASHED": {
                return DASHED;
            }

            case "DOTTED": {
                return DOTTED;
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

            case DASHED: {
                return "DASHED";
            }

            case DOTTED: {
                return "DOTTED";
            }

            default: {
                return "";
            }
        }
    }
}

