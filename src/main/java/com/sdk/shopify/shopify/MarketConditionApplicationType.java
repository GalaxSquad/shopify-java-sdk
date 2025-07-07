// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The application level for a market condition.
*/
public enum MarketConditionApplicationType {
    /**
    * The condition matches all records of a given type.
    */
    ALL,

    /**
    * The condition matches specified records of a given type.
    */
    SPECIFIED,

    UNKNOWN_VALUE;

    public static MarketConditionApplicationType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALL": {
                return ALL;
            }

            case "SPECIFIED": {
                return SPECIFIED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALL: {
                return "ALL";
            }

            case SPECIFIED: {
                return "SPECIFIED";
            }

            default: {
                return "";
            }
        }
    }
}

