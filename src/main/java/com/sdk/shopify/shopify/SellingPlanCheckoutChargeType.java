// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The checkout charge when the full amount isn't charged at checkout.
*/
public enum SellingPlanCheckoutChargeType {
    /**
    * The checkout charge is a percentage of the product or variant price.
    */
    PERCENTAGE,

    /**
    * The checkout charge is a fixed price amount.
    */
    PRICE,

    UNKNOWN_VALUE;

    public static SellingPlanCheckoutChargeType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
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

