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
* The checkout charge when the full amount isn't charged at checkout.
*/
public enum SellingPlanCheckoutChargeType {
    /**
    * The checkout charge is a percentage of the product or variant price.
    */
    PERCENTAGE,

    /**
    * The checkout charge is a fixed price amount.
    */
    PRICE,

    UNKNOWN_VALUE;

    public static SellingPlanCheckoutChargeType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PERCENTAGE": {
                return PERCENTAGE;
            }

            case "PRICE": {
                return PRICE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PERCENTAGE: {
                return "PERCENTAGE";
            }

            case PRICE: {
                return "PRICE";
            }

            default: {
                return "";
            }
        }
    }
}

