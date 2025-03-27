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
* The order's aggregated return status that's used for display purposes.
* An order might have multiple returns, so this field communicates the prioritized return status.
* The `OrderReturnStatus` enum is a supported filter parameter in the [`orders`
* query](https://shopify.dev/api/admin-graphql/latest/queries/orders#:~:text=reference_location_id-,re
* turn_status,-risk_level).
*/
public enum OrderReturnStatus {
    /**
    * All return shipments from a return in this order were inspected.
    */
    INSPECTION_COMPLETE,

    /**
    * Some items in the order are being returned.
    */
    IN_PROGRESS,

    /**
    * No items in the order were returned.
    */
    NO_RETURN,

    /**
    * Some items in the order were returned.
    */
    RETURNED,

    /**
    * Some returns in the order were not completed successfully.
    */
    RETURN_FAILED,

    /**
    * A return was requested for some items in the order.
    */
    RETURN_REQUESTED,

    UNKNOWN_VALUE;

    public static OrderReturnStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INSPECTION_COMPLETE": {
                return INSPECTION_COMPLETE;
            }

            case "IN_PROGRESS": {
                return IN_PROGRESS;
            }

            case "NO_RETURN": {
                return NO_RETURN;
            }

            case "RETURNED": {
                return RETURNED;
            }

            case "RETURN_FAILED": {
                return RETURN_FAILED;
            }

            case "RETURN_REQUESTED": {
                return RETURN_REQUESTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INSPECTION_COMPLETE: {
                return "INSPECTION_COMPLETE";
            }

            case IN_PROGRESS: {
                return "IN_PROGRESS";
            }

            case NO_RETURN: {
                return "NO_RETURN";
            }

            case RETURNED: {
                return "RETURNED";
            }

            case RETURN_FAILED: {
                return "RETURN_FAILED";
            }

            case RETURN_REQUESTED: {
                return "RETURN_REQUESTED";
            }

            default: {
                return "";
            }
        }
    }
}

