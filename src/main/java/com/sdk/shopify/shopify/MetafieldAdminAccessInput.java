// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Metafield access permissions for the Admin API.
*/
public enum MetafieldAdminAccessInput {
    /**
    * The merchant has read-only access. No other apps have access.
    */
    MERCHANT_READ,

    /**
    * The merchant has read and write access. No other apps have access.
    */
    MERCHANT_READ_WRITE,

    UNKNOWN_VALUE;

    public static MetafieldAdminAccessInput fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MERCHANT_READ": {
                return MERCHANT_READ;
            }

            case "MERCHANT_READ_WRITE": {
                return MERCHANT_READ_WRITE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MERCHANT_READ: {
                return "MERCHANT_READ";
            }

            case MERCHANT_READ_WRITE: {
                return "MERCHANT_READ_WRITE";
            }

            default: {
                return "";
            }
        }
    }
}

