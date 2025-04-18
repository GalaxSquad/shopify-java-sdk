// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `CustomerPaymentMethodRemoteUserError`.
*/
public enum CustomerPaymentMethodRemoteUserErrorCode {
    /**
    * Authorize.net is not enabled for subscriptions.
    */
    AUTHORIZE_NET_NOT_ENABLED_FOR_SUBSCRIPTIONS,

    /**
    * Braintree is not enabled for subscriptions.
    */
    BRAINTREE_NOT_ENABLED_FOR_SUBSCRIPTIONS,

    /**
    * Exactly one remote reference is required.
    */
    EXACTLY_ONE_REMOTE_REFERENCE_REQUIRED,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * The input value is already taken.
    */
    TAKEN,

    UNKNOWN_VALUE;

    public static CustomerPaymentMethodRemoteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTHORIZE_NET_NOT_ENABLED_FOR_SUBSCRIPTIONS": {
                return AUTHORIZE_NET_NOT_ENABLED_FOR_SUBSCRIPTIONS;
            }

            case "BRAINTREE_NOT_ENABLED_FOR_SUBSCRIPTIONS": {
                return BRAINTREE_NOT_ENABLED_FOR_SUBSCRIPTIONS;
            }

            case "EXACTLY_ONE_REMOTE_REFERENCE_REQUIRED": {
                return EXACTLY_ONE_REMOTE_REFERENCE_REQUIRED;
            }

            case "INVALID": {
                return INVALID;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "TAKEN": {
                return TAKEN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTHORIZE_NET_NOT_ENABLED_FOR_SUBSCRIPTIONS: {
                return "AUTHORIZE_NET_NOT_ENABLED_FOR_SUBSCRIPTIONS";
            }

            case BRAINTREE_NOT_ENABLED_FOR_SUBSCRIPTIONS: {
                return "BRAINTREE_NOT_ENABLED_FOR_SUBSCRIPTIONS";
            }

            case EXACTLY_ONE_REMOTE_REFERENCE_REQUIRED: {
                return "EXACTLY_ONE_REMOTE_REFERENCE_REQUIRED";
            }

            case INVALID: {
                return "INVALID";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case TAKEN: {
                return "TAKEN";
            }

            default: {
                return "";
            }
        }
    }
}

