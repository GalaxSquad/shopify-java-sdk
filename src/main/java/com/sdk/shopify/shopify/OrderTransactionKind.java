// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The different kinds of order transactions.
*/
public enum OrderTransactionKind {
    /**
    * An amount reserved against the cardholder's funding source.
    * Money does not change hands until the authorization is captured.
    */
    AUTHORIZATION,

    /**
    * A transfer of the money that was reserved by an authorization.
    */
    CAPTURE,

    /**
    * The money returned to the customer when they've paid too much during a cash transaction.
    */
    CHANGE,

    /**
    * An authorization for a payment taken with an EMV credit card reader.
    */
    EMV_AUTHORIZATION,

    /**
    * A partial or full return of captured funds to the cardholder.
    * A refund can happen only after a capture is processed.
    */
    REFUND,

    /**
    * An authorization and capture performed together in a single step.
    */
    SALE,

    /**
    * A suggested refund transaction that can be used to create a refund.
    */
    SUGGESTED_REFUND,

    /**
    * A cancelation of an authorization transaction.
    */
    VOID,

    UNKNOWN_VALUE;

    public static OrderTransactionKind fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTHORIZATION": {
                return AUTHORIZATION;
            }

            case "CAPTURE": {
                return CAPTURE;
            }

            case "CHANGE": {
                return CHANGE;
            }

            case "EMV_AUTHORIZATION": {
                return EMV_AUTHORIZATION;
            }

            case "REFUND": {
                return REFUND;
            }

            case "SALE": {
                return SALE;
            }

            case "SUGGESTED_REFUND": {
                return SUGGESTED_REFUND;
            }

            case "VOID": {
                return VOID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTHORIZATION: {
                return "AUTHORIZATION";
            }

            case CAPTURE: {
                return "CAPTURE";
            }

            case CHANGE: {
                return "CHANGE";
            }

            case EMV_AUTHORIZATION: {
                return "EMV_AUTHORIZATION";
            }

            case REFUND: {
                return "REFUND";
            }

            case SALE: {
                return "SALE";
            }

            case SUGGESTED_REFUND: {
                return "SUGGESTED_REFUND";
            }

            case VOID: {
                return "VOID";
            }

            default: {
                return "";
            }
        }
    }
}

