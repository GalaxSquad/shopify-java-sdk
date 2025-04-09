// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Warning types for media.
*/
public enum MediaWarningCode {
    /**
    * 3D model physical size might be invalid. The dimensions of your model are very large. Consider
    * reviewing your model to ensure they are correct.
    */
    MODEL_LARGE_PHYSICAL_SIZE,

    /**
    * 3D model physical size might be invalid. The dimensions of your model are very small. Consider
    * reviewing your model to ensure they are correct.
    */
    MODEL_SMALL_PHYSICAL_SIZE,

    UNKNOWN_VALUE;

    public static MediaWarningCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MODEL_LARGE_PHYSICAL_SIZE": {
                return MODEL_LARGE_PHYSICAL_SIZE;
            }

            case "MODEL_SMALL_PHYSICAL_SIZE": {
                return MODEL_SMALL_PHYSICAL_SIZE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MODEL_LARGE_PHYSICAL_SIZE: {
                return "MODEL_LARGE_PHYSICAL_SIZE";
            }

            case MODEL_SMALL_PHYSICAL_SIZE: {
                return "MODEL_SMALL_PHYSICAL_SIZE";
            }

            default: {
                return "";
            }
        }
    }
}

