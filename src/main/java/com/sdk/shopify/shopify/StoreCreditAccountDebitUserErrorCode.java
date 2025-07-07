// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `StoreCreditAccountDebitUserError`.
*/
public enum StoreCreditAccountDebitUserErrorCode {
    /**
    * The store credit account could not be found.
    */
    ACCOUNT_NOT_FOUND,

    /**
    * The store credit account does not have sufficient funds to satisfy the request.
    */
    INSUFFICIENT_FUNDS,

    /**
    * The currency provided does not match the currency of the store credit account.
    */
    MISMATCHING_CURRENCY,

    /**
    * A positive amount must be used to debit a store credit account.
    */
    NEGATIVE_OR_ZERO_AMOUNT,

    UNKNOWN_VALUE;

    public static StoreCreditAccountDebitUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCOUNT_NOT_FOUND": {
                return ACCOUNT_NOT_FOUND;
            }

            case "INSUFFICIENT_FUNDS": {
                return INSUFFICIENT_FUNDS;
            }

            case "MISMATCHING_CURRENCY": {
                return MISMATCHING_CURRENCY;
            }

            case "NEGATIVE_OR_ZERO_AMOUNT": {
                return NEGATIVE_OR_ZERO_AMOUNT;
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

            case INSUFFICIENT_FUNDS: {
                return "INSUFFICIENT_FUNDS";
            }

            case MISMATCHING_CURRENCY: {
                return "MISMATCHING_CURRENCY";
            }

            case NEGATIVE_OR_ZERO_AMOUNT: {
                return "NEGATIVE_OR_ZERO_AMOUNT";
            }

            default: {
                return "";
            }
        }
    }
}

