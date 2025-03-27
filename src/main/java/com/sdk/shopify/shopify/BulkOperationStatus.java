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
* The valid values for the status of a bulk operation.
*/
public enum BulkOperationStatus {
    /**
    * The bulk operation has been canceled.
    */
    CANCELED,

    /**
    * Cancelation has been initiated on the bulk operation. There may be a short delay from when a
    * cancelation
    * starts until the operation is actually canceled.
    */
    CANCELING,

    /**
    * The bulk operation has successfully completed.
    */
    COMPLETED,

    /**
    * The bulk operation has been created.
    */
    CREATED,

    /**
    * The bulk operation URL has expired.
    */
    EXPIRED,

    /**
    * The bulk operation has failed. For information on why the operation failed, use
    * [BulkOperation.errorCode](https://shopify.dev/api/admin-graphql/latest/enums/bulkoperationerrorcode)
    * .
    */
    FAILED,

    /**
    * The bulk operation is runnning.
    */
    RUNNING,

    UNKNOWN_VALUE;

    public static BulkOperationStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELED": {
                return CANCELED;
            }

            case "CANCELING": {
                return CANCELING;
            }

            case "COMPLETED": {
                return COMPLETED;
            }

            case "CREATED": {
                return CREATED;
            }

            case "EXPIRED": {
                return EXPIRED;
            }

            case "FAILED": {
                return FAILED;
            }

            case "RUNNING": {
                return RUNNING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELED: {
                return "CANCELED";
            }

            case CANCELING: {
                return "CANCELING";
            }

            case COMPLETED: {
                return "COMPLETED";
            }

            case CREATED: {
                return "CREATED";
            }

            case EXPIRED: {
                return "EXPIRED";
            }

            case FAILED: {
                return "FAILED";
            }

            case RUNNING: {
                return "RUNNING";
            }

            default: {
                return "";
            }
        }
    }
}

