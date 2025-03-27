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
* Discrepancy reasons for order adjustments.
*/
public enum OrderAdjustmentInputDiscrepancyReason {
    /**
    * The discrepancy reason is customer.
    */
    CUSTOMER,

    /**
    * The discrepancy reason is damage.
    */
    DAMAGE,

    /**
    * The discrepancy reason is not one of the predefined reasons.
    */
    OTHER,

    /**
    * The discrepancy reason is restocking.
    */
    RESTOCK,

    UNKNOWN_VALUE;

    public static OrderAdjustmentInputDiscrepancyReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER": {
                return CUSTOMER;
            }

            case "DAMAGE": {
                return DAMAGE;
            }

            case "OTHER": {
                return OTHER;
            }

            case "RESTOCK": {
                return RESTOCK;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER: {
                return "CUSTOMER";
            }

            case DAMAGE: {
                return "DAMAGE";
            }

            case OTHER: {
                return "OTHER";
            }

            case RESTOCK: {
                return "RESTOCK";
            }

            default: {
                return "";
            }
        }
    }
}

