// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Legacy type information for the stored value.
* Replaced by `type`.
*/
public enum MetafieldValueType {
    /**
    * A `true` or `false` value.
    */
    BOOLEAN,

    /**
    * A whole number.
    */
    INTEGER,

    /**
    * A JSON string.
    */
    JSON_STRING,

    /**
    * A text field.
    */
    STRING,

    UNKNOWN_VALUE;

    public static MetafieldValueType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BOOLEAN": {
                return BOOLEAN;
            }

            case "INTEGER": {
                return INTEGER;
            }

            case "JSON_STRING": {
                return JSON_STRING;
            }

            case "STRING": {
                return STRING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BOOLEAN: {
                return "BOOLEAN";
            }

            case INTEGER: {
                return "INTEGER";
            }

            case JSON_STRING: {
                return "JSON_STRING";
            }

            case STRING: {
                return "STRING";
            }

            default: {
                return "";
            }
        }
    }
}

