// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The field type that the condition will be applied to.
*/
public enum DeliveryConditionField {
    /**
    * The condition will check against the total price of the order.
    */
    TOTAL_PRICE,

    /**
    * The condition will check against the total weight of the order.
    */
    TOTAL_WEIGHT,

    UNKNOWN_VALUE;

    public static DeliveryConditionField fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "TOTAL_PRICE": {
                return TOTAL_PRICE;
            }

            case "TOTAL_WEIGHT": {
                return TOTAL_WEIGHT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case TOTAL_PRICE: {
                return "TOTAL_PRICE";
            }

            case TOTAL_WEIGHT: {
                return "TOTAL_WEIGHT";
            }

            default: {
                return "";
            }
        }
    }
}

