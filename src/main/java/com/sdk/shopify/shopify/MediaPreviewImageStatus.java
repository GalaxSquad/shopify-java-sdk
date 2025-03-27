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
* The possible statuses for a media preview image.
*/
public enum MediaPreviewImageStatus {
    /**
    * Preview image processing has failed.
    */
    FAILED,

    /**
    * Preview image is being processed.
    */
    PROCESSING,

    /**
    * Preview image is ready to be displayed.
    */
    READY,

    /**
    * Preview image is uploaded but not yet processed.
    */
    UPLOADED,

    UNKNOWN_VALUE;

    public static MediaPreviewImageStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FAILED": {
                return FAILED;
            }

            case "PROCESSING": {
                return PROCESSING;
            }

            case "READY": {
                return READY;
            }

            case "UPLOADED": {
                return UPLOADED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FAILED: {
                return "FAILED";
            }

            case PROCESSING: {
                return "PROCESSING";
            }

            case READY: {
                return "READY";
            }

            case UPLOADED: {
                return "UPLOADED";
            }

            default: {
                return "";
            }
        }
    }
}

