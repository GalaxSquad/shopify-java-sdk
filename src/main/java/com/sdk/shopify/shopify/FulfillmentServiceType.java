// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The type of a fulfillment service.
*/
public enum FulfillmentServiceType {
    /**
    * Fulfillment by gift card.
    */
    GIFT_CARD,

    /**
    * Manual fulfillment by the merchant.
    */
    MANUAL,

    /**
    * Fullfillment by a third-party fulfillment service.
    */
    THIRD_PARTY,

    UNKNOWN_VALUE;

    public static FulfillmentServiceType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GIFT_CARD": {
                return GIFT_CARD;
            }

            case "MANUAL": {
                return MANUAL;
            }

            case "THIRD_PARTY": {
                return THIRD_PARTY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case GIFT_CARD: {
                return "GIFT_CARD";
            }

            case MANUAL: {
                return "MANUAL";
            }

            case THIRD_PARTY: {
                return "THIRD_PARTY";
            }

            default: {
                return "";
            }
        }
    }
}

