// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The possible status values of a subscription billing cycle.
*/
public enum SubscriptionBillingCycleBillingCycleStatus {
    /**
    * The billing cycle is billed.
    */
    BILLED,

    /**
    * The billing cycle hasn't been billed.
    */
    UNBILLED,

    UNKNOWN_VALUE;

    public static SubscriptionBillingCycleBillingCycleStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BILLED": {
                return BILLED;
            }

            case "UNBILLED": {
                return UNBILLED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BILLED: {
                return "BILLED";
            }

            case UNBILLED: {
                return "UNBILLED";
            }

            default: {
                return "";
            }
        }
    }
}

