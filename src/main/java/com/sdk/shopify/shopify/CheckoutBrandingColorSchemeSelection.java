// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible color schemes.
*/
public enum CheckoutBrandingColorSchemeSelection {
    /**
    * The COLOR_SCHEME1 color scheme selection.
    */
    COLOR_SCHEME1,

    /**
    * The COLOR_SCHEME2 color scheme selection.
    */
    COLOR_SCHEME2,

    /**
    * The COLOR_SCHEME3 color scheme selection.
    */
    COLOR_SCHEME3,

    /**
    * The COLOR_SCHEME4 color scheme selection.
    */
    COLOR_SCHEME4,

    /**
    * The TRANSPARENT color scheme selection.
    */
    TRANSPARENT,

    UNKNOWN_VALUE;

    public static CheckoutBrandingColorSchemeSelection fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COLOR_SCHEME1": {
                return COLOR_SCHEME1;
            }

            case "COLOR_SCHEME2": {
                return COLOR_SCHEME2;
            }

            case "COLOR_SCHEME3": {
                return COLOR_SCHEME3;
            }

            case "COLOR_SCHEME4": {
                return COLOR_SCHEME4;
            }

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
            case COLOR_SCHEME1: {
                return "COLOR_SCHEME1";
            }

            case COLOR_SCHEME2: {
                return "COLOR_SCHEME2";
            }

            case COLOR_SCHEME3: {
                return "COLOR_SCHEME3";
            }

            case COLOR_SCHEME4: {
                return "COLOR_SCHEME4";
            }

            case TRANSPARENT: {
                return "TRANSPARENT";
            }

            default: {
                return "";
            }
        }
    }
}

