// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ProductBundleMutationUserError`.
*/
public enum ProductBundleMutationUserErrorCode {
    /**
    * Something went wrong, please try again.
    */
    GENERIC_ERROR,

    /**
    * Input is not valid.
    */
    INVALID_INPUT,

    /**
    * Error processing request in the background job.
    */
    JOB_ERROR,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    UNKNOWN_VALUE;

    public static ProductBundleMutationUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "INVALID_INPUT": {
                return INVALID_INPUT;
            }

            case "JOB_ERROR": {
                return JOB_ERROR;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case INVALID_INPUT: {
                return "INVALID_INPUT";
            }

            case JOB_ERROR: {
                return "JOB_ERROR";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            default: {
                return "";
            }
        }
    }
}

