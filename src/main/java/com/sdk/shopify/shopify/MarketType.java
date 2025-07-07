// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The market types.
*/
public enum MarketType {
    /**
    * The market applies to the visitor based on the company location.
    */
    COMPANY_LOCATION,

    /**
    * The market applies to the visitor based on the location.
    */
    LOCATION,

    /**
    * The market does not apply to any visitor.
    */
    NONE,

    /**
    * The market applies to the visitor based on region.
    */
    REGION,

    UNKNOWN_VALUE;

    public static MarketType fromGraphQl(String value) {
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

            case "NONE": {
                return NONE;
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

            case NONE: {
                return "NONE";
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

