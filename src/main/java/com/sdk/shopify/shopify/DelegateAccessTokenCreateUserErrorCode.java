// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `DelegateAccessTokenCreateUserError`.
*/
public enum DelegateAccessTokenCreateUserErrorCode {
    /**
    * The parent access token can't be a delegate token.
    */
    DELEGATE_ACCESS_TOKEN,

    /**
    * The access scope can't be empty.
    */
    EMPTY_ACCESS_SCOPE,

    /**
    * The delegate token can't expire after the parent token.
    */
    EXPIRES_AFTER_PARENT,

    /**
    * The expires_in value must be greater than 0.
    */
    NEGATIVE_EXPIRES_IN,

    /**
    * Persistence failed.
    */
    PERSISTENCE_FAILED,

    /**
    * The parent access token can't have a refresh token.
    */
    REFRESH_TOKEN,

    /**
    * Unknown scopes.
    */
    UNKNOWN_SCOPES,

    UNKNOWN_VALUE;

    public static DelegateAccessTokenCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DELEGATE_ACCESS_TOKEN": {
                return DELEGATE_ACCESS_TOKEN;
            }

            case "EMPTY_ACCESS_SCOPE": {
                return EMPTY_ACCESS_SCOPE;
            }

            case "EXPIRES_AFTER_PARENT": {
                return EXPIRES_AFTER_PARENT;
            }

            case "NEGATIVE_EXPIRES_IN": {
                return NEGATIVE_EXPIRES_IN;
            }

            case "PERSISTENCE_FAILED": {
                return PERSISTENCE_FAILED;
            }

            case "REFRESH_TOKEN": {
                return REFRESH_TOKEN;
            }

            case "UNKNOWN_SCOPES": {
                return UNKNOWN_SCOPES;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DELEGATE_ACCESS_TOKEN: {
                return "DELEGATE_ACCESS_TOKEN";
            }

            case EMPTY_ACCESS_SCOPE: {
                return "EMPTY_ACCESS_SCOPE";
            }

            case EXPIRES_AFTER_PARENT: {
                return "EXPIRES_AFTER_PARENT";
            }

            case NEGATIVE_EXPIRES_IN: {
                return "NEGATIVE_EXPIRES_IN";
            }

            case PERSISTENCE_FAILED: {
                return "PERSISTENCE_FAILED";
            }

            case REFRESH_TOKEN: {
                return "REFRESH_TOKEN";
            }

            case UNKNOWN_SCOPES: {
                return "UNKNOWN_SCOPES";
            }

            default: {
                return "";
            }
        }
    }
}

