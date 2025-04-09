// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The possible line types for a sale record. One of the possible order line types for a sale is an
* adjustment. Sales adjustments occur when a refund is issued for a line item that is either more or
* less than the total value of the line item. Examples are restocking fees and goodwill payments. When
* this happens, Shopify produces a sales agreement with sale records for each line item that is
* returned or refunded and an additional sale record for the adjustment (for example, a restocking
* fee). The sales records for the returned or refunded items represent the reversal of the original
* line item sale value. The additional adjustment sale record represents the difference between the
* original total value of all line items that were refunded, and the actual amount refunded.
*/
public enum SaleLineType {
    /**
    * An additional fee.
    */
    ADDITIONAL_FEE,

    /**
    * A sale adjustment.
    */
    ADJUSTMENT,

    /**
    * A duty charge.
    */
    DUTY,

    /**
    * A fee charge.
    */
    FEE,

    /**
    * A gift card.
    */
    GIFT_CARD,

    /**
    * A product purchased, returned or exchanged.
    */
    PRODUCT,

    /**
    * A shipping cost.
    */
    SHIPPING,

    /**
    * A tip added by the customer.
    */
    TIP,

    /**
    * An unknown sale line. Represents new types that may be added in future versions.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static SaleLineType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADDITIONAL_FEE": {
                return ADDITIONAL_FEE;
            }

            case "ADJUSTMENT": {
                return ADJUSTMENT;
            }

            case "DUTY": {
                return DUTY;
            }

            case "FEE": {
                return FEE;
            }

            case "GIFT_CARD": {
                return GIFT_CARD;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            case "SHIPPING": {
                return SHIPPING;
            }

            case "TIP": {
                return TIP;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADDITIONAL_FEE: {
                return "ADDITIONAL_FEE";
            }

            case ADJUSTMENT: {
                return "ADJUSTMENT";
            }

            case DUTY: {
                return "DUTY";
            }

            case FEE: {
                return "FEE";
            }

            case GIFT_CARD: {
                return "GIFT_CARD";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            case SHIPPING: {
                return "SHIPPING";
            }

            case TIP: {
                return "TIP";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

