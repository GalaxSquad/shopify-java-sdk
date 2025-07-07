// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CustomerEmailMarketingConsentUpdateUserError`.
*/
public enum CustomerEmailMarketingConsentUpdateUserErrorCode {
    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Missing a required argument.
    */
    MISSING_ARGUMENT,

    UNKNOWN_VALUE;

    public static CustomerEmailMarketingConsentUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INCLUSION": {
                return INCLUSION;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID": {
                return INVALID;
            }

            case "MISSING_ARGUMENT": {
                return MISSING_ARGUMENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INCLUSION: {
                return "INCLUSION";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID: {
                return "INVALID";
            }

            case MISSING_ARGUMENT: {
                return "MISSING_ARGUMENT";
            }

            default: {
                return "";
            }
        }
    }
}

