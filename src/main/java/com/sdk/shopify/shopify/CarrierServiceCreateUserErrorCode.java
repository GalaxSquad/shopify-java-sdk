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
* Possible error codes that can be returned by `CarrierServiceCreateUserError`.
*/
public enum CarrierServiceCreateUserErrorCode {
    /**
    * Carrier service creation failed.
    */
    CARRIER_SERVICE_CREATE_FAILED,

    UNKNOWN_VALUE;

    public static CarrierServiceCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CARRIER_SERVICE_CREATE_FAILED": {
                return CARRIER_SERVICE_CREATE_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CARRIER_SERVICE_CREATE_FAILED: {
                return "CARRIER_SERVICE_CREATE_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

