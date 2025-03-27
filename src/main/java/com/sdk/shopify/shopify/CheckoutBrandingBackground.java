// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The container background style.
*/
public enum CheckoutBrandingBackground {
    /**
    * The Base background style.
    */
    BASE,

    /**
    * The Subdued background style.
    */
    SUBDUED,

    /**
    * The Transparent background style.
    */
    TRANSPARENT,

    UNKNOWN_VALUE;

    public static CheckoutBrandingBackground fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "SUBDUED": {
                return SUBDUED;
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
            case BASE: {
                return "BASE";
            }

            case SUBDUED: {
                return "SUBDUED";
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

