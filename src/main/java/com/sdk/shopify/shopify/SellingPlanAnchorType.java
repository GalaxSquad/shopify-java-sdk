// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Represents the anchor type.
*/
public enum SellingPlanAnchorType {
    /**
    * Which day of the month, between 1-31.
    */
    MONTHDAY,

    /**
    * Which day of the week, between 1-7.
    */
    WEEKDAY,

    /**
    * Which days of the month and year, month between 1-12, and day between 1-31.
    */
    YEARDAY,

    UNKNOWN_VALUE;

    public static SellingPlanAnchorType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MONTHDAY": {
                return MONTHDAY;
            }

            case "WEEKDAY": {
                return WEEKDAY;
            }

            case "YEARDAY": {
                return YEARDAY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MONTHDAY: {
                return "MONTHDAY";
            }

            case WEEKDAY: {
                return "WEEKDAY";
            }

            case YEARDAY: {
                return "YEARDAY";
            }

            default: {
                return "";
            }
        }
    }
}

