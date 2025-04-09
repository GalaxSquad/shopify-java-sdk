// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The valid units of measurement for a unit price measurement.
*/
public enum UnitPriceMeasurementMeasuredUnit {
    /**
    * 100 centiliters equals 1 liter.
    */
    CL,

    /**
    * 100 centimeters equals 1 meter.
    */
    CM,

    /**
    * Metric system unit of weight.
    */
    G,

    /**
    * 1 kilogram equals 1000 grams.
    */
    KG,

    /**
    * Metric system unit of volume.
    */
    L,

    /**
    * Metric system unit of length.
    */
    M,

    /**
    * Metric system unit of area.
    */
    M2,

    /**
    * 1 cubic meter equals 1000 liters.
    */
    M3,

    /**
    * 1000 milligrams equals 1 gram.
    */
    MG,

    /**
    * 1000 milliliters equals 1 liter.
    */
    ML,

    /**
    * 1000 millimeters equals 1 meter.
    */
    MM,

    UNKNOWN_VALUE;

    public static UnitPriceMeasurementMeasuredUnit fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CL": {
                return CL;
            }

            case "CM": {
                return CM;
            }

            case "G": {
                return G;
            }

            case "KG": {
                return KG;
            }

            case "L": {
                return L;
            }

            case "M": {
                return M;
            }

            case "M2": {
                return M2;
            }

            case "M3": {
                return M3;
            }

            case "MG": {
                return MG;
            }

            case "ML": {
                return ML;
            }

            case "MM": {
                return MM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CL: {
                return "CL";
            }

            case CM: {
                return "CM";
            }

            case G: {
                return "G";
            }

            case KG: {
                return "KG";
            }

            case L: {
                return "L";
            }

            case M: {
                return "M";
            }

            case M2: {
                return "M2";
            }

            case M3: {
                return "M3";
            }

            case MG: {
                return "MG";
            }

            case ML: {
                return "ML";
            }

            case MM: {
                return "MM";
            }

            default: {
                return "";
            }
        }
    }
}

