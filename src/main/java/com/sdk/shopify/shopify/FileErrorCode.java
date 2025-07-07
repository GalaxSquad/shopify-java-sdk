// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The error types for a file.
*/
public enum FileErrorCode {
    /**
    * File could not be created because a file with the same name already exists.
    */
    DUPLICATE_FILENAME_ERROR,

    /**
    * File could not be created because embed permissions are disabled for this video.
    */
    EXTERNAL_VIDEO_EMBED_DISABLED,

    /**
    * File could not be created because video is either not found or still transcoding.
    */
    EXTERNAL_VIDEO_EMBED_NOT_FOUND_OR_TRANSCODING,

    /**
    * File could not be created because the external video has an invalid aspect ratio.
    */
    EXTERNAL_VIDEO_INVALID_ASPECT_RATIO,

    /**
    * File could not be created because the external video could not be found.
    */
    EXTERNAL_VIDEO_NOT_FOUND,

    /**
    * File could not be created because the external video is not listed or is private.
    */
    EXTERNAL_VIDEO_UNLISTED,

    /**
    * File could not be created because the cumulative file storage limit would be exceeded.
    */
    FILE_STORAGE_LIMIT_EXCEEDED,

    /**
    * File could not be processed because the source could not be downloaded.
    */
    GENERIC_FILE_DOWNLOAD_FAILURE,

    /**
    * File could not be created because the size is too large.
    */
    GENERIC_FILE_INVALID_SIZE,

    /**
    * File could not be processed because the image could not be downloaded.
    */
    IMAGE_DOWNLOAD_FAILURE,

    /**
    * File could not be processed because the image could not be processed.
    */
    IMAGE_PROCESSING_FAILURE,

    /**
    * File could not be created because the image has an invalid aspect ratio.
    */
    INVALID_IMAGE_ASPECT_RATIO,

    /**
    * File could not be created because the image size is too large.
    */
    INVALID_IMAGE_FILE_SIZE,

    /**
    * File could not be created because the image's resolution exceeds the max limit.
    */
    INVALID_IMAGE_RESOLUTION,

    /**
    * File could not be processed because the signed URL was invalid.
    */
    INVALID_SIGNED_URL,

    /**
    * File timed out because it is currently being modified by another operation.
    */
    MEDIA_TIMEOUT_ERROR,

    /**
    * File could not be created because the model file failed processing.
    */
    MODEL3D_GLB_OUTPUT_CREATION_ERROR,

    /**
    * File could not be created because the model can't be converted to USDZ format.
    */
    MODEL3D_GLB_TO_USDZ_CONVERSION_ERROR,

    /**
    * File could not be created because the model file failed processing.
    */
    MODEL3D_PROCESSING_FAILURE,

    /**
    * File could not be created because the model's thumbnail generation failed.
    */
    MODEL3D_THUMBNAIL_GENERATION_ERROR,

    /**
    * There was an issue while trying to generate a new thumbnail.
    */
    MODEL3D_THUMBNAIL_REGENERATION_ERROR,

    /**
    * Model failed validation.
    */
    MODEL3D_VALIDATION_ERROR,

    /**
    * File error has occurred for an unknown reason.
    */
    UNKNOWN,

    /**
    * File could not be created because the image is an unsupported file type.
    */
    UNSUPPORTED_IMAGE_FILE_TYPE,

    /**
    * File could not be created because it has an invalid file type.
    */
    VIDEO_INVALID_FILETYPE_ERROR,

    /**
    * File could not be created because it does not meet the maximum duration requirement.
    */
    VIDEO_MAX_DURATION_ERROR,

    /**
    * File could not be created because it does not meet the maximum height requirement.
    */
    VIDEO_MAX_HEIGHT_ERROR,

    /**
    * File could not be created because it does not meet the maximum width requirement.
    */
    VIDEO_MAX_WIDTH_ERROR,

    /**
    * File could not be created because the metadata could not be read.
    */
    VIDEO_METADATA_READ_ERROR,

    /**
    * File could not be created because it does not meet the minimum duration requirement.
    */
    VIDEO_MIN_DURATION_ERROR,

    /**
    * File could not be created because it does not meet the minimum height requirement.
    */
    VIDEO_MIN_HEIGHT_ERROR,

    /**
    * File could not be created because it does not meet the minimum width requirement.
    */
    VIDEO_MIN_WIDTH_ERROR,

    /**
    * Video failed validation.
    */
    VIDEO_VALIDATION_ERROR,

    UNKNOWN_VALUE;

    public static FileErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DUPLICATE_FILENAME_ERROR": {
                return DUPLICATE_FILENAME_ERROR;
            }

            case "EXTERNAL_VIDEO_EMBED_DISABLED": {
                return EXTERNAL_VIDEO_EMBED_DISABLED;
            }

            case "EXTERNAL_VIDEO_EMBED_NOT_FOUND_OR_TRANSCODING": {
                return EXTERNAL_VIDEO_EMBED_NOT_FOUND_OR_TRANSCODING;
            }

            case "EXTERNAL_VIDEO_INVALID_ASPECT_RATIO": {
                return EXTERNAL_VIDEO_INVALID_ASPECT_RATIO;
            }

            case "EXTERNAL_VIDEO_NOT_FOUND": {
                return EXTERNAL_VIDEO_NOT_FOUND;
            }

            case "EXTERNAL_VIDEO_UNLISTED": {
                return EXTERNAL_VIDEO_UNLISTED;
            }

            case "FILE_STORAGE_LIMIT_EXCEEDED": {
                return FILE_STORAGE_LIMIT_EXCEEDED;
            }

            case "GENERIC_FILE_DOWNLOAD_FAILURE": {
                return GENERIC_FILE_DOWNLOAD_FAILURE;
            }

            case "GENERIC_FILE_INVALID_SIZE": {
                return GENERIC_FILE_INVALID_SIZE;
            }

            case "IMAGE_DOWNLOAD_FAILURE": {
                return IMAGE_DOWNLOAD_FAILURE;
            }

            case "IMAGE_PROCESSING_FAILURE": {
                return IMAGE_PROCESSING_FAILURE;
            }

            case "INVALID_IMAGE_ASPECT_RATIO": {
                return INVALID_IMAGE_ASPECT_RATIO;
            }

            case "INVALID_IMAGE_FILE_SIZE": {
                return INVALID_IMAGE_FILE_SIZE;
            }

            case "INVALID_IMAGE_RESOLUTION": {
                return INVALID_IMAGE_RESOLUTION;
            }

            case "INVALID_SIGNED_URL": {
                return INVALID_SIGNED_URL;
            }

            case "MEDIA_TIMEOUT_ERROR": {
                return MEDIA_TIMEOUT_ERROR;
            }

            case "MODEL3D_GLB_OUTPUT_CREATION_ERROR": {
                return MODEL3D_GLB_OUTPUT_CREATION_ERROR;
            }

            case "MODEL3D_GLB_TO_USDZ_CONVERSION_ERROR": {
                return MODEL3D_GLB_TO_USDZ_CONVERSION_ERROR;
            }

            case "MODEL3D_PROCESSING_FAILURE": {
                return MODEL3D_PROCESSING_FAILURE;
            }

            case "MODEL3D_THUMBNAIL_GENERATION_ERROR": {
                return MODEL3D_THUMBNAIL_GENERATION_ERROR;
            }

            case "MODEL3D_THUMBNAIL_REGENERATION_ERROR": {
                return MODEL3D_THUMBNAIL_REGENERATION_ERROR;
            }

            case "MODEL3D_VALIDATION_ERROR": {
                return MODEL3D_VALIDATION_ERROR;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            case "UNSUPPORTED_IMAGE_FILE_TYPE": {
                return UNSUPPORTED_IMAGE_FILE_TYPE;
            }

            case "VIDEO_INVALID_FILETYPE_ERROR": {
                return VIDEO_INVALID_FILETYPE_ERROR;
            }

            case "VIDEO_MAX_DURATION_ERROR": {
                return VIDEO_MAX_DURATION_ERROR;
            }

            case "VIDEO_MAX_HEIGHT_ERROR": {
                return VIDEO_MAX_HEIGHT_ERROR;
            }

            case "VIDEO_MAX_WIDTH_ERROR": {
                return VIDEO_MAX_WIDTH_ERROR;
            }

            case "VIDEO_METADATA_READ_ERROR": {
                return VIDEO_METADATA_READ_ERROR;
            }

            case "VIDEO_MIN_DURATION_ERROR": {
                return VIDEO_MIN_DURATION_ERROR;
            }

            case "VIDEO_MIN_HEIGHT_ERROR": {
                return VIDEO_MIN_HEIGHT_ERROR;
            }

            case "VIDEO_MIN_WIDTH_ERROR": {
                return VIDEO_MIN_WIDTH_ERROR;
            }

            case "VIDEO_VALIDATION_ERROR": {
                return VIDEO_VALIDATION_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DUPLICATE_FILENAME_ERROR: {
                return "DUPLICATE_FILENAME_ERROR";
            }

            case EXTERNAL_VIDEO_EMBED_DISABLED: {
                return "EXTERNAL_VIDEO_EMBED_DISABLED";
            }

            case EXTERNAL_VIDEO_EMBED_NOT_FOUND_OR_TRANSCODING: {
                return "EXTERNAL_VIDEO_EMBED_NOT_FOUND_OR_TRANSCODING";
            }

            case EXTERNAL_VIDEO_INVALID_ASPECT_RATIO: {
                return "EXTERNAL_VIDEO_INVALID_ASPECT_RATIO";
            }

            case EXTERNAL_VIDEO_NOT_FOUND: {
                return "EXTERNAL_VIDEO_NOT_FOUND";
            }

            case EXTERNAL_VIDEO_UNLISTED: {
                return "EXTERNAL_VIDEO_UNLISTED";
            }

            case FILE_STORAGE_LIMIT_EXCEEDED: {
                return "FILE_STORAGE_LIMIT_EXCEEDED";
            }

            case GENERIC_FILE_DOWNLOAD_FAILURE: {
                return "GENERIC_FILE_DOWNLOAD_FAILURE";
            }

            case GENERIC_FILE_INVALID_SIZE: {
                return "GENERIC_FILE_INVALID_SIZE";
            }

            case IMAGE_DOWNLOAD_FAILURE: {
                return "IMAGE_DOWNLOAD_FAILURE";
            }

            case IMAGE_PROCESSING_FAILURE: {
                return "IMAGE_PROCESSING_FAILURE";
            }

            case INVALID_IMAGE_ASPECT_RATIO: {
                return "INVALID_IMAGE_ASPECT_RATIO";
            }

            case INVALID_IMAGE_FILE_SIZE: {
                return "INVALID_IMAGE_FILE_SIZE";
            }

            case INVALID_IMAGE_RESOLUTION: {
                return "INVALID_IMAGE_RESOLUTION";
            }

            case INVALID_SIGNED_URL: {
                return "INVALID_SIGNED_URL";
            }

            case MEDIA_TIMEOUT_ERROR: {
                return "MEDIA_TIMEOUT_ERROR";
            }

            case MODEL3D_GLB_OUTPUT_CREATION_ERROR: {
                return "MODEL3D_GLB_OUTPUT_CREATION_ERROR";
            }

            case MODEL3D_GLB_TO_USDZ_CONVERSION_ERROR: {
                return "MODEL3D_GLB_TO_USDZ_CONVERSION_ERROR";
            }

            case MODEL3D_PROCESSING_FAILURE: {
                return "MODEL3D_PROCESSING_FAILURE";
            }

            case MODEL3D_THUMBNAIL_GENERATION_ERROR: {
                return "MODEL3D_THUMBNAIL_GENERATION_ERROR";
            }

            case MODEL3D_THUMBNAIL_REGENERATION_ERROR: {
                return "MODEL3D_THUMBNAIL_REGENERATION_ERROR";
            }

            case MODEL3D_VALIDATION_ERROR: {
                return "MODEL3D_VALIDATION_ERROR";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            case UNSUPPORTED_IMAGE_FILE_TYPE: {
                return "UNSUPPORTED_IMAGE_FILE_TYPE";
            }

            case VIDEO_INVALID_FILETYPE_ERROR: {
                return "VIDEO_INVALID_FILETYPE_ERROR";
            }

            case VIDEO_MAX_DURATION_ERROR: {
                return "VIDEO_MAX_DURATION_ERROR";
            }

            case VIDEO_MAX_HEIGHT_ERROR: {
                return "VIDEO_MAX_HEIGHT_ERROR";
            }

            case VIDEO_MAX_WIDTH_ERROR: {
                return "VIDEO_MAX_WIDTH_ERROR";
            }

            case VIDEO_METADATA_READ_ERROR: {
                return "VIDEO_METADATA_READ_ERROR";
            }

            case VIDEO_MIN_DURATION_ERROR: {
                return "VIDEO_MIN_DURATION_ERROR";
            }

            case VIDEO_MIN_HEIGHT_ERROR: {
                return "VIDEO_MIN_HEIGHT_ERROR";
            }

            case VIDEO_MIN_WIDTH_ERROR: {
                return "VIDEO_MIN_WIDTH_ERROR";
            }

            case VIDEO_VALIDATION_ERROR: {
                return "VIDEO_VALIDATION_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

