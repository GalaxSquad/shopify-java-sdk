// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `GiftCardTransactionUserError`.
*/
public enum GiftCardTransactionUserErrorCode {
    /**
    * The gift card's value exceeds the allowed limits.
    */
    GIFT_CARD_LIMIT_EXCEEDED,

    /**
    * The gift card could not be found.
    */
    GIFT_CARD_NOT_FOUND,

    /**
    * The gift card does not have sufficient funds to satisfy the request.
    */
    INSUFFICIENT_FUNDS,

    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The currency provided does not match the currency of the gift card.
    */
    MISMATCHING_CURRENCY,

    /**
    * A positive amount must be used.
    */
    NEGATIVE_OR_ZERO_AMOUNT,

    UNKNOWN_VALUE;

    public static GiftCardTransactionUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GIFT_CARD_LIMIT_EXCEEDED": {
                return GIFT_CARD_LIMIT_EXCEEDED;
            }

            case "GIFT_CARD_NOT_FOUND": {
                return GIFT_CARD_NOT_FOUND;
            }

            case "INSUFFICIENT_FUNDS": {
                return INSUFFICIENT_FUNDS;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID": {
                return INVALID;
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
            case GIFT_CARD_LIMIT_EXCEEDED: {
                return "GIFT_CARD_LIMIT_EXCEEDED";
            }

            case GIFT_CARD_NOT_FOUND: {
                return "GIFT_CARD_NOT_FOUND";
            }

            case INSUFFICIENT_FUNDS: {
                return "INSUFFICIENT_FUNDS";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID: {
                return "INVALID";
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

