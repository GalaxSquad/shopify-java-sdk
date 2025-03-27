// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Describes what triggers fulfillment.
*/
public enum SellingPlanFulfillmentTrigger {
    /**
    * Use the anchor values to calculate fulfillment date.
    */
    ANCHOR,

    /**
    * As soon as possible.
    */
    ASAP,

    /**
    * At an exact time defined by the fulfillment_exact_time field.
    */
    EXACT_TIME,

    /**
    * Unknown. Usually to be determined in the future.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static SellingPlanFulfillmentTrigger fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ANCHOR": {
                return ANCHOR;
            }

            case "ASAP": {
                return ASAP;
            }

            case "EXACT_TIME": {
                return EXACT_TIME;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ANCHOR: {
                return "ANCHOR";
            }

            case ASAP: {
                return "ASAP";
            }

            case EXACT_TIME: {
                return "EXACT_TIME";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

