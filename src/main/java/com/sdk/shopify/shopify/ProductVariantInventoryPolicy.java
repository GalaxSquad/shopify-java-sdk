// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The valid values for the inventory policy of a product variant once it is out of stock.
*/
public enum ProductVariantInventoryPolicy {
    /**
    * Customers can buy this product variant after it's out of stock.
    */
    CONTINUE,

    /**
    * Customers can't buy this product variant after it's out of stock.
    */
    DENY,

    UNKNOWN_VALUE;

    public static ProductVariantInventoryPolicy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONTINUE": {
                return CONTINUE;
            }

            case "DENY": {
                return DENY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONTINUE: {
                return "CONTINUE";
            }

            case DENY: {
                return "DENY";
            }

            default: {
                return "";
            }
        }
    }
}

