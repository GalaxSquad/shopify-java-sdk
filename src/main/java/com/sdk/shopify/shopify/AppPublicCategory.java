// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The public-facing category for an app.
*/
public enum AppPublicCategory {
    /**
    * The app's public category is
    * [custom](https://shopify.dev/apps/distribution#capabilities-and-requirements).
    */
    CUSTOM,

    /**
    * The app's public category is other. An app is in this category if it's not classified under any of
    * the other app types (private, public, or custom).
    */
    OTHER,

    /**
    * The app's public category is [private](https://shopify.dev/apps/distribution#deprecated-app-types).
    */
    PRIVATE,

    /**
    * The app's public category is
    * [public](https://shopify.dev/apps/distribution#capabilities-and-requirements).
    */
    PUBLIC,

    UNKNOWN_VALUE;

    public static AppPublicCategory fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOM": {
                return CUSTOM;
            }

            case "OTHER": {
                return OTHER;
            }

            case "PRIVATE": {
                return PRIVATE;
            }

            case "PUBLIC": {
                return PUBLIC;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOM: {
                return "CUSTOM";
            }

            case OTHER: {
                return "OTHER";
            }

            case PRIVATE: {
                return "PRIVATE";
            }

            case PUBLIC: {
                return "PUBLIC";
            }

            default: {
                return "";
            }
        }
    }
}

