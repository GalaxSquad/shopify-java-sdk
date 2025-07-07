// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The valid values for the notification usage, specifying the intended notification environment usage
* for certain operations.
*/
public enum NotificationUsage {
    /**
    * The notification environment is sms.
    */
    SMS,

    /**
    * The notification environment is web.
    */
    WEB,

    UNKNOWN_VALUE;

    public static NotificationUsage fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "SMS": {
                return SMS;
            }

            case "WEB": {
                return WEB;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case SMS: {
                return "SMS";
            }

            case WEB: {
                return "WEB";
            }

            default: {
                return "";
            }
        }
    }
}

