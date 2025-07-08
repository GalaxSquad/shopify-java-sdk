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
    * Imperial system unit of volume (U.S. customary unit).
    */
    FLOZ,

    /**
    * 1 foot equals 12 inches.
    */
    FT,

    /**
    * Imperial system unit of area.
    */
    FT2,

    /**
    * Metric system unit of weight.
    */
    G,

    /**
    * 1 gallon equals 128 fluid ounces (U.S. customary unit).
    */
    GAL,

    /**
    * Imperial system unit of length.
    */
    IN,

    /**
    * 1 item, a unit of count.
    */
    ITEM,

    /**
    * 1 kilogram equals 1000 grams.
    */
    KG,

    /**
    * Metric system unit of volume.
    */
    L,

    /**
    * Imperial system unit of weight.
    */
    LB,

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

    /**
    * 16 ounces equals 1 pound.
    */
    OZ,

    /**
    * 1 pint equals 16 fluid ounces (U.S. customary unit).
    */
    PT,

    /**
    * 1 quart equals 32 fluid ounces (U.S. customary unit).
    */
    QT,

    /**
    * The unit of measurement is unknown. Upgrade to the latest version of the API to resolve this unit.
    */
    UNKNOWN,

    /**
    * 1 yard equals 36 inches.
    */
    YD,

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

            case "FLOZ": {
                return FLOZ;
            }

            case "FT": {
                return FT;
            }

            case "FT2": {
                return FT2;
            }

            case "G": {
                return G;
            }

            case "GAL": {
                return GAL;
            }

            case "IN": {
                return IN;
            }

            case "ITEM": {
                return ITEM;
            }

            case "KG": {
                return KG;
            }

            case "L": {
                return L;
            }

            case "LB": {
                return LB;
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

            case "OZ": {
                return OZ;
            }

            case "PT": {
                return PT;
            }

            case "QT": {
                return QT;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            case "YD": {
                return YD;
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

            case FLOZ: {
                return "FLOZ";
            }

            case FT: {
                return "FT";
            }

            case FT2: {
                return "FT2";
            }

            case G: {
                return "G";
            }

            case GAL: {
                return "GAL";
            }

            case IN: {
                return "IN";
            }

            case ITEM: {
                return "ITEM";
            }

            case KG: {
                return "KG";
            }

            case L: {
                return "L";
            }

            case LB: {
                return "LB";
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

            case OZ: {
                return "OZ";
            }

            case PT: {
                return "PT";
            }

            case QT: {
                return "QT";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            case YD: {
                return "YD";
            }

            default: {
                return "";
            }
        }
    }
}

