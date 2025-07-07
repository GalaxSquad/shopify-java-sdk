// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `GiftCardUserError`.
*/
public enum GiftCardErrorCode {
    /**
    * The customer could not be found.
    */
    CUSTOMER_NOT_FOUND,

    /**
    * The gift card's value exceeds the allowed limits.
    */
    GIFT_CARD_LIMIT_EXCEEDED,

    /**
    * The input value should be greater than the minimum allowed value.
    */
    GREATER_THAN,

    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Missing a required argument.
    */
    MISSING_ARGUMENT,

    /**
    * The recipient could not be found.
    */
    RECIPIENT_NOT_FOUND,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    UNKNOWN_VALUE;

    public static GiftCardErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER_NOT_FOUND": {
                return CUSTOMER_NOT_FOUND;
            }

            case "GIFT_CARD_LIMIT_EXCEEDED": {
                return GIFT_CARD_LIMIT_EXCEEDED;
            }

            case "GREATER_THAN": {
                return GREATER_THAN;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID": {
                return INVALID;
            }

            case "MISSING_ARGUMENT": {
                return MISSING_ARGUMENT;
            }

            case "RECIPIENT_NOT_FOUND": {
                return RECIPIENT_NOT_FOUND;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER_NOT_FOUND: {
                return "CUSTOMER_NOT_FOUND";
            }

            case GIFT_CARD_LIMIT_EXCEEDED: {
                return "GIFT_CARD_LIMIT_EXCEEDED";
            }

            case GREATER_THAN: {
                return "GREATER_THAN";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID: {
                return "INVALID";
            }

            case MISSING_ARGUMENT: {
                return "MISSING_ARGUMENT";
            }

            case RECIPIENT_NOT_FOUND: {
                return "RECIPIENT_NOT_FOUND";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            default: {
                return "";
            }
        }
    }
}

