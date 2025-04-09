// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error for a failed price list price operation.
*/
public class PriceListPriceUserErrorQuery extends Query<PriceListPriceUserErrorQuery> {
    PriceListPriceUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PriceListPriceUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PriceListPriceUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PriceListPriceUserErrorQuery message() {
        startField("message");

        return this;
    }
}
