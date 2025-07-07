// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `DelegateAccessTokenDestroyUserError`.
*/
public enum DelegateAccessTokenDestroyUserErrorCode {
    /**
    * Access denied.
    */
    ACCESS_DENIED,

    /**
    * Access token not found.
    */
    ACCESS_TOKEN_NOT_FOUND,

    /**
    * Cannot delete parent access token.
    */
    CAN_ONLY_DELETE_DELEGATE_TOKENS,

    /**
    * Persistence failed.
    */
    PERSISTENCE_FAILED,

    UNKNOWN_VALUE;

    public static DelegateAccessTokenDestroyUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCESS_DENIED": {
                return ACCESS_DENIED;
            }

            case "ACCESS_TOKEN_NOT_FOUND": {
                return ACCESS_TOKEN_NOT_FOUND;
            }

            case "CAN_ONLY_DELETE_DELEGATE_TOKENS": {
                return CAN_ONLY_DELETE_DELEGATE_TOKENS;
            }

            case "PERSISTENCE_FAILED": {
                return PERSISTENCE_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCESS_DENIED: {
                return "ACCESS_DENIED";
            }

            case ACCESS_TOKEN_NOT_FOUND: {
                return "ACCESS_TOKEN_NOT_FOUND";
            }

            case CAN_ONLY_DELETE_DELEGATE_TOKENS: {
                return "CAN_ONLY_DELETE_DELEGATE_TOKENS";
            }

            case PERSISTENCE_FAILED: {
                return "PERSISTENCE_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

