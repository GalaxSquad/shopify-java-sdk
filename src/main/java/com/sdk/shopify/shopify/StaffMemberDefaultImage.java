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
* Represents the fallback avatar image for a staff member. This is used only if the staff member has
* no avatar image.
*/
public enum StaffMemberDefaultImage {
    /**
    * Returns a default avatar image for the staff member.
    */
    DEFAULT,

    /**
    * Returns a URL that returns a 404 error if the image is not present.
    */
    NOT_FOUND,

    /**
    * Returns a transparent avatar image for the staff member.
    */
    TRANSPARENT,

    UNKNOWN_VALUE;

    public static StaffMemberDefaultImage fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DEFAULT": {
                return DEFAULT;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "TRANSPARENT": {
                return TRANSPARENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DEFAULT: {
                return "DEFAULT";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case TRANSPARENT: {
                return "TRANSPARENT";
            }

            default: {
                return "";
            }
        }
    }
}

