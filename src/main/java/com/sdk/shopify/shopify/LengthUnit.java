// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Units of measurement for length.
*/
public enum LengthUnit {
    /**
    * 100 centimeters equals 1 meter.
    */
    CENTIMETERS,

    /**
    * Imperial system unit of length.
    */
    FEET,

    /**
    * 12 inches equals 1 foot.
    */
    INCHES,

    /**
    * Metric system unit of length.
    */
    METERS,

    /**
    * 1000 millimeters equals 1 meter.
    */
    MILLIMETERS,

    /**
    * 1 yard equals 3 feet.
    */
    YARDS,

    UNKNOWN_VALUE;

    public static LengthUnit fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CENTIMETERS": {
                return CENTIMETERS;
            }

            case "FEET": {
                return FEET;
            }

            case "INCHES": {
                return INCHES;
            }

            case "METERS": {
                return METERS;
            }

            case "MILLIMETERS": {
                return MILLIMETERS;
            }

            case "YARDS": {
                return YARDS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CENTIMETERS: {
                return "CENTIMETERS";
            }

            case FEET: {
                return "FEET";
            }

            case INCHES: {
                return "INCHES";
            }

            case METERS: {
                return "METERS";
            }

            case MILLIMETERS: {
                return "MILLIMETERS";
            }

            case YARDS: {
                return "YARDS";
            }

            default: {
                return "";
            }
        }
    }
}

