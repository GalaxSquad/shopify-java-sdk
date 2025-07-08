// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `AppUninstallAppUninstallError`.
*/
public enum AppUninstallAppUninstallErrorCode {
    /**
    * The app cannot be found.
    */
    APP_NOT_FOUND,

    /**
    * The app is not installed.
    */
    APP_NOT_INSTALLED,

    /**
    * An error occurred while uninstalling the app.
    */
    APP_UNINSTALL_ERROR,

    /**
    * User does not have sufficient permissions to uninstall this app.
    */
    USER_PERMISSIONS_INSUFFICIENT,

    UNKNOWN_VALUE;

    public static AppUninstallAppUninstallErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP_NOT_FOUND": {
                return APP_NOT_FOUND;
            }

            case "APP_NOT_INSTALLED": {
                return APP_NOT_INSTALLED;
            }

            case "APP_UNINSTALL_ERROR": {
                return APP_UNINSTALL_ERROR;
            }

            case "USER_PERMISSIONS_INSUFFICIENT": {
                return USER_PERMISSIONS_INSUFFICIENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP_NOT_FOUND: {
                return "APP_NOT_FOUND";
            }

            case APP_NOT_INSTALLED: {
                return "APP_NOT_INSTALLED";
            }

            case APP_UNINSTALL_ERROR: {
                return "APP_UNINSTALL_ERROR";
            }

            case USER_PERMISSIONS_INSUFFICIENT: {
                return "USER_PERMISSIONS_INSUFFICIENT";
            }

            default: {
                return "";
            }
        }
    }
}

