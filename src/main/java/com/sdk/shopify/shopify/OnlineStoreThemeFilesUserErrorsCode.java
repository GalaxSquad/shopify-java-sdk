// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Possible error codes that can be returned by `OnlineStoreThemeFilesUserErrors`.
*/
public enum OnlineStoreThemeFilesUserErrorsCode {
    /**
    * Access denied.
    */
    ACCESS_DENIED,

    /**
    * There are files with the same filename.
    */
    DUPLICATE_FILE_INPUT,

    /**
    * Error.
    */
    ERROR,

    /**
    * The file is invalid.
    */
    FILE_VALIDATION_ERROR,

    /**
    * The input value should be less than or equal to the maximum value allowed.
    */
    LESS_THAN_OR_EQUAL_TO,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * There are theme files with conflicts.
    */
    THEME_FILES_CONFLICT,

    /**
    * This action is not available on your current plan. Please upgrade to access theme editing features.
    */
    THEME_LIMITED_PLAN,

    /**
    * Too many updates in a short period. Please try again later.
    */
    THROTTLED,

    UNKNOWN_VALUE;

    public static OnlineStoreThemeFilesUserErrorsCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCESS_DENIED": {
                return ACCESS_DENIED;
            }

            case "DUPLICATE_FILE_INPUT": {
                return DUPLICATE_FILE_INPUT;
            }

            case "ERROR": {
                return ERROR;
            }

            case "FILE_VALIDATION_ERROR": {
                return FILE_VALIDATION_ERROR;
            }

            case "LESS_THAN_OR_EQUAL_TO": {
                return LESS_THAN_OR_EQUAL_TO;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "THEME_FILES_CONFLICT": {
                return THEME_FILES_CONFLICT;
            }

            case "THEME_LIMITED_PLAN": {
                return THEME_LIMITED_PLAN;
            }

            case "THROTTLED": {
                return THROTTLED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCESS_DENIED: {
                return "ACCESS_DENIED";
            }

            case DUPLICATE_FILE_INPUT: {
                return "DUPLICATE_FILE_INPUT";
            }

            case ERROR: {
                return "ERROR";
            }

            case FILE_VALIDATION_ERROR: {
                return "FILE_VALIDATION_ERROR";
            }

            case LESS_THAN_OR_EQUAL_TO: {
                return "LESS_THAN_OR_EQUAL_TO";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case THEME_FILES_CONFLICT: {
                return "THEME_FILES_CONFLICT";
            }

            case THEME_LIMITED_PLAN: {
                return "THEME_LIMITED_PLAN";
            }

            case THROTTLED: {
                return "THROTTLED";
            }

            default: {
                return "";
            }
        }
    }
}

