// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible intentions of a Delivery Policy.
*/
public enum SellingPlanFixedDeliveryPolicyIntent {
    /**
    * A merchant-centric delivery policy. Mark this delivery policy to define when the merchant should
    * start fulfillment.
    */
    FULFILLMENT_BEGIN,

    UNKNOWN_VALUE;

    public static SellingPlanFixedDeliveryPolicyIntent fromGraphQl(String value) {
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

