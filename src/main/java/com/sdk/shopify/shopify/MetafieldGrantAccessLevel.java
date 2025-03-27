// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible access levels for explicit metafield access grants.
*/
public enum MetafieldGrantAccessLevel {
    /**
    * Read metafield access.
    */
    READ,

    /**
    * Read and write metafield access.
    */
    READ_WRITE,

    UNKNOWN_VALUE;

    public static MetafieldGrantAccessLevel fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
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

