// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `StoreCreditAccountCreditUserError`.
*/
public enum StoreCreditAccountCreditUserErrorCode {
    /**
    * The store credit account could not be found.
    */
    ACCOUNT_NOT_FOUND,

    /**
    * The operation would cause the account's credit limit to be exceeded.
    */
    CREDIT_LIMIT_EXCEEDED,

    /**
    * The expiry date must be in the future.
    */
    EXPIRES_AT_IN_PAST,

    /**
    * The currency provided does not match the currency of the store credit account.
    */
    MISMATCHING_CURRENCY,

    /**
    * A positive amount must be used to credit a store credit account.
    */
    NEGATIVE_OR_ZERO_AMOUNT,

    /**
    * Owner does not exist.
    */
    OWNER_NOT_FOUND,

    /**
    * The currency provided is not currently supported.
    */
    UNSUPPORTED_CURRENCY,

    UNKNOWN_VALUE;

    public static StoreCreditAccountCreditUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCOUNT_NOT_FOUND": {
                return ACCOUNT_NOT_FOUND;
            }

            case "CREDIT_LIMIT_EXCEEDED": {
                return CREDIT_LIMIT_EXCEEDED;
            }

            case "EXPIRES_AT_IN_PAST": {
                return EXPIRES_AT_IN_PAST;
            }

            case "MISMATCHING_CURRENCY": {
                return MISMATCHING_CURRENCY;
            }

            case "NEGATIVE_OR_ZERO_AMOUNT": {
                return NEGATIVE_OR_ZERO_AMOUNT;
            }

            case "OWNER_NOT_FOUND": {
                return OWNER_NOT_FOUND;
            }

            case "UNSUPPORTED_CURRENCY": {
                return UNSUPPORTED_CURRENCY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCOUNT_NOT_FOUND: {
                return "ACCOUNT_NOT_FOUND";
            }

            case CREDIT_LIMIT_EXCEEDED: {
                return "CREDIT_LIMIT_EXCEEDED";
            }

            case EXPIRES_AT_IN_PAST: {
                return "EXPIRES_AT_IN_PAST";
            }

            case MISMATCHING_CURRENCY: {
                return "MISMATCHING_CURRENCY";
            }

            case NEGATIVE_OR_ZERO_AMOUNT: {
                return "NEGATIVE_OR_ZERO_AMOUNT";
            }

            case OWNER_NOT_FOUND: {
                return "OWNER_NOT_FOUND";
            }

            case UNSUPPORTED_CURRENCY: {
                return "UNSUPPORTED_CURRENCY";
            }

            default: {
                return "";
            }
        }
    }
}

