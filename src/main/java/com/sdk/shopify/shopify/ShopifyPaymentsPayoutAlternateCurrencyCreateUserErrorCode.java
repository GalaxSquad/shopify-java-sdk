// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by
* `ShopifyPaymentsPayoutAlternateCurrencyCreateUserError`.
*/
public enum ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCode {
    /**
    * Failed to create payout, there is no eligible balance in this currency.
    */
    ALTERNATE_CURRENCY_PAYOUT_FAILED_NO_ELIGIBLE_BALANCE,

    /**
    * Failed to create payout due to an error from Stripe.
    */
    ALTERNATE_CURRENCY_PAYOUT_FAILED_STRIPE_ERROR,

    /**
    * No Stripe provider account was found.
    */
    MISSING_PROVIDER_ACCOUNT,

    /**
    * Failed to create payout due to an error from Shopify Core.
    */
    UNKNOWN_CORE_ERROR,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALTERNATE_CURRENCY_PAYOUT_FAILED_NO_ELIGIBLE_BALANCE": {
                return ALTERNATE_CURRENCY_PAYOUT_FAILED_NO_ELIGIBLE_BALANCE;
            }

            case "ALTERNATE_CURRENCY_PAYOUT_FAILED_STRIPE_ERROR": {
                return ALTERNATE_CURRENCY_PAYOUT_FAILED_STRIPE_ERROR;
            }

            case "MISSING_PROVIDER_ACCOUNT": {
                return MISSING_PROVIDER_ACCOUNT;
            }

            case "UNKNOWN_CORE_ERROR": {
                return UNKNOWN_CORE_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALTERNATE_CURRENCY_PAYOUT_FAILED_NO_ELIGIBLE_BALANCE: {
                return "ALTERNATE_CURRENCY_PAYOUT_FAILED_NO_ELIGIBLE_BALANCE";
            }

            case ALTERNATE_CURRENCY_PAYOUT_FAILED_STRIPE_ERROR: {
                return "ALTERNATE_CURRENCY_PAYOUT_FAILED_STRIPE_ERROR";
            }

            case MISSING_PROVIDER_ACCOUNT: {
                return "MISSING_PROVIDER_ACCOUNT";
            }

            case UNKNOWN_CORE_ERROR: {
                return "UNKNOWN_CORE_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

