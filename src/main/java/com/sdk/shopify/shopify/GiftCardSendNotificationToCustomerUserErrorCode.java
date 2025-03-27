// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `GiftCardSendNotificationToCustomerUserError`.
*/
public enum GiftCardSendNotificationToCustomerUserErrorCode {
    /**
    * The customer could not be found.
    */
    CUSTOMER_NOT_FOUND,

    /**
    * The gift card could not be found.
    */
    GIFT_CARD_NOT_FOUND,

    /**
    * The input value is invalid.
    */
    INVALID,

    UNKNOWN_VALUE;

    public static GiftCardSendNotificationToCustomerUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER_NOT_FOUND": {
                return CUSTOMER_NOT_FOUND;
            }

            case "GIFT_CARD_NOT_FOUND": {
                return GIFT_CARD_NOT_FOUND;
            }

            case "INVALID": {
                return INVALID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER_NOT_FOUND: {
                return "CUSTOMER_NOT_FOUND";
            }

            case GIFT_CARD_NOT_FOUND: {
                return "GIFT_CARD_NOT_FOUND";
            }

            case INVALID: {
                return "INVALID";
            }

            default: {
                return "";
            }
        }
    }
}

