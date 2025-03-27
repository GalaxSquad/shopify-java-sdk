// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed contextual pricing operations.
*/
public class PriceListUserErrorQuery extends Query<PriceListUserErrorQuery> {
    PriceListUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PriceListUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PriceListUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PriceListUserErrorQuery message() {
        startField("message");

        return this;
    }
}
