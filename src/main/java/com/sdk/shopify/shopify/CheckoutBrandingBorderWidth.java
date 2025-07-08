// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The container border width.
*/
public enum CheckoutBrandingBorderWidth {
    /**
    * The Base border width.
    */
    BASE,

    /**
    * The Large border width.
    */
    LARGE,

    /**
    * The Large 100 border width.
    */
    LARGE_100,

    /**
    * The Large 200 border width.
    */
    LARGE_200,

    UNKNOWN_VALUE;

    public static CheckoutBrandingBorderWidth fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "LARGE": {
                return LARGE;
            }

            case "LARGE_100": {
                return LARGE_100;
            }

            case "LARGE_200": {
                return LARGE_200;
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

            case LARGE: {
                return "LARGE";
            }

            case LARGE_100: {
                return "LARGE_100";
            }

            case LARGE_200: {
                return "LARGE_200";
            }

            default: {
                return "";
            }
        }
    }
}

