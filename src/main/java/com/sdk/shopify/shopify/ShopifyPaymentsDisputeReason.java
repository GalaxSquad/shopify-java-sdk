// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The reason for the dispute provided by the cardholder's bank.
*/
public enum ShopifyPaymentsDisputeReason {
    /**
    * The customer's bank can't process the charge.
    */
    BANK_CANNOT_PROCESS,

    /**
    * The customer claims that the purchased product was returned or the transaction was otherwise
    * canceled, but you haven't yet provided a refund or credit.
    */
    CREDIT_NOT_PROCESSED,

    /**
    * The customer initiated the dispute. Contact the customer for additional details on why the payment
    * was disputed.
    */
    CUSTOMER_INITIATED,

    /**
    * The customer's bank can't proceed with the debit since it hasn't been authorized.
    */
    DEBIT_NOT_AUTHORIZED,

    /**
    * The customer claims they were charged multiple times for the same product or service.
    */
    DUPLICATE,

    /**
    * The cardholder claims that they didn’t authorize the payment.
    */
    FRAUDULENT,

    /**
    * The dispute is uncategorized, so you should contact the customer for additional details to find out
    * why the payment was disputed.
    */
    GENERAL,

    /**
    * The customer account associated with the purchase is incorrect.
    */
    INCORRECT_ACCOUNT_DETAILS,

    /**
    * The customer's bank account has insufficient funds.
    */
    INSUFFICIENT_FUNDS,

    /**
    * The card issuer believes the disputed transaction doesn't conform to the network rules. These
    * disputes occur when transactions don't meet card network requirements and may incur additional
    * network fees if escalated for resolution.
    */
    NONCOMPLIANT,

    /**
    * The customer claims they did not receive the products or services purchased.
    */
    PRODUCT_NOT_RECEIVED,

    /**
    * The product or service was received but was defective, damaged, or not as described.
    */
    PRODUCT_UNACCEPTABLE,

    /**
    * The customer claims that you continued to charge them after a subscription was canceled.
    */
    SUBSCRIPTION_CANCELLED,

    /**
    * The customer doesn’t recognize the payment appearing on their card statement.
    */
    UNRECOGNIZED,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsDisputeReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BANK_CANNOT_PROCESS": {
                return BANK_CANNOT_PROCESS;
            }

            case "CREDIT_NOT_PROCESSED": {
                return CREDIT_NOT_PROCESSED;
            }

            case "CUSTOMER_INITIATED": {
                return CUSTOMER_INITIATED;
            }

            case "DEBIT_NOT_AUTHORIZED": {
                return DEBIT_NOT_AUTHORIZED;
            }

            case "DUPLICATE": {
                return DUPLICATE;
            }

            case "FRAUDULENT": {
                return FRAUDULENT;
            }

            case "GENERAL": {
                return GENERAL;
            }

            case "INCORRECT_ACCOUNT_DETAILS": {
                return INCORRECT_ACCOUNT_DETAILS;
            }

            case "INSUFFICIENT_FUNDS": {
                return INSUFFICIENT_FUNDS;
            }

            case "NONCOMPLIANT": {
                return NONCOMPLIANT;
            }

            case "PRODUCT_NOT_RECEIVED": {
                return PRODUCT_NOT_RECEIVED;
            }

            case "PRODUCT_UNACCEPTABLE": {
                return PRODUCT_UNACCEPTABLE;
            }

            case "SUBSCRIPTION_CANCELLED": {
                return SUBSCRIPTION_CANCELLED;
            }

            case "UNRECOGNIZED": {
                return UNRECOGNIZED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BANK_CANNOT_PROCESS: {
                return "BANK_CANNOT_PROCESS";
            }

            case CREDIT_NOT_PROCESSED: {
                return "CREDIT_NOT_PROCESSED";
            }

            case CUSTOMER_INITIATED: {
                return "CUSTOMER_INITIATED";
            }

            case DEBIT_NOT_AUTHORIZED: {
                return "DEBIT_NOT_AUTHORIZED";
            }

            case DUPLICATE: {
                return "DUPLICATE";
            }

            case FRAUDULENT: {
                return "FRAUDULENT";
            }

            case GENERAL: {
                return "GENERAL";
            }

            case INCORRECT_ACCOUNT_DETAILS: {
                return "INCORRECT_ACCOUNT_DETAILS";
            }

            case INSUFFICIENT_FUNDS: {
                return "INSUFFICIENT_FUNDS";
            }

            case NONCOMPLIANT: {
                return "NONCOMPLIANT";
            }

            case PRODUCT_NOT_RECEIVED: {
                return "PRODUCT_NOT_RECEIVED";
            }

            case PRODUCT_UNACCEPTABLE: {
                return "PRODUCT_UNACCEPTABLE";
            }

            case SUBSCRIPTION_CANCELLED: {
                return "SUBSCRIPTION_CANCELLED";
            }

            case UNRECOGNIZED: {
                return "UNRECOGNIZED";
            }

            default: {
                return "";
            }
        }
    }
}

