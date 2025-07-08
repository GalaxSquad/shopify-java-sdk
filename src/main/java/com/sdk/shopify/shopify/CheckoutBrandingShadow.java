// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The container shadow.
*/
public enum CheckoutBrandingShadow {
    /**
    * The Base shadow.
    */
    BASE,

    /**
    * The Large 100 shadow.
    */
    LARGE_100,

    /**
    * The Large 200 shadow.
    */
    LARGE_200,

    /**
    * The Small 100 shadow.
    */
    SMALL_100,

    /**
    * The Small 200 shadow.
    */
    SMALL_200,

    UNKNOWN_VALUE;

    public static CheckoutBrandingShadow fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "LARGE_100": {
                return LARGE_100;
            }

            case "LARGE_200": {
                return LARGE_200;
            }

            case "SMALL_100": {
                return SMALL_100;
            }

            case "SMALL_200": {
                return SMALL_200;
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

            case LARGE_100: {
                return "LARGE_100";
            }

            case LARGE_200: {
                return "LARGE_200";
            }

            case SMALL_100: {
                return "SMALL_100";
            }

            case SMALL_200: {
                return "SMALL_200";
            }

            default: {
                return "";
            }
        }
    }
}

