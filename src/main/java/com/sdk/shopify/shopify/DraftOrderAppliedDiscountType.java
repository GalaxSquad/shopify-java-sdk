// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The valid discount types that can be applied to a draft order.
*/
public enum DraftOrderAppliedDiscountType {
    /**
    * A fixed amount in the store's currency.
    */
    FIXED_AMOUNT,

    /**
    * A percentage of the order subtotal.
    */
    PERCENTAGE,

    UNKNOWN_VALUE;

    public static DraftOrderAppliedDiscountType fromGraphQl(String value) {
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

            default: {
                return "";
            }
        }
    }
}

