// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The available icons for resource alerts.
*/
public enum ResourceAlertIcon {
    /**
    * A checkmark inside a circle.
    */
    CHECKMARK_CIRCLE,

    /**
    * A lowercase `i` inside a circle.
    */
    INFORMATION_CIRCLE,

    UNKNOWN_VALUE;

    public static ResourceAlertIcon fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CHECKMARK_CIRCLE": {
                return CHECKMARK_CIRCLE;
            }

            case "INFORMATION_CIRCLE": {
                return INFORMATION_CIRCLE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CHECKMARK_CIRCLE: {
                return "CHECKMARK_CIRCLE";
            }

            case INFORMATION_CIRCLE: {
                return "INFORMATION_CIRCLE";
            }

            default: {
                return "";
            }
        }
    }
}

