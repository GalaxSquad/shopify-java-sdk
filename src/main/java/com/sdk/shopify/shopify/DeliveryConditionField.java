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
* The field type that the condition will be applied to.
*/
public enum DeliveryConditionField {
    /**
    * The condition will check against the total price of the order.
    */
    TOTAL_PRICE,

    /**
    * The condition will check against the total weight of the order.
    */
    TOTAL_WEIGHT,

    UNKNOWN_VALUE;

    public static DeliveryConditionField fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "TOTAL_PRICE": {
                return TOTAL_PRICE;
            }

            case "TOTAL_WEIGHT": {
                return TOTAL_WEIGHT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case TOTAL_PRICE: {
                return "TOTAL_PRICE";
            }

            case TOTAL_WEIGHT: {
                return "TOTAL_WEIGHT";
            }

            default: {
                return "";
            }
        }
    }
}

