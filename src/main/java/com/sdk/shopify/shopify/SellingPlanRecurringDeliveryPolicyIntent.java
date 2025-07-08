// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Whether the delivery policy is merchant or buyer-centric.
*/
public enum SellingPlanRecurringDeliveryPolicyIntent {
    /**
    * A merchant-centric delivery policy. Mark this delivery policy to define when the merchant should
    * start fulfillment.
    */
    FULFILLMENT_BEGIN,

    UNKNOWN_VALUE;

    public static SellingPlanRecurringDeliveryPolicyIntent fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLMENT_BEGIN": {
                return FULFILLMENT_BEGIN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULFILLMENT_BEGIN: {
                return "FULFILLMENT_BEGIN";
            }

            default: {
                return "";
            }
        }
    }
}

