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
* The source that collected the customer's consent to receive marketing materials.
*/
public enum CustomerConsentCollectedFrom {
    /**
    * The customer consent was collected outside of Shopify.
    */
    OTHER,

    /**
    * The customer consent was collected by Shopify.
    */
    SHOPIFY,

    UNKNOWN_VALUE;

    public static CustomerConsentCollectedFrom fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "OTHER": {
                return OTHER;
            }

            case "SHOPIFY": {
                return SHOPIFY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case OTHER: {
                return "OTHER";
            }

            case SHOPIFY: {
                return "SHOPIFY";
            }

            default: {
                return "";
            }
        }
    }
}

