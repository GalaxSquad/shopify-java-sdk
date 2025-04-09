// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible metafield definition validation statuses.
*/
public enum MetafieldDefinitionValidationStatus {
    /**
    * All of this definition's metafields are valid.
    */
    ALL_VALID,

    /**
    * Asynchronous validation of this definition's metafields is in progress.
    */
    IN_PROGRESS,

    /**
    * Some of this definition's metafields are invalid.
    */
    SOME_INVALID,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionValidationStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALL_VALID": {
                return ALL_VALID;
            }

            case "IN_PROGRESS": {
                return IN_PROGRESS;
            }

            case "SOME_INVALID": {
                return SOME_INVALID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALL_VALID: {
                return "ALL_VALID";
            }

            case IN_PROGRESS: {
                return "IN_PROGRESS";
            }

            case SOME_INVALID: {
                return "SOME_INVALID";
            }

            default: {
                return "";
            }
        }
    }
}

