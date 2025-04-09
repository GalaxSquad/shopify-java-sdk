// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `ThemeCreateUserError`.
*/
public enum ThemeCreateUserErrorCode {
    /**
    * Invalid theme role for theme creation.
    */
    INVALID_THEME_ROLE_FOR_THEME_CREATION,

    /**
    * Must be a zip file.
    */
    INVALID_ZIP,

    /**
    * Theme creation is not allowed for your shop's plan.
    */
    THEME_CREATION_NOT_ALLOWED_FOR_THEME_LIMITED_PLAN,

    /**
    * Zip is empty.
    */
    ZIP_IS_EMPTY,

    /**
    * May not be used to fetch a file bigger
    * than 50MB.
    */
    ZIP_TOO_LARGE,

    UNKNOWN_VALUE;

    public static ThemeCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_THEME_ROLE_FOR_THEME_CREATION": {
                return INVALID_THEME_ROLE_FOR_THEME_CREATION;
            }

            case "INVALID_ZIP": {
                return INVALID_ZIP;
            }

            case "THEME_CREATION_NOT_ALLOWED_FOR_THEME_LIMITED_PLAN": {
                return THEME_CREATION_NOT_ALLOWED_FOR_THEME_LIMITED_PLAN;
            }

            case "ZIP_IS_EMPTY": {
                return ZIP_IS_EMPTY;
            }

            case "ZIP_TOO_LARGE": {
                return ZIP_TOO_LARGE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID_THEME_ROLE_FOR_THEME_CREATION: {
                return "INVALID_THEME_ROLE_FOR_THEME_CREATION";
            }

            case INVALID_ZIP: {
                return "INVALID_ZIP";
            }

            case THEME_CREATION_NOT_ALLOWED_FOR_THEME_LIMITED_PLAN: {
                return "THEME_CREATION_NOT_ALLOWED_FOR_THEME_LIMITED_PLAN";
            }

            case ZIP_IS_EMPTY: {
                return "ZIP_IS_EMPTY";
            }

            case ZIP_TOO_LARGE: {
                return "ZIP_TOO_LARGE";
            }

            default: {
                return "";
            }
        }
    }
}

