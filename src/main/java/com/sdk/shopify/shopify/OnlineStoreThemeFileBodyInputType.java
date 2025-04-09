// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The input type for a theme file body.
*/
public enum OnlineStoreThemeFileBodyInputType {
    /**
    * The base64 encoded body of a theme file.
    */
    BASE64,

    /**
    * The text body of the theme file.
    */
    TEXT,

    /**
    * The url of the body of a theme file.
    */
    URL,

    UNKNOWN_VALUE;

    public static OnlineStoreThemeFileBodyInputType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE64": {
                return BASE64;
            }

            case "TEXT": {
                return TEXT;
            }

            case "URL": {
                return URL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BASE64: {
                return "BASE64";
            }

            case TEXT: {
                return "TEXT";
            }

            case URL: {
                return "URL";
            }

            default: {
                return "";
            }
        }
    }
}

