// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Units of measurement for distance.
*/
public enum DistanceUnit {
    /**
    * Metric system unit of distance.
    */
    KILOMETERS,

    /**
    * Imperial system unit of distance.
    */
    MILES,

    UNKNOWN_VALUE;

    public static DistanceUnit fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "KILOMETERS": {
                return KILOMETERS;
            }

            case "MILES": {
                return MILES;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case KILOMETERS: {
                return "KILOMETERS";
            }

            case MILES: {
                return "MILES";
            }

            default: {
                return "";
            }
        }
    }
}

