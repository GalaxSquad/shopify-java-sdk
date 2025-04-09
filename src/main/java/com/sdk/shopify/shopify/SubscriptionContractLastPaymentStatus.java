// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The possible status values of the last payment on a subscription contract.
*/
public enum SubscriptionContractLastPaymentStatus {
    /**
    * Failed subscription billing attempt.
    */
    FAILED,

    /**
    * Successful subscription billing attempt.
    */
    SUCCEEDED,

    UNKNOWN_VALUE;

    public static SubscriptionContractLastPaymentStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FAILED": {
                return FAILED;
            }

            case "SUCCEEDED": {
                return SUCCEEDED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FAILED: {
                return "FAILED";
            }

            case SUCCEEDED: {
                return "SUCCEEDED";
            }

            default: {
                return "";
            }
        }
    }
}

