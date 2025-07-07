// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible metafield validation statuses.
*/
public enum MetafieldValidationStatus {
    /**
    * Any validation status (valid or invalid).
    */
    ANY,

    /**
    * Invalid (according to definition).
    */
    INVALID,

    /**
    * Valid (according to definition).
    */
    VALID,

    UNKNOWN_VALUE;

    public static MetafieldValidationStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ANY": {
                return ANY;
            }

            case "INVALID": {
                return INVALID;
            }

            case "VALID": {
                return VALID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ANY: {
                return "ANY";
            }

            case INVALID: {
                return "INVALID";
            }

            case VALID: {
                return "VALID";
            }

            default: {
                return "";
            }
        }
    }
}

