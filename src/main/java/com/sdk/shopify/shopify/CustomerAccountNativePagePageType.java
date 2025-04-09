// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The type of customer account native page.
*/
public enum CustomerAccountNativePagePageType {
    /**
    * An orders page type.
    */
    NATIVE_ORDERS,

    /**
    * A profile page type.
    */
    NATIVE_PROFILE,

    /**
    * A settings page type.
    */
    NATIVE_SETTINGS,

    /**
    * An unknown page type. Represents new page types that may be added in future versions.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static CustomerAccountNativePagePageType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NATIVE_ORDERS": {
                return NATIVE_ORDERS;
            }

            case "NATIVE_PROFILE": {
                return NATIVE_PROFILE;
            }

            case "NATIVE_SETTINGS": {
                return NATIVE_SETTINGS;
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
            case NATIVE_ORDERS: {
                return "NATIVE_ORDERS";
            }

            case NATIVE_PROFILE: {
                return "NATIVE_PROFILE";
            }

            case NATIVE_SETTINGS: {
                return "NATIVE_SETTINGS";
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

