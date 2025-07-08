// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible visibility states.
*/
public enum CheckoutBrandingVisibility {
    /**
    * The Hidden visibility setting.
    */
    HIDDEN,

    /**
    * The Visible visibility setting.
    */
    VISIBLE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingVisibility fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "HIDDEN": {
                return HIDDEN;
            }

            case "VISIBLE": {
                return VISIBLE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case HIDDEN: {
                return "HIDDEN";
            }

            case VISIBLE: {
                return "VISIBLE";
            }

            default: {
                return "";
            }
        }
    }
}

