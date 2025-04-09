// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
