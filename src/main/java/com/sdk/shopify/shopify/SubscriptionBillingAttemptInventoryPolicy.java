// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The inventory policy for a billing attempt.
*/
public enum SubscriptionBillingAttemptInventoryPolicy {
    /**
    * Override the merchant's product variant
    * inventory policy and allow overselling for this billing attempt.
    */
    ALLOW_OVERSELLING,

    /**
    * Respect the merchant's product variant
    * inventory policy for this billing attempt.
    */
    PRODUCT_VARIANT_INVENTORY_POLICY,

    UNKNOWN_VALUE;

    public static SubscriptionBillingAttemptInventoryPolicy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALLOW_OVERSELLING": {
                return ALLOW_OVERSELLING;
            }

            case "PRODUCT_VARIANT_INVENTORY_POLICY": {
                return PRODUCT_VARIANT_INVENTORY_POLICY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALLOW_OVERSELLING: {
                return "ALLOW_OVERSELLING";
            }

            case PRODUCT_VARIANT_INVENTORY_POLICY: {
                return "PRODUCT_VARIANT_INVENTORY_POLICY";
            }

            default: {
                return "";
            }
        }
    }
}

