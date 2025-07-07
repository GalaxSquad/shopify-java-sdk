// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Metafield access permissions for the Customer Account API.
*/
public enum MetafieldCustomerAccountAccess {
    /**
    * No access.
    */
    NONE,

    /**
    * Read-only access.
    */
    READ,

    /**
    * Read and write access.
    */
    READ_WRITE,

    UNKNOWN_VALUE;

    public static MetafieldCustomerAccountAccess fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NONE": {
                return NONE;
            }

            case "READ": {
                return READ;
            }

            case "READ_WRITE": {
                return READ_WRITE;
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

            case READ: {
                return "READ";
            }

            case READ_WRITE: {
                return "READ_WRITE";
            }

            default: {
                return "";
            }
        }
    }
}

