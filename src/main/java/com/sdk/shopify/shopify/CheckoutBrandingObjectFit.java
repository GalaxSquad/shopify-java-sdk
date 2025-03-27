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
* Possible values for object fit.
*/
public enum CheckoutBrandingObjectFit {
    /**
    * The Contain value for fit. The image is scaled to maintain its aspect ratio while fitting within the
    * containing box. The entire image is made to fill the box, while preserving its aspect ratio, so the
    * image will be "letterboxed" if its aspect ratio does not match the aspect ratio of the box. This is
    * the default value.
    */
    CONTAIN,

    /**
    * The Cover value for fit. The image is sized to maintain its aspect ratio while filling the entire
    * containing box. If the image’s aspect ratio does not match the aspect ratio of the containing box,
    * then the object will be clipped to fit.
    */
    COVER,

    UNKNOWN_VALUE;

    public static CheckoutBrandingObjectFit fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONTAIN": {
                return CONTAIN;
            }

            case "COVER": {
                return COVER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONTAIN: {
                return "CONTAIN";
            }

            case COVER: {
                return "COVER";
            }

            default: {
                return "";
            }
        }
    }
}

