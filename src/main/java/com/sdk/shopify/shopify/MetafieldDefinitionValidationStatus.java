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
* Possible metafield definition validation statuses.
*/
public enum MetafieldDefinitionValidationStatus {
    /**
    * All of this definition's metafields are valid.
    */
    ALL_VALID,

    /**
    * Asynchronous validation of this definition's metafields is in progress.
    */
    IN_PROGRESS,

    /**
    * Some of this definition's metafields are invalid.
    */
    SOME_INVALID,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionValidationStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALL_VALID": {
                return ALL_VALID;
            }

            case "IN_PROGRESS": {
                return IN_PROGRESS;
            }

            case "SOME_INVALID": {
                return SOME_INVALID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALL_VALID: {
                return "ALL_VALID";
            }

            case IN_PROGRESS: {
                return "IN_PROGRESS";
            }

            case SOME_INVALID: {
                return "SOME_INVALID";
            }

            default: {
                return "";
            }
        }
    }
}

