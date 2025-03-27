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
* Represents a percentage price adjustment type.
*/
public enum PriceListAdjustmentType {
    /**
    * Percentage decrease type. Prices will have a lower value.
    */
    PERCENTAGE_DECREASE,

    /**
    * Percentage increase type. Prices will have a higher value.
    */
    PERCENTAGE_INCREASE,

    UNKNOWN_VALUE;

    public static PriceListAdjustmentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PERCENTAGE_DECREASE": {
                return PERCENTAGE_DECREASE;
            }

            case "PERCENTAGE_INCREASE": {
                return PERCENTAGE_INCREASE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PERCENTAGE_DECREASE: {
                return "PERCENTAGE_DECREASE";
            }

            case PERCENTAGE_INCREASE: {
                return "PERCENTAGE_INCREASE";
            }

            default: {
                return "";
            }
        }
    }
}

