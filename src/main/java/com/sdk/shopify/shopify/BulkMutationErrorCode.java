// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `BulkMutationUserError`.
*/
public enum BulkMutationErrorCode {
    /**
    * There was a problem reading the JSONL file. This error might be intermittent, so you can try
    * performing the same query again.
    */
    INTERNAL_FILE_SERVER_ERROR,

    /**
    * The operation did not run because the mutation is invalid. Check your mutation syntax and try again.
    */
    INVALID_MUTATION,

    /**
    * The JSONL file submitted via the `stagedUploadsCreate` mutation is invalid. Update the file and try
    * again.
    */
    INVALID_STAGED_UPLOAD_FILE,

    /**
    * The JSONL file could not be found. Try [uploading the
    * file](https://shopify.dev/api/usage/bulk-operations/imports#generate-the-uploaded-url-and-parameters
    * ) again, and check that you've entered the URL correctly for the `stagedUploadPath` mutation
    * argument.
    */
    NO_SUCH_FILE,

    /**
    * The operation did not run because another bulk mutation is already running. [Wait for the operation
    * to finish](https://shopify.dev/api/usage/bulk-operations/imports#wait-for-the-operation-to-finish)
    * before retrying this operation.
    */
    OPERATION_IN_PROGRESS,

    UNKNOWN_VALUE;

    public static BulkMutationErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INTERNAL_FILE_SERVER_ERROR": {
                return INTERNAL_FILE_SERVER_ERROR;
            }

            case "INVALID_MUTATION": {
                return INVALID_MUTATION;
            }

            case "INVALID_STAGED_UPLOAD_FILE": {
                return INVALID_STAGED_UPLOAD_FILE;
            }

            case "NO_SUCH_FILE": {
                return NO_SUCH_FILE;
            }

            case "OPERATION_IN_PROGRESS": {
                return OPERATION_IN_PROGRESS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INTERNAL_FILE_SERVER_ERROR: {
                return "INTERNAL_FILE_SERVER_ERROR";
            }

            case INVALID_MUTATION: {
                return "INVALID_MUTATION";
            }

            case INVALID_STAGED_UPLOAD_FILE: {
                return "INVALID_STAGED_UPLOAD_FILE";
            }

            case NO_SUCH_FILE: {
                return "NO_SUCH_FILE";
            }

            case OPERATION_IN_PROGRESS: {
                return "OPERATION_IN_PROGRESS";
            }

            default: {
                return "";
            }
        }
    }
}

