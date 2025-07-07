// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The levels of privacy of an app installation.
*/
public enum AppInstallationPrivacy {
    PRIVATE,

    PUBLIC,

    UNKNOWN_VALUE;

    public static AppInstallationPrivacy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
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

