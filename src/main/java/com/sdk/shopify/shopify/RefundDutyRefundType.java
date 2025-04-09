// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The type of refund to perform for a particular refund duty.
*/
public enum RefundDutyRefundType {
    /**
    * The duty is fully refunded.
    */
    FULL,

    /**
    * The duty is proportionally refunded based on the quantity of the refunded line item.
    */
    PROPORTIONAL,

    UNKNOWN_VALUE;

    public static RefundDutyRefundType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULL": {
                return FULL;
            }

            case "PROPORTIONAL": {
                return PROPORTIONAL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULL: {
                return "FULL";
            }

            case PROPORTIONAL: {
                return "PROPORTIONAL";
            }

            default: {
                return "";
            }
        }
    }
}

