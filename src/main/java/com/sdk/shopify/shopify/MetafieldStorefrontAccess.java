// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Metafield access permissions for the Storefront API.
*/
public enum MetafieldStorefrontAccess {
    /**
    * No access.
    */
    NONE,

    /**
    * Read-only access.
    */
    PUBLIC_READ,

    UNKNOWN_VALUE;

    public static MetafieldStorefrontAccess fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NONE": {
                return NONE;
            }

            case "PUBLIC_READ": {
                return PUBLIC_READ;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NONE: {
                return "NONE";
            }

            case PUBLIC_READ: {
                return "PUBLIC_READ";
            }

            default: {
                return "";
            }
        }
    }
}

