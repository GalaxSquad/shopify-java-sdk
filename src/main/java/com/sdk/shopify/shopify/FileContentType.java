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
* The possible content types for a file object.
*/
public enum FileContentType {
    /**
    * An externally hosted video.
    */
    EXTERNAL_VIDEO,

    /**
    * A Shopify-hosted generic file.
    */
    FILE,

    /**
    * A Shopify-hosted image.
    */
    IMAGE,

    /**
    * A Shopify-hosted 3D model.
    */
    MODEL_3D,

    /**
    * A Shopify-hosted video file. It's recommended to use this type for all video files.
    */
    VIDEO,

    UNKNOWN_VALUE;

    public static FileContentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "EXTERNAL_VIDEO": {
                return EXTERNAL_VIDEO;
            }

            case "FILE": {
                return FILE;
            }

            case "IMAGE": {
                return IMAGE;
            }

            case "MODEL_3D": {
                return MODEL_3D;
            }

            case "VIDEO": {
                return VIDEO;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case EXTERNAL_VIDEO: {
                return "EXTERNAL_VIDEO";
            }

            case FILE: {
                return "FILE";
            }

            case IMAGE: {
                return "IMAGE";
            }

            case MODEL_3D: {
                return "MODEL_3D";
            }

            case VIDEO: {
                return "VIDEO";
            }

            default: {
                return "";
            }
        }
    }
}

