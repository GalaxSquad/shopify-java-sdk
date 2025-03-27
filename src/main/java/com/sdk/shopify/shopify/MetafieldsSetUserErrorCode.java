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
* Possible error codes that can be returned by `MetafieldsSetUserError`.
*/
public enum MetafieldsSetUserErrorCode {
    /**
    * ApiPermission metafields can only be created or updated by the app owner.
    */
    APP_NOT_AUTHORIZED,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The metafield violates a capability restriction.
    */
    CAPABILITY_VIOLATION,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The compareDigest is invalid.
    */
    INVALID_COMPARE_DIGEST,

    /**
    * The type is invalid.
    */
    INVALID_TYPE,

    /**
    * The value is invalid for the metafield type or for the definition options.
    */
    INVALID_VALUE,

    /**
    * The input value should be less than or equal to the maximum value allowed.
    */
    LESS_THAN_OR_EQUAL_TO,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * The metafield has been modified since it was loaded.
    */
    STALE_OBJECT,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    UNKNOWN_VALUE;

    public static MetafieldsSetUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP_NOT_AUTHORIZED": {
                return APP_NOT_AUTHORIZED;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CAPABILITY_VIOLATION": {
                return CAPABILITY_VIOLATION;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID_COMPARE_DIGEST": {
                return INVALID_COMPARE_DIGEST;
            }

            case "INVALID_TYPE": {
                return INVALID_TYPE;
            }

            case "INVALID_VALUE": {
                return INVALID_VALUE;
            }

            case "LESS_THAN_OR_EQUAL_TO": {
                return LESS_THAN_OR_EQUAL_TO;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "STALE_OBJECT": {
                return STALE_OBJECT;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP_NOT_AUTHORIZED: {
                return "APP_NOT_AUTHORIZED";
            }

            case BLANK: {
                return "BLANK";
            }

            case CAPABILITY_VIOLATION: {
                return "CAPABILITY_VIOLATION";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID_COMPARE_DIGEST: {
                return "INVALID_COMPARE_DIGEST";
            }

            case INVALID_TYPE: {
                return "INVALID_TYPE";
            }

            case INVALID_VALUE: {
                return "INVALID_VALUE";
            }

            case LESS_THAN_OR_EQUAL_TO: {
                return "LESS_THAN_OR_EQUAL_TO";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case STALE_OBJECT: {
                return "STALE_OBJECT";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            default: {
                return "";
            }
        }
    }
}

