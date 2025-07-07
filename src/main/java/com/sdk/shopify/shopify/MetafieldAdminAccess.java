// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Metafield access permissions for the Admin API.
*/
public enum MetafieldAdminAccess {
    /**
    * The merchant has read-only access. No other apps have access.
    */
    MERCHANT_READ,

    /**
    * The merchant has read and write access. No other apps have access.
    */
    MERCHANT_READ_WRITE,

    /**
    * The merchant and other apps have no access.
    */
    PRIVATE,

    /**
    * The merchant and other apps have read-only access.
    */
    PUBLIC_READ,

    /**
    * The merchant and other apps have read and write access.
    */
    PUBLIC_READ_WRITE,

    UNKNOWN_VALUE;

    public static MetafieldAdminAccess fromGraphQl(String value) {
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

            case "PRIVATE": {
                return PRIVATE;
            }

            case "PUBLIC_READ": {
                return PUBLIC_READ;
            }

            case "PUBLIC_READ_WRITE": {
                return PUBLIC_READ_WRITE;
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

            case PRIVATE: {
                return "PRIVATE";
            }

            case PUBLIC_READ: {
                return "PUBLIC_READ";
            }

            case PUBLIC_READ_WRITE: {
                return "PUBLIC_READ_WRITE";
            }

            default: {
                return "";
            }
        }
    }
}

