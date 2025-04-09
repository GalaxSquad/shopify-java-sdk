// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* When to reserve inventory for a selling plan.
*/
public enum SellingPlanReserve {
    /**
    * Reserve inventory when order is fulfilled.
    */
    ON_FULFILLMENT,

    /**
    * Reserve inventory at time of sale.
    */
    ON_SALE,

    UNKNOWN_VALUE;

    public static SellingPlanReserve fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ON_FULFILLMENT": {
                return ON_FULFILLMENT;
            }

            case "ON_SALE": {
                return ON_SALE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ON_FULFILLMENT: {
                return "ON_FULFILLMENT";
            }

            case ON_SALE: {
                return "ON_SALE";
            }

            default: {
                return "";
            }
        }
    }
}

