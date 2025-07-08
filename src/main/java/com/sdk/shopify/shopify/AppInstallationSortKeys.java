// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the AppInstallation query.
*/
public enum AppInstallationSortKeys {
    /**
    * Sort by the `app_title` value.
    */
    APP_TITLE,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `installed_at` value.
    */
    INSTALLED_AT,

    UNKNOWN_VALUE;

    public static AppInstallationSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP_TITLE": {
                return APP_TITLE;
            }

            case "ID": {
                return ID;
            }

            case "INSTALLED_AT": {
                return INSTALLED_AT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP_TITLE: {
                return "APP_TITLE";
            }

            case ID: {
                return "ID";
            }

            case INSTALLED_AT: {
                return "INSTALLED_AT";
            }

            default: {
                return "";
            }
        }
    }
}

