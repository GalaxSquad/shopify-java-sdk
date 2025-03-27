// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The part of the image that should remain after cropping.
*/
public enum CropRegion {
    /**
    * Keep the bottom of the image.
    */
    BOTTOM,

    /**
    * Keep the center of the image.
    */
    CENTER,

    /**
    * Keep the left of the image.
    */
    LEFT,

    /**
    * Keep the right of the image.
    */
    RIGHT,

    /**
    * Keep the top of the image.
    */
    TOP,

    UNKNOWN_VALUE;

    public static CropRegion fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BOTTOM": {
                return BOTTOM;
            }

            case "CENTER": {
                return CENTER;
            }

            case "LEFT": {
                return LEFT;
            }

            case "RIGHT": {
                return RIGHT;
            }

            case "TOP": {
                return TOP;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BOTTOM: {
                return "BOTTOM";
            }

            case CENTER: {
                return "CENTER";
            }

            case LEFT: {
                return "LEFT";
            }

            case RIGHT: {
                return "RIGHT";
            }

            case TOP: {
                return "TOP";
            }

            default: {
                return "";
            }
        }
    }
}

