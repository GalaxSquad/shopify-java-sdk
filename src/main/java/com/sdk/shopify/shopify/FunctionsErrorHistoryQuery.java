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
* The error history from running a Shopify Function.
*/
public class FunctionsErrorHistoryQuery extends Query<FunctionsErrorHistoryQuery> {
    FunctionsErrorHistoryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The date and time that the first error occurred.
    */
    public FunctionsErrorHistoryQuery errorsFirstOccurredAt() {
        startField("errorsFirstOccurredAt");

        return this;
    }

    /**
    * The date and time that the first error occurred.
    */
    public FunctionsErrorHistoryQuery firstOccurredAt() {
        startField("firstOccurredAt");

        return this;
    }

    /**
    * Whether the merchant has shared all the recent errors with the developer.
    */
    public FunctionsErrorHistoryQuery hasBeenSharedSinceLastError() {
        startField("hasBeenSharedSinceLastError");

        return this;
    }

    /**
    * Whether the merchant has shared all the recent errors with the developer.
    */
    public FunctionsErrorHistoryQuery hasSharedRecentErrors() {
        startField("hasSharedRecentErrors");

        return this;
    }
}
