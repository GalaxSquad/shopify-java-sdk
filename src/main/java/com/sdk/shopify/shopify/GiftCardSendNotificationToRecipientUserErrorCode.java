// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `GiftCardSendNotificationToRecipientUserError`.
*/
public enum GiftCardSendNotificationToRecipientUserErrorCode {
    /**
    * The gift card could not be found.
    */
    GIFT_CARD_NOT_FOUND,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The recipient could not be found.
    */
    RECIPIENT_NOT_FOUND,

    UNKNOWN_VALUE;

    public static GiftCardSendNotificationToRecipientUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GIFT_CARD_NOT_FOUND": {
                return GIFT_CARD_NOT_FOUND;
            }

            case "INVALID": {
                return INVALID;
            }

            case "RECIPIENT_NOT_FOUND": {
                return RECIPIENT_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case GIFT_CARD_NOT_FOUND: {
                return "GIFT_CARD_NOT_FOUND";
            }

            case INVALID: {
                return "INVALID";
            }

            case RECIPIENT_NOT_FOUND: {
                return "RECIPIENT_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

