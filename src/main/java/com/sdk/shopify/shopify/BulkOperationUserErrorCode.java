// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `BulkOperationUserError`.
*/
public enum BulkOperationUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * A bulk operation is already in progress.
    */
    OPERATION_IN_PROGRESS,

    UNKNOWN_VALUE;

    public static BulkOperationUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID": {
                return INVALID;
            }

            case "OPERATION_IN_PROGRESS": {
                return OPERATION_IN_PROGRESS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID: {
                return "INVALID";
            }

            case OPERATION_IN_PROGRESS: {
                return "OPERATION_IN_PROGRESS";
            }

            default: {
                return "";
            }
        }
    }
}

