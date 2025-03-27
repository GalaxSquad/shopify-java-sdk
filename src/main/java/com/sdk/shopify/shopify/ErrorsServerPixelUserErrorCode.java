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
* Possible error codes that can be returned by `ErrorsServerPixelUserError`.
*/
public enum ErrorsServerPixelUserErrorCode {
    /**
    * A server pixel already exists for this app and shop. Only one server pixel can exist for any app and
    * shop combination.
    */
    ALREADY_EXISTS,

    /**
    * Server Pixel must be configured with a valid AWS Event Bridge or GCP pub/sub endpoint address to be
    * connected.
    */
    NEEDS_CONFIGURATION_TO_CONNECT,

    /**
    * A server pixel doesn't exist for this app and shop.
    */
    NOT_FOUND,

    /**
    * PubSubProject and PubSubTopic values resulted in an address that is not a valid GCP pub/sub
    * format.Address format should be pubsub://project:topic.
    */
    PUB_SUB_ERROR,

    UNKNOWN_VALUE;

    public static ErrorsServerPixelUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALREADY_EXISTS": {
                return ALREADY_EXISTS;
            }

            case "NEEDS_CONFIGURATION_TO_CONNECT": {
                return NEEDS_CONFIGURATION_TO_CONNECT;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "PUB_SUB_ERROR": {
                return PUB_SUB_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALREADY_EXISTS: {
                return "ALREADY_EXISTS";
            }

            case NEEDS_CONFIGURATION_TO_CONNECT: {
                return "NEEDS_CONFIGURATION_TO_CONNECT";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case PUB_SUB_ERROR: {
                return "PUB_SUB_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

