// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `TransactionVoidUserError`.
*/
public enum TransactionVoidUserErrorCode {
    /**
    * Transaction must be a successful authorization.
    */
    AUTH_NOT_SUCCESSFUL,

    /**
    * Transaction must be voidable.
    */
    AUTH_NOT_VOIDABLE,

    /**
    * A generic error occurred while attempting to void the transaction.
    */
    GENERIC_ERROR,

    /**
    * Transaction does not exist.
    */
    TRANSACTION_NOT_FOUND,

    UNKNOWN_VALUE;

    public static TransactionVoidUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTH_NOT_SUCCESSFUL": {
                return AUTH_NOT_SUCCESSFUL;
            }

            case "AUTH_NOT_VOIDABLE": {
                return AUTH_NOT_VOIDABLE;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "TRANSACTION_NOT_FOUND": {
                return TRANSACTION_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTH_NOT_SUCCESSFUL: {
                return "AUTH_NOT_SUCCESSFUL";
            }

            case AUTH_NOT_VOIDABLE: {
                return "AUTH_NOT_VOIDABLE";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case TRANSACTION_NOT_FOUND: {
                return "TRANSACTION_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

