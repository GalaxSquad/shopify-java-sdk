// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Units of measurement for weight.
*/
public enum WeightUnit {
    /**
    * Metric system unit of mass.
    */
    GRAMS,

    /**
    * 1 kilogram equals 1000 grams.
    */
    KILOGRAMS,

    /**
    * Imperial system unit of mass.
    */
    OUNCES,

    /**
    * 1 pound equals 16 ounces.
    */
    POUNDS,

    UNKNOWN_VALUE;

    public static WeightUnit fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GRAMS": {
                return GRAMS;
            }

            case "KILOGRAMS": {
                return KILOGRAMS;
            }

            case "OUNCES": {
                return OUNCES;
            }

            case "POUNDS": {
                return POUNDS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case GRAMS: {
                return "GRAMS";
            }

            case KILOGRAMS: {
                return "KILOGRAMS";
            }

            case OUNCES: {
                return "OUNCES";
            }

            case POUNDS: {
                return "POUNDS";
            }

            default: {
                return "";
            }
        }
    }
}

