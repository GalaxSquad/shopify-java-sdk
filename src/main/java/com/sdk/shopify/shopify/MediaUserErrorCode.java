// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `MediaUserError`.
*/
public enum MediaUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Invalid media type.
    */
    INVALID_MEDIA_TYPE,

    /**
    * Exceeded the maximum number of 100 variant-media pairs per mutation call.
    */
    MAXIMUM_VARIANT_MEDIA_PAIRS_EXCEEDED,

    /**
    * Media cannot be modified. It is currently being modified by another operation.
    */
    MEDIA_CANNOT_BE_MODIFIED,

    /**
    * Media does not exist.
    */
    MEDIA_DOES_NOT_EXIST,

    /**
    * Media does not exist on the given product.
    */
    MEDIA_DOES_NOT_EXIST_ON_PRODUCT,

    /**
    * The specified media is not attached to the specified variant.
    */
    MEDIA_IS_NOT_ATTACHED_TO_VARIANT,

    /**
    * Missing arguments.
    */
    MISSING_ARGUMENTS,

    /**
    * Model3d creation throttle was exceeded.
    */
    MODEL3D_THROTTLE_EXCEEDED,

    /**
    * Model validation failed.
    */
    MODEL3D_VALIDATION_ERROR,

    /**
    * Non-ready media are not supported.
    */
    NON_READY_MEDIA,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    /**
    * Exceeded the limit of media per product.
    */
    PRODUCT_MEDIA_LIMIT_EXCEEDED,

    /**
    * Product is suspended.
    */
    PRODUCT_SUSPENDED,

    /**
    * Product variant already has attached media.
    */
    PRODUCT_VARIANT_ALREADY_HAS_MEDIA,

    /**
    * Variant does not exist on the given product.
    */
    PRODUCT_VARIANT_DOES_NOT_EXIST_ON_PRODUCT,

    /**
    * Variant specified in more than one pair.
    */
    PRODUCT_VARIANT_SPECIFIED_MULTIPLE_TIMES,

    /**
    * Exceeded the limit of media per shop.
    */
    SHOP_MEDIA_LIMIT_EXCEEDED,

    /**
    * Only one mediaId is allowed per variant-media input pair.
    */
    TOO_MANY_MEDIA_PER_INPUT_PAIR,

    /**
    * Video creation throttle was exceeded.
    */
    VIDEO_THROTTLE_EXCEEDED,

    /**
    * Video validation failed.
    */
    VIDEO_VALIDATION_ERROR,

    UNKNOWN_VALUE;

    public static MediaUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_MEDIA_TYPE": {
                return INVALID_MEDIA_TYPE;
            }

            case "MAXIMUM_VARIANT_MEDIA_PAIRS_EXCEEDED": {
                return MAXIMUM_VARIANT_MEDIA_PAIRS_EXCEEDED;
            }

            case "MEDIA_CANNOT_BE_MODIFIED": {
                return MEDIA_CANNOT_BE_MODIFIED;
            }

            case "MEDIA_DOES_NOT_EXIST": {
                return MEDIA_DOES_NOT_EXIST;
            }

            case "MEDIA_DOES_NOT_EXIST_ON_PRODUCT": {
                return MEDIA_DOES_NOT_EXIST_ON_PRODUCT;
            }

            case "MEDIA_IS_NOT_ATTACHED_TO_VARIANT": {
                return MEDIA_IS_NOT_ATTACHED_TO_VARIANT;
            }

            case "MISSING_ARGUMENTS": {
                return MISSING_ARGUMENTS;
            }

            case "MODEL3D_THROTTLE_EXCEEDED": {
                return MODEL3D_THROTTLE_EXCEEDED;
            }

            case "MODEL3D_VALIDATION_ERROR": {
                return MODEL3D_VALIDATION_ERROR;
            }

            case "NON_READY_MEDIA": {
                return NON_READY_MEDIA;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            case "PRODUCT_MEDIA_LIMIT_EXCEEDED": {
                return PRODUCT_MEDIA_LIMIT_EXCEEDED;
            }

            case "PRODUCT_SUSPENDED": {
                return PRODUCT_SUSPENDED;
            }

            case "PRODUCT_VARIANT_ALREADY_HAS_MEDIA": {
                return PRODUCT_VARIANT_ALREADY_HAS_MEDIA;
            }

            case "PRODUCT_VARIANT_DOES_NOT_EXIST_ON_PRODUCT": {
                return PRODUCT_VARIANT_DOES_NOT_EXIST_ON_PRODUCT;
            }

            case "PRODUCT_VARIANT_SPECIFIED_MULTIPLE_TIMES": {
                return PRODUCT_VARIANT_SPECIFIED_MULTIPLE_TIMES;
            }

            case "SHOP_MEDIA_LIMIT_EXCEEDED": {
                return SHOP_MEDIA_LIMIT_EXCEEDED;
            }

            case "TOO_MANY_MEDIA_PER_INPUT_PAIR": {
                return TOO_MANY_MEDIA_PER_INPUT_PAIR;
            }

            case "VIDEO_THROTTLE_EXCEEDED": {
                return VIDEO_THROTTLE_EXCEEDED;
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
            case BLANK: {
                return "BLANK";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_MEDIA_TYPE: {
                return "INVALID_MEDIA_TYPE";
            }

            case MAXIMUM_VARIANT_MEDIA_PAIRS_EXCEEDED: {
                return "MAXIMUM_VARIANT_MEDIA_PAIRS_EXCEEDED";
            }

            case MEDIA_CANNOT_BE_MODIFIED: {
                return "MEDIA_CANNOT_BE_MODIFIED";
            }

            case MEDIA_DOES_NOT_EXIST: {
                return "MEDIA_DOES_NOT_EXIST";
            }

            case MEDIA_DOES_NOT_EXIST_ON_PRODUCT: {
                return "MEDIA_DOES_NOT_EXIST_ON_PRODUCT";
            }

            case MEDIA_IS_NOT_ATTACHED_TO_VARIANT: {
                return "MEDIA_IS_NOT_ATTACHED_TO_VARIANT";
            }

            case MISSING_ARGUMENTS: {
                return "MISSING_ARGUMENTS";
            }

            case MODEL3D_THROTTLE_EXCEEDED: {
                return "MODEL3D_THROTTLE_EXCEEDED";
            }

            case MODEL3D_VALIDATION_ERROR: {
                return "MODEL3D_VALIDATION_ERROR";
            }

            case NON_READY_MEDIA: {
                return "NON_READY_MEDIA";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            case PRODUCT_MEDIA_LIMIT_EXCEEDED: {
                return "PRODUCT_MEDIA_LIMIT_EXCEEDED";
            }

            case PRODUCT_SUSPENDED: {
                return "PRODUCT_SUSPENDED";
            }

            case PRODUCT_VARIANT_ALREADY_HAS_MEDIA: {
                return "PRODUCT_VARIANT_ALREADY_HAS_MEDIA";
            }

            case PRODUCT_VARIANT_DOES_NOT_EXIST_ON_PRODUCT: {
                return "PRODUCT_VARIANT_DOES_NOT_EXIST_ON_PRODUCT";
            }

            case PRODUCT_VARIANT_SPECIFIED_MULTIPLE_TIMES: {
                return "PRODUCT_VARIANT_SPECIFIED_MULTIPLE_TIMES";
            }

            case SHOP_MEDIA_LIMIT_EXCEEDED: {
                return "SHOP_MEDIA_LIMIT_EXCEEDED";
            }

            case TOO_MANY_MEDIA_PER_INPUT_PAIR: {
                return "TOO_MANY_MEDIA_PER_INPUT_PAIR";
            }

            case VIDEO_THROTTLE_EXCEEDED: {
                return "VIDEO_THROTTLE_EXCEEDED";
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

