// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The different states that an `OrderTransaction` can have.
*/
public enum OrderTransactionStatus {
    /**
    * Awaiting a response.
    */
    AWAITING_RESPONSE,

    /**
    * There was an error while processing the transaction.
    */
    ERROR,

    /**
    * The transaction failed.
    */
    FAILURE,

    /**
    * The transaction is pending.
    */
    PENDING,

    /**
    * The transaction succeeded.
    */
    SUCCESS,

    /**
    * The transaction status is unknown.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static OrderTransactionStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AWAITING_RESPONSE": {
                return AWAITING_RESPONSE;
            }

            case "ERROR": {
                return ERROR;
            }

            case "FAILURE": {
                return FAILURE;
            }

            case "PENDING": {
                return PENDING;
            }

            case "SUCCESS": {
                return SUCCESS;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AWAITING_RESPONSE: {
                return "AWAITING_RESPONSE";
            }

            case ERROR: {
                return "ERROR";
            }

            case FAILURE: {
                return "FAILURE";
            }

            case PENDING: {
                return "PENDING";
            }

            case SUCCESS: {
                return "SUCCESS";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

