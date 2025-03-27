// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentOrderSplit`.
*/
public class FulfillmentOrderSplitUserErrorQuery extends Query<FulfillmentOrderSplitUserErrorQuery> {
    FulfillmentOrderSplitUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentOrderSplitUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentOrderSplitUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentOrderSplitUserErrorQuery message() {
        startField("message");

        return this;
    }
}
