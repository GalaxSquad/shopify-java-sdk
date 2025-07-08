// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible values for object fit.
*/
public enum CheckoutBrandingObjectFit {
    /**
    * The Contain value for fit. The image is scaled to maintain its aspect ratio while fitting within the
    * containing box. The entire image is made to fill the box, while preserving its aspect ratio, so the
    * image will be "letterboxed" if its aspect ratio does not match the aspect ratio of the box. This is
    * the default value.
    */
    CONTAIN,

    /**
    * The Cover value for fit. The image is sized to maintain its aspect ratio while filling the entire
    * containing box. If the image’s aspect ratio does not match the aspect ratio of the containing box,
    * then the object will be clipped to fit.
    */
    COVER,

    UNKNOWN_VALUE;

    public static CheckoutBrandingObjectFit fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONTAIN": {
                return CONTAIN;
            }

            case "COVER": {
                return COVER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONTAIN: {
                return "CONTAIN";
            }

            case COVER: {
                return "COVER";
            }

            default: {
                return "";
            }
        }
    }
}

