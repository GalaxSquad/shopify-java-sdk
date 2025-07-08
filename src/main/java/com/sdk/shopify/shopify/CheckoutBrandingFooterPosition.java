// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible values for the footer position.
*/
public enum CheckoutBrandingFooterPosition {
    /**
    * The End footer position.
    */
    END,

    /**
    * The Inline footer position.
    */
    INLINE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingFooterPosition fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "END": {
                return END;
            }

            case "INLINE": {
                return INLINE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case END: {
                return "END";
            }

            case INLINE: {
                return "INLINE";
            }

            default: {
                return "";
            }
        }
    }
}

