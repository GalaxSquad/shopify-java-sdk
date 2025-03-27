// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Possible error codes that can be returned by `AppRevokeAccessScopesAppRevokeScopeError`.
*/
public enum AppRevokeAccessScopesAppRevokeScopeErrorCode {
    /**
    * The application cannot be found.
    */
    APPLICATION_CANNOT_BE_FOUND,

    /**
    * App is not installed on shop.
    */
    APP_NOT_INSTALLED,

    /**
    * Already granted implied scopes cannot be revoked.
    */
    CANNOT_REVOKE_IMPLIED_SCOPES,

    /**
    * Required scopes cannot be revoked.
    */
    CANNOT_REVOKE_REQUIRED_SCOPES,

    /**
    * Cannot revoke optional scopes that haven't been declared.
    */
    CANNOT_REVOKE_UNDECLARED_SCOPES,

    /**
    * No app found on the access token.
    */
    MISSING_SOURCE_APP,

    /**
    * The requested list of scopes to revoke includes invalid handles.
    */
    UNKNOWN_SCOPES,

    UNKNOWN_VALUE;

    public static AppRevokeAccessScopesAppRevokeScopeErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APPLICATION_CANNOT_BE_FOUND": {
                return APPLICATION_CANNOT_BE_FOUND;
            }

            case "APP_NOT_INSTALLED": {
                return APP_NOT_INSTALLED;
            }

            case "CANNOT_REVOKE_IMPLIED_SCOPES": {
                return CANNOT_REVOKE_IMPLIED_SCOPES;
            }

            case "CANNOT_REVOKE_REQUIRED_SCOPES": {
                return CANNOT_REVOKE_REQUIRED_SCOPES;
            }

            case "CANNOT_REVOKE_UNDECLARED_SCOPES": {
                return CANNOT_REVOKE_UNDECLARED_SCOPES;
            }

            case "MISSING_SOURCE_APP": {
                return MISSING_SOURCE_APP;
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
            case APPLICATION_CANNOT_BE_FOUND: {
                return "APPLICATION_CANNOT_BE_FOUND";
            }

            case APP_NOT_INSTALLED: {
                return "APP_NOT_INSTALLED";
            }

            case CANNOT_REVOKE_IMPLIED_SCOPES: {
                return "CANNOT_REVOKE_IMPLIED_SCOPES";
            }

            case CANNOT_REVOKE_REQUIRED_SCOPES: {
                return "CANNOT_REVOKE_REQUIRED_SCOPES";
            }

            case CANNOT_REVOKE_UNDECLARED_SCOPES: {
                return "CANNOT_REVOKE_UNDECLARED_SCOPES";
            }

            case MISSING_SOURCE_APP: {
                return "MISSING_SOURCE_APP";
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

