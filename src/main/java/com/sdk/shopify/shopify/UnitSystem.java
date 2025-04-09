// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Systems of weights and measures.
*/
public enum UnitSystem {
    /**
    * Imperial system of weights and measures.
    */
    IMPERIAL_SYSTEM,

    /**
    * Metric system of weights and measures.
    */
    METRIC_SYSTEM,

    UNKNOWN_VALUE;

    public static UnitSystem fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "IMPERIAL_SYSTEM": {
                return IMPERIAL_SYSTEM;
            }

            case "METRIC_SYSTEM": {
                return METRIC_SYSTEM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case IMPERIAL_SYSTEM: {
                return "IMPERIAL_SYSTEM";
            }

            case METRIC_SYSTEM: {
                return "METRIC_SYSTEM";
            }

            default: {
                return "";
            }
        }
    }
}

