// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* When to capture the payment for the remaining amount due.
*/
public enum SellingPlanRemainingBalanceChargeTrigger {
    /**
    * At an exact time defined by the remaining_balance_charge_exact_time field.
    */
    EXACT_TIME,

    /**
    * When there's no remaining balance to be charged after checkout.
    */
    NO_REMAINING_BALANCE,

    /**
    * After the duration defined by the remaining_balance_charge_time_after_checkout field.
    */
    TIME_AFTER_CHECKOUT,

    UNKNOWN_VALUE;

    public static SellingPlanRemainingBalanceChargeTrigger fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "EXACT_TIME": {
                return EXACT_TIME;
            }

            case "NO_REMAINING_BALANCE": {
                return NO_REMAINING_BALANCE;
            }

            case "TIME_AFTER_CHECKOUT": {
                return TIME_AFTER_CHECKOUT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case EXACT_TIME: {
                return "EXACT_TIME";
            }

            case NO_REMAINING_BALANCE: {
                return "NO_REMAINING_BALANCE";
            }

            case TIME_AFTER_CHECKOUT: {
                return "TIME_AFTER_CHECKOUT";
            }

            default: {
                return "";
            }
        }
    }
}

