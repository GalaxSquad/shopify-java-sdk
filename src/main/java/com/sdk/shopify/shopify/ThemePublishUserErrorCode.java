// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `ThemePublishUserError`.
*/
public enum ThemePublishUserErrorCode {
    /**
    * Theme publishing is not available during install.
    */
    CANNOT_PUBLISH_THEME_DURING_INSTALL,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * Theme publishing is not allowed on this plan.
    */
    THEME_PUBLISH_NOT_AVAILABLE_FOR_THEME_LIMITED_PLAN,

    UNKNOWN_VALUE;

    public static ThemePublishUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_PUBLISH_THEME_DURING_INSTALL": {
                return CANNOT_PUBLISH_THEME_DURING_INSTALL;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "THEME_PUBLISH_NOT_AVAILABLE_FOR_THEME_LIMITED_PLAN": {
                return THEME_PUBLISH_NOT_AVAILABLE_FOR_THEME_LIMITED_PLAN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANNOT_PUBLISH_THEME_DURING_INSTALL: {
                return "CANNOT_PUBLISH_THEME_DURING_INSTALL";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case THEME_PUBLISH_NOT_AVAILABLE_FOR_THEME_LIMITED_PLAN: {
                return "THEME_PUBLISH_NOT_AVAILABLE_FOR_THEME_LIMITED_PLAN";
            }

            default: {
                return "";
            }
        }
    }
}

