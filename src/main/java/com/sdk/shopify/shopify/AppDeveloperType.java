// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible types of app developer.
*/
public enum AppDeveloperType {
    /**
    * Indicates the app developer works directly for a Merchant.
    */
    MERCHANT,

    /**
    * Indicates the app developer is a Partner.
    */
    PARTNER,

    /**
    * Indicates the app developer is Shopify.
    */
    SHOPIFY,

    /**
    * Indicates the app developer is unknown. It is not categorized as any of the other developer types.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static AppDeveloperType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MERCHANT": {
                return MERCHANT;
            }

            case "PARTNER": {
                return PARTNER;
            }

            case "SHOPIFY": {
                return SHOPIFY;
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
            case MERCHANT: {
                return "MERCHANT";
            }

            case PARTNER: {
                return "PARTNER";
            }

            case SHOPIFY: {
                return "SHOPIFY";
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

