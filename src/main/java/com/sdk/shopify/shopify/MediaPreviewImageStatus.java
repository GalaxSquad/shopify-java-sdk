// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible statuses for a media preview image.
*/
public enum MediaPreviewImageStatus {
    /**
    * Preview image processing has failed.
    */
    FAILED,

    /**
    * Preview image is being processed.
    */
    PROCESSING,

    /**
    * Preview image is ready to be displayed.
    */
    READY,

    /**
    * Preview image is uploaded but not yet processed.
    */
    UPLOADED,

    UNKNOWN_VALUE;

    public static MediaPreviewImageStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FAILED": {
                return FAILED;
            }

            case "PROCESSING": {
                return PROCESSING;
            }

            case "READY": {
                return READY;
            }

            case "UPLOADED": {
                return UPLOADED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FAILED: {
                return "FAILED";
            }

            case PROCESSING: {
                return "PROCESSING";
            }

            case READY: {
                return "READY";
            }

            case UPLOADED: {
                return "UPLOADED";
            }

            default: {
                return "";
            }
        }
    }
}

