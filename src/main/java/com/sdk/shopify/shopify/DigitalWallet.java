// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Digital wallet, such as Apple Pay, which can be used for accelerated checkouts.
*/
public enum DigitalWallet {
    /**
    * Android Pay.
    */
    ANDROID_PAY,

    /**
    * Apple Pay.
    */
    APPLE_PAY,

    /**
    * Google Pay.
    */
    GOOGLE_PAY,

    /**
    * Shopify Pay.
    */
    SHOPIFY_PAY,

    UNKNOWN_VALUE;

    public static DigitalWallet fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ANDROID_PAY": {
                return ANDROID_PAY;
            }

            case "APPLE_PAY": {
                return APPLE_PAY;
            }

            case "GOOGLE_PAY": {
                return GOOGLE_PAY;
            }

            case "SHOPIFY_PAY": {
                return SHOPIFY_PAY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ANDROID_PAY: {
                return "ANDROID_PAY";
            }

            case APPLE_PAY: {
                return "APPLE_PAY";
            }

            case GOOGLE_PAY: {
                return "GOOGLE_PAY";
            }

            case SHOPIFY_PAY: {
                return "SHOPIFY_PAY";
            }

            default: {
                return "";
            }
        }
    }
}

