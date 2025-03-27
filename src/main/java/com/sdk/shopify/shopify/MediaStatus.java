// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The possible statuses for a media object.
*/
public enum MediaStatus {
    /**
    * Media processing has failed.
    */
    FAILED,

    /**
    * Media is being processed.
    */
    PROCESSING,

    /**
    * Media is ready to be displayed.
    */
    READY,

    /**
    * Media has been uploaded but not yet processed.
    */
    UPLOADED,

    UNKNOWN_VALUE;

    public static MediaStatus fromGraphQl(String value) {
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

