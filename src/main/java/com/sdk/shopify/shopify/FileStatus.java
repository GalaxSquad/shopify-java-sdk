// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The possible statuses for a file object.
*/
public enum FileStatus {
    /**
    * File processing has failed.
    */
    FAILED,

    /**
    * File is being processed.
    */
    PROCESSING,

    /**
    * File is ready to be displayed.
    */
    READY,

    /**
    * File has been uploaded but hasn't been processed.
    */
    UPLOADED,

    UNKNOWN_VALUE;

    public static FileStatus fromGraphQl(String value) {
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

