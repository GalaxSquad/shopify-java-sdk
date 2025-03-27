// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `GiftCardDeactivateUserError`.
*/
public enum GiftCardDeactivateUserErrorCode {
    /**
    * The gift card could not be found.
    */
    GIFT_CARD_NOT_FOUND,

    UNKNOWN_VALUE;

    public static GiftCardDeactivateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GIFT_CARD_NOT_FOUND": {
                return GIFT_CARD_NOT_FOUND;
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

            default: {
                return "";
            }
        }
    }
}

