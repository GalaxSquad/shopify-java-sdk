// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Highest level of validation concerns identified for the address.
*/
public enum MailingAddressValidationResult {
    /**
    * Indicates that the address has been validated and is very likely to contain invalid information.
    */
    ERROR,

    /**
    * Indicates that the address has been validated and no issues were found.
    */
    NO_ISSUES,

    /**
    * Indicates that the address has been validated and might contain invalid information.
    */
    WARNING,

    UNKNOWN_VALUE;

    public static MailingAddressValidationResult fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ERROR": {
                return ERROR;
            }

            case "NO_ISSUES": {
                return NO_ISSUES;
            }

            case "WARNING": {
                return WARNING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ERROR: {
                return "ERROR";
            }

            case NO_ISSUES: {
                return "NO_ISSUES";
            }

            case WARNING: {
                return "WARNING";
            }

            default: {
                return "";
            }
        }
    }
}

