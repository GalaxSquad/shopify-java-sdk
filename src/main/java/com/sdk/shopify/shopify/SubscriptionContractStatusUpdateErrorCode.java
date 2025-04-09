// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `SubscriptionContractStatusUpdateUserError`.
*/
public enum SubscriptionContractStatusUpdateErrorCode {
    /**
    * Subscription contract status cannot be changed once terminated.
    */
    CONTRACT_TERMINATED,

    /**
    * The input value is invalid.
    */
    INVALID,

    UNKNOWN_VALUE;

    public static SubscriptionContractStatusUpdateErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONTRACT_TERMINATED": {
                return CONTRACT_TERMINATED;
            }

            case "INVALID": {
                return INVALID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONTRACT_TERMINATED: {
                return "CONTRACT_TERMINATED";
            }

            case INVALID: {
                return "INVALID";
            }

            default: {
                return "";
            }
        }
    }
}

