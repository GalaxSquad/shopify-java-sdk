// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of marketing activity and engagement mutations.
*/
public class MarketingActivityUserErrorQuery extends Query<MarketingActivityUserErrorQuery> {
    MarketingActivityUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MarketingActivityUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MarketingActivityUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MarketingActivityUserErrorQuery message() {
        startField("message");

        return this;
    }
}
