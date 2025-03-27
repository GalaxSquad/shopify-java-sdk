// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The possible status values of a subscription.
*/
public enum SubscriptionContractSubscriptionStatus {
    /**
    * The contract is active and continuing per its policies.
    */
    ACTIVE,

    /**
    * The contract was ended by an unplanned customer action.
    */
    CANCELLED,

    /**
    * The contract has ended per the expected circumstances. All billing and deliverycycles of the
    * subscriptions were executed.
    */
    EXPIRED,

    /**
    * The contract ended because billing failed and no further billing attempts are expected.
    */
    FAILED,

    /**
    * The contract is temporarily paused and is expected to resume in the future.
    */
    PAUSED,

    UNKNOWN_VALUE;

    public static SubscriptionContractSubscriptionStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "CANCELLED": {
                return CANCELLED;
            }

            case "EXPIRED": {
                return EXPIRED;
            }

            case "FAILED": {
                return FAILED;
            }

            case "PAUSED": {
                return PAUSED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE: {
                return "ACTIVE";
            }

            case CANCELLED: {
                return "CANCELLED";
            }

            case EXPIRED: {
                return "EXPIRED";
            }

            case FAILED: {
                return "FAILED";
            }

            case PAUSED: {
                return "PAUSED";
            }

            default: {
                return "";
            }
        }
    }
}

