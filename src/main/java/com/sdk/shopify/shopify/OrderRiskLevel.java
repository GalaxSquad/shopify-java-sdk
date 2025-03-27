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
* The likelihood that an order is fraudulent.
*/
public enum OrderRiskLevel {
    /**
    * There is a high level of risk that this order is fraudulent.
    */
    HIGH,

    /**
    * There is a low level of risk that this order is fraudulent.
    */
    LOW,

    /**
    * There is a medium level of risk that this order is fraudulent.
    */
    MEDIUM,

    UNKNOWN_VALUE;

    public static OrderRiskLevel fromGraphQl(String value) {
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

