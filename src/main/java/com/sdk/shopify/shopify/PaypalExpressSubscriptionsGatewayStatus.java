// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Represents a valid PayPal Express subscriptions gateway status.
*/
public enum PaypalExpressSubscriptionsGatewayStatus {
    /**
    * The status is disabled.
    */
    DISABLED,

    /**
    * The status is enabled.
    */
    ENABLED,

    /**
    * The status is pending.
    */
    PENDING,

    UNKNOWN_VALUE;

    public static PaypalExpressSubscriptionsGatewayStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DISABLED": {
                return DISABLED;
            }

            case "ENABLED": {
                return ENABLED;
            }

            case "PENDING": {
                return PENDING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DISABLED: {
                return "DISABLED";
            }

            case ENABLED: {
                return "ENABLED";
            }

            case PENDING: {
                return "PENDING";
            }

            default: {
                return "";
            }
        }
    }
}

