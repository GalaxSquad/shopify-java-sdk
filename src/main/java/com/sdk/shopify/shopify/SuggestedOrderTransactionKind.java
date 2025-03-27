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
* Specifies the kind of the suggested order transaction.
*/
public enum SuggestedOrderTransactionKind {
    /**
    * A suggested refund transaction for an order.
    */
    SUGGESTED_REFUND,

    UNKNOWN_VALUE;

    public static SuggestedOrderTransactionKind fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "SUGGESTED_REFUND": {
                return SUGGESTED_REFUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case SUGGESTED_REFUND: {
                return "SUGGESTED_REFUND";
            }

            default: {
                return "";
            }
        }
    }
}

