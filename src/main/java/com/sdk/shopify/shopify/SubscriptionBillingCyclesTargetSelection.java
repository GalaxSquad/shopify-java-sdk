// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Select subscription billing cycles to be targeted.
*/
public enum SubscriptionBillingCyclesTargetSelection {
    /**
    * Target all current and upcoming subscription billing cycles.
    */
    ALL,

    UNKNOWN_VALUE;

    public static SubscriptionBillingCyclesTargetSelection fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALL": {
                return ALL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALL: {
                return "ALL";
            }

            default: {
                return "";
            }
        }
    }
}

