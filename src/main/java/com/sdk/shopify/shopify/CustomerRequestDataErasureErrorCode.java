// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CustomerRequestDataErasureUserError`.
*/
public enum CustomerRequestDataErasureErrorCode {
    /**
    * Customer does not exist.
    */
    DOES_NOT_EXIST,

    /**
    * Failed to request customer data erasure.
    */
    FAILED_TO_REQUEST,

    UNKNOWN_VALUE;

    public static CustomerRequestDataErasureErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DOES_NOT_EXIST": {
                return DOES_NOT_EXIST;
            }

            case "FAILED_TO_REQUEST": {
                return FAILED_TO_REQUEST;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DOES_NOT_EXIST: {
                return "DOES_NOT_EXIST";
            }

            case FAILED_TO_REQUEST: {
                return "FAILED_TO_REQUEST";
            }

            default: {
                return "";
            }
        }
    }
}

