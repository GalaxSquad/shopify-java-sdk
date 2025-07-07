// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Metafield definition constraint criteria to filter metafield definitions by.
*/
public enum MetafieldDefinitionConstraintStatus {
    /**
    * Returns both constrained and unconstrained metafield definitions.
    */
    CONSTRAINED_AND_UNCONSTRAINED,

    /**
    * Only returns metafield definitions that are constrained to a resource subtype.
    */
    CONSTRAINED_ONLY,

    /**
    * Only returns metafield definitions that are not constrained to a resource subtype.
    */
    UNCONSTRAINED_ONLY,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionConstraintStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONSTRAINED_AND_UNCONSTRAINED": {
                return CONSTRAINED_AND_UNCONSTRAINED;
            }

            case "CONSTRAINED_ONLY": {
                return CONSTRAINED_ONLY;
            }

            case "UNCONSTRAINED_ONLY": {
                return UNCONSTRAINED_ONLY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONSTRAINED_AND_UNCONSTRAINED: {
                return "CONSTRAINED_AND_UNCONSTRAINED";
            }

            case CONSTRAINED_ONLY: {
                return "CONSTRAINED_ONLY";
            }

            case UNCONSTRAINED_ONLY: {
                return "UNCONSTRAINED_ONLY";
            }

            default: {
                return "";
            }
        }
    }
}

