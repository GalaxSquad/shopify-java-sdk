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
* The different types of method definitions to filter by.
*/
public enum DeliveryMethodDefinitionType {
    /**
    * A static merchant-defined rate.
    */
    MERCHANT,

    /**
    * A dynamic participant rate.
    */
    PARTICIPANT,

    UNKNOWN_VALUE;

    public static DeliveryMethodDefinitionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MERCHANT": {
                return MERCHANT;
            }

            case "PARTICIPANT": {
                return PARTICIPANT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MERCHANT: {
                return "MERCHANT";
            }

            case PARTICIPANT: {
                return "PARTICIPANT";
            }

            default: {
                return "";
            }
        }
    }
}

