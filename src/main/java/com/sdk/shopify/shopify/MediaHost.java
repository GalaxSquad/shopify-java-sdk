// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Host for a Media Resource.
*/
public enum MediaHost {
    /**
    * Host for Vimeo embedded videos.
    */
    VIMEO,

    /**
    * Host for YouTube embedded videos.
    */
    YOUTUBE,

    UNKNOWN_VALUE;

    public static MediaHost fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "VIMEO": {
                return VIMEO;
            }

            case "YOUTUBE": {
                return YOUTUBE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case VIMEO: {
                return "VIMEO";
            }

            case YOUTUBE: {
                return "YOUTUBE";
            }

            default: {
                return "";
            }
        }
    }
}

