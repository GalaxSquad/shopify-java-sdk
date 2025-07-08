// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Type of a shipping package.
*/
public enum ShippingPackageType {
    /**
    * A shipping box.
    */
    BOX,

    /**
    * An envelope.
    */
    ENVELOPE,

    /**
    * A flat rate packaging supplied by a carrier.
    */
    FLAT_RATE,

    /**
    * A soft-pack, bubble-wrap or vinyl envelope.
    */
    SOFT_PACK,

    UNKNOWN_VALUE;

    public static ShippingPackageType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BOX": {
                return BOX;
            }

            case "ENVELOPE": {
                return ENVELOPE;
            }

            case "FLAT_RATE": {
                return FLAT_RATE;
            }

            case "SOFT_PACK": {
                return SOFT_PACK;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BOX: {
                return "BOX";
            }

            case ENVELOPE: {
                return "ENVELOPE";
            }

            case FLAT_RATE: {
                return "FLAT_RATE";
            }

            case SOFT_PACK: {
                return "SOFT_PACK";
            }

            default: {
                return "";
            }
        }
    }
}

