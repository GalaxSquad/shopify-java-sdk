// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Represents a selling plan pricing policy adjustment type.
*/
public enum SellingPlanPricingPolicyAdjustmentType {
    /**
    * Fixed amount off adjustment.
    */
    FIXED_AMOUNT,

    /**
    * Percentage off adjustment.
    */
    PERCENTAGE,

    /**
    * Price of the policy.
    */
    PRICE,

    UNKNOWN_VALUE;

    public static SellingPlanPricingPolicyAdjustmentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FIXED_AMOUNT": {
                return FIXED_AMOUNT;
            }

            case "PERCENTAGE": {
                return PERCENTAGE;
            }

            case "PRICE": {
                return PRICE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FIXED_AMOUNT: {
                return "FIXED_AMOUNT";
            }

            case PERCENTAGE: {
                return "PERCENTAGE";
            }

            case PRICE: {
                return "PRICE";
            }

            default: {
                return "";
            }
        }
    }
}

