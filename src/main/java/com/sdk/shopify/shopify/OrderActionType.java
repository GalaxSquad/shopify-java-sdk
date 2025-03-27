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
* The possible order action types for a
* [sales agreement](https://shopify.dev/api/admin-graphql/latest/interfaces/salesagreement).
*/
public enum OrderActionType {
    /**
    * An order with a purchase or charge.
    */
    ORDER,

    /**
    * An edit to the order.
    */
    ORDER_EDIT,

    /**
    * A refund on the order.
    */
    REFUND,

    /**
    * A return on the order.
    */
    RETURN,

    /**
    * An unknown agreement action. Represents new actions that may be added in future versions.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static OrderActionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ORDER": {
                return ORDER;
            }

            case "ORDER_EDIT": {
                return ORDER_EDIT;
            }

            case "REFUND": {
                return REFUND;
            }

            case "RETURN": {
                return RETURN;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ORDER: {
                return "ORDER";
            }

            case ORDER_EDIT: {
                return "ORDER_EDIT";
            }

            case REFUND: {
                return "REFUND";
            }

            case RETURN: {
                return "RETURN";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

