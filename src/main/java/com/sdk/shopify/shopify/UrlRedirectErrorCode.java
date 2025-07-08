// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `UrlRedirectUserError`.
*/
public enum UrlRedirectErrorCode {
    /**
    * Redirect could not be created.
    */
    CREATE_FAILED,

    /**
    * Redirect could not be deleted.
    */
    DELETE_FAILED,

    /**
    * Redirect does not exist.
    */
    DOES_NOT_EXIST,

    /**
    * Redirect could not be updated.
    */
    UPDATE_FAILED,

    UNKNOWN_VALUE;

    public static UrlRedirectErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATE_FAILED": {
                return CREATE_FAILED;
            }

            case "DELETE_FAILED": {
                return DELETE_FAILED;
            }

            case "DOES_NOT_EXIST": {
                return DOES_NOT_EXIST;
            }

            case "UPDATE_FAILED": {
                return UPDATE_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CREATE_FAILED: {
                return "CREATE_FAILED";
            }

            case DELETE_FAILED: {
                return "DELETE_FAILED";
            }

            case DOES_NOT_EXIST: {
                return "DOES_NOT_EXIST";
            }

            case UPDATE_FAILED: {
                return "UPDATE_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

