// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `ProductFeedCreateUserError`.
*/
public enum ProductFeedCreateUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The input value is already taken.
    */
    TAKEN,

    UNKNOWN_VALUE;

    public static ProductFeedCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID": {
                return INVALID;
            }

            case "TAKEN": {
                return TAKEN;
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

            case TAKEN: {
                return "TAKEN";
            }

            default: {
                return "";
            }
        }
    }
}

