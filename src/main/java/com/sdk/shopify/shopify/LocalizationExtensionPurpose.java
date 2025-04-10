// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The purpose of a localization extension.
*/
public enum LocalizationExtensionPurpose {
    /**
    * Extensions that are used for shipping purposes, for example, customs clearance.
    */
    SHIPPING,

    /**
    * Extensions that are used for taxes purposes, for example, invoicing.
    */
    TAX,

    UNKNOWN_VALUE;

    public static LocalizationExtensionPurpose fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "SHIPPING": {
                return SHIPPING;
            }

            case "TAX": {
                return TAX;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case SHIPPING: {
                return "SHIPPING";
            }

            case TAX: {
                return "TAX";
            }

            default: {
                return "";
            }
        }
    }
}

