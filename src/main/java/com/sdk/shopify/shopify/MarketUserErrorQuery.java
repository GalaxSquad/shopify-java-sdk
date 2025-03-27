// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines errors encountered while managing a Market.
*/
public class MarketUserErrorQuery extends Query<MarketUserErrorQuery> {
    MarketUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MarketUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MarketUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MarketUserErrorQuery message() {
        startField("message");

        return this;
    }
}
