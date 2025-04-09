// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The status of an order's protection with Shopify Protect.
*/
public enum ShopifyProtectStatus {
    /**
    * The protection for the order is active and eligible for reimbursement against fraudulent
    * chargebacks.
    * If an order is updated, the order's eligibility may change and protection could become inactive.
    */
    ACTIVE,

    /**
    * The protection for an order isn't active because the order didn't meet eligibility requirements.
    */
    INACTIVE,

    /**
    * The order received a chargeback but the order wasn't protected because it didn't meet coverage
    * requirements.
    */
    NOT_PROTECTED,

    /**
    * The protection for the order is pending and has not yet been determined.
    */
    PENDING,

    /**
    * The order received a fraudulent chargeback and it was protected.
    */
    PROTECTED,

    UNKNOWN_VALUE;

    public static ShopifyProtectStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "INACTIVE": {
                return INACTIVE;
            }

            case "NOT_PROTECTED": {
                return NOT_PROTECTED;
            }

            case "PENDING": {
                return PENDING;
            }

            case "PROTECTED": {
                return PROTECTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE: {
                return "ACTIVE";
            }

            case INACTIVE: {
                return "INACTIVE";
            }

            case NOT_PROTECTED: {
                return "NOT_PROTECTED";
            }

            case PENDING: {
                return "PENDING";
            }

            case PROTECTED: {
                return "PROTECTED";
            }

            default: {
                return "";
            }
        }
    }
}

