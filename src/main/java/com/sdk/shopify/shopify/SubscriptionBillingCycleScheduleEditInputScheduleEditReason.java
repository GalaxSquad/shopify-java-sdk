// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The input fields for possible reasons for editing the billing cycle's schedule.
*/
public enum SubscriptionBillingCycleScheduleEditInputScheduleEditReason {
    /**
    * Buyer initiated the schedule edit.
    */
    BUYER_INITIATED,

    /**
    * Developer initiated the schedule edit.
    */
    DEV_INITIATED,

    /**
    * Merchant initiated the schedule edit.
    */
    MERCHANT_INITIATED,

    UNKNOWN_VALUE;

    public static SubscriptionBillingCycleScheduleEditInputScheduleEditReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BUYER_INITIATED": {
                return BUYER_INITIATED;
            }

            case "DEV_INITIATED": {
                return DEV_INITIATED;
            }

            case "MERCHANT_INITIATED": {
                return MERCHANT_INITIATED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BUYER_INITIATED: {
                return "BUYER_INITIATED";
            }

            case DEV_INITIATED: {
                return "DEV_INITIATED";
            }

            case MERCHANT_INITIATED: {
                return "MERCHANT_INITIATED";
            }

            default: {
                return "";
            }
        }
    }
}

