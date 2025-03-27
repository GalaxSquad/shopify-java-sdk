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
* Metafield access permissions for the Customer Account API.
*/
public enum MetafieldCustomerAccountAccess {
    /**
    * No access.
    */
    NONE,

    /**
    * Read-only access.
    */
    READ,

    /**
    * Read and write access.
    */
    READ_WRITE,

    UNKNOWN_VALUE;

    public static MetafieldCustomerAccountAccess fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NONE": {
                return NONE;
            }

            case "READ": {
                return READ;
            }

            case "READ_WRITE": {
                return READ_WRITE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NONE: {
                return "NONE";
            }

            case READ: {
                return "READ";
            }

            case READ_WRITE: {
                return "READ_WRITE";
            }

            default: {
                return "";
            }
        }
    }
}

