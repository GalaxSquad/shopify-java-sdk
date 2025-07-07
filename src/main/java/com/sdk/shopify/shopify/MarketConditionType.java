// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The condition types for the condition set.
*/
public enum MarketConditionType {
    /**
    * The condition checks the company location that the visitor is purchasing for.
    */
    COMPANY_LOCATION,

    /**
    * The condition checks the location that the visitor is shopping from.
    */
    LOCATION,

    /**
    * The condition checks the visitor's region.
    */
    REGION,

    UNKNOWN_VALUE;

    public static MarketConditionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMPANY_LOCATION": {
                return COMPANY_LOCATION;
            }

            case "LOCATION": {
                return LOCATION;
            }

            case "REGION": {
                return REGION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COMPANY_LOCATION: {
                return "COMPANY_LOCATION";
            }

            case LOCATION: {
                return "LOCATION";
            }

            case REGION: {
                return "REGION";
            }

            default: {
                return "";
            }
        }
    }
}

