// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The intended audience for the order status page.
*/
public enum Audience {
    /**
    * Intended for customer notifications.
    */
    CUSTOMERVIEW,

    /**
    * Intended for merchant wanting to preview the order status page. Should be used immediately after
    * querying.
    */
    MERCHANTVIEW,

    UNKNOWN_VALUE;

    public static Audience fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMERVIEW": {
                return CUSTOMERVIEW;
            }

            case "MERCHANTVIEW": {
                return MERCHANTVIEW;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMERVIEW: {
                return "CUSTOMERVIEW";
            }

            case MERCHANTVIEW: {
                return "MERCHANTVIEW";
            }

            default: {
                return "";
            }
        }
    }
}

