// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `OrderCancelUserError`.
*/
public enum OrderCancelUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * An order refund was requested but the user does not have the refund_orders permission.
    */
    NO_REFUND_PERMISSION,

    /**
    * An order refund was requested but the user does not have the refund_to_store_credit permission.
    */
    NO_REFUND_TO_STORE_CREDIT_PERMISSION,

    /**
    * A store credit order refund was requested but the order is a B2B order.
    */
    STORE_CREDIT_REFUND_B2B_NOT_SUPPORTED,

    /**
    * A store credit order refund was requested but the expiration date is in the past.
    */
    STORE_CREDIT_REFUND_EXPIRATION_IN_PAST,

    /**
    * A store credit order refund was requested but the order has no customer.
    */
    STORE_CREDIT_REFUND_MISSING_CUSTOMER,

    UNKNOWN_VALUE;

    public static OrderCancelUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID": {
                return INVALID;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "NO_REFUND_PERMISSION": {
                return NO_REFUND_PERMISSION;
            }

            case "NO_REFUND_TO_STORE_CREDIT_PERMISSION": {
                return NO_REFUND_TO_STORE_CREDIT_PERMISSION;
            }

            case "STORE_CREDIT_REFUND_B2B_NOT_SUPPORTED": {
                return STORE_CREDIT_REFUND_B2B_NOT_SUPPORTED;
            }

            case "STORE_CREDIT_REFUND_EXPIRATION_IN_PAST": {
                return STORE_CREDIT_REFUND_EXPIRATION_IN_PAST;
            }

            case "STORE_CREDIT_REFUND_MISSING_CUSTOMER": {
                return STORE_CREDIT_REFUND_MISSING_CUSTOMER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID: {
                return "INVALID";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case NO_REFUND_PERMISSION: {
                return "NO_REFUND_PERMISSION";
            }

            case NO_REFUND_TO_STORE_CREDIT_PERMISSION: {
                return "NO_REFUND_TO_STORE_CREDIT_PERMISSION";
            }

            case STORE_CREDIT_REFUND_B2B_NOT_SUPPORTED: {
                return "STORE_CREDIT_REFUND_B2B_NOT_SUPPORTED";
            }

            case STORE_CREDIT_REFUND_EXPIRATION_IN_PAST: {
                return "STORE_CREDIT_REFUND_EXPIRATION_IN_PAST";
            }

            case STORE_CREDIT_REFUND_MISSING_CUSTOMER: {
                return "STORE_CREDIT_REFUND_MISSING_CUSTOMER";
            }

            default: {
                return "";
            }
        }
    }
}

