// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible content types for a media object.
*/
public enum MediaContentType {
    /**
    * An externally hosted video.
    */
    EXTERNAL_VIDEO,

    /**
    * A Shopify-hosted image.
    */
    IMAGE,

    /**
    * A 3d model.
    */
    MODEL_3D,

    /**
    * A Shopify-hosted video.
    */
    VIDEO,

    UNKNOWN_VALUE;

    public static MediaContentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "EXTERNAL_VIDEO": {
                return EXTERNAL_VIDEO;
            }

            case "IMAGE": {
                return IMAGE;
            }

            case "MODEL_3D": {
                return MODEL_3D;
            }

            case "VIDEO": {
                return VIDEO;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case EXTERNAL_VIDEO: {
                return "EXTERNAL_VIDEO";
            }

            case IMAGE: {
                return "IMAGE";
            }

            case MODEL_3D: {
                return "MODEL_3D";
            }

            case VIDEO: {
                return "VIDEO";
            }

            default: {
                return "";
            }
        }
    }
}

