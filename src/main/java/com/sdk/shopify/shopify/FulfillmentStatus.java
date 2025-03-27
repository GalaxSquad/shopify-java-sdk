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
* The status of a fulfillment.
*/
public enum FulfillmentStatus {
    /**
    * The fulfillment was canceled.
    */
    CANCELLED,

    /**
    * There was an error with the fulfillment request.
    */
    ERROR,

    /**
    * The fulfillment request failed.
    */
    FAILURE,

    /**
    * The fulfillment was completed successfully.
    */
    SUCCESS,

    UNKNOWN_VALUE;

    public static FulfillmentStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELLED": {
                return CANCELLED;
            }

            case "ERROR": {
                return ERROR;
            }

            case "FAILURE": {
                return FAILURE;
            }

            case "SUCCESS": {
                return SUCCESS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELLED: {
                return "CANCELLED";
            }

            case ERROR: {
                return "ERROR";
            }

            case FAILURE: {
                return "FAILURE";
            }

            case SUCCESS: {
                return "SUCCESS";
            }

            default: {
                return "";
            }
        }
    }
}

