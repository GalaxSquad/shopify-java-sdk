// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The list of features that can be supported by a price rule.
*/
public enum PriceRuleTrait {
    /**
    * The price rule supports bulk discounts.
    */
    BULK,

    /**
    * The price rule supports Buy X, Get Y (BXGY) discounts.
    */
    BUY_ONE_GET_ONE,

    /**
    * The price rule supports Buy X, Get Y (BXGY) discounts that specify a custom allocation limit.
    */
    BUY_ONE_GET_ONE_WITH_ALLOCATION_LIMIT,

    /**
    * The price rule supports discounts that require a quantity.
    */
    QUANTITY_DISCOUNTS,

    /**
    * The price rule targets specific customers.
    */
    SPECIFIC_CUSTOMERS,

    UNKNOWN_VALUE;

    public static PriceRuleTrait fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BULK": {
                return BULK;
            }

            case "BUY_ONE_GET_ONE": {
                return BUY_ONE_GET_ONE;
            }

            case "BUY_ONE_GET_ONE_WITH_ALLOCATION_LIMIT": {
                return BUY_ONE_GET_ONE_WITH_ALLOCATION_LIMIT;
            }

            case "QUANTITY_DISCOUNTS": {
                return QUANTITY_DISCOUNTS;
            }

            case "SPECIFIC_CUSTOMERS": {
                return SPECIFIC_CUSTOMERS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BULK: {
                return "BULK";
            }

            case BUY_ONE_GET_ONE: {
                return "BUY_ONE_GET_ONE";
            }

            case BUY_ONE_GET_ONE_WITH_ALLOCATION_LIMIT: {
                return "BUY_ONE_GET_ONE_WITH_ALLOCATION_LIMIT";
            }

            case QUANTITY_DISCOUNTS: {
                return "QUANTITY_DISCOUNTS";
            }

            case SPECIFIC_CUSTOMERS: {
                return "SPECIFIC_CUSTOMERS";
            }

            default: {
                return "";
            }
        }
    }
}

