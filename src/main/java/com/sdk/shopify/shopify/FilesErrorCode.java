// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `FilesUserError`.
*/
public enum FilesErrorCode {
    /**
    * The alt value exceeds the maximum limit of 512 characters.
    */
    ALT_VALUE_LIMIT_EXCEEDED,

    /**
    * The search term must not be blank.
    */
    BLANK_SEARCH,

    /**
    * The provided filename already exists.
    */
    FILENAME_ALREADY_EXISTS,

    /**
    * File does not exist.
    */
    FILE_DOES_NOT_EXIST,

    /**
    * File has a pending operation.
    */
    FILE_LOCKED,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Duplicate resolution mode is not supported for this file type.
    */
    INVALID_DUPLICATE_MODE_FOR_TYPE,

    /**
    * The provided filename is invalid.
    */
    INVALID_FILENAME,

    /**
    * Invalid filename extension.
    */
    INVALID_FILENAME_EXTENSION,

    /**
    * Invalid image source url value provided.
    */
    INVALID_IMAGE_SOURCE_URL,

    /**
    * Search query isn't supported.
    */
    INVALID_QUERY,

    /**
    * Cannot create file with custom filename which does not match original source extension.
    */
    MISMATCHED_FILENAME_AND_ORIGINAL_SOURCE,

    /**
    * At least one argument is required.
    */
    MISSING_ARGUMENTS,

    /**
    * Duplicate resolution mode REPLACE cannot be used without specifying filename.
    */
    MISSING_FILENAME_FOR_DUPLICATE_MODE_REPLACE,

    /**
    * Exceeded the limit of non-image media per shop.
    */
    NON_IMAGE_MEDIA_PER_SHOP_LIMIT_EXCEEDED,

    /**
    * The file is not in the READY state.
    */
    NON_READY_STATE,

    /**
    * Exceeded the limit of media per product.
    */
    PRODUCT_MEDIA_LIMIT_EXCEEDED,

    /**
    * The target resource does not exist.
    */
    REFERENCE_TARGET_DOES_NOT_EXIST,

    /**
    * Specify one argument: search, IDs, or deleteAll.
    */
    TOO_MANY_ARGUMENTS,

    /**
    * Cannot add more than 10000 references to a file.
    */
    TOO_MANY_FILE_REFERENCE,

    /**
    * The file type is not supported.
    */
    UNACCEPTABLE_ASSET,

    /**
    * The file is not supported on trial accounts. Select a plan to upload this file.
    */
    UNACCEPTABLE_TRIAL_ASSET,

    /**
    * The file is not supported on trial accounts that have not validated their email. Either select a
    * plan or verify the shop owner email to upload this file.
    */
    UNACCEPTABLE_UNVERIFIED_TRIAL_ASSET,

    /**
    * The file type is not supported for referencing.
    */
    UNSUPPORTED_FILE_REFERENCE,

    /**
    * Filename update is only supported on Image and GenericFile.
    */
    UNSUPPORTED_MEDIA_TYPE_FOR_FILENAME_UPDATE,

    UNKNOWN_VALUE;

    public static FilesErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALT_VALUE_LIMIT_EXCEEDED": {
                return ALT_VALUE_LIMIT_EXCEEDED;
            }

            case "BLANK_SEARCH": {
                return BLANK_SEARCH;
            }

            case "FILENAME_ALREADY_EXISTS": {
                return FILENAME_ALREADY_EXISTS;
            }

            case "FILE_DOES_NOT_EXIST": {
                return FILE_DOES_NOT_EXIST;
            }

            case "FILE_LOCKED": {
                return FILE_LOCKED;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_DUPLICATE_MODE_FOR_TYPE": {
                return INVALID_DUPLICATE_MODE_FOR_TYPE;
            }

            case "INVALID_FILENAME": {
                return INVALID_FILENAME;
            }

            case "INVALID_FILENAME_EXTENSION": {
                return INVALID_FILENAME_EXTENSION;
            }

            case "INVALID_IMAGE_SOURCE_URL": {
                return INVALID_IMAGE_SOURCE_URL;
            }

            case "INVALID_QUERY": {
                return INVALID_QUERY;
            }

            case "MISMATCHED_FILENAME_AND_ORIGINAL_SOURCE": {
                return MISMATCHED_FILENAME_AND_ORIGINAL_SOURCE;
            }

            case "MISSING_ARGUMENTS": {
                return MISSING_ARGUMENTS;
            }

            case "MISSING_FILENAME_FOR_DUPLICATE_MODE_REPLACE": {
                return MISSING_FILENAME_FOR_DUPLICATE_MODE_REPLACE;
            }

            case "NON_IMAGE_MEDIA_PER_SHOP_LIMIT_EXCEEDED": {
                return NON_IMAGE_MEDIA_PER_SHOP_LIMIT_EXCEEDED;
            }

            case "NON_READY_STATE": {
                return NON_READY_STATE;
            }

            case "PRODUCT_MEDIA_LIMIT_EXCEEDED": {
                return PRODUCT_MEDIA_LIMIT_EXCEEDED;
            }

            case "REFERENCE_TARGET_DOES_NOT_EXIST": {
                return REFERENCE_TARGET_DOES_NOT_EXIST;
            }

            case "TOO_MANY_ARGUMENTS": {
                return TOO_MANY_ARGUMENTS;
            }

            case "TOO_MANY_FILE_REFERENCE": {
                return TOO_MANY_FILE_REFERENCE;
            }

            case "UNACCEPTABLE_ASSET": {
                return UNACCEPTABLE_ASSET;
            }

            case "UNACCEPTABLE_TRIAL_ASSET": {
                return UNACCEPTABLE_TRIAL_ASSET;
            }

            case "UNACCEPTABLE_UNVERIFIED_TRIAL_ASSET": {
                return UNACCEPTABLE_UNVERIFIED_TRIAL_ASSET;
            }

            case "UNSUPPORTED_FILE_REFERENCE": {
                return UNSUPPORTED_FILE_REFERENCE;
            }

            case "UNSUPPORTED_MEDIA_TYPE_FOR_FILENAME_UPDATE": {
                return UNSUPPORTED_MEDIA_TYPE_FOR_FILENAME_UPDATE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALT_VALUE_LIMIT_EXCEEDED: {
                return "ALT_VALUE_LIMIT_EXCEEDED";
            }

            case BLANK_SEARCH: {
                return "BLANK_SEARCH";
            }

            case FILENAME_ALREADY_EXISTS: {
                return "FILENAME_ALREADY_EXISTS";
            }

            case FILE_DOES_NOT_EXIST: {
                return "FILE_DOES_NOT_EXIST";
            }

            case FILE_LOCKED: {
                return "FILE_LOCKED";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_DUPLICATE_MODE_FOR_TYPE: {
                return "INVALID_DUPLICATE_MODE_FOR_TYPE";
            }

            case INVALID_FILENAME: {
                return "INVALID_FILENAME";
            }

            case INVALID_FILENAME_EXTENSION: {
                return "INVALID_FILENAME_EXTENSION";
            }

            case INVALID_IMAGE_SOURCE_URL: {
                return "INVALID_IMAGE_SOURCE_URL";
            }

            case INVALID_QUERY: {
                return "INVALID_QUERY";
            }

            case MISMATCHED_FILENAME_AND_ORIGINAL_SOURCE: {
                return "MISMATCHED_FILENAME_AND_ORIGINAL_SOURCE";
            }

            case MISSING_ARGUMENTS: {
                return "MISSING_ARGUMENTS";
            }

            case MISSING_FILENAME_FOR_DUPLICATE_MODE_REPLACE: {
                return "MISSING_FILENAME_FOR_DUPLICATE_MODE_REPLACE";
            }

            case NON_IMAGE_MEDIA_PER_SHOP_LIMIT_EXCEEDED: {
                return "NON_IMAGE_MEDIA_PER_SHOP_LIMIT_EXCEEDED";
            }

            case NON_READY_STATE: {
                return "NON_READY_STATE";
            }

            case PRODUCT_MEDIA_LIMIT_EXCEEDED: {
                return "PRODUCT_MEDIA_LIMIT_EXCEEDED";
            }

            case REFERENCE_TARGET_DOES_NOT_EXIST: {
                return "REFERENCE_TARGET_DOES_NOT_EXIST";
            }

            case TOO_MANY_ARGUMENTS: {
                return "TOO_MANY_ARGUMENTS";
            }

            case TOO_MANY_FILE_REFERENCE: {
                return "TOO_MANY_FILE_REFERENCE";
            }

            case UNACCEPTABLE_ASSET: {
                return "UNACCEPTABLE_ASSET";
            }

            case UNACCEPTABLE_TRIAL_ASSET: {
                return "UNACCEPTABLE_TRIAL_ASSET";
            }

            case UNACCEPTABLE_UNVERIFIED_TRIAL_ASSET: {
                return "UNACCEPTABLE_UNVERIFIED_TRIAL_ASSET";
            }

            case UNSUPPORTED_FILE_REFERENCE: {
                return "UNSUPPORTED_FILE_REFERENCE";
            }

            case UNSUPPORTED_MEDIA_TYPE_FOR_FILENAME_UPDATE: {
                return "UNSUPPORTED_MEDIA_TYPE_FOR_FILENAME_UPDATE";
            }

            default: {
                return "";
            }
        }
    }
}

