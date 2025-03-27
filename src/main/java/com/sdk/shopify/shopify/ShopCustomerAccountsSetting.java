// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Represents the shop's customer account requirement preference.
*/
public enum ShopCustomerAccountsSetting {
    DISABLED,

    OPTIONAL,

    REQUIRED,

    UNKNOWN_VALUE;

    public static ShopCustomerAccountsSetting fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DISABLED": {
                return DISABLED;
            }

            case "OPTIONAL": {
                return OPTIONAL;
            }

            case "REQUIRED": {
                return REQUIRED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DISABLED: {
                return "DISABLED";
            }

            case OPTIONAL: {
                return "OPTIONAL";
            }

            case REQUIRED: {
                return "REQUIRED";
            }

            default: {
                return "";
            }
        }
    }
}

