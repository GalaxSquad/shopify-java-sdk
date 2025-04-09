// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentOrderMerge`.
*/
public class FulfillmentOrderMergeUserErrorQuery extends Query<FulfillmentOrderMergeUserErrorQuery> {
    FulfillmentOrderMergeUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentOrderMergeUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentOrderMergeUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentOrderMergeUserErrorQuery message() {
        startField("message");

        return this;
    }
}
