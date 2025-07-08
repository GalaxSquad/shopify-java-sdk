// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* How to caluclate the parent product variant's price while bulk updating variant relationships.
*/
public enum PriceCalculationType {
    /**
    * The price of the parent will be the sum of the components price times their quantity.
    */
    COMPONENTS_SUM,

    /**
    * The price of the parent will be set to the price provided.
    */
    FIXED,

    /**
    * The price of the parent will not be adjusted.
    */
    NONE,

    UNKNOWN_VALUE;

    public static PriceCalculationType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMPONENTS_SUM": {
                return COMPONENTS_SUM;
            }

            case "FIXED": {
                return FIXED;
            }

            case "NONE": {
                return NONE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COMPONENTS_SUM: {
                return "COMPONENTS_SUM";
            }

            case FIXED: {
                return "FIXED";
            }

            case NONE: {
                return "NONE";
            }

            default: {
                return "";
            }
        }
    }
}

