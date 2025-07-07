// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* List of supported image content types.
*/
public enum ImageContentType {
    /**
    * A JPG image.
    */
    JPG,

    /**
    * A PNG image.
    */
    PNG,

    /**
    * A WEBP image.
    */
    WEBP,

    UNKNOWN_VALUE;

    public static ImageContentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "JPG": {
                return JPG;
            }

            case "PNG": {
                return PNG;
            }

            case "WEBP": {
                return WEBP;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case JPG: {
                return "JPG";
            }

            case PNG: {
                return "PNG";
            }

            case WEBP: {
                return "WEBP";
            }

            default: {
                return "";
            }
        }
    }
}

