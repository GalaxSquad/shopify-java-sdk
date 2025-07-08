// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Represents valid selling plan interval.
*/
public enum SellingPlanInterval {
    /**
    * Day interval.
    */
    DAY,

    /**
    * Month interval.
    */
    MONTH,

    /**
    * Week interval.
    */
    WEEK,

    /**
    * Year interval.
    */
    YEAR,

    UNKNOWN_VALUE;

    public static SellingPlanInterval fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DAY": {
                return DAY;
            }

            case "MONTH": {
                return MONTH;
            }

            case "WEEK": {
                return WEEK;
            }

            case "YEAR": {
                return YEAR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DAY: {
                return "DAY";
            }

            case MONTH: {
                return "MONTH";
            }

            case WEEK: {
                return "WEEK";
            }

            case YEAR: {
                return "YEAR";
            }

            default: {
                return "";
            }
        }
    }
}

