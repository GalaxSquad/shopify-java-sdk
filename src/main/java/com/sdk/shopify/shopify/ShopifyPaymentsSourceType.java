// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible source types for a balance transaction.
*/
public enum ShopifyPaymentsSourceType {
    /**
    * The adjustment source type.
    */
    ADJUSTMENT,

    /**
    * The adjustment_reversal source type.
    */
    ADJUSTMENT_REVERSAL,

    /**
    * The charge source type.
    */
    CHARGE,

    /**
    * The dispute source type.
    */
    DISPUTE,

    /**
    * The refund source type.
    */
    REFUND,

    /**
    * The system_adjustment source type.
    */
    SYSTEM_ADJUSTMENT,

    /**
    * The transfer source type.
    */
    TRANSFER,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsSourceType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADJUSTMENT": {
                return ADJUSTMENT;
            }

            case "ADJUSTMENT_REVERSAL": {
                return ADJUSTMENT_REVERSAL;
            }

            case "CHARGE": {
                return CHARGE;
            }

            case "DISPUTE": {
                return DISPUTE;
            }

            case "REFUND": {
                return REFUND;
            }

            case "SYSTEM_ADJUSTMENT": {
                return SYSTEM_ADJUSTMENT;
            }

            case "TRANSFER": {
                return TRANSFER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADJUSTMENT: {
                return "ADJUSTMENT";
            }

            case ADJUSTMENT_REVERSAL: {
                return "ADJUSTMENT_REVERSAL";
            }

            case CHARGE: {
                return "CHARGE";
            }

            case DISPUTE: {
                return "DISPUTE";
            }

            case REFUND: {
                return "REFUND";
            }

            case SYSTEM_ADJUSTMENT: {
                return "SYSTEM_ADJUSTMENT";
            }

            case TRANSFER: {
                return "TRANSFER";
            }

            default: {
                return "";
            }
        }
    }
}

