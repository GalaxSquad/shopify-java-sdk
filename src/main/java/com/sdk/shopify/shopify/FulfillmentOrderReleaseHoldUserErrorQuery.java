// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentOrderReleaseHold`.
*/
public class FulfillmentOrderReleaseHoldUserErrorQuery extends Query<FulfillmentOrderReleaseHoldUserErrorQuery> {
    FulfillmentOrderReleaseHoldUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentOrderReleaseHoldUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentOrderReleaseHoldUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentOrderReleaseHoldUserErrorQuery message() {
        startField("message");

        return this;
    }
}
