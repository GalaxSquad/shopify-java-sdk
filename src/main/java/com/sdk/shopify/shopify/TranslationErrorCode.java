// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `TranslationUserError`.
*/
public enum TranslationErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Translation value is invalid.
    */
    FAILS_RESOURCE_VALIDATION,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Locale language code is invalid.
    */
    INVALID_CODE,

    /**
    * Locale code format is invalid.
    */
    INVALID_FORMAT,

    /**
    * Translation key is invalid.
    */
    INVALID_KEY_FOR_MODEL,

    /**
    * Locale is invalid for the shop.
    */
    INVALID_LOCALE_FOR_SHOP,

    /**
    * Market localizable content is invalid.
    */
    INVALID_MARKET_LOCALIZABLE_CONTENT,

    /**
    * Translatable content is invalid.
    */
    INVALID_TRANSLATABLE_CONTENT,

    /**
    * The handle is already taken for this resource.
    */
    INVALID_VALUE_FOR_HANDLE_TRANSLATION,

    /**
    * The shop isn't allowed to operate on market custom content.
    */
    MARKET_CUSTOM_CONTENT_NOT_ALLOWED,

    /**
    * The market corresponding to the `marketId` argument doesn't exist.
    */
    MARKET_DOES_NOT_EXIST,

    /**
    * The market override locale creation failed.
    */
    MARKET_LOCALE_CREATION_FAILED,

    /**
    * Resource does not exist.
    */
    RESOURCE_NOT_FOUND,

    /**
    * The specified resource can't be customized for a market.
    */
    RESOURCE_NOT_MARKET_CUSTOMIZABLE,

    /**
    * Resource is not translatable.
    */
    RESOURCE_NOT_TRANSLATABLE,

    /**
    * Too many translation keys for the resource.
    */
    TOO_MANY_KEYS_FOR_RESOURCE,

    UNKNOWN_VALUE;

    public static TranslationErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "FAILS_RESOURCE_VALIDATION": {
                return FAILS_RESOURCE_VALIDATION;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_CODE": {
                return INVALID_CODE;
            }

            case "INVALID_FORMAT": {
                return INVALID_FORMAT;
            }

            case "INVALID_KEY_FOR_MODEL": {
                return INVALID_KEY_FOR_MODEL;
            }

            case "INVALID_LOCALE_FOR_SHOP": {
                return INVALID_LOCALE_FOR_SHOP;
            }

            case "INVALID_MARKET_LOCALIZABLE_CONTENT": {
                return INVALID_MARKET_LOCALIZABLE_CONTENT;
            }

            case "INVALID_TRANSLATABLE_CONTENT": {
                return INVALID_TRANSLATABLE_CONTENT;
            }

            case "INVALID_VALUE_FOR_HANDLE_TRANSLATION": {
                return INVALID_VALUE_FOR_HANDLE_TRANSLATION;
            }

            case "MARKET_CUSTOM_CONTENT_NOT_ALLOWED": {
                return MARKET_CUSTOM_CONTENT_NOT_ALLOWED;
            }

            case "MARKET_DOES_NOT_EXIST": {
                return MARKET_DOES_NOT_EXIST;
            }

            case "MARKET_LOCALE_CREATION_FAILED": {
                return MARKET_LOCALE_CREATION_FAILED;
            }

            case "RESOURCE_NOT_FOUND": {
                return RESOURCE_NOT_FOUND;
            }

            case "RESOURCE_NOT_MARKET_CUSTOMIZABLE": {
                return RESOURCE_NOT_MARKET_CUSTOMIZABLE;
            }

            case "RESOURCE_NOT_TRANSLATABLE": {
                return RESOURCE_NOT_TRANSLATABLE;
            }

            case "TOO_MANY_KEYS_FOR_RESOURCE": {
                return TOO_MANY_KEYS_FOR_RESOURCE;
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

            case FAILS_RESOURCE_VALIDATION: {
                return "FAILS_RESOURCE_VALIDATION";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_CODE: {
                return "INVALID_CODE";
            }

            case INVALID_FORMAT: {
                return "INVALID_FORMAT";
            }

            case INVALID_KEY_FOR_MODEL: {
                return "INVALID_KEY_FOR_MODEL";
            }

            case INVALID_LOCALE_FOR_SHOP: {
                return "INVALID_LOCALE_FOR_SHOP";
            }

            case INVALID_MARKET_LOCALIZABLE_CONTENT: {
                return "INVALID_MARKET_LOCALIZABLE_CONTENT";
            }

            case INVALID_TRANSLATABLE_CONTENT: {
                return "INVALID_TRANSLATABLE_CONTENT";
            }

            case INVALID_VALUE_FOR_HANDLE_TRANSLATION: {
                return "INVALID_VALUE_FOR_HANDLE_TRANSLATION";
            }

            case MARKET_CUSTOM_CONTENT_NOT_ALLOWED: {
                return "MARKET_CUSTOM_CONTENT_NOT_ALLOWED";
            }

            case MARKET_DOES_NOT_EXIST: {
                return "MARKET_DOES_NOT_EXIST";
            }

            case MARKET_LOCALE_CREATION_FAILED: {
                return "MARKET_LOCALE_CREATION_FAILED";
            }

            case RESOURCE_NOT_FOUND: {
                return "RESOURCE_NOT_FOUND";
            }

            case RESOURCE_NOT_MARKET_CUSTOMIZABLE: {
                return "RESOURCE_NOT_MARKET_CUSTOMIZABLE";
            }

            case RESOURCE_NOT_TRANSLATABLE: {
                return "RESOURCE_NOT_TRANSLATABLE";
            }

            case TOO_MANY_KEYS_FOR_RESOURCE: {
                return "TOO_MANY_KEYS_FOR_RESOURCE";
            }

            default: {
                return "";
            }
        }
    }
}

