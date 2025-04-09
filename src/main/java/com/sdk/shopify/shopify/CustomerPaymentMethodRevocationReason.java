// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The revocation reason types for a customer payment method.
*/
public enum CustomerPaymentMethodRevocationReason {
    /**
    * The Authorize.net payment gateway is not enabled.
    */
    AUTHORIZE_NET_GATEWAY_NOT_ENABLED,

    /**
    * Authorize.net did not return any payment methods. Make sure that the correct Authorize.net account
    * is linked.
    */
    AUTHORIZE_NET_RETURNED_NO_PAYMENT_METHOD,

    /**
    * Failed to contact Braintree API.
    */
    BRAINTREE_API_AUTHENTICATION_ERROR,

    /**
    * The Braintree payment gateway is not enabled.
    */
    BRAINTREE_GATEWAY_NOT_ENABLED,

    /**
    * The Braintree payment method type should be a credit card or Apple Pay card.
    */
    BRAINTREE_PAYMENT_METHOD_NOT_CARD,

    /**
    * Braintree returned no payment methods. Make sure the correct Braintree account is linked.
    */
    BRAINTREE_RETURNED_NO_PAYMENT_METHOD,

    /**
    * The billing address failed to retrieve.
    */
    FAILED_TO_RETRIEVE_BILLING_ADDRESS,

    /**
    * The credit card failed to update.
    */
    FAILED_TO_UPDATE_CREDIT_CARD,

    /**
    * The payment method was manually revoked.
    */
    MANUALLY_REVOKED,

    /**
    * The payment method was replaced with an existing payment method. The associated contracts have been
    * migrated to the other payment method.
    */
    MERGED,

    /**
    * Verification of payment method failed.
    */
    PAYMENT_METHOD_VERIFICATION_FAILED,

    /**
    * Failed to contact the Stripe API.
    */
    STRIPE_API_AUTHENTICATION_ERROR,

    /**
    * Invalid request. Failed to retrieve payment method from Stripe.
    */
    STRIPE_API_INVALID_REQUEST_ERROR,

    /**
    * The Stripe payment gateway is not enabled.
    */
    STRIPE_GATEWAY_NOT_ENABLED,

    /**
    * The Stripe payment method type should be card.
    */
    STRIPE_PAYMENT_METHOD_NOT_CARD,

    /**
    * Stripe did not return any payment methods. Make sure that the correct Stripe account is linked.
    */
    STRIPE_RETURNED_NO_PAYMENT_METHOD,

    /**
    * Verification of the payment method failed due to 3DS not being supported.
    */
    THREE_D_SECURE_FLOW_IN_VERIFICATION_NOT_IMPLEMENTED,

    UNKNOWN_VALUE;

    public static CustomerPaymentMethodRevocationReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTHORIZE_NET_GATEWAY_NOT_ENABLED": {
                return AUTHORIZE_NET_GATEWAY_NOT_ENABLED;
            }

            case "AUTHORIZE_NET_RETURNED_NO_PAYMENT_METHOD": {
                return AUTHORIZE_NET_RETURNED_NO_PAYMENT_METHOD;
            }

            case "BRAINTREE_API_AUTHENTICATION_ERROR": {
                return BRAINTREE_API_AUTHENTICATION_ERROR;
            }

            case "BRAINTREE_GATEWAY_NOT_ENABLED": {
                return BRAINTREE_GATEWAY_NOT_ENABLED;
            }

            case "BRAINTREE_PAYMENT_METHOD_NOT_CARD": {
                return BRAINTREE_PAYMENT_METHOD_NOT_CARD;
            }

            case "BRAINTREE_RETURNED_NO_PAYMENT_METHOD": {
                return BRAINTREE_RETURNED_NO_PAYMENT_METHOD;
            }

            case "FAILED_TO_RETRIEVE_BILLING_ADDRESS": {
                return FAILED_TO_RETRIEVE_BILLING_ADDRESS;
            }

            case "FAILED_TO_UPDATE_CREDIT_CARD": {
                return FAILED_TO_UPDATE_CREDIT_CARD;
            }

            case "MANUALLY_REVOKED": {
                return MANUALLY_REVOKED;
            }

            case "MERGED": {
                return MERGED;
            }

            case "PAYMENT_METHOD_VERIFICATION_FAILED": {
                return PAYMENT_METHOD_VERIFICATION_FAILED;
            }

            case "STRIPE_API_AUTHENTICATION_ERROR": {
                return STRIPE_API_AUTHENTICATION_ERROR;
            }

            case "STRIPE_API_INVALID_REQUEST_ERROR": {
                return STRIPE_API_INVALID_REQUEST_ERROR;
            }

            case "STRIPE_GATEWAY_NOT_ENABLED": {
                return STRIPE_GATEWAY_NOT_ENABLED;
            }

            case "STRIPE_PAYMENT_METHOD_NOT_CARD": {
                return STRIPE_PAYMENT_METHOD_NOT_CARD;
            }

            case "STRIPE_RETURNED_NO_PAYMENT_METHOD": {
                return STRIPE_RETURNED_NO_PAYMENT_METHOD;
            }

            case "THREE_D_SECURE_FLOW_IN_VERIFICATION_NOT_IMPLEMENTED": {
                return THREE_D_SECURE_FLOW_IN_VERIFICATION_NOT_IMPLEMENTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTHORIZE_NET_GATEWAY_NOT_ENABLED: {
                return "AUTHORIZE_NET_GATEWAY_NOT_ENABLED";
            }

            case AUTHORIZE_NET_RETURNED_NO_PAYMENT_METHOD: {
                return "AUTHORIZE_NET_RETURNED_NO_PAYMENT_METHOD";
            }

            case BRAINTREE_API_AUTHENTICATION_ERROR: {
                return "BRAINTREE_API_AUTHENTICATION_ERROR";
            }

            case BRAINTREE_GATEWAY_NOT_ENABLED: {
                return "BRAINTREE_GATEWAY_NOT_ENABLED";
            }

            case BRAINTREE_PAYMENT_METHOD_NOT_CARD: {
                return "BRAINTREE_PAYMENT_METHOD_NOT_CARD";
            }

            case BRAINTREE_RETURNED_NO_PAYMENT_METHOD: {
                return "BRAINTREE_RETURNED_NO_PAYMENT_METHOD";
            }

            case FAILED_TO_RETRIEVE_BILLING_ADDRESS: {
                return "FAILED_TO_RETRIEVE_BILLING_ADDRESS";
            }

            case FAILED_TO_UPDATE_CREDIT_CARD: {
                return "FAILED_TO_UPDATE_CREDIT_CARD";
            }

            case MANUALLY_REVOKED: {
                return "MANUALLY_REVOKED";
            }

            case MERGED: {
                return "MERGED";
            }

            case PAYMENT_METHOD_VERIFICATION_FAILED: {
                return "PAYMENT_METHOD_VERIFICATION_FAILED";
            }

            case STRIPE_API_AUTHENTICATION_ERROR: {
                return "STRIPE_API_AUTHENTICATION_ERROR";
            }

            case STRIPE_API_INVALID_REQUEST_ERROR: {
                return "STRIPE_API_INVALID_REQUEST_ERROR";
            }

            case STRIPE_GATEWAY_NOT_ENABLED: {
                return "STRIPE_GATEWAY_NOT_ENABLED";
            }

            case STRIPE_PAYMENT_METHOD_NOT_CARD: {
                return "STRIPE_PAYMENT_METHOD_NOT_CARD";
            }

            case STRIPE_RETURNED_NO_PAYMENT_METHOD: {
                return "STRIPE_RETURNED_NO_PAYMENT_METHOD";
            }

            case THREE_D_SECURE_FLOW_IN_VERIFICATION_NOT_IMPLEMENTED: {
                return "THREE_D_SECURE_FLOW_IN_VERIFICATION_NOT_IMPLEMENTED";
            }

            default: {
                return "";
            }
        }
    }
}

