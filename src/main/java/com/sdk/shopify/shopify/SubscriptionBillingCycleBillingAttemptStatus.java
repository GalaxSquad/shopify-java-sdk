// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The presence of billing attempts on Billing Cycles.
*/
public enum SubscriptionBillingCycleBillingAttemptStatus {
    /**
    * Billing cycle has any number of billing attempts.
    */
    ANY,

    /**
    * Billing cycle has at least one billing attempt.
    */
    HAS_ATTEMPT,

    /**
    * Billing cycle has no billing attempts.
    */
    NO_ATTEMPT,

    UNKNOWN_VALUE;

    public static SubscriptionBillingCycleBillingAttemptStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ANY": {
                return ANY;
            }

            case "HAS_ATTEMPT": {
                return HAS_ATTEMPT;
            }

            case "NO_ATTEMPT": {
                return NO_ATTEMPT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ANY: {
                return "ANY";
            }

            case HAS_ATTEMPT: {
                return "HAS_ATTEMPT";
            }

            case NO_ATTEMPT: {
                return "NO_ATTEMPT";
            }

            default: {
                return "";
            }
        }
    }
}

