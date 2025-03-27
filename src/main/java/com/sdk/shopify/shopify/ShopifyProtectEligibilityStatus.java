// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The status of an order's eligibility for protection against fraudulent chargebacks by Shopify
* Protect.
*/
public enum ShopifyProtectEligibilityStatus {
    /**
    * The order is eligible for protection against fraudulent chargebacks.
    * If an order is updated, the order's eligibility may change and protection could be removed.
    */
    ELIGIBLE,

    /**
    * The order isn't eligible for protection against fraudulent chargebacks.
    */
    NOT_ELIGIBLE,

    /**
    * The eligibility of the order is pending and has not yet been determined.
    */
    PENDING,

    UNKNOWN_VALUE;

    public static ShopifyProtectEligibilityStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ELIGIBLE": {
                return ELIGIBLE;
            }

            case "NOT_ELIGIBLE": {
                return NOT_ELIGIBLE;
            }

            case "PENDING": {
                return PENDING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ELIGIBLE: {
                return "ELIGIBLE";
            }

            case NOT_ELIGIBLE: {
                return "NOT_ELIGIBLE";
            }

            case PENDING: {
                return "PENDING";
            }

            default: {
                return "";
            }
        }
    }
}

