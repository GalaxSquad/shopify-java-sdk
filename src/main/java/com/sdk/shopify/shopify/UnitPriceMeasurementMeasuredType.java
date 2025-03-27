// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The accepted types of unit of measurement.
*/
public enum UnitPriceMeasurementMeasuredType {
    /**
    * Unit of measurements representing areas.
    */
    AREA,

    /**
    * Unit of measurements representing lengths.
    */
    LENGTH,

    /**
    * Unit of measurements representing volumes.
    */
    VOLUME,

    /**
    * Unit of measurements representing weights.
    */
    WEIGHT,

    UNKNOWN_VALUE;

    public static UnitPriceMeasurementMeasuredType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AREA": {
                return AREA;
            }

            case "LENGTH": {
                return LENGTH;
            }

            case "VOLUME": {
                return VOLUME;
            }

            case "WEIGHT": {
                return WEIGHT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AREA: {
                return "AREA";
            }

            case LENGTH: {
                return "LENGTH";
            }

            case VOLUME: {
                return "VOLUME";
            }

            case WEIGHT: {
                return "WEIGHT";
            }

            default: {
                return "";
            }
        }
    }
}

