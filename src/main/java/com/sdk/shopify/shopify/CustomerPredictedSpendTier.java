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
* The valid tiers for the predicted spend of a customer with a shop.
*/
public enum CustomerPredictedSpendTier {
    /**
    * The customer's spending is predicted to be in the top spending range for the shop in the following
    * year.
    */
    HIGH,

    /**
    * The customer's spending is predicted to be zero, or in the lowest spending range for the shop in the
    * following year.
    */
    LOW,

    /**
    * The customer's spending is predicted to be in the normal spending range for the shop in the
    * following year.
    */
    MEDIUM,

    UNKNOWN_VALUE;

    public static CustomerPredictedSpendTier fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "HIGH": {
                return HIGH;
            }

            case "LOW": {
                return LOW;
            }

            case "MEDIUM": {
                return MEDIUM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case HIGH: {
                return "HIGH";
            }

            case LOW: {
                return "LOW";
            }

            case MEDIUM: {
                return "MEDIUM";
            }

            default: {
                return "";
            }
        }
    }
}

