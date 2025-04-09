// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

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

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

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

            case "RELEVANCE": {
                return RELEVANCE;
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

            case RELEVANCE: {
                return "RELEVANCE";
            }

            default: {
                return "";
            }
        }
    }
}

