// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CustomerCancelDataErasureUserError`.
*/
public enum CustomerCancelDataErasureErrorCode {
    /**
    * Customer does not exist.
    */
    DOES_NOT_EXIST,

    /**
    * Failed to cancel customer data erasure.
    */
    FAILED_TO_CANCEL,

    /**
    * Customer's data is not scheduled for erasure.
    */
    NOT_BEING_ERASED,

    /**
    * Only the original requester can cancel this data erasure.
    */
    UNAUTHORIZED_CANCELLATION,

    UNKNOWN_VALUE;

    public static CustomerCancelDataErasureErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DOES_NOT_EXIST": {
                return DOES_NOT_EXIST;
            }

            case "FAILED_TO_CANCEL": {
                return FAILED_TO_CANCEL;
            }

            case "NOT_BEING_ERASED": {
                return NOT_BEING_ERASED;
            }

            case "UNAUTHORIZED_CANCELLATION": {
                return UNAUTHORIZED_CANCELLATION;
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

            case FAILED_TO_CANCEL: {
                return "FAILED_TO_CANCEL";
            }

            case NOT_BEING_ERASED: {
                return "NOT_BEING_ERASED";
            }

            case UNAUTHORIZED_CANCELLATION: {
                return "UNAUTHORIZED_CANCELLATION";
            }

            default: {
                return "";
            }
        }
    }
}

